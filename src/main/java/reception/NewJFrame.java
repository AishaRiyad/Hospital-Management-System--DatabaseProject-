/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package reception;

import DBConnection.DBConnection;
import java.awt.Color;
import java.awt.Font;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import login.Login;
import login.LoginUser;

/**
 *
 * @author ThinkPad
 */

  
     public class NewJFrame extends javax.swing.JFrame {
    
     private LoginUser receptionUser;
     private static final String MALE = "Male";
     private static final String FEMALE = "Female";
     private boolean isFromSearch = false;
     private List<History> patientList;
    /**
     * Creates new form NewJFrame
     */
    
    
    
    
    
    
    
    public NewJFrame(LoginUser receptionName) throws ParseException {
        initComponents();
        this.setResizable(false);
         this.receptionUser = receptionName;
          addreceptionInfoToGUI();
          addChangePasswordDefaultSettings();
          String formattedDate = new SimpleDateFormat("yyyy_MM_dd").format(Calendar.getInstance().getTime());
            Date date = new SimpleDateFormat("yyyy_MM_dd").parse(formattedDate);
            Birthdate.setMaxSelectableDate(date);
            jDateChooser1.setMaxSelectableDate(date);
            enterdatetextfield.setMinSelectableDate(date);
            exitdatetextfield.setMinSelectableDate(date);
//        receptionınInfoToGUI();
    }
    
     public LoginUser getfinantialUser() {
        return receptionUser;
    }

    public void setAdminUser(LoginUser adminUser) {
        this.receptionUser = receptionUser;
    }
    
    private void addreceptionInfoToGUI() {
        jLabel24uname.setText(receptionUser.getUsername());
        Username.setText(receptionUser.getUsername());
       SSN.setText(receptionUser.getSsn());
        Email.setText(receptionUser.getEmail());
        Birthdate.setDate(receptionUser.getBirthdate());
        if (receptionUser.getGender().equalsIgnoreCase(MALE)) {
            maleRadioButton.setSelected(true);
        } else if (receptionUser.getGender().equalsIgnoreCase(FEMALE)) {
           femaleRadioButton.setSelected(true);
        }
        
        setEditProfileInfoUsernameDefault();
        setEditProfileInfoEmailDefault();
        setEditProfileInfoDateDefault();
    }
    
     public void addPlaceholder(JTextField text) {
        Font font = text.getFont();
        font = font.deriveFont(Font.BOLD);
        text.setFont(font);
        text.setForeground(Color.GRAY);
    }

    public void removePlaceholder(JTextField text) {
        Font font = text.getFont();
        font = font.deriveFont(Font.PLAIN | Font.BOLD);
        text.setFont(font);
        text.setForeground(Color.BLACK);
    }
    
     private void addChangePasswordDefaultSettings() {
        this.setFocusable(true);
        addPlaceholder(oldPasswordTextField);
        addPlaceholder(newPasswordTextField);
        addPlaceholder(confirmNewPasswordTextField);
        setDefaultChangePasswordGUIValues();
        
    }
    
     private void setEditProfileInfoUsernameDefault() {
        Username.setBorder(null);
        jLabel42.setText("");
    }

    private void setEditProfileInfoEmailDefault() {
        Email.setBorder(null);
        jLabel43.setText("");
    }

    private void setEditProfileInfoDateDefault() {
        Birthdate.setBorder(null);
        jLabel44.setText("");
    }
   
    
    
    
    
    
     
    
    
    
//     private void receptionınInfoToGUI(){
//        
//     try{
//         DriverManager.registerDriver(new org.postgresql.Driver());
//         String connect="jdbc:postgresql://localhost:5432/postgres";
//         Connection con=DriverManager.getConnection(connect,"aisha","555333555@aisha");
//         Statement stm=con.createStatement();
//         String sql= "SELECT uname FROM hospital.login WHERE itype = '1'";//تعديل
//          
//          ResultSet rs=stm.executeQuery(sql);
//                if(rs.next()){
//                  String runame=rs.getString("uname");
//                  jLabel24uname.setText(runame); 
//                  Username.setText(runame); 
//                  
//                sql= "SELECT ssn FROM hospital.login WHERE itype = '1'";//تعديل
//                  rs=stm.executeQuery(sql);
//             while(rs.next()){
//           String rssn=rs.getString("ssn");
//                  SSN.setText(rssn);
//             }
//             sql= "SELECT email FROM hospital.login WHERE itype = '1'";//تعديل
//                  rs=stm.executeQuery(sql);
//             while(rs.next()){
//           String remail=rs.getString("email");
//                Email.setText(remail);
//             }
//             
//             sql= "SELECT gender FROM hospital.login WHERE itype = '1'";//تعديل
//              rs=stm.executeQuery(sql);
//             while(rs.next()){
//           String rgender=rs.getString("gender");
//                if(rgender.equalsIgnoreCase("male") ){
//                    maleRadioButton.setSelected(true);
//                    
//                }else
//                  femaleRadioButton.setSelected(true);
//             }
//             
//             sql="select birthdate from hospital.login WHERE itype = '1'";//تعديل
//             rs=stm.executeQuery(sql);
//             while(rs.next()){
//           java.sql.Date bdate = rs.getDate("birthdate");
//             Birthdate.setDate(bdate);
//             }
//             
//             
//             
//                }
//        
//        
//     }
//     catch (Exception ex) {
//           
//        JOptionPane.showConfirmDialog(null, ex.toString());
//        }
         
         
//     }
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel16 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel24uname = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Username = new javax.swing.JTextField();
        SSN = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        Birthdate = new com.toedter.calendar.JDateChooser();
        maleRadioButton = new javax.swing.JRadioButton();
        femaleRadioButton = new javax.swing.JRadioButton();
        jLabel38 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        search = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        oldPasswordTextField = new javax.swing.JPasswordField();
        newPasswordTextField = new javax.swing.JPasswordField();
        confirmNewPasswordTextField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        Save = new javax.swing.JLabel();
        Cancel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        enterdatetextfield = new com.toedter.calendar.JDateChooser();
        exitdatetextfield = new com.toedter.calendar.JDateChooser();
        costfield = new javax.swing.JTextField();
        deseasefield = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        savePatientLabelButton = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();

        jLabel16.setText("jLabel16");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24uname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel24uname.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit-user.png"))); // NOI18N
        jPanel1.add(jLabel24uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 80));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        jLabel33.setText("LogOut");
        jLabel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel33MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 190, 50));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/settings_icon.png"))); // NOI18N
        jLabel34.setText("Settings");
        jLabel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel34MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 170, 50));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/employeer.png"))); // NOI18N
        jLabel35.setText("Reception");
        jLabel35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel35MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 180, 190, 50));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hospital1.png"))); // NOI18N
        jPanel11.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 650));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab1", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel12.setBackground(new java.awt.Color(204, 255, 204));

        jLabel36.setFont(new java.awt.Font("Snap ITC", 1, 24)); // NOI18N
        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/name.png"))); // NOI18N
        jLabel36.setText("  Profile Info");
        jLabel36.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel36.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLabel36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel36MouseClicked(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Snap ITC", 1, 24)); // NOI18N
        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/password2.png"))); // NOI18N
        jLabel37.setText("Change Password");
        jLabel37.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel37.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLabel37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel37MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(263, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 195, Short.MAX_VALUE)
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab2", jPanel4);

        jPanel13.setBackground(new java.awt.Color(204, 255, 204));

        jPanel14.setBackground(new java.awt.Color(204, 255, 204));
        jPanel14.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setText("Username");
        jPanel14.add(jLabel7);
        jLabel7.setBounds(50, 160, 139, 45);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setText("SSN");
        jPanel14.add(jLabel8);
        jLabel8.setBounds(49, 260, 160, 45);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setText("Email");
        jPanel14.add(jLabel9);
        jLabel9.setBounds(60, 360, 139, 45);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setText("Gender");
        jPanel14.add(jLabel10);
        jLabel10.setBounds(60, 440, 139, 43);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setText("Birthdate");
        jPanel14.add(jLabel11);
        jLabel11.setBounds(60, 500, 147, 45);

        Username.setEditable(false);
        jPanel14.add(Username);
        Username.setBounds(240, 170, 327, 45);

        SSN.setEditable(false);
        SSN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SSNActionPerformed(evt);
            }
        });
        jPanel14.add(SSN);
        SSN.setBounds(240, 260, 327, 45);

        Email.setEditable(false);
        jPanel14.add(Email);
        Email.setBounds(240, 360, 327, 49);
        jPanel14.add(Birthdate);
        Birthdate.setBounds(240, 500, 327, 45);

        maleRadioButton.setBackground(new java.awt.Color(204, 255, 204));
        buttonGroup1.add(maleRadioButton);
        maleRadioButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        maleRadioButton.setForeground(new java.awt.Color(255, 0, 0));
        maleRadioButton.setText("Male");
        maleRadioButton.setOpaque(true);
        jPanel14.add(maleRadioButton);
        maleRadioButton.setBounds(240, 440, 106, 43);

        femaleRadioButton.setBackground(new java.awt.Color(204, 255, 204));
        buttonGroup1.add(femaleRadioButton);
        femaleRadioButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        femaleRadioButton.setForeground(new java.awt.Color(255, 0, 0));
        femaleRadioButton.setText("Famale");
        femaleRadioButton.setOpaque(true);
        jPanel14.add(femaleRadioButton);
        femaleRadioButton.setBounds(440, 440, 130, 43);

        jLabel38.setFont(new java.awt.Font("Ravie", 1, 24)); // NOI18N
        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/profileInfo.png"))); // NOI18N
        jLabel38.setText("Account Info");
        jPanel14.add(jLabel38);
        jLabel38.setBounds(50, 30, 297, 73);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit2.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel14.add(jLabel6);
        jLabel6.setBounds(570, 160, 46, 50);

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit2.png"))); // NOI18N
        jLabel39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel39MouseClicked(evt);
            }
        });
        jPanel14.add(jLabel39);
        jLabel39.setBounds(570, 360, 54, 47);

        jLabel41.setFont(new java.awt.Font("Snap ITC", 1, 24)); // NOI18N
        jLabel41.setText("   Cancel");
        jLabel41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel41MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel41MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel41MouseExited(evt);
            }
        });
        jPanel14.add(jLabel41);
        jLabel41.setBounds(480, 590, 154, 43);
        jPanel14.add(jLabel42);
        jLabel42.setBounds(240, 220, 327, 20);
        jPanel14.add(jLabel43);
        jLabel43.setBounds(240, 410, 327, 20);
        jPanel14.add(jLabel44);
        jLabel44.setBounds(240, 550, 327, 20);

        jLabel40.setFont(new java.awt.Font("Snap ITC", 1, 24)); // NOI18N
        jLabel40.setText("    Save");
        jLabel40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel40MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel40MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel40MouseExited(evt);
            }
        });
        jPanel14.add(jLabel40);
        jLabel40.setBounds(280, 590, 154, 43);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab4", jPanel6);

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel15.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 470, 60));

        jLabel45.setFont(new java.awt.Font("Snap ITC", 1, 24)); // NOI18N
        jLabel45.setText("    Cancel");
        jLabel45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel45MouseClicked(evt);
            }
        });
        jPanel15.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 490, 160, 60));

        jButton2.setFont(new java.awt.Font("Snap ITC", 1, 24)); // NOI18N
        jButton2.setText("ADD");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 413, 150, 70));

        jButton1.setFont(new java.awt.Font("Snap ITC", 1, 24)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 330, 150, 70));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cartoon-physician.png"))); // NOI18N
        jLabel15.setText("jLabel15");
        jPanel15.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 690));

        jPanel7.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 670));

        jTabbedPane1.addTab("tab5", jPanel7);

        jPanel16.setBackground(new java.awt.Color(204, 255, 204));
        jPanel16.setLayout(null);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel17.setText("patient name");
        jPanel16.add(jLabel17);
        jLabel17.setBounds(60, 70, 169, 45);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel18.setText("patient ssn");
        jPanel16.add(jLabel18);
        jLabel18.setBounds(60, 390, 169, 45);

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel19.setText("address");
        jPanel16.add(jLabel19);
        jLabel19.setBounds(60, 480, 169, 45);

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel20.setText("gender");
        jPanel16.add(jLabel20);
        jLabel20.setBounds(60, 320, 169, 45);

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel21.setText("material status");
        jPanel16.add(jLabel21);
        jLabel21.setBounds(60, 160, 169, 50);

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel22.setText("birthdate");
        jPanel16.add(jLabel22);
        jLabel22.setBounds(60, 240, 169, 45);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel16.add(jTextField2);
        jTextField2.setBounds(320, 70, 275, 45);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel16.add(jTextField3);
        jTextField3.setBounds(320, 480, 275, 50);
        jPanel16.add(jTextField4);
        jTextField4.setBounds(320, 390, 275, 45);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "married", "single" }));
        jComboBox2.setOpaque(true);
        jPanel16.add(jComboBox2);
        jComboBox2.setBounds(320, 160, 275, 50);

        jDateChooser1.setDateFormatString("yyy-MM-dd");
        jPanel16.add(jDateChooser1);
        jDateChooser1.setBounds(320, 240, 275, 45);

        jRadioButton1.setBackground(new java.awt.Color(204, 255, 204));
        buttonGroup2.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 0, 0));
        jRadioButton1.setText("Male");
        jRadioButton1.setOpaque(true);
        jPanel16.add(jRadioButton1);
        jRadioButton1.setBounds(320, 320, 100, 30);

        jRadioButton2.setBackground(new java.awt.Color(204, 255, 204));
        buttonGroup2.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 0, 0));
        jRadioButton2.setText("Female");
        jRadioButton2.setOpaque(true);
        jPanel16.add(jRadioButton2);
        jRadioButton2.setBounds(490, 320, 130, 40);

        jLabel12.setFont(new java.awt.Font("Snap ITC", 1, 20)); // NOI18N
        jLabel12.setText("   Cancel");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel16.add(jLabel12);
        jLabel12.setBounds(470, 600, 150, 47);

        jLabel14.setFont(new java.awt.Font("Snap ITC", 1, 20)); // NOI18N
        jLabel14.setText("jLabel14");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel16.add(jLabel14);
        jLabel14.setBounds(90, 600, 290, 47);
        jPanel16.add(jLabel46);
        jLabel46.setBounds(320, 440, 275, 20);
        jPanel16.add(jLabel47);
        jLabel47.setBounds(320, 120, 275, 20);
        jPanel16.add(jLabel48);
        jLabel48.setBounds(320, 540, 275, 30);
        jPanel16.add(jLabel49);
        jLabel49.setBounds(320, 290, 275, 30);
        jPanel16.add(jLabel50);
        jLabel50.setBounds(320, 210, 275, 20);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab6", jPanel8);

        jPanel9.setBackground(new java.awt.Color(153, 255, 153));

        jList1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 255, 153), 5));
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jList1);

        jButton3.setFont(new java.awt.Font("Snap ITC", 1, 24)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        jButton3.setText("ADD");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Snap ITC", 1, 24)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel.png"))); // NOI18N
        jButton4.setText("Cancel");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("tab7", jPanel9);

        jPanel5.setBackground(new java.awt.Color(204, 255, 204));

        jPanel10.setBackground(new java.awt.Color(204, 255, 204));

        oldPasswordTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                oldPasswordTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                oldPasswordTextFieldFocusLost(evt);
            }
        });

        newPasswordTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                newPasswordTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                newPasswordTextFieldFocusLost(evt);
            }
        });

        confirmNewPasswordTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                confirmNewPasswordTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                confirmNewPasswordTextFieldFocusLost(evt);
            }
        });
        confirmNewPasswordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmNewPasswordTextFieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Jokerman", 1, 36)); // NOI18N
        jLabel1.setText("    Change Password");

        Save.setFont(new java.awt.Font("Elephant", 1, 24)); // NOI18N
        Save.setText(" Change Password");
        Save.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        Save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SaveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SaveMouseExited(evt);
            }
        });

        Cancel.setFont(new java.awt.Font("Elephant", 1, 24)); // NOI18N
        Cancel.setText("            Cancel");
        Cancel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        Cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CancelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CancelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(oldPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(newPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(confirmNewPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(166, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(oldPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(newPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(confirmNewPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab3", jPanel5);

        jPanel18.setBackground(new java.awt.Color(204, 255, 204));

        jLabel24.setFont(new java.awt.Font("Elephant", 1, 18)); // NOI18N
        jLabel24.setText("patient enter date");

        jLabel25.setFont(new java.awt.Font("Elephant", 1, 18)); // NOI18N
        jLabel25.setText("patient exit date");

        jLabel26.setFont(new java.awt.Font("Elephant", 1, 18)); // NOI18N
        jLabel26.setText("Cost");

        jLabel27.setFont(new java.awt.Font("Elephant", 1, 18)); // NOI18N
        jLabel27.setText("patient desease");

        enterdatetextfield.setDateFormatString("yyy-MM-dd");

        exitdatetextfield.setDateFormatString("yyy-MM-dd");

        costfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                costfieldKeyTyped(evt);
            }
        });

        deseasefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deseasefieldActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Snap ITC", 1, 36)); // NOI18N
        jLabel32.setText("  History");

        savePatientLabelButton.setFont(new java.awt.Font("Snap ITC", 1, 24)); // NOI18N
        savePatientLabelButton.setText("   Save");
        savePatientLabelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                savePatientLabelButtonMouseClicked(evt);
            }
        });

        jLabel52.setFont(new java.awt.Font("Snap ITC", 1, 24)); // NOI18N
        jLabel52.setText("   Cancel");
        jLabel52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel52MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(enterdatetextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(354, 354, 354)
                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(deseasefield, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(354, 354, 354)
                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(costfield, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(354, 354, 354)
                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(exitdatetextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(354, 354, 354)
                .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(savePatientLabelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140)
                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel32)
                .addGap(79, 79, 79)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterdatetextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deseasefield, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(costfield, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(exitdatetextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(savePatientLabelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jTabbedPane1.addTab("tab8", jPanel18);

        jPanel2.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 760, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmNewPasswordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmNewPasswordTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmNewPasswordTextFieldActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed
    
    
    private void createListHistoryPanels(String ssn){
         try {
             patientList = new ArrayList<>();
             String query = "SELECT * FROM hospital.history WHERE patientssn='" + ssn + "' ORDER BY payornot DESC, enterdate ASC";
             Connection c = DBConnection.getDBConnection();
             PreparedStatement p = c.prepareStatement(query);
             ResultSet rs = p.executeQuery();
             
             if (rs.next()) {
                // Populate staffList
                do {
                    patientList.add(new History(rs));
                } while (rs.next());
            }
             DefaultListModel defaultListModel = new DefaultListModel();
             for (History patient : patientList) {
                if (patient.getSsn()!= null) {
                    defaultListModel.addElement(patient.toString());
                }

         }
                         jList1.setModel(defaultListModel);

         } catch (Exception ex) {
             Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                 }
    }    
    private void deseasefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deseasefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deseasefieldActionPerformed

    private void jLabel33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseClicked
        // TODO add your handling code here:
          Login login = new Login();
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel33MouseClicked
    
     private void setDefaultChangePasswordGUIValues() {
        setDefaultOldPassGUIValue();
        setDefaultNewPassGUIValue();
        setDefaultConfirmNewPassGUIValues();
        oldPasswordFieldsLostFocus();
        newPasswordFieldsLostFocus();
        confirmNewPasswordFieldsLostFocus();
    }
     
     private void setDefaultOldPassGUIValue() {
        oldPasswordTextField.setBorder(null);
        jLabel2.setText("");
    }
     
     private void setDefaultNewPassGUIValue() {
        newPasswordTextField .setBorder(null);
        jLabel3.setText("");
    }  
     
     private void setDefaultConfirmNewPassGUIValues() {
        confirmNewPasswordTextField.setBorder(null);
        jLabel4.setText("");
    }
     
    private void oldPasswordFieldGainFocus() {
        oldPasswordTextField.setText(null);
        oldPasswordTextField.requestFocus();
        oldPasswordTextField.setEchoChar('*');
        removePlaceholder(oldPasswordTextField);
    }
    
     private void newPasswordFieldGainFocus() {
        newPasswordTextField.setText(null);
        newPasswordTextField.requestFocus();
        newPasswordTextField.setEchoChar('*');
        removePlaceholder(newPasswordTextField);
    }
     
    private void confirmNewPasswordFieldGainFocus() {
        confirmNewPasswordTextField.setText(null);
        confirmNewPasswordTextField.requestFocus();
        confirmNewPasswordTextField.setEchoChar('*');
        removePlaceholder(confirmNewPasswordTextField);
    }
    
    private void oldPasswordFieldsLostFocus() {
        addPlaceholder(oldPasswordTextField);
        oldPasswordTextField.setText("Old Password");
        oldPasswordTextField.setEchoChar((char) 0);
    }
    
    private void newPasswordFieldsLostFocus() {
        addPlaceholder( newPasswordTextField);
        newPasswordTextField.setText("New Password");
        newPasswordTextField.setEchoChar((char) 0);
    }
    
    private void confirmNewPasswordFieldsLostFocus() {
        addPlaceholder(  confirmNewPasswordTextField);
        confirmNewPasswordTextField.setText("Confirm New Password");
        confirmNewPasswordTextField.setEchoChar((char) 0);
    }
    
    
    private void jLabel34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jLabel34MouseClicked

    private void jLabel36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MouseClicked
        // TODO add your handling code here:
        
addreceptionInfoToGUI();
         jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_jLabel36MouseClicked

    private void jLabel37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel37MouseClicked
        // TODO add your handling code here:
    addChangePasswordDefaultSettings();
    jTabbedPane1.setSelectedIndex(6);
    }//GEN-LAST:event_jLabel37MouseClicked

    private void SSNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SSNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SSNActionPerformed

    private void jLabel41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel41MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(1);
        addreceptionInfoToGUI();
        setEditProfileInfoUsernameDefault();
        setEditProfileInfoEmailDefault();
        setEditProfileInfoDateDefault();
    }//GEN-LAST:event_jLabel41MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
          boolean isUsernameEditable = !Username.isEditable();
        jLabel40.setEnabled(!(isUsernameEditable || Email.isEditable()));
        Username.setEditable(isUsernameEditable);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource(isUsernameEditable ? "/images/done1.png" : "/images/edit2.png")));
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel39MouseClicked
        // TODO add your handling code here:
         boolean isEmailEditable = !Email.isEditable();
        jLabel40.setEnabled(!(Username.isEditable() || isEmailEditable));
        Email.setEditable(isEmailEditable);
        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource(isEmailEditable ? "/images/done1.png" : "/images/edit2.png")));
    }//GEN-LAST:event_jLabel39MouseClicked

    private void jLabel40MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel40MouseExited
        // TODO add your handling code here:
         jLabel40.setBackground(new Color(153, 204, 255));
    }//GEN-LAST:event_jLabel40MouseExited

    private void jLabel40MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel40MouseEntered
        // TODO add your handling code here:
          if (jLabel40.isEnabled()) {
              jLabel40.setBackground(Color.GRAY);
        }
    }//GEN-LAST:event_jLabel40MouseEntered

    private void jLabel40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel40MouseClicked
        // TODO add your handling code here:
         try {
            // TODO add your handling code here:
if (jLabel40.isEnabled()){
            Date date = Birthdate.getDate();
            String gender = maleRadioButton.isSelected() ? MALE : femaleRadioButton.isSelected() ? FEMALE : "";
            String username = Username.getText();
            String email = Email.getText();

            if (username.isEmpty()) {
                Username.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
                jLabel42.setText("Username cannot be empty");
            } else {
                setEditProfileInfoUsernameDefault();
            }
            if (email.isEmpty()) {
                Email.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
               jLabel43.setText("Email cannot be empty");
            } else {
                setEditProfileInfoEmailDefault();
            }
            if (date == null) {
                Birthdate.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
                jLabel44.setText("Date cannot be empty");
            } else {
                setEditProfileInfoDateDefault();
            }
            if (!username.isEmpty() && !email.isEmpty() && date != null) {

                java.sql.Date dateSql = new java.sql.Date(date.getYear(), date.getMonth(), date.getDate());
                String updateQuery = "UPDATE hospital.login SET uname = '" + username
                        + "' ,email = '" + email + "' ,birthdate = '"
                        + dateSql + "' ,gender = '" + gender
                        + "' where ssn = '" + receptionUser.getSsn() + "'";
                // register the connection
                Connection c = DBConnection.getDBConnection();
                PreparedStatement p = c.prepareStatement(updateQuery);
                p.executeUpdate();
                
                updateQuery = "UPDATE hospital.staff SET birthdate = '" + dateSql
                               +"' ,email = '" + email
                                + "' ,username = '" + username
                                + "' where essnstaff = '" + receptionUser.getSsn() + "'";
                        // register the connection
                p = c.prepareStatement(updateQuery);
                p.executeUpdate();

                receptionUser.setUsername(username);
                receptionUser.setEmail(email);
                receptionUser.setBirthdate(dateSql);
                receptionUser.setGender(gender);
                jLabel24uname.setText(receptionUser.getUsername());

                JOptionPane.showMessageDialog(this, "Account Info updated successfully");
            }}

            //      try( PreparedStatement preparedStatement = db.prepareStatement(updateQuery)){
            //
            //
            //    preparedStatement.setString(1, name); // Set new value for uname
            //    preparedStatement.setString(2, email); // Set new value for email
            //    preparedStatement.setDate(3, (java.sql.Date) birthdate); // Set new value for birthdate (assuming newBirthdate is a java.sql.Date)
            //    preparedStatement.setString(4, ssn); // Set the SSN value for WHERE clause
            //    int rowsAffected = preparedStatement.executeUpdate();
            //    JOptionPane.showMessageDialog(null, "done");
            //
            //      }catch(SQLException e){
            //       e.printStackTrace();
            //      }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: update account info failed");
        }
    }//GEN-LAST:event_jLabel40MouseClicked

    private void jLabel41MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel41MouseExited
        // TODO add your handling code here:
        jLabel41.setBackground(new Color(153, 204, 255));
    }//GEN-LAST:event_jLabel41MouseExited

    private void jLabel41MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel41MouseEntered
        // TODO add your handling code here:
          jLabel41.setBackground(Color.GRAY);

    }//GEN-LAST:event_jLabel41MouseEntered

    private void CancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelMouseExited
        // TODO add your handling code here:
        Cancel.setBackground(new Color(0, 153, 102));
        Cancel.setForeground(Color.WHITE);
    }//GEN-LAST:event_CancelMouseExited

    private void CancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelMouseEntered
        // TODO add your handling code here:
         Cancel.setBackground(Color.WHITE);
        Cancel.setForeground(new Color(0, 153, 102));
    }//GEN-LAST:event_CancelMouseEntered

    private void CancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelMouseClicked
        // TODO add your handling code here:
          jTabbedPane1.setSelectedIndex(1);
        setDefaultChangePasswordGUIValues();
    }//GEN-LAST:event_CancelMouseClicked

    private void SaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveMouseExited
        // TODO add your handling code here:
        Save.setBackground(new Color(0, 153, 102));
        Save.setForeground(Color.WHITE);
    }//GEN-LAST:event_SaveMouseExited

    private void SaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveMouseEntered
        // TODO add your handling code here:
         Save.setBackground(Color.WHITE);
        Save.setForeground(new Color(0, 153, 102));
    }//GEN-LAST:event_SaveMouseEntered

    private void SaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveMouseClicked
        // TODO add your handling code here:
         String oldPassword = oldPasswordTextField.getText();
        String newPassword = newPasswordTextField.getText();
        String confirmNewPassword = confirmNewPasswordTextField.getText();
        boolean isEmptyInputPassword = false;
        if (oldPassword.isEmpty() || oldPasswordTextField.getForeground().equals(Color.gray)) {
            oldPasswordTextField.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
            jLabel2.setText("Old password cannot be empty");
            isEmptyInputPassword = true;
        } else {
            setDefaultOldPassGUIValue();
        }
        if (newPassword.isEmpty() || newPasswordTextField.getForeground().equals(Color.gray)) {
            newPasswordTextField.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
            jLabel3.setText("New password cannot be empty");
            isEmptyInputPassword = true;
        } else {
            setDefaultNewPassGUIValue();
        }
        if (confirmNewPassword.isEmpty() || confirmNewPasswordTextField.getForeground().equals(Color.gray)) {
            confirmNewPasswordTextField.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
            jLabel4.setText("Confirm new password cannot be empty");
            isEmptyInputPassword = true;
        } else {
            setDefaultConfirmNewPassGUIValues();
        }
        if (!isEmptyInputPassword) {
            if (!oldPassword.equals(receptionUser.getPassword())) {
                oldPasswordTextField.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
                jLabel2.setText("Old password is incorrect");
            } else if (newPassword.length() < 6) {
                newPasswordTextField.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
                jLabel3.setText("Password cannot be less than 8 characters");
            } else if (!newPassword.equals(confirmNewPassword)) {
                confirmNewPasswordTextField.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
                jLabel4.setText("Confirm new password should equal new password");
            } else {
                try {
                    int okNoChangePassResult = JOptionPane.showConfirmDialog(this, "Are you sure to change password",
                            "Confirm changing password", JOptionPane.YES_NO_OPTION);
                    if (okNoChangePassResult == JOptionPane.YES_OPTION) {
                        String updateQuery = "UPDATE hospital.login SET apassword = '" + newPassword + "' where ssn = '" + receptionUser.getSsn() + "'";
                        Connection db = DBConnection.getDBConnection();
                        PreparedStatement p = db.prepareStatement(updateQuery);
                        p.executeUpdate();
                       receptionUser.setPassword(newPassword);
                        setDefaultChangePasswordGUIValues();
                        JOptionPane.showMessageDialog(this, "Changing password done successfully!");
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Error in change password");
                }
            }
        }

                                   
    }//GEN-LAST:event_SaveMouseClicked

    private void oldPasswordTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_oldPasswordTextFieldFocusGained
        // TODO add your handling code here:
        if (oldPasswordTextField.getText().equals("Old Password")) {
            oldPasswordFieldGainFocus();
        }
    }//GEN-LAST:event_oldPasswordTextFieldFocusGained

    private void oldPasswordTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_oldPasswordTextFieldFocusLost
        // TODO add your handling code here:
         if (oldPasswordTextField.getText().length() == 0) {
            oldPasswordFieldsLostFocus();
        }
    }//GEN-LAST:event_oldPasswordTextFieldFocusLost

    private void newPasswordTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_newPasswordTextFieldFocusGained
        // TODO add your handling code here:
         if (newPasswordTextField .getText().equals("New Password")) {
            newPasswordFieldGainFocus();
        }
    }//GEN-LAST:event_newPasswordTextFieldFocusGained

    private void newPasswordTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_newPasswordTextFieldFocusLost
        // TODO add your handling code here:
        if (newPasswordTextField.getText().length() == 0) {
            newPasswordFieldsLostFocus();
        }
    }//GEN-LAST:event_newPasswordTextFieldFocusLost

    private void confirmNewPasswordTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmNewPasswordTextFieldFocusGained
        // TODO add your handling code here:
        if (confirmNewPasswordTextField .getText().equals("Confirm New Password")) {
            confirmNewPasswordFieldGainFocus();
        }
    }//GEN-LAST:event_confirmNewPasswordTextFieldFocusGained

    private void confirmNewPasswordTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmNewPasswordTextFieldFocusLost
        // TODO add your handling code here:
         if (confirmNewPasswordTextField.getText().length() == 0) {
            confirmNewPasswordFieldsLostFocus();
        }
    }//GEN-LAST:event_confirmNewPasswordTextFieldFocusLost

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          isFromSearch = true;
        String searchText = search.getText();
        if (searchText.isEmpty()){
            search.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
            JOptionPane.showMessageDialog(this, "Please Enter SSN");
        }
        else {
             search.setBorder(null);
            try {
                String query = "SELECT * FROM hospital.patient WHERE patientssn='" + searchText + "'";
                Connection c = DBConnection.getDBConnection();
                PreparedStatement p = c.prepareStatement(query);
                ResultSet rs = p.executeQuery();
                if (rs.next()) {
                    
                    Patient patient = new Patient(rs);
                    jTextField4.setText(patient.getSsnpatient());
                    if (patient.getGender().equalsIgnoreCase(MALE)) {
                    jRadioButton1.setSelected(true);
                    } else if (patient.getGender().equalsIgnoreCase(FEMALE)) {
                      jRadioButton2.setSelected(true);
                    }
                    jTextField3.setText(patient.getAddress());
                    jDateChooser1.setDate(patient.getBirthdate());
                    
                    if ("single".equalsIgnoreCase(patient.getMs())){
                           jComboBox2.setSelectedItem("single");}
                    else if("married".equalsIgnoreCase( patient.getMs())){
                           jComboBox2.setSelectedItem("married");}
                    else {jComboBox2.setSelectedIndex(-1);}
                       
                    jTextField2.setText(patient.getName());
                    
                    disableAllPatientInfo();
                    jLabel14.setText("View History");
                    jTabbedPane1.setSelectedIndex(4);

                } else {
            search.setBorder(BorderFactory.createLineBorder(Color.RED, 3));

                    JOptionPane.showMessageDialog(this, "patient with " + searchText + " doesn't exist");
                }
                
                
                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error in Read from DB");
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void pationInfoDefaultBorderAndLabel(){
        jLabel46.setText("");
        jLabel47.setText("");
        jLabel48.setText("");
        jLabel49.setText("");
        jLabel50.setText("");
        jComboBox2.setBorder(null);
        jTextField2.setBorder(null);
         jTextField3.setBorder(null);
          jTextField4.setBorder(null);
         jDateChooser1.setBorder(null);
    }
    private void disableAllPatientInfo(){
        pationInfoDefaultBorderAndLabel();
        jComboBox2.setEnabled(false);
        jTextField2.setEditable(false);
         jTextField3.setEditable(false);
          jTextField4.setEditable(false);
          jRadioButton1.setEnabled(false);
         jRadioButton2.setEnabled(false);
         jDateChooser1.setEnabled(false);
    }
        private void enableAllPatientInfo(){
        jComboBox2.setEnabled(true);
        jTextField2.setEditable(true);
         jTextField3.setEditable(true);
          jTextField4.setEditable(true);
          jRadioButton1.setEnabled(true);
         jRadioButton2.setEnabled(true);
         jDateChooser1.setEnabled(true);
    }
    
    private void jLabel45MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel45MouseClicked
        // TODO add your handling code here:
        setSearchTextoDefault();
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jLabel45MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        isFromSearch=false;
        jTextField2.setText("");
        jTextField4.setText("");
        jDateChooser1.setDate(null);
        jRadioButton1.setSelected(true);
        jRadioButton2.setSelected(false);
        jComboBox2.setSelectedIndex(-1);
        jTextField3.setText("");
        

        enableAllPatientInfo();
        pationInfoDefaultBorderAndLabel();
        jLabel14.setText("SAVE");
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
        if (jLabel14.getText().equalsIgnoreCase("SAVE")) {
            String patientname = jTextField2.getText();
            Date birthdate = jDateChooser1.getDate();
            String ssn = jTextField4.getText();
            String address = jTextField3.getText();
            String ms = jComboBox2.getSelectedItem()==null?null:jComboBox2.getSelectedItem().toString();
            String gender = null;
            if (jRadioButton1.isSelected()) {
            gender = jRadioButton1.getText();
        } else if (jRadioButton2.isSelected()) {
           gender = jRadioButton2.getText();
        }
           {
                        if (ssn.isEmpty()) {
               jTextField4.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
                jLabel46.setText("SSN cannot be empty");
            } else if (ssn.length() != 9) {
                jTextField4.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
                jLabel46.setText("SSN length should be 9");
            } else {
                jTextField4.setBorder(null);
                jLabel46.setText("");
            }
            }
            if (patientname.isEmpty()) {
                jTextField2.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
                jLabel47.setText("Salary cannot be empty");
            } else {
                jTextField2.setBorder(null);
                jLabel47.setText("");
            }
           
            
            if (address.isEmpty()) {
                jTextField3.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
                jLabel48.setText("Address cannot be empty");
            } else {
                jTextField3.setBorder(null);
                jLabel48.setText("");
            }
            if (birthdate == null) {
                jDateChooser1.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
                jLabel49.setText("BirthDate cannot be empty");
            } else {
                jDateChooser1.setBorder(null);
                jLabel49.setText("");
            }
            if (ms==null || ms.isEmpty()) {
                jComboBox2.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
                jLabel50.setText("matrial status cannot be empty");
            } else {
                jComboBox2.setBorder(null);
                jLabel50.setText("");
            }
            

            if (birthdate != null && ms != null && !ms.isEmpty() && !patientname.isEmpty() && !address.isEmpty() && !ssn.isEmpty() && ssn.length()==9)
                    {

                try {
                    java.sql.Date birthDateSql = new java.sql.Date(birthdate.getYear(), birthdate.getMonth(), birthdate.getDate());
                    

                    if (jLabel14.getText().equalsIgnoreCase("SAVE")) {
                        String updateQuery = "INSERT INTO hospital.patient (patientssn, address, patientname, materialstatus, "
                                + "gender,  birthdate)"
                                + "VALUES('" + ssn + "', '" + address + "', '" + patientname
                                + "', '" + ms + "', '" + gender + "', '" + birthDateSql  + "')";
                        // register the connection
                        Connection c = DBConnection.getDBConnection();
                        PreparedStatement p = c.prepareStatement(updateQuery);
                        p.executeUpdate();

                        Patient patient = new Patient();
                        patient.setSsnpatient(ssn);
                        patient.setName(patientname);
                        patient.setBirthdate(birthDateSql);
                        patient.setMs(ms);
                        patient.setGender(gender);
                        JOptionPane.showMessageDialog(this,  "Patient with " + ssn + " added successfully");
                                setSearchTextoDefault();
                        jTabbedPane1.setSelectedIndex(3);
                    }
                    
                   
                        } catch (Exception ex) {
                   if (ex.getMessage().contains("duplicate key value")) {
                        JOptionPane.showMessageDialog(this, "Patient with " + ssn + " already exist");
                    } else {
                        JOptionPane.showMessageDialog(this, "Error in adding patient");
                        System.out.println(ex);
                   }
                }
                    
               
                }

            }
        else if (jLabel14.getText().equalsIgnoreCase("View History")) {
              createListHistoryPanels(jTextField4.getText());
              jTabbedPane1.setSelectedIndex(5);
        }
        
     
    }//GEN-LAST:event_jLabel14MouseClicked
 
    private void jLabel35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel35MouseClicked
        // TODO add your handling code here:
        setSearchTextoDefault();
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_jLabel35MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        setSearchTextoDefault();
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void setSearchTextoDefault(){
        search.setText("");
        search.setBorder(null);
    }
    
    private void savePatientLabelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savePatientLabelButtonMouseClicked
         try {
             // TODO add your handling code here:
             String desease = deseasefield.getText();
             Date enterdate = enterdatetextfield.getDate();
             Date exitdate = exitdatetextfield.getDate();
             String cost = costfield.getText();
             String ssn = search.getText();
             String name = jTextField2.getText();
             
             if (desease.isEmpty()) {
                 deseasefield.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
                 jLabel54.setText("Desease cannot be empty");
             }else {
                 deseasefield.setBorder(null);
                 jLabel54.setText("");
             }
             
             if (enterdate == null) {
                 enterdatetextfield.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
                 jLabel53.setText("Enterdate cannot be empty");
             } else {
                 enterdatetextfield.setBorder(null);
                 jLabel53.setText("");
             }
             
             if (exitdate == null) {
                 exitdatetextfield.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
                 jLabel55.setText("Exitdate cannot be empty");
             } else {
                 exitdatetextfield.setBorder(null);
                 jLabel55.setText("");
             }
             
             if (cost.isEmpty()) {
                 costfield.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
                 jLabel56.setText("Cost cannot be empty");
             } else {
                 costfield.setBorder(null);
                 jLabel56.setText("");
             }
             
             
             if (enterdate != null && exitdate!=null && !cost.isEmpty()&& !desease.isEmpty()){
             
             java.sql.Date enterDateSql = new java.sql.Date(enterdate.getYear(), enterdate.getMonth(), enterdate.getDate());
             java.sql.Date exitDateSql = new java.sql.Date(exitdate.getYear(), exitdate.getMonth(), exitdate.getDate());
             
             
             String updateQuery = "INSERT INTO hospital.history (enterdate, exitdate, cost, "
                     + "patientdesease, patientname, patientssn, payornot)"
                     + "VALUES('" + enterDateSql + "', '" + exitDateSql + "', '" + cost
                     + "', '" + desease + "', '" + name + "', '" + ssn + "', 'false" + "')";
             // register the connection
             Connection c = DBConnection.getDBConnection();
             PreparedStatement p = c.prepareStatement(updateQuery);
             p.executeUpdate();
             
             History history = new History();
             history.setCost(Integer.valueOf (cost));
             history.setDesease(desease);
             history.setEnterdate(enterDateSql);
             history.setExitdate(exitDateSql);
             
             createListHistoryPanels(ssn);
             
             JOptionPane.showMessageDialog(this, "New items added to the history");
             
             
             jTabbedPane1.setSelectedIndex(5);}
         } catch (Exception ex) {
             Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
         }
                    
            
    }//GEN-LAST:event_savePatientLabelButtonMouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_jButton4MouseClicked

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void jLabel52MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel52MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(5);
    }//GEN-LAST:event_jLabel52MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        deseasefield.setBorder(null);
        deseasefield.setText("");
        jLabel53.setText("");
        enterdatetextfield.setBorder(null);
        enterdatetextfield.setDate(null);
        jLabel54.setText("");
        exitdatetextfield.setBorder(null);
          exitdatetextfield.setDate(null);
        jLabel55.setText("");
        costfield.setBorder(null);
             costfield.setText("");
        jLabel56.setText("");
        
        jTabbedPane1.setSelectedIndex(7);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void costfieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_costfieldKeyTyped
        // TODO add your handling code here:
                char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_costfieldKeyTyped

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Birthdate;
    private javax.swing.JLabel Cancel;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField SSN;
    private javax.swing.JLabel Save;
    private javax.swing.JTextField Username;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JPasswordField confirmNewPasswordTextField;
    private javax.swing.JTextField costfield;
    private javax.swing.JTextField deseasefield;
    private com.toedter.calendar.JDateChooser enterdatetextfield;
    private com.toedter.calendar.JDateChooser exitdatetextfield;
    private javax.swing.JRadioButton femaleRadioButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel24uname;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JRadioButton maleRadioButton;
    private javax.swing.JPasswordField newPasswordTextField;
    private javax.swing.JPasswordField oldPasswordTextField;
    private javax.swing.JLabel savePatientLabelButton;
    private javax.swing.JTextField search;
    // End of variables declaration//GEN-END:variables
}
