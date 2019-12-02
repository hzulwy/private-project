/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package compareuploadprograms;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author elvislee
 */
public class UploadFile {
    
    public static void main(String[] args) throws IOException {
        //upload();
        String str="sdsd";
        System.out.println(str.toUpperCase().equals("SDSD"));
    }
  
      private static void upload() throws FileNotFoundException, IOException {
          
        String str=null;  
        File f=new File("c:\\5760\\XML.log");
        FileInputStream fis=new FileInputStream(f);
        byte[]bs=new byte[1024];
        int count=0;
        while((count=fis.read(bs))>0){
            str=new String(bs,0,count);
            
        }
          
         OutputStreamWriter out=null;
         BufferedReader in=null;
         StringBuilder result=new StringBuilder();
         String url="http://172.17.0.90/MES.WIP.Webservice/FTService.asmx/AOITestXml";
         URL realUrl=new URL(url);
         HttpURLConnection conn= (HttpURLConnection) realUrl.openConnection();
         conn.setRequestProperty("accept", "*/*");
         conn.setRequestProperty("Content-Type","application/x-www-form-urlencoded");
      //   conn.setRequestProperty("Content-Length",str.length());
         conn.setDoOutput(true);
         conn.setDoInput(true);
         conn.setRequestMethod("POST");
         out=new OutputStreamWriter(conn.getOutputStream(),"UTF-8");
         
         //正文，内容跟get的url中？后面的参数字符一致
         out.write("sXML=<root><TestStation>1543</TestStation><TestMachine>5760p</TestMachine><Tester>85007252</Tester><BarcodeNo>J9B6010723</BarcodeNo><TestStatus>P</TestStatus><Customer></Customer><TestTime>2019-09-24 14:33:19</TestTime><TestInfo><TestItem Key=\"SDCARD\">PASS</TestItem><TestItem Key=\"MIC\">PASS</TestItem><TestItem Key=\"Pid\">PASS</TestItem><TestItem Key=\"remark2\">Info_MS5-4.1.3_01-04-2019_4.3.7,GPS_PASS,TriColorLED_PASS,MultiTouchPanel_PASS</TestItem></TestInfo><NgInfo><Errcode></Errcode><Pin></Pin><Location></Location></NgInfo></root>\n");
         out.flush();
         
         conn.connect();
          in=new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));
          String line;
          
          while((line=in.readLine())!=null){
              result.append(line);
          }
          System.out.println(result);
          conn.disconnect();
          out.close();
          in.close();
       /* String end="\r\n";
        String str=null;
        String twoHyphens="--";
        String boundary="*****";
        File f=new File("c:\\5760\\XML.log");
        FileInputStream fis=new FileInputStream(f);
        byte[]bs=new byte[1024];
        int count=0;
        while((count=fis.read(bs))>0){
            str=new String(bs,0,count);
            
        }
         System.out.println(str);
        try {
            URL url=new URL("http://172.17.0.90/MES.WIP.Webservice/FTService.asmx/AOITestXml?sXML="+str);
            
            HttpURLConnection conn= (HttpURLConnection) url.openConnection();

            conn.setDoInput(true);
            conn.setDoOutput(true);
            conn.setUseCaches(false);

            conn.setRequestMethod("GET");

            DataOutputStream ds=new DataOutputStream(conn.getOutputStream());

            FileOutputStream fStream=new FileOutputStream("C:\\log\\log.xml");

            int bufferSize=1024;
            byte[]buffer=new byte[bufferSize];
            int length=-1;

            while((length=fStream.read(buffer))!=-1){

                ds.write(buffer,0,length);
                System.out.println(new String(buffer,0,length));
            }
//            ds.writeBytes(end);
//            ds.writeBytes(twoHyphens+boundary+twoHyphens+end);
            fStream.close();
            ds.flush();

//            InputStream is=conn.getInputStream();
//            int ch;
//            StringBuffer b=new StringBuffer();
//            while((ch=is.read())!=-1){
//                b.append((char) ch);
//            }

            ds.close();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
          
          
    }
}
