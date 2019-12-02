/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package compareuploadprograms;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.StyledDocument;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author dell
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
         int windowWidth = this.getWidth(); //获得窗口宽
         int windowHeight = this.getHeight(); //获得窗口高
         System.out.println(windowWidth+"==========="+windowHeight);
         Toolkit kit = Toolkit.getDefaultToolkit(); //定义工具包
         Dimension screenSize = kit.getScreenSize(); //获取屏幕的尺寸
         int screenWidth = screenSize.width; //获取屏幕的宽
         int screenHeight = screenSize.height; //获取屏幕的高
         //this.setLocation(screenWidth/2-windowWidth/2, screenHeight/2-windowHeight/2);//设置窗口居中显示
         set=new Setting();
         timer=new Timer();
         
         init();
         initComponents();
         
          // int message = JOptionPane.showConfirmDialog(this, "是否需要修改设置信息","提示框", INFORMATION_MESSAGE);
           inititems();
            timer=new Timer();
            timer.schedule(new TimerTask() {

               @Override
               public void run() {
                   synchronized(obj){
                       AddDataForTable2(jTextFieldtoMES.getText().toString());
                       System.out.println("1111");
                   }   
               }
           }, 1000, 3000);
            flag=true;
//         items();
    }
    
    public void inititems(){
       File f=new File("c:\\uploaditem.log");
           if(!f.exists())
             return;
         FileInputStream fis;
        
         int bufferSize=1024;
         byte[]buffer=new byte[bufferSize];
         int length=-1;
         String str="";       
         
        try {
           fis =new FileInputStream(f);
           while((length=fis.read(buffer))!=-1){
                str+=new String(buffer,0,length);
            }
             String[] strpilt = str.split(",");
             count=strpilt.length;
            for(int i=0;i<strpilt.length;i++){
                  Items0fTrue[i]=strpilt[i];  
                  System.out.println(Items0fTrue[i]+"1111111111111");
           }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void init(){
         File f=new File("c:\\name.log");
         if(!f.exists())
             return;
         FileInputStream fis;
        
         int bufferSize=1024;
         byte[]buffer=new byte[bufferSize];
         int length=-1;
         String str="";       
         
        try {
           fis =new FileInputStream(f);
           while((length=fis.read(buffer))!=-1){
                str+=new String(buffer,0,length);
            }
             String[] strpilt = str.split(",");
             System.out.println(strpilt);
             set.setID(strpilt[0]);
             System.out.println(strpilt[0]);
             set.setLine(strpilt[1]);
             System.out.println(strpilt[1]);
             set.setLog_path(strpilt[2]);
             System.out.println(strpilt[2]);
             set.setNum(strpilt[3]);
             System.out.println(strpilt[3]);
             set.setServerIP(strpilt[6]);
             System.out.println(strpilt[6]);
             set.setToMES_path(strpilt[7]);
             System.out.println(strpilt[7]);
             set.setPoint(strpilt[5]);
             System.out.println(strpilt[5]);
             set.setPath(strpilt[4]);
             System.out.println(strpilt[4]);
             isCompare=strpilt[8];
             System.out.println(strpilt[8]);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
          
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane5 = new javax.swing.JScrollPane();
        jPanelChange = new javax.swing.JPanel();
        jLabelBarCode = new javax.swing.JLabel();
        jTextFieldBarCode = new javax.swing.JTextField();
        jLabelIsCheck = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel1 = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jLabelUpload = new javax.swing.JLabel();
        jLabelSetting = new javax.swing.JLabel();
        jLabelServer = new javax.swing.JLabel();
        jTextFieldServer = new javax.swing.JTextField();
        jLabelID = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jLabelPoit = new javax.swing.JLabel();
        jTextFieldLine = new javax.swing.JTextField();
        jLabelLine = new javax.swing.JLabel();
        jTextFieldPoit = new javax.swing.JTextField();
        jLabeltoMES = new javax.swing.JLabel();
        jTextFieldtoMES = new javax.swing.JTextField();
        jButtontoMES = new javax.swing.JButton();
        jLabelLog = new javax.swing.JLabel();
        jTextFieldLog = new javax.swing.JTextField();
        jButtonLog = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabelpwd = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPasswordField = new javax.swing.JPasswordField();
        jButtonSave = new javax.swing.JButton();
        jLabelIsCompare = new javax.swing.JLabel();
        jComboBoxIsCompare = new javax.swing.JComboBox();
        jLabelSetPwd = new javax.swing.JLabel();
        jButtonConfirm = new javax.swing.JButton();
        jTextFieldSetPwd = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ACS上传比对程序 2019.10.23");
        setLocation(new java.awt.Point(200, 200));

        jLabelBarCode.setFont(new java.awt.Font("宋体", 1, 12)); // NOI18N
        jLabelBarCode.setText("条形码：");

        jTextFieldBarCode.setEnabled(false);
        jTextFieldBarCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldBarCodeKeyPressed(evt);
            }
        });

        jLabel1.setEditable(false);
        jLabel1.setFocusable(false);
        jScrollPane1.setViewportView(jLabel1);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "选择", "关键字名称", "关键字值"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable1);

        jScrollPane4.setViewportView(jLabelUpload);

        jLabelSetting.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jLabelSetting.setText("基本设置");

        jLabelServer.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jLabelServer.setText("服务器IP:");

        jTextFieldServer.setEnabled(false);
        jTextFieldServer.setText(set.getServerIP());
        jTextFieldServer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldServerActionPerformed(evt);
            }
        });

        jLabelID.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jLabelID.setText("工号：");

        jTextFieldID.setEnabled(false);
        jTextFieldID.setText(set.getID());
        jTextFieldID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIDActionPerformed(evt);
            }
        });

        jLabelPoit.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jLabelPoit.setText("机台号（站别）:");

        jTextFieldLine.setEnabled(false);
        jTextFieldLine.setText(set.getLine());
        jTextFieldLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLineActionPerformed(evt);
            }
        });

        jLabelLine.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jLabelLine.setText("线别：");

        jTextFieldPoit.setEnabled(false);
        jTextFieldPoit.setText(set.getPoint());
        jTextFieldPoit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPoitActionPerformed(evt);
            }
        });

        jLabeltoMES.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jLabeltoMES.setText("toMES执行资料夹");

        jTextFieldtoMES.setEnabled(false);
        jTextFieldtoMES.setText(set.getToMES_path());
        jTextFieldtoMES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldtoMESActionPerformed(evt);
            }
        });

        jButtontoMES.setText("Open");
        jButtontoMES.setEnabled(false);
        jButtontoMES.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtontoMESMouseClicked(evt);
            }
        });

        jLabelLog.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jLabelLog.setText("log存放资料夹");

        jTextFieldLog.setEnabled(false);
        jTextFieldLog.setText(set.getLog_path());

        jButtonLog.setText("Open");
        jButtonLog.setEnabled(false);
        jButtonLog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonLogMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jLabel5.setText("工程设置");

        jLabel2.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jLabel2.setText("站别ID:");

        jTextField1.setEnabled(false);
        jTextField1.setText(set.getPath());

        jLabel3.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jLabel3.setText("上传项目数：");

        jTextField2.setEnabled(false);
        jTextField2.setText(set.getNum());

        jLabelpwd.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jLabelpwd.setText("密    码：");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jPasswordField.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jPasswordField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordFieldMouseClicked(evt);
            }
        });
        jPasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordFieldKeyPressed(evt);
            }
        });

        jButtonSave.setText("保存");
        jButtonSave.setEnabled(false);
        jButtonSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSaveMouseClicked(evt);
            }
        });

        jLabelIsCompare.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jLabelIsCompare.setText("是否需要比对：");

        jComboBoxIsCompare.setEditable(true);
        jComboBoxIsCompare.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1" }));
        jComboBoxIsCompare.setToolTipText("");
        jComboBoxIsCompare.setEnabled(false);
        jComboBoxIsCompare.setSelectedItem(isCompare);

        jLabelSetPwd.setFont(new java.awt.Font("新細明體", 1, 18)); // NOI18N
        jLabelSetPwd.setText("设置密码：");

        jButtonConfirm.setText("确定");
        jButtonConfirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonConfirmMouseClicked(evt);
            }
        });

        jTextFieldSetPwd.setFont(new java.awt.Font("新細明體", 0, 18)); // NOI18N
        jTextFieldSetPwd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldSetPwdMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelChangeLayout = new javax.swing.GroupLayout(jPanelChange);
        jPanelChange.setLayout(jPanelChangeLayout);
        jPanelChangeLayout.setHorizontalGroup(
            jPanelChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelChangeLayout.createSequentialGroup()
                .addGroup(jPanelChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelChangeLayout.createSequentialGroup()
                        .addComponent(jLabelBarCode)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldBarCode, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelIsCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelChangeLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelChangeLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanelChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelChangeLayout.createSequentialGroup()
                                        .addGroup(jPanelChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldServer, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelServer)
                                            .addComponent(jLabeltoMES))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanelChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelID))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanelChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldLine, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelPoit))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanelChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelLine)
                                            .addComponent(jTextFieldPoit, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanelChangeLayout.createSequentialGroup()
                                        .addComponent(jTextFieldtoMES, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtontoMES))
                                    .addComponent(jLabelLog)
                                    .addGroup(jPanelChangeLayout.createSequentialGroup()
                                        .addComponent(jTextFieldLog, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonLog))
                                    .addGroup(jPanelChangeLayout.createSequentialGroup()
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanelChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanelChangeLayout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabelIsCompare, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanelChangeLayout.createSequentialGroup()
                                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jComboBoxIsCompare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanelChangeLayout.createSequentialGroup()
                                        .addGroup(jPanelChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabelpwd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabelSetPwd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanelChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanelChangeLayout.createSequentialGroup()
                                                .addComponent(jTextFieldSetPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonConfirm))
                                            .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jLabelSetting)
                            .addGroup(jPanelChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel5))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelChangeLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSave)
                        .addGap(230, 230, 230))))
        );
        jPanelChangeLayout.setVerticalGroup(
            jPanelChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanelChangeLayout.createSequentialGroup()
                .addGroup(jPanelChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelBarCode)
                        .addComponent(jTextFieldBarCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelSetting, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelIsCheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                    .addGroup(jPanelChangeLayout.createSequentialGroup()
                        .addGroup(jPanelChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelServer)
                            .addComponent(jLabelID)
                            .addComponent(jLabelPoit)
                            .addComponent(jLabelLine))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldServer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldLine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldPoit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(jLabeltoMES)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldtoMES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtontoMES))
                        .addGap(10, 10, 10)
                        .addComponent(jLabelLog)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldLog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonLog))))
                .addGroup(jPanelChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelChangeLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabelIsCompare))
                        .addGap(8, 8, 8)
                        .addGroup(jPanelChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxIsCompare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanelChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelpwd)
                            .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelSetPwd)
                            .addComponent(jButtonConfirm)
                            .addComponent(jTextFieldSetPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(jButtonSave)
                        .addContainerGap())
                    .addGroup(jPanelChangeLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jScrollPane5.setViewportView(jPanelChange);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSaveMouseClicked
        // TODO add your handling code here:
        /*
//           set.setServerIP(jTextFieldServer.getText().toString());
            set.setID(jTextFieldID.getText().toString());
            set.setLine(jTextFieldLine.getText().toString());
            set.setToMES_path(jTextFieldtoMES.getText().toString());
            set.setPoint(jTextFieldPoit.getText().toString());
            set.setLog_path(jTextFieldLog.getText().toString());
            set.setPath(jTextField1.getText().toString());
//            System.out.println(jTextField.getText().toString()+"::::::::::::::");
            set.setNum(jTextField2.getText().toString());
         //  System.out.println(jTable1.getRowCount()+"]]]]]]]"); 
            isCompare=(String) jComboBoxIsCompare.getSelectedItem();
        */
        if("".equals(jTextFieldServer.getText())||"".equals(jTextFieldID.getText())||"".equals(jTextFieldLine.getText())
            ||"".equals(jTextFieldtoMES.getText())||"".equals(jTextFieldPoit.getText())||"".equals(jTextFieldLog.getText())
            ||"".equals(jTextField1.getText())||"".equals(jTextField2.getText())||"".equals((String) jComboBoxIsCompare.getSelectedItem())){
            JOptionPane.showMessageDialog(this, "请完善设置信息","提示框", INFORMATION_MESSAGE);
            return;
        }

        System.out.println(Integer.parseInt(jTextField2.getText().toString())+";;;;;;;;;");
        save();
        System.out.println(count+":::::::::");
        if(count==Integer.parseInt(jTextField2.getText().toString())){
            // jTable1.setEnabled(false);
            SetEditFalse();
            flag=true;
            timer=new Timer();
            timer.schedule(new TimerTask() {

                @Override
                public void run() {
                    synchronized(obj){
                        AddDataForTable2(jTextFieldtoMES.getText().toString());
                        System.out.println("1111");
                    }
                }
            }, 1000, 3000);
        }else{
           JOptionPane.showMessageDialog(this, "上传项目数不匹配","提示框", INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButtonSaveMouseClicked

    private void jPasswordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldKeyPressed
        // TODO add your handling code here:
        String pwd=jPasswordField.getText();
        //  System.out.println(pwd);
        if(pwd.equals("000000")||(pwd.equals(newPwd)&&(!"".equals(newPwd)))){
            jPasswordField.setText("");
            SetEditTrue();
            if(flag==true){
                timer.cancel();
                AddDataForTable(jTextFieldtoMES.getText().toString());
            }
            //            System.out.println(list_size+"......");
            //           if(list_size!=0){
                //
                //           }
        }
    }//GEN-LAST:event_jPasswordFieldKeyPressed

    private void jButtonLogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLogMouseClicked
        // TODO add your handling code here:
        String path=null;
        if(!jButtonLog.isEnabled())
        return;
        try {
            JFileChooser jdir = new JFileChooser();
            //设置选择路径模式
            jdir.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            //设置对话框标题
            jdir.setDialogTitle("请选择文件夹路径");
            if (JFileChooser.APPROVE_OPTION == jdir.showOpenDialog(null)) {//用户点击了确定
                path = jdir.getSelectedFile().getAbsolutePath();//取得路径选择
                jTextFieldLog.setText(path);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButtonLogMouseClicked

    private void jButtontoMESMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtontoMESMouseClicked
        // TODO add your handling code here:
        String path=null;
        if(!jButtontoMES.isEnabled())
        return;
        try {
            JFileChooser jdir = new JFileChooser();
            //设置选择路径模式
            jdir.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            //过滤文件类型
            // FileNameExtensionFilter filter = new FileNameExtensionFilter("Xml文件(*.xml;)","xml");
            //jdir.setFileFilter(filter);
            //设置对话框标题
            jdir.setDialogTitle("请选择文件夹路径");
            if (JFileChooser.APPROVE_OPTION == jdir.showOpenDialog(null)) {//用户点击了确定
                path = jdir.getSelectedFile().getAbsolutePath();//取得路径选择
                jTextFieldtoMES.setText(path);
            }

            AddDataForTable(jTextFieldtoMES.getText().toString());

            System.out.println("1111");
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButtontoMESMouseClicked

    private void jTextFieldtoMESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldtoMESActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldtoMESActionPerformed

    private void jTextFieldPoitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPoitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPoitActionPerformed

    private void jTextFieldLineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLineActionPerformed

    private void jTextFieldIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIDActionPerformed

    private void jTextFieldServerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldServerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldServerActionPerformed

    private void jTextFieldBarCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBarCodeKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            if(!set.getID().equals("")){
                server=set.getServerIP().toString();
                String actionUrl="http://"+server+"/MES.WIP.Webservice/FTService.asmx/GetComponent?sBarcodeNo=";
                String code=jTextFieldBarCode.getText().toString().trim();
                actionUrl=actionUrl+code;
                System.out.println(actionUrl);
                String path=set.getLog_path().toString();
                System.out.println(path);
                saveUrlAs(actionUrl, path+"\\", "GET");
                    ParseXml2(path+"\\config.txt");
                    bar=jTextFieldBarCode.getText().trim();
                    switch (isCompare) {
                        case "1":
                        if(ParseXml(path+"\\log.xml")){
                            jLabelIsCheck.setText(bar+" Comparation is OK!");
                            jLabelIsCheck.setForeground(Color.green);
                            jLabelIsCheck.setFont(new Font("",1,18));
                            jTextFieldBarCode.setText("");
                            if(GenerateXml(code))
                            msFile.delete();
                            try {
                                //                            jLabelUpload.setText("");
                                UploadXml(set.getToMES_path()+"\\XML.log");
                            } catch (IOException ex) {
                                Logger.getLogger(TestJPanel.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (ParserConfigurationException ex) {
                                Logger.getLogger(TestJPanel.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (SAXException ex) {
                                Logger.getLogger(TestJPanel.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }else{
                            jLabelIsCheck.setText(bar+" Comparation is ERROR!");
                            jLabelIsCheck.setForeground(Color.red);
                            jLabelIsCheck.setFont(new Font("",1,18));
                            jTextFieldBarCode.setText("");
                            GenerateXml(code);
                        }
                        break;
                        case "0":
                        if(GenerateXml(code))
                        msFile.delete();
                        try {
                            //                            jLabelUpload.setText("");
                            jLabelIsCheck.setText("");
                            jLabel1.setText("");
                            UploadXml(set.getToMES_path()+"\\XML.log");
                            jTextFieldBarCode.setText("");
                        } catch (IOException ex) {
                            Logger.getLogger(TestJPanel.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (ParserConfigurationException ex) {
                            Logger.getLogger(TestJPanel.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (SAXException ex) {
                            Logger.getLogger(TestJPanel.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        break;
                        case "10":
                            if(ParseXml(path+"\\log.xml")){
                                jLabelIsCheck.setText(bar+" Comparation is OK!");
                                jLabelIsCheck.setForeground(Color.green);
                                jLabelIsCheck.setFont(new Font("",1,18));
                                jTextFieldBarCode.setText("");
                                if(GenerateXml(code))
                                msFile.delete();  
                            }else{
                                jLabelIsCheck.setText(bar+" Comparation is ERROR!");
                                jLabelIsCheck.setForeground(Color.red);
                                jLabelIsCheck.setFont(new Font("",1,18));
                                jTextFieldBarCode.setText("");
                                GenerateXml(code);
                            }
                            break;
                        case "0110":
                              if(GenerateXml(code))
                                msFile.delete();
                                try {
                                    //                            jLabelUpload.setText("");
                                    jLabelIsCheck.setText("");
                                    jLabel1.setText("");
                                    UploadXml(set.getToMES_path()+"\\XML.log");
                                    jTextFieldBarCode.setText("");
                                } catch (IOException ex) {
                                    Logger.getLogger(TestJPanel.class.getName()).log(Level.SEVERE, null, ex);
                                } catch (ParserConfigurationException ex) {
                                    Logger.getLogger(TestJPanel.class.getName()).log(Level.SEVERE, null, ex);
                                } catch (SAXException ex) {
                                    Logger.getLogger(TestJPanel.class.getName()).log(Level.SEVERE, null, ex);
                                }
//                            try {
//                                Thread.sleep(2000);
//                            } catch (InterruptedException ex) {
//                                Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
//                            }
                           if(ParseXml(path+"\\log.xml")){
                                jLabelIsCheck.setText(bar+" Comparation is OK!");
                                jLabelIsCheck.setForeground(Color.green);
                                jLabelIsCheck.setFont(new Font("",1,18));
                                jTextFieldBarCode.setText("");
                                if(GenerateXml(code))
                                msFile.delete();  
                            }else{
                                jLabelIsCheck.setText(bar+" Comparation is ERROR!");
                                jLabelIsCheck.setForeground(Color.red);
                                jLabelIsCheck.setFont(new Font("",1,18));
                                jTextFieldBarCode.setText("");
                                GenerateXml(code);
                            }
                            break;
                    }
                    jTextFieldBarCode.setEnabled(false);
                }else{
                    jLabelIsCheck.setText("请填写工号！！！");
                    jLabelIsCheck.setForeground(Color.red);
                    jLabelIsCheck.setFont(new Font("",1,18));
                    jTextFieldBarCode.setText("");
                }
            }
    }//GEN-LAST:event_jTextFieldBarCodeKeyPressed

    private void jButtonConfirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonConfirmMouseClicked
        // TODO add your handling code here:
        if("".equals(jTextFieldSetPwd.getText())){
            JOptionPane.showMessageDialog(this, "请输入密码","提示框", INFORMATION_MESSAGE);
        }else{
              File f=new File("c:\\name.log");
              FileOutputStream fos;
            try {
                fos = new FileOutputStream(f);
                fos.write(jTextFieldSetPwd.getText().getBytes());
                fos.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            newPwd=jTextFieldSetPwd.getText();
            jTextFieldSetPwd.setText("");
        }
    }//GEN-LAST:event_jButtonConfirmMouseClicked

    private void jPasswordFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordFieldMouseClicked
        // TODO add your handling code here:
        //jPasswordField.requestFocus(true);
        //jTextFieldBarCode.setEnabled(false);
    }//GEN-LAST:event_jPasswordFieldMouseClicked

    private void jTextFieldSetPwdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldSetPwdMouseClicked
        // TODO add your handling code here:
       // jTextFieldSetPwd.requestFocusInWindow();
       // jTextFieldBarCode.setEnabled(false);
    }//GEN-LAST:event_jTextFieldSetPwdMouseClicked

    //进行xml与服务器端数据的比对
     public boolean ParseXml(String path){
        boolean ischeck=true;
        String s="";
        String shtml="";
        try{
            File file=new File(path);
            DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
            DocumentBuilder builder=factory.newDocumentBuilder();
            Document doc=builder.parse(file);
            String str=doc.getDocumentElement().getFirstChild().getNodeValue();
            
            if(str.equals("[]")){
                //System.out.println("False");
                ischeck=false;
                jLabel1.setText("服务器上没有此条码！！！");
               // AddNullForTable();
            }else{
                String substring=str.substring(2, str.length()-2);
                String[] logsubstring = substring.split(",");
                for(int i=0;i<logsubstring.length;i++){
                String[] extendlogsubstring = logsubstring[i].split(":");
                    for(int j=0;j<substr.length;j++){
                     if(extendlogsubstring[0].equals("\""+substr[j]+"\"")){
                        if(("\""+netstr[j]+"\"").equals(extendlogsubstring[1])){
                          //  System.out.println("++++++++++++"+("\""+netstr[j]+"\"").equals(extendlogsubstring[1]));
                           s="Server-- "+substr[j]+" : "+extendlogsubstring[1]+"<br/>";
                           s+="XML-- "+substr[j]+" : "+"\""+netstr[j]+"\"";
                           shtml+="<h3 style='color:green'>"+s+"</h3>";
                          // ischeck=true;
                        }else{
                           //   System.out.println("------------"+("\""+netstr[j]+"\"").equals(extendlogsubstring[1]));
                             s="Server-- "+substr[j]+" : "+extendlogsubstring[1]+"<br/>";
                             s+="XML-- "+substr[j]+" : "+"\""+netstr[j]+"\"";
                             shtml+="<h3 style='color:red'>"+s+"</h3>";    
                             ischeck=false;
                        }
                           jLabel1.setContentType("text/html");
                           jLabel1.setFont(new Font("",1,16));
                           jLabel1.setText(shtml);
                           StyledDocument styledDoc = jLabel1.getStyledDocument();
                            System.out.println(styledDoc.getLength()); 
                            System.out.println(jLabel1.getText());
                     }
                  }
              }
          }
        }catch(Exception e){
           e.printStackTrace();
        }
        return ischeck;
    }
    
     //读取config.txt文档的数据并且获取ms5760P_e04f439e17de.xml文档的键值
     public void ParseXml2(String path){
      //  boolean ischeck=false;
        String str = null;
        
        try{
            File file=new File(set.getToMES_path().toString());
            File[] files = file.listFiles();
            
            File f=new File(path);
            FileInputStream fis=new FileInputStream(f);
           // BufferedReader bfr=new BufferedReader();
            byte[]bs=new byte[1024];
            int count=0;
            while((count=fis.read(bs))>0){
                str=new String(bs,0,count);
                //System.out.println(str);
            }
            if(str==null){
                 ;
            }else{
               substr = str.split(",");
               for(int j=0;j<substr.length;j++){
                  for(int i=0;i<files.length;i++){
                      if(!files[i].isFile()) continue;
                    if(files[i].getName().startsWith("ms")){
                       if(files[i].getName().endsWith(".xml")){
                          
                           msFile=files[i];
                           msFileName=files[i].getName();
                           DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
                           DocumentBuilder builder=factory.newDocumentBuilder();
                           Document doc=builder.parse(files[i]);
                            nL = doc.getDocumentElement().getElementsByTagName("TestItem");
                           for(int k=0;k<nL.getLength();k++){
                              if(nL.item(k).getAttributes().item(0).getNodeValue().equals(substr[j])){
                                  //System.out.println(nL.item(k).getTextContent());
                                  System.out.println(nL.item(k).getAttributes().item(0).getNodeValue()+"===========");
                                  netstr[j]=nL.item(k).getTextContent();
                                  System.out.println("======="+netstr[j]);
                              } 
                           }
//                           System.out.println("========="+nL.item(0).getTextContent()+"=========="+nL.item(0).getAttributes().item(0).getNodeName());
//                           NodeList nLEc = doc.getDocumentElement().getElementsByTagName("Errcode");
//                           if(nLEc.item(0).getTextContent()!=null)
//                              err[0]=nLEc.item(0).getTextContent();
//                           else
//                               err[0]="";
//                           System.out.println(nLEc.item(0).getTextContent()+"====---===");
//                           NodeList nLEp = doc.getDocumentElement().getElementsByTagName("ErrPinDesc");
//                           if(nLEp.item(0).getTextContent()!=null)
//                              err[1]=nLEp.item(0).getTextContent();
//                           else
//                               err[1]="";
                        }
                    }
                    break;
                    }
               }
            }
            //System.out.println(str.substring(2, str.length()-2));
        }catch(Exception e){
           e.printStackTrace();
        }
        return ;
    }
    
     //生成log.xml文档
    private void saveUrlAs(String url, String filePath, String method) {
//         File file=new File(filePath);
//        if(!file.exists()){
//            file.mkdirs();
//        }
        FileOutputStream fileOut=null;
        HttpURLConnection conn=null;
        InputStream inputStream=null;
        
        try {
            URL httpUrl=new URL(url);
            conn= (HttpURLConnection) httpUrl.openConnection();
            conn.setDoInput(true);
            conn.setDoOutput(true);
            conn.setUseCaches(false);
            conn.setRequestMethod(method);
            
            conn.connect();
            inputStream=conn.getInputStream();
            BufferedInputStream bis=new BufferedInputStream(inputStream);
            
            if(filePath.endsWith("\\")){
               filePath+="\\";
            }
            fileOut=new FileOutputStream(filePath+"log.xml");
            BufferedOutputStream bos=new BufferedOutputStream(fileOut);
            
            byte[]buf=new byte[4096];
            int length=bis.read(buf);
            
            while(length!=-1){
                bos.write(buf,0,length);
                length=bis.read(buf);
            }
            bos.close();
            bis.close();
            conn.disconnect();
        } catch (MalformedURLException ex) {
            Logger.getLogger(DownloadFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ProtocolException ex) {
            Logger.getLogger(DownloadFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DownloadFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //生成上传文档
    private boolean GenerateXml(String str) {
        
        FileOutputStream fileOut=null;
        BufferedOutputStream bos=null;
        SimpleDateFormat sDateFormat=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String date=sDateFormat.format(new Date());
        char c = 0;
        for(int i=0;i<msFileName.length();i++){
          if(msFileName.charAt(i)=='F'||msFileName.charAt(i)=='P'){
             c=msFileName.charAt(i);
             break;
          }
        }
        
        if(msFileName!=null){
            try {
                fileOut=new FileOutputStream(set.getToMES_path()+"\\XML.log");
                bos=new BufferedOutputStream(fileOut);
                bos.write("<root>".getBytes());
                bos.write("<TestStation>".getBytes());
                bos.write(set.getPath().getBytes());
                bos.write("</TestStation>".getBytes());
                bos.write("<TestMachine>".getBytes());
                bos.write(set.getLine().getBytes());
                bos.write("</TestMachine>".getBytes());
                bos.write("<Tester>".getBytes());
                bos.write(set.getID().getBytes());
                bos.write("</Tester>".getBytes());
                bos.write("<BarcodeNo>".getBytes());
                bos.write(str.getBytes());
                bos.write("</BarcodeNo>".getBytes());
                bos.write("<TestStatus>".getBytes());
                bos.write(c);
                bos.write("</TestStatus>".getBytes());
                bos.write("<Customer>".getBytes());
                
                bos.write("</Customer>".getBytes());
                bos.write("<TestTime>".getBytes());
                bos.write(date.getBytes());
                bos.write("</TestTime>".getBytes());
                bos.write("<TestInfo>".getBytes());
                for(int i=0;i<count;i++){
                   bos.write("<TestItem Key=".getBytes());
                   bos.write(("\""+Items0fTrue[i]+"\"").getBytes());
                   bos.write(">".getBytes());
                    for(int k=0;k<nL.getLength();k++){
                        if(nL.item(k).getAttributes().item(0).getNodeValue().equals(Items0fTrue[i])){
                            //System.out.println(nL.item(k).getTextContent());
                            System.out.println(nL.item(k).getAttributes().item(0).getNodeValue()+"===========");
                            bos.write(nL.item(k).getTextContent().getBytes());
                        } 
                     }
                   bos.write("</TestItem>".getBytes());  
                }
                bos.write("</TestInfo>".getBytes());
                bos.write("<NgInfo>".getBytes());
                bos.write("<Errcode>".getBytes());
               // bos.write(err[0].getBytes());
                bos.write("</Errcode>".getBytes());
                bos.write("<Pin>".getBytes());
               // bos.write(err[1].getBytes());
                bos.write("</Pin>".getBytes());
                bos.write("<Location>".getBytes());
                
                bos.write("</Location>".getBytes());
                bos.write("</NgInfo>".getBytes());
                bos.write("</root>".getBytes());
                bos.close();
               
            } catch (FileNotFoundException ex) {
                Logger.getLogger(TestJPanel.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(TestJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }    
        }
         if(new File(set.getToMES_path()+"\\XML.log").length()!=0){
            return true;
         }else{
            return false;
         }
    }
    
     private void AddDataForTable(String path) {
            String filename="";

          if(jTextFieldtoMES.getText().equals(""))
             return;
          File file=new File(jTextFieldtoMES.getText().toString());
          File[] files = file.listFiles();
          
           for(int i=0;i<files.length;i++){
                if(files[i].getName().startsWith("ms")){
                   if(files[i].getName().endsWith(".xml")){
                       filename=files[i].getName();
                   }
                }
           }
           
          System.out.println(path+"\\"+filename);   
          if(filename.equals("")){
               ;
          }else{
              ReadXmlFile readXmlFile=new ReadXmlFile(path+"\\"+filename);
              try {
                  List list_id=readXmlFile.XmlToList_key(path+"\\"+filename);
                  List list_casename=readXmlFile.XmlToList_casename(path+"\\"+filename);
              
              DefaultTableModel tableModel = null;
              tableModel=new DefaultTableModel(){
                    @Override
                    public boolean isCellEditable(int row,int column){
                          if(column==0)
                              return true;
                          else
                              return false; 
                    }
                };
              tableModel.setColumnIdentifiers(new String[]{"选择", "关键字名称", "关键字值"});

              list_size=list_id.size();

              tableModel.getDataVector().clear();

                int k=0;
                 for(int i=0;i<list_size;i++){  
                      String id=null;
                      String name=null;
                     id=(String) list_id.get(i);
                     name=(String)list_casename.get(i);
//                     System.out.println(id+"1111111111111");
      //               for(int q=1;q<items.length;q++)
//                          System.out.println(Items0fTrue[i]+"00000000010");
                         if(id.equals(Items0fTrue[k])){
                              tableModel.addRow(new Object[]{new Boolean(true),id,name});
                              k++;
                         } 
                         else
                            tableModel.addRow(new Object[]{new Boolean(false),id,name});
                      
//                      System.out.println(id+";--------");
//                      System.out.println(Items0fTrue[i]+"-----------;");
//                      System.out.println(jTable1.getValueAt(i, 0)+"++++++++++");   
                  }       

              jTable1=new JTable(tableModel){
                    Class[] types = new Class [] {
                      java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class
                  };
                  boolean[] canEdit = new boolean [] {
                      true, false, false
                  };

                  public Class getColumnClass(int columnIndex) {
                      return types [columnIndex];
                  }

                  public boolean isCellEditable(int rowIndex, int columnIndex) {
                      return canEdit [columnIndex];
                  }
              };
              jTable1.getTableHeader().setReorderingAllowed(false);
              jScrollPane3.setViewportView(jTable1);

              } catch (Exception ex) {
                  Logger.getLogger(TestJPanel.class.getName()).log(Level.SEVERE, null, ex);
              }
          }      
    }
     
      private void AddDataForTable2(String path) {
          String filename="";
         if(jTextFieldtoMES.getText().equals(""))
             return;
          File file=new File(jTextFieldtoMES.getText().toString());
          File[] files = file.listFiles();
          
           for(int i=0;i<files.length;i++){
                if(files[i].getName().startsWith("ms")){
                   if(files[i].getName().endsWith(".xml")){
                       filename=files[i].getName();
                        jTextFieldBarCode.setEnabled(true);
                        jTextFieldBarCode.requestFocus(true);
                   }
                }
           }
           
          System.out.println(path+"\\"+filename);   
          if(filename.equals("")){
               ;
          }else{
              ReadXmlFile readXmlFile=new ReadXmlFile(path+"\\"+filename);
              try {
                  List list_id=readXmlFile.XmlToList_key(path+"\\"+filename);
                  List list_casename=readXmlFile.XmlToList_casename(path+"\\"+filename);
                
              DefaultTableModel tableModel = null;
              tableModel=new DefaultTableModel(){
                    @Override
                    public boolean isCellEditable(int row,int column){
                          if(column==0)
                              return true;
                          else
                              return false; 
                    }
                };
              tableModel.setColumnIdentifiers(new String[]{"选择", "关键字名称", "关键字值"});

              list_size=list_id.size();

              tableModel.getDataVector().clear();

//                  System.out.println(list_size+"<<<<<<<>>>>>>>>");
              int k=0;
                 for(int i=0;i<list_size;i++){  
                      String id=null;
                      String name=null;
                     id=(String) list_id.get(i);
                     name=(String)list_casename.get(i);
//                     System.out.println(id+"1111111111111");
      //               for(int q=1;q<items.length;q++)
//                          System.out.println(Items0fTrue[i]+"00000000010");
                         if(id.equals(Items0fTrue[k])){
                              tableModel.addRow(new Object[]{new Boolean(true),id,name});
                              k++;
                         } 
                         else
                            tableModel.addRow(new Object[]{new Boolean(false),id,name});
                      
//                      System.out.println(id+";--------");
//                      System.out.println(Items0fTrue[i]+"-----------;");
//                      System.out.println(jTable1.getValueAt(i, 0)+"++++++++++");   
                  }        

              jTable1=new JTable(tableModel){
                    Class[] types = new Class [] {
                      java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class
                  };
                  boolean[] canEdit = new boolean [] {
                      false, false, false
                  };

                  public Class getColumnClass(int columnIndex) {
                      return types [columnIndex];
                  }

                  public boolean isCellEditable(int rowIndex, int columnIndex) {
                      return canEdit [columnIndex];
                  }
              };    
              
              jTable1.getTableHeader().setReorderingAllowed(false);
              jScrollPane3.setViewportView(jTable1);

              } catch (Exception ex) {
                  Logger.getLogger(TestJPanel.class.getName()).log(Level.SEVERE, null, ex);
              }
          }      
    }

    private void AddNullForTable() {
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Boolean(true), null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "选择", "关键字名称", "关键字值"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(jTable1);
    }

    private void UploadXml(String path) throws FileNotFoundException, IOException, ParserConfigurationException, SAXException {
        String str=null;  
        File f=new File(path);
        FileInputStream fis=new FileInputStream(f);
        byte[]bs=new byte[1024];
        int count=0;
        while((count=fis.read(bs))>0){
            str=new String(bs,0,count);
        }
          
         OutputStreamWriter out=null;
         BufferedReader in=null;
         StringBuilder result=new StringBuilder();
         String url="http://"+server+"/MES.WIP.Webservice/FTService.asmx/MBTestXml";
         URL realUrl=new URL(url);
         HttpURLConnection conn= (HttpURLConnection) realUrl.openConnection();
         conn.setRequestProperty("Content-Type","application/x-www-form-urlencoded");
      //   conn.setRequestProperty("Content-Length",str.length());
         conn.setDoOutput(true);
         conn.setDoInput(true);
         conn.setRequestMethod("POST");
         out=new OutputStreamWriter(conn.getOutputStream(),"UTF-8");
         
         //正文，内容跟get的url中？后面的参数字符一致
         out.write("sXML="+str);
         out.flush();
         
          conn.connect();
          in=new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));
          String line;
          
          while((line=in.readLine())!=null){
              result.append(line);
          }
          System.out.println(result);
          
          if(result.toString().equals("<?xml version=\"1.0\" encoding=\"utf-8\"?><string xmlns=\"http://tempuri.org/\">OK</string>")){
              
//              jLabelUpload.setText(bar+" Transfer OK!--->"+result.substring(74,result.length()-9));
              jLabelUpload.setText(bar+"-->Transfer OK!"); 
              jLabelUpload.setForeground(Color.green);
              jLabelUpload.setFont(new Font("",1,16));
          }else{
//              jLabelUpload.setText(bar+" Transfer FAIL!--->"+result.substring(74,result.length()-9));
              jLabelUpload.setText(bar+"-->"+result.substring(74,result.length()-9));
              jLabelUpload.setForeground(Color.red);
              jLabelUpload.setFont(new Font("",1,20));
          }
          
          conn.disconnect();
          out.close();
          in.close();
    }
    
        public void SetEditFalse(){
            jTextField1.setEnabled(false);
            jTextFieldID.setEnabled(false);
            jTextFieldLine.setEnabled(false);
            jTextFieldPoit.setEnabled(false);
            jTextFieldServer.setEnabled(false);
            jTextField2.setEnabled(false);
            jTextFieldtoMES.setEnabled(false);
            jButtontoMES.setEnabled(false);
            jTextFieldLog.setEnabled(false);
            jButtonLog.setEnabled(false);
            jComboBoxIsCompare.setEnabled(false);
            jButtonSave.setEnabled(false);
    }
    
     public void SetEditTrue(){
            jTextField1.setEnabled(true);
            jTextFieldID.setEnabled(true);
            jTextFieldLine.setEnabled(true);
            jTextFieldPoit.setEnabled(true);
            jTextFieldServer.setEnabled(true);
            jTextField2.setEnabled(true);
            jTextFieldtoMES.setEnabled(true);
            jButtontoMES.setEnabled(true);
            jTextFieldLog.setEnabled(true);
            jButtonLog.setEnabled(true);
            jComboBoxIsCompare.setEnabled(true);
            jButtonSave.setEnabled(true);
    }
     
   public  void saveToFile(){
       File f=new File("c:\\name.log");
       FileOutputStream fos;
        try {
             fos = new FileOutputStream(f);
            if(!set.getID().equals(""))
               fos.write((set.getID()+",").getBytes());
            if(!set.getLine().equals(""))
               fos.write((set.getLine()+",").getBytes());
            if(!set.getLog_path().equals(""))
               fos.write((set.getLog_path()+",").getBytes());
            if(!set.getNum().equals(""))
               fos.write((set.getNum()+",").getBytes());
            if(!set.getPath().equals(""))
               fos.write((set.getPath()+",").getBytes());
            if(!set.getPoint().equals(""))
               fos.write((set.getPoint()+",").getBytes());
            if(!set.getServerIP().equals(""))
               fos.write((set.getServerIP()+",").getBytes());   
            if(!set.getToMES_path().equals(""))
               fos.write((set.getToMES_path()+",").getBytes());
            fos.write(isCompare.getBytes());
            fos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
     
   }  
    
    public void save(){
            set.setServerIP(jTextFieldServer.getText().toString());
            set.setID(jTextFieldID.getText().toString());
            set.setLine(jTextFieldLine.getText().toString());
            set.setToMES_path(jTextFieldtoMES.getText().toString());
            set.setPoint(jTextFieldPoit.getText().toString());
            set.setLog_path(jTextFieldLog.getText().toString());
            set.setPath(jTextField1.getText().toString());
//            System.out.println(jTextField.getText().toString()+"::::::::::::::");
            set.setNum(jTextField2.getText().toString());
         //  System.out.println(jTable1.getRowCount()+"]]]]]]]"); 
            isCompare=(String) jComboBoxIsCompare.getSelectedItem();
         //   System.out.println(isCompare+"isCompare");
        items();
        saveToFile();
    }
    
    public void items(){                   
        count=0;
        Items0fTrue=new String[30];
        
         File f=new File("c:\\uploaditem.log");
         FileOutputStream fos;
        try {
             fos = new FileOutputStream(f);
             for(int i=0;i<jTable1.getRowCount();i++){
                System.out.println(jTable1.getValueAt(i, 0)+"]]]]]]]");
                Object obj= jTable1.getValueAt(i, 0);
                if(obj==null){
                    ;
                }else if((boolean)obj){
                 Items0fTrue[count]=(String) jTable1.getValueAt(i, 1);
               //  Items0fTrueOfValue[count]=(String) jTable1.getValueAt(i, 2);
                   fos.write((Items0fTrue[count]+",").getBytes());
                   count++;
                   System.out.println(count+"'''''''''");
                }
            }
             fos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        MainJFrame Frame = new MainJFrame();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Frame.setVisible(true);
//                new MainJFrame().SetEditTrue();
                int message = JOptionPane.showConfirmDialog(new MainJFrame(), "是否需要修改设置信息","提示框", INFORMATION_MESSAGE);
//                System.out.println(message+"???????????");
                
                if(message==0){
                   Frame.SetEditTrue();//静态方法调用非静态方法
                   if(Frame.flag==true){
                       Frame.timer.cancel();
                       Frame.AddDataForTable(Frame.jTextFieldtoMES.getText().toString());
                  }
                }else if(message==1){
                  // Frame.SetEditFalse();
                }
                
            }
        });
    }
    
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private int count=0;
    private String[]Items0fTrue=new String[30];
    private String newPwd="";
   // private String[]Items0fTrueOfValue=new String[30];
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConfirm;
    private javax.swing.JButton jButtonLog;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JButton jButtontoMES;
    private javax.swing.JComboBox jComboBoxIsCompare;
    private javax.swing.JTextPane jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelBarCode;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelIsCheck;
    private javax.swing.JLabel jLabelIsCompare;
    private javax.swing.JLabel jLabelLine;
    private javax.swing.JLabel jLabelLog;
    private javax.swing.JLabel jLabelPoit;
    private javax.swing.JLabel jLabelServer;
    private javax.swing.JLabel jLabelSetPwd;
    private javax.swing.JLabel jLabelSetting;
    private javax.swing.JLabel jLabelUpload;
    private javax.swing.JLabel jLabelpwd;
    private javax.swing.JLabel jLabeltoMES;
    private javax.swing.JPanel jPanelChange;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextFieldBarCode;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldLine;
    private javax.swing.JTextField jTextFieldLog;
    private javax.swing.JTextField jTextFieldPoit;
    private javax.swing.JTextField jTextFieldServer;
    private javax.swing.JPasswordField jTextFieldSetPwd;
    private javax.swing.JTextField jTextFieldtoMES;
    // End of variables declaration//GEN-END:variables
    String[] substr=null;
    String[] netstr=new String[30];
    String msFileName="";
    String bar=null;
    File msFile=null;
    String[]err=new String[2];
    NodeList nL=null;
    String server=null; 
    Setting set;
    Object obj=new Object();
    boolean flag=false;
    Timer timer=null;
    int list_size=0;
    boolean isDelete=false;
    String isCompare="";
}
