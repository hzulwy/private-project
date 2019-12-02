/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package compareuploadprograms;

import compareuploadprograms.testJComboBox.RwJComboBox;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author dell
 */
public class SetJPanel extends javax.swing.JPanel {
    
    String str[][] = new String[13][3];

    /**
     * Creates new form SetJPanel
     */
    public SetJPanel() {
        initComponents();
//        initStr();
//        initComponents3();
    }

    public SetJPanel(Setting set) {
//        initStr();
        this.set=set;
        initComponents2();
    }
    

    
    private void initComponents3(){
     //    String str[][] = new String[10][3];
        
        jLabelSetting = new javax.swing.JLabel();
        jLabelServer = new javax.swing.JLabel();
        jTextFieldServer = new javax.swing.JTextField();
        jLabelID = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jLabelPoit = new javax.swing.JLabel();
        jTextFieldPoit = new javax.swing.JTextField();
        jTextFieldLine = new javax.swing.JTextField();
        jLabelLine = new javax.swing.JLabel();
        jLabeltoMES = new javax.swing.JLabel();
        jTextFieldtoMES = new javax.swing.JTextField();
        jButtontoMES = new javax.swing.JButton();
        jLabelLog = new javax.swing.JLabel();
        jTextFieldLog = new javax.swing.JTextField();
        jButtonLog = new javax.swing.JButton();
        jLabelProduct = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButtonSave = new javax.swing.JButton();
        jLabelpwd = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        UploadBox = new RwJComboBox(str);
        UploadBox.setEditable(true);
        
        SetEditFalse();
        setPreferredSize(new java.awt.Dimension(700, 470));

        jLabelSetting.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jLabelSetting.setText("基本设置");

        jLabelServer.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jLabelServer.setText("服务器IP：");

//        jTextFieldServer.setEditable(false);
        jTextFieldServer.setText("30.30.0.30");
        jTextFieldServer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldServerActionPerformed(evt);
            }
        });

        jLabelID.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jLabelID.setText("工号：");

//        jTextFieldID.setEditable(false);

        jLabelPoit.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jLabelPoit.setText("机台号（站别）:");

//        jTextFieldPoit.setEditable(false);

//        jTextFieldLine.setEditable(false);

        jLabelLine.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jLabelLine.setText("线别：");

        jLabeltoMES.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jLabeltoMES.setText("toMES执行资料夹");

        jButtontoMES.setText("Open");
        jButtontoMES.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtontoMESMouseClicked(evt);
            }
        });

        jLabelLog.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jLabelLog.setText("log存放资料夹");

        jButtonLog.setText("Open");
        jButtonLog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonLogMouseClicked(evt);
            }
        });

        jLabelProduct.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jLabelProduct.setText("工程设置");

        jLabel2.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jLabel2.setText("站别ID");

//        jTextField1.setEditable(false);

        jLabel1.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jLabel1.setText("上传项目");

        jButtonSave.setText("保存");
        jButtonSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSaveMouseClicked(evt);
            }
        });

        jLabelpwd.setFont(new java.awt.Font("新細明體", 1, 18)); // NOI18N
        jLabelpwd.setText("密码：");

        jPasswordField.setFont(new java.awt.Font("新細明體", 0, 18)); // NOI18N
        jPasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordFieldKeyPressed(evt);
            }
        });
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSave)
                .addGap(316, 316, 316))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 2, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelServer)
                            .addComponent(jLabelSetting)
                            .addComponent(jTextFieldServer, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelID))
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabelpwd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPasswordField))
                            .addComponent(jTextFieldtoMES, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtontoMES))
                    .addComponent(jLabelProduct)
                    .addComponent(jLabeltoMES)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(UploadBox))))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldLog)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonLog))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldLine, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelPoit))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldPoit, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelLine)))
                            .addComponent(jLabelLog))
                        .addGap(0, 19, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelSetting)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelServer)
                    .addComponent(jLabelID)
                    .addComponent(jLabelPoit)
                    .addComponent(jLabelLine))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldServer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldLine, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPoit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelLog)
                    .addComponent(jLabeltoMES))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldtoMES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtontoMES)
                    .addComponent(jTextFieldLog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLog))
                .addGap(49, 49, 49)
                .addComponent(jLabelProduct)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UploadBox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelpwd)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jButtonSave)
                .addContainerGap())
        );
    }
    
     private void initComponents2() {
       jLabelSetting = new javax.swing.JLabel();
        jLabelServer = new javax.swing.JLabel();
        jTextFieldServer = new javax.swing.JTextField();
        jLabelID = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jLabelPoit = new javax.swing.JLabel();
        jTextFieldPoit = new javax.swing.JTextField();
        jTextFieldLine = new javax.swing.JTextField();
        jLabelLine = new javax.swing.JLabel();
        jLabeltoMES = new javax.swing.JLabel();
        jTextFieldtoMES = new javax.swing.JTextField();
        jButtontoMES = new javax.swing.JButton();
        jLabelLog = new javax.swing.JLabel();
        jTextFieldLog = new javax.swing.JTextField();
        jButtonLog = new javax.swing.JButton();
        jLabelProduct = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButtonSave = new javax.swing.JButton();
        jLabelpwd = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        jTextField2 = new javax.swing.JTextField();

         SetEditFalse();
        setPreferredSize(new java.awt.Dimension(700, 470));

        jLabelSetting.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jLabelSetting.setText("基本设置");

        jLabelServer.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jLabelServer.setText("服务器IP：");

      //  jTextFieldServer.setEditable(false);
        jTextFieldServer.setText(set.getServerIP());
        jTextFieldServer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldServerActionPerformed(evt);
            }
        });

        jLabelID.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jLabelID.setText("工号：");
        jTextFieldID.setText(set.getID());
        //jTextFieldID.setEnabled(false);

        jLabelPoit.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jLabelPoit.setText("机台号（站别）:");
        jTextFieldPoit.setText(set.getPoint());

    //    jTextFieldLine.setEditable(false);

        jLabelLine.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jLabelLine.setText("线别：");
        jTextFieldLine.setText(set.getLine());

        jLabeltoMES.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jLabeltoMES.setText("toMES执行资料夹");

        jButtontoMES.setText("Open");
        jButtontoMES.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtontoMESMouseClicked(evt);
            }
        });

        jLabelLog.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jLabelLog.setText("log存放资料夹");

        jButtonLog.setText("Open");
        jButtonLog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonLogMouseClicked(evt);
            }
        });

        jLabelProduct.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jLabelProduct.setText("工程设置");

        jLabel2.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jLabel2.setText("站别ID");
        jTextField1.setText(set.getPath());

        jLabel1.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jLabel1.setText("上传项目数");
        jTextField2.setText(set.getNum());
        
        jButtonSave.setText("保存");
        jButtonSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSaveMouseClicked(evt);
            }
        });

        jLabelpwd.setFont(new java.awt.Font("新細明體", 1, 18)); // NOI18N
        jLabelpwd.setText("密码：");

        jPasswordField.setFont(new java.awt.Font("新細明體", 0, 18)); // NOI18N
        jPasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordFieldKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSave)
                .addGap(316, 316, 316))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 2, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelServer)
                            .addComponent(jLabelSetting)
                            .addComponent(jTextFieldServer, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelID))
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabelpwd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPasswordField))
                            .addComponent(jTextFieldtoMES, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtontoMES))
                    .addComponent(jLabelProduct)
                    .addComponent(jLabeltoMES)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldLog)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonLog))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldLine, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelPoit))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldPoit, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelLine)))
                            .addComponent(jLabelLog))
                        .addGap(0, 19, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelSetting)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelServer)
                    .addComponent(jLabelID)
                    .addComponent(jLabelPoit)
                    .addComponent(jLabelLine))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldServer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldLine, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPoit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelLog)
                    .addComponent(jLabeltoMES))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldtoMES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtontoMES)
                    .addComponent(jTextFieldLog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLog))
                .addGap(49, 49, 49)
                .addComponent(jLabelProduct)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelpwd)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jButtonSave)
                .addContainerGap())
        );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelSetting = new javax.swing.JLabel();
        jLabelServer = new javax.swing.JLabel();
        jTextFieldServer = new javax.swing.JTextField();
        jLabelID = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jLabelPoit = new javax.swing.JLabel();
        jTextFieldPoit = new javax.swing.JTextField();
        jTextFieldLine = new javax.swing.JTextField();
        jLabelLine = new javax.swing.JLabel();
        jLabeltoMES = new javax.swing.JLabel();
        jTextFieldtoMES = new javax.swing.JTextField();
        jButtontoMES = new javax.swing.JButton();
        jLabelLog = new javax.swing.JLabel();
        jTextFieldLog = new javax.swing.JTextField();
        jButtonLog = new javax.swing.JButton();
        jLabelProduct = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButtonSave = new javax.swing.JButton();
        jLabelpwd = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        jTextField2 = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(700, 470));

        jLabelSetting.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jLabelSetting.setText("基本设置");

        jLabelServer.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jLabelServer.setText("服务器IP：");

        jTextFieldServer.setText("30.30.0.30");
        jTextFieldServer.setEnabled(false);
        jTextFieldServer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldServerActionPerformed(evt);
            }
        });

        jLabelID.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jLabelID.setText("工号：");

        jTextFieldID.setEnabled(false);

        jLabelPoit.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jLabelPoit.setText("机台号（站别）:");

        jTextFieldPoit.setEnabled(false);

        jTextFieldLine.setEnabled(false);

        jLabelLine.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jLabelLine.setText("线别：");

        jLabeltoMES.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jLabeltoMES.setText("toMES执行资料夹");

        jButtontoMES.setText("Open");
        jButtontoMES.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtontoMESMouseClicked(evt);
            }
        });

        jLabelLog.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jLabelLog.setText("log存放资料夹");

        jButtonLog.setText("Open");
        jButtonLog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonLogMouseClicked(evt);
            }
        });

        jLabelProduct.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jLabelProduct.setText("工程设置");

        jLabel2.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jLabel2.setText("站别ID");

        jTextField1.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        jLabel1.setText("上传项目");

        jButtonSave.setText("保存");
        jButtonSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSaveMouseClicked(evt);
            }
        });

        jLabelpwd.setFont(new java.awt.Font("新細明體", 1, 18)); // NOI18N
        jLabelpwd.setText("密码：");

        jPasswordField.setFont(new java.awt.Font("新細明體", 0, 18)); // NOI18N
        jPasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordFieldKeyPressed(evt);
            }
        });

        jTextField2.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSave)
                .addGap(316, 316, 316))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 2, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelServer)
                            .addComponent(jLabelSetting)
                            .addComponent(jTextFieldServer, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelID))
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabelpwd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPasswordField))
                            .addComponent(jTextFieldtoMES, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtontoMES))
                    .addComponent(jLabelProduct)
                    .addComponent(jLabeltoMES)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldLog)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonLog))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldLine, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelPoit))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldPoit, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelLine)))
                            .addComponent(jLabelLog))
                        .addGap(0, 19, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelSetting)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelServer)
                    .addComponent(jLabelID)
                    .addComponent(jLabelPoit)
                    .addComponent(jLabelLine))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldServer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldLine, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPoit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelLog)
                    .addComponent(jLabeltoMES))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldtoMES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtontoMES)
                    .addComponent(jTextFieldLog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLog))
                .addGap(49, 49, 49)
                .addComponent(jLabelProduct)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelpwd)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jButtonSave)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldServerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldServerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldServerActionPerformed

    private void jButtontoMESMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtontoMESMouseClicked
        // TODO add your handling code here: 
       String path=null;
        try {
              JFileChooser jdir = new JFileChooser();
            //设置选择路径模式
            jdir.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            //过滤文件类型
           // FileNameExtensionFilter filter = new FileNameExtensionFilter("Xml文件(*.xml;)","xml"); 
            //jdir.setFileFilter(filter);
            //设置对话框标题
            jdir.setDialogTitle("请选择文件路径");
            if (JFileChooser.APPROVE_OPTION == jdir.showOpenDialog(null)) {//用户点击了确定
                    path = jdir.getSelectedFile().getAbsolutePath();//取得路径选择
                    jTextFieldtoMES.setText(path);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButtontoMESMouseClicked

    private void jButtonLogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLogMouseClicked
        // TODO add your handling code here:
       String path=null;
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

    private void jButtonSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSaveMouseClicked
        // TODO add your handling code here:
        SetEditFalse();
        save();
    }//GEN-LAST:event_jButtonSaveMouseClicked

    private void jPasswordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldKeyPressed
        // TODO add your handling code here:
        String pwd=jPasswordField.getText();
      //  System.out.println(pwd);
        if(pwd.equals("000000")){
            jPasswordField.setText("");
            SetEditTrue();       
        }
    }//GEN-LAST:event_jPasswordFieldKeyPressed

    public void SetEditFalse(){
            jTextField1.setEnabled(false);
//            UploadBox.setEditable(false);
//            UploadBox.setEnabled(false);
            jTextFieldID.setEnabled(false);
            jTextFieldLine.setEnabled(false);
            //jTextFieldLog.setEditable(false);
            jTextFieldPoit.setEnabled(false);
            jTextFieldServer.setEnabled(false);
            jTextField2.setEnabled(false);
            // jTextFieldtoMES.setEditable(false);
    }
    
     public void SetEditTrue(){
            jTextField1.setEnabled(true);
//            UploadBox.setEditable(true);
//            UploadBox.setEnabled(true);
            jTextFieldID.setEnabled(true);
            jTextFieldLine.setEnabled(true);
            //jTextFieldLog.setEditable(false);
            jTextFieldPoit.setEnabled(true);
            jTextFieldServer.setEnabled(true);
            jTextField2.setEnabled(true);
           // jTextFieldtoMES.setEditable(false);
    }
    
    public void save(){
            set=new Setting();
            set.setServerIP(jTextFieldServer.getText().toString());
            set.setID(jTextFieldID.getText().toString());
            set.setLine(jTextFieldLine.getText().toString());
            set.setToMES_path(jTextFieldtoMES.getText().toString());
            set.setPoint(jTextFieldPoit.getText().toString());
            set.setLog_path(jTextFieldLog.getText().toString());
            set.setPath(jTextField1.getText().toString());
//            JTextField jTextField=(JTextField)UploadBox.getEditor().getEditorComponent();
//            UploadItem=jTextField.getText().toString();
//            System.out.println(jTextField.getText().toString()+"::::::::::::::");
            set.setNum(jTextField2.getText().toString());
            new SetJPanel(set);
    }

    static Setting set;
    private int count=1;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLog;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JButton jButtontoMES;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelLine;
    private javax.swing.JLabel jLabelLog;
    private javax.swing.JLabel jLabelPoit;
    private javax.swing.JLabel jLabelProduct;
    private javax.swing.JLabel jLabelServer;
    private javax.swing.JLabel jLabelSetting;
    private javax.swing.JLabel jLabelpwd;
    private javax.swing.JLabel jLabeltoMES;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldLine;
    private javax.swing.JTextField jTextFieldLog;
    private javax.swing.JTextField jTextFieldPoit;
    private javax.swing.JTextField jTextFieldServer;
    private javax.swing.JTextField jTextFieldtoMES;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JComboBox UploadBox;
    public String UploadItem="";

    private void initStr() {
       str[0][0]="Button";
       str[1][0]="WIP_NO";
       str[2][0]="ITEM_NO";
       str[3][0]="WIFI_MAC";
       str[4][0]="BT_MAC";
       str[5][0]="IMEI";
       str[6][0]="IMEI1";
       str[7][0]="WVKEYID";
       str[8][0]="SN";
       str[9][0]="SN1";
       str[10][0]="NET_MAC";
       str[11][0]="DOCKSN";
       str[12][0]="IMSI";
    }

}
