import face_recognition
import cv2
import os
import numpy as np
from PIL import Image,ImageDraw,ImageFont

import datetime
import threading
import time
import yagmail

class Recorder: #定义单条记录的结构体类
    pass

red_dict={}#定义全局变量存放来访记录
unknownjpg=[]#定义全局变量存放未识别文件名

def sendmail(title,contents,fileslist):
    yag = yagmail.SMTP("发送邮件号码", '授权码', 'smtp.qq.com',465)  # 后面两个参数为固定写法，无需改动,第二个参数是授权码而不是邮箱的密码
    yag.send(['接收邮件号码'], title, contents, fileslist)

def dicttostr():
    strlist=[]
    listKey=list(sorted(red_dict.keys()))#取字典的key
    for item in listKey:#通过循环，合成每一条的来访记录
        strlist.extend([item+','+str(onetime) for onetime in red_dict[item].times])
    return strlist

flagover=0 #全局标志,用来控制是否保持来访记录
def saveRecorder(name,frame):
    global red_dict
    global flagover
    global unknownjpg
    if flagover==1:#响应全局标志，如果为1时,关闭保存记录的功能
        return
    try:
        red=red_dict[name]#如果时多次识别，比较时间
        secondsDiff=(datetime.datetime.now()-red.times[-1]).total_seconds()

        if secondsDiff < 20:#如果两次的时间在20秒以内，将被过滤掉
            return
        red.times.append(datetime.datetime.now())#添加符合规定的到访记录
        print('更新记录',red_dict,red.times)
    except(KeyError):#如果是当日第一次来访，将走以下分支
        newRed=Recorder()#新建一个记录
        newRed.times=[datetime.datetime.now()]
        red_dict[name]=newRed
        print('添加记录',red_dict,newRed.times)

    if name=='Unknown':#如果是未识别
        s=str(red_dict[name].times[-1])
        print('写入',s[:10]+s[-6:])
        filename=s[:10]+s[-6:]+'.jpg'
        cv2.imwrite(filename,frame)#将图片保存
        unknownjpg.append(filename)#添加到访记录

def loop_timer_headle():#定时器循环触发函数
    global timer2
    global flagover
    global red_dict
    global unknownjpg

    flagover=1#关闭保存记录功能
    timer2=threading.Timer(60*1,loop_timer_headle)#创建定时器线程，1分钟之后执行
    timer2.start()
    sendmail("来访统计记录",'\n'.join(dicttostr()),unknownjpg)#发送邮件
    print("清空")
    red_dict.clear()
    unknownjpg.clear()

    print("重新开始")
    flagover=0

tiemr2=threading.Timer(2,loop_timer_headle)
tiemr2.start()

def load_img(sample_dir):
    for(dirpath,dirnames,filenames) in os.walk(sample_dir):#一级一级地文件夹递归
        print(dirpath,dirnames,filenames)
        facelib=[]#获取人脸库图片
        for filename in filenames:
            filename_path=os.sep.join([dirpath,filename])
            print(filename_path)
            faceimage=face_recognition.load_image_file(filename_path)
            face_encoding=face_recognition.face_encodings(faceimage)[0]#每个图只取一个人
            facelib.append(face_encoding)#保存人脸库特征
        return facelib,filenames

facelib,facename=load_img('facelib')#调用函数载入人脸库

video_capture=cv2.VideoCapture(0)#获得摄像头

face_locations=[]#定义列表存放人脸位置
face_encodings=[]#定义列表存放人脸特征编码
process_this_frame=True #订阅信号量

while True:
    ret,frame=video_capture.read()#捕获一帧图片
    small_frame=cv2.resize(frame,(0,0),fx=0.25,fy=0.25)#将图片缩小为原来的1/4,为人脸识别提速
    rgb_small_frame=small_frame[:,:,::-1]#将opencv的BGR格式转为RGB格式

    if process_this_frame:#使用信号量对当前的处理进行保护
        face_locations=face_recognition.face_locations(rgb_small_frame)
        face_encodings=face_recognition.face_encodings(rgb_small_frame,face_locations)
        face_names=[]#定义列表，放置识别结果
        for face_encoding in face_encodings:#循环多张人脸
            matches=face_recognition.compare_faces(facelib,face_encoding)#人脸识别
            name="Unknown"#定义默认的识别结果为Unknown
            if True in matches:#如果识别出来，就将名称取出
                first_match_index=matches.index(True)
                name=facename[first_match_index][:-4]
            face_names.append(name) #保存识别结果
    process_this_frame=not process_this_frame#信号量保护结束

    #显示结果
    for(top,right,bottom,left),name in zip(face_locations,face_names):
        top*=4
        right*=4
        bottom*=4
        left*=4

        cv2.rectangle(frame,(left,top),(right,bottom),(0,0,255),2)
        img_PIL = Image.fromarray(cv2.cvtColor(frame, cv2.COLOR_BGR2RGB))  # 将图片转为PIL支持的格式
        font = ImageFont.truetype('simhei.ttf', 40)  # 载入字体
        position=(left+6,bottom-6)#指定文字输出位置
        draw = ImageDraw.Draw(img_PIL)  # 画出原始图片
        draw.text(position,name, font=font, fill=(255, 255, 255))  # 在图片上面显示中文
        frame = cv2.cvtColor(np.asarray(img_PIL), cv2.COLOR_RGB2BGR)  # 将图片转为cv支持的格式
        saveRecorder(name,frame)
    cv2.imshow("Video", frame)  # 将这一帧图像显示出来
    if cv2.waitKey(1) & 0XFF == ord('q'):
        break
video_capture.release()
cv2.destroyAllWindows()
time.sleep(2)
tiemr2.cancel()

