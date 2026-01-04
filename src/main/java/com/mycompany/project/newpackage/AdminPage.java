/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.project.newpackage;

import DBConnection.DBConnection;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import login.Login;
import login.LoginUser;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.swing.JRViewer;

/**
 *
 * @author NTC
 */
public class AdminPage extends javax.swing.JFrame {

    private static final String MALE = "Male";
    private static final String FEMALE = "Female";
    private static final Integer ADMIN_TYPE = 0;
    private static final Integer RECEPTION_TYPE = 1;
    private static final Integer FINANTIAL_TYPE = 2;
    private static final Integer DOCTOR_TYPE = 3;
    private static final Integer NURSE_TYPE = 4;
    private static final Integer RADIO_LOGIC_TYPE = 5;
    private static final Integer ENGINEER_TYPE = 6;
    private static final Integer PHARMACER_TYPE = 7;
    private static final Integer SECURITY_TYPE = 8;

    private static final Map<Integer, String> STAFF_TYPE_MAP;

    static {
        STAFF_TYPE_MAP = new HashMap<>();
        STAFF_TYPE_MAP.put(ADMIN_TYPE, "Admin");
        STAFF_TYPE_MAP.put(RECEPTION_TYPE, "Reception");
        STAFF_TYPE_MAP.put(FINANTIAL_TYPE, "Finantial");
        STAFF_TYPE_MAP.put(DOCTOR_TYPE, "Doctor");
        STAFF_TYPE_MAP.put(NURSE_TYPE, "Nurse");
        STAFF_TYPE_MAP.put(RADIO_LOGIC_TYPE, "Radio Logic");
        STAFF_TYPE_MAP.put(ENGINEER_TYPE, "Engineer");
        STAFF_TYPE_MAP.put(PHARMACER_TYPE, "Pharmacer");
        STAFF_TYPE_MAP.put(SECURITY_TYPE, "Security");
    }

    private LoginUser adminUser;
    private Staff admin;
    private int staffType;
    private boolean isFromSearch = false;
    private List<Staff> staffList;

    /**
     * Creates new form AdminPage
     */
    public AdminPage(LoginUser adminName)  {
        try {
            this.staffList = new ArrayList<>();
            this.adminUser = adminName;
            this.setResizable(false);
            initComponents();
            String formattedDate = new SimpleDateFormat("yyyy_MM_dd").format(Calendar.getInstance().getTime());
            Date date = new SimpleDateFormat("yyyy_MM_dd").parse(formattedDate);
            
            //Date currentDate = new Date();
           
            staffBirthDateTextField.setMaxSelectableDate(date);
            jDateChooser1.setMaxSelectableDate(date);
            addAdmınInfoToGUI();
            setDefaultChangePasswordGUIValues();
        } catch (ParseException ex) {
            Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public LoginUser getAdminUser() {
        return adminUser;
    }

    public void setAdminUser(LoginUser adminUser) {
        this.adminUser = adminUser;
    }

    public AdminPage(Staff admin) {
        this.staffList = new ArrayList<>();
        this.admin = admin;
        //  Doctor.setOpaque(true);
        initComponents();

    }

    public void setAdmin(Staff admin) {
        this.admin = admin;
    }

    public Staff getAdmin() {
        return admin;
    }

    private void addAdmınInfoToGUI() {
        uNameLabel.setText(adminUser.getUsername());
        usernameEditTextField.setText(adminUser.getUsername());
        jTextField5.setText(adminUser.getSsn());
        emailEditTextField.setText(adminUser.getEmail());
        jDateChooser1.setDate(adminUser.getBirthdate());
        if (adminUser.getGender().equalsIgnoreCase(MALE)) {
            maleRadioButton.setSelected(true);
        } else if (adminUser.getGender().equalsIgnoreCase(FEMALE)) {
            femaleRadioButton.setSelected(true);
        }
    }

    private void addChangePasswordDefaultSettings() {
        this.setFocusable(true);
        addPlaceholder(oldPasswordTextField);
        addPlaceholder(newPasswordTextField);
        addPlaceholder(confirmNewPasswordTextField);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderButtonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        uNameLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        searchJTextField = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel10 = new javax.swing.JPanel();
        Doctor = new javax.swing.JLabel();
        Engineers = new javax.swing.JLabel();
        Reception = new javax.swing.JLabel();
        Nurse = new javax.swing.JLabel();
        Radiologic = new javax.swing.JLabel();
        Finantial = new javax.swing.JLabel();
        Security = new javax.swing.JLabel();
        pharmacer = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        profileinfo = new javax.swing.JLabel();
        Changepassword = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        Save = new javax.swing.JLabel();
        Cancel = new javax.swing.JLabel();
        jLabel1null = new javax.swing.JLabel();
        jLabel2null = new javax.swing.JLabel();
        jLabel3null = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        oldPasswordTextField = new javax.swing.JPasswordField();
        newPasswordTextField = new javax.swing.JPasswordField();
        confirmNewPasswordTextField = new javax.swing.JPasswordField();
        jPanel17 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        usernameEditTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        emailEditTextField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        maleRadioButton = new javax.swing.JRadioButton();
        femaleRadioButton = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        editUsernameLabel = new javax.swing.JLabel();
        editEmailLabel = new javax.swing.JLabel();
        SaveEdit = new javax.swing.JLabel();
        CancelEdit = new javax.swing.JLabel();
        null1 = new javax.swing.JLabel();
        null3 = new javax.swing.JLabel();
        null4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanelStaffPanels = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        staffSsnTextField = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        staffSalaryTextField = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        staffworkingHoursTextField = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        staffLanguageTextField = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        staffExperinceTextField = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        staffPhoneTextField = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        staffEmailTextField = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        staffUsernameTextField = new javax.swing.JTextField();
        staffJoinDateTextField = new com.toedter.calendar.JDateChooser();
        staffBirthDateTextField = new com.toedter.calendar.JDateChooser();
        saveStaffLabelButton = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        editStaffLabelButton = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        checkBill = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 255));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        uNameLabel.setBackground(new java.awt.Color(255, 255, 255));
        uNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        uNameLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/username.png"))); // NOI18N
        uNameLabel.setText("User Name");
        jPanel3.add(uNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 60));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 62));

        jPanel4.setBackground(new java.awt.Color(153, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 106, 240, -1));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-doctor-64.png"))); // NOI18N
        jLabel8.setText("Employees");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 70));

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 250, 70));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/settings_icon.png"))); // NOI18N
        jLabel7.setText(" Settings");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 70));

        jPanel4.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 250, -1));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        jLabel9.setText("Logout");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel8.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 70));

        jPanel4.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 260, 70));

        jPanel9.setBackground(new java.awt.Color(153, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel14.setBackground(new java.awt.Color(153, 255, 255));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search2.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel14.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 60, 50));

        searchJTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        searchJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchJTextFieldActionPerformed(evt);
            }
        });
        jPanel14.add(searchJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 440, 50));

        jPanel9.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 90));
        jPanel9.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, -1, -1));

        jTabbedPane2.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane2MouseClicked(evt);
            }
        });

        jPanel10.setBackground(new java.awt.Color(0, 255, 153));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Doctor.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        Doctor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/doctor1.png"))); // NOI18N
        Doctor.setText("Doctor");
        Doctor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));
        Doctor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Doctor.setIconTextGap(0);
        Doctor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Doctor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DoctorMouseClicked(evt);
            }
        });
        jPanel10.add(Doctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 100, 110));

        Engineers.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        Engineers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/engineer.png"))); // NOI18N
        Engineers.setText("   Engineers");
        Engineers.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));
        Engineers.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Engineers.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Engineers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EngineersMouseClicked(evt);
            }
        });
        jPanel10.add(Engineers, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 130, 100));

        Reception.setBackground(new java.awt.Color(0, 51, 255));
        Reception.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        Reception.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/employee.png"))); // NOI18N
        Reception.setText("Reception");
        Reception.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));
        Reception.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Reception.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Reception.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReceptionMouseClicked(evt);
            }
        });
        jPanel10.add(Reception, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 120, 100));

        Nurse.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        Nurse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nurse.png"))); // NOI18N
        Nurse.setText("Nurse");
        Nurse.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        Nurse.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Nurse.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Nurse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NurseMouseClicked(evt);
            }
        });
        jPanel10.add(Nurse, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 100, 110));

        Radiologic.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        Radiologic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/radiographer.png"))); // NOI18N
        Radiologic.setText("Radiologic");
        Radiologic.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        Radiologic.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Radiologic.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Radiologic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RadiologicMouseClicked(evt);
            }
        });
        jPanel10.add(Radiologic, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 130, 110));

        Finantial.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        Finantial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/finantial.png"))); // NOI18N
        Finantial.setText("Finantial");
        Finantial.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        Finantial.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Finantial.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Finantial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FinantialMouseClicked(evt);
            }
        });
        jPanel10.add(Finantial, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 290, 140, 100));

        Security.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        Security.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/security.png"))); // NOI18N
        Security.setText("Security");
        Security.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        Security.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Security.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Security.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SecurityMouseClicked(evt);
            }
        });
        jPanel10.add(Security, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, 130, 100));

        pharmacer.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        pharmacer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pharmacy.png"))); // NOI18N
        pharmacer.setText("pharmacer");
        pharmacer.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        pharmacer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pharmacer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        pharmacer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pharmacerMouseClicked(evt);
            }
        });
        jPanel10.add(pharmacer, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 470, 130, 90));

        jTabbedPane2.addTab("tab4", jPanel10);

        jPanel15.setBackground(new java.awt.Color(153, 255, 255));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        profileinfo.setBackground(new java.awt.Color(255, 255, 255));
        profileinfo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        profileinfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/profileInfo.png"))); // NOI18N
        profileinfo.setText("     Profile Info");
        profileinfo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        profileinfo.setOpaque(true);
        profileinfo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        profileinfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileinfoMouseClicked(evt);
            }
        });
        jPanel15.add(profileinfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 200, 150));

        Changepassword.setBackground(new java.awt.Color(255, 255, 255));
        Changepassword.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Changepassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/password.png"))); // NOI18N
        Changepassword.setText(" Change Password");
        Changepassword.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Changepassword.setOpaque(true);
        Changepassword.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Changepassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChangepasswordMouseClicked(evt);
            }
        });
        jPanel15.add(Changepassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, 213, 160));

        jTabbedPane2.addTab("tab1", jPanel15);

        jPanel16.setBackground(new java.awt.Color(0, 102, 102));

        Save.setBackground(new java.awt.Color(0, 153, 102));
        Save.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        Save.setForeground(new java.awt.Color(255, 255, 255));
        Save.setText("CHANGE PASSWORD");
        Save.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        Save.setNextFocusableComponent(Cancel);
        Save.setOpaque(true);
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

        Cancel.setBackground(new java.awt.Color(0, 153, 102));
        Cancel.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        Cancel.setForeground(new java.awt.Color(255, 255, 255));
        Cancel.setText("Cancel");
        Cancel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        Cancel.setOpaque(true);
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

        jLabel1null.setForeground(new java.awt.Color(255, 0, 0));

        jLabel2null.setForeground(new java.awt.Color(255, 0, 0));

        jLabel3null.setForeground(new java.awt.Color(255, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Change Password");

        oldPasswordTextField.setNextFocusableComponent(newPasswordTextField);
        oldPasswordTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                oldPasswordTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                oldPasswordTextFieldFocusLost(evt);
            }
        });

        newPasswordTextField.setNextFocusableComponent(confirmNewPasswordTextField);
        newPasswordTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                newPasswordTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                newPasswordTextFieldFocusLost(evt);
            }
        });

        confirmNewPasswordTextField.setNextFocusableComponent(Save);
        confirmNewPasswordTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                confirmNewPasswordTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                confirmNewPasswordTextFieldFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(confirmNewPasswordTextField)
                        .addComponent(newPasswordTextField)
                        .addComponent(oldPasswordTextField)
                        .addComponent(jLabel1null, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2null, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3null, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel16Layout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(252, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(oldPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1null, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(newPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2null, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(confirmNewPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3null, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        jTabbedPane2.addTab("tab2", jPanel16);

        jPanel17.setBackground(new java.awt.Color(153, 204, 255));
        jPanel17.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Username");
        jPanel17.add(jLabel2);
        jLabel2.setBounds(190, 220, 150, 35);

        usernameEditTextField.setEditable(false);
        usernameEditTextField.setBackground(new java.awt.Color(255, 255, 255));
        usernameEditTextField.setNextFocusableComponent(jTextField5);
        jPanel17.add(usernameEditTextField);
        usernameEditTextField.setBounds(340, 220, 252, 35);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setText("SSN");
        jPanel17.add(jLabel13);
        jLabel13.setBounds(190, 280, 150, 35);

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.add(jTextField5);
        jTextField5.setBounds(340, 280, 252, 35);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setText("Email");
        jPanel17.add(jLabel14);
        jLabel14.setBounds(190, 340, 150, 35);

        emailEditTextField.setEditable(false);
        emailEditTextField.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.add(emailEditTextField);
        emailEditTextField.setBounds(340, 340, 252, 35);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setText("Gender");
        jPanel17.add(jLabel15);
        jLabel15.setBounds(190, 410, 77, 35);

        maleRadioButton.setBackground(new java.awt.Color(153, 204, 255));
        genderButtonGroup.add(maleRadioButton);
        maleRadioButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        maleRadioButton.setForeground(new java.awt.Color(255, 0, 0));
        maleRadioButton.setText("Male");
        maleRadioButton.setActionCommand("");
        jPanel17.add(maleRadioButton);
        maleRadioButton.setBounds(340, 420, 90, 25);

        femaleRadioButton.setBackground(new java.awt.Color(153, 204, 255));
        genderButtonGroup.add(femaleRadioButton);
        femaleRadioButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        femaleRadioButton.setForeground(new java.awt.Color(255, 0, 0));
        femaleRadioButton.setText("Female");
        femaleRadioButton.setActionCommand("");
        jPanel17.add(femaleRadioButton);
        femaleRadioButton.setBounds(483, 420, 110, 25);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setText("Birthdate");
        jPanel17.add(jLabel16);
        jLabel16.setBounds(190, 470, 150, 35);

        jDateChooser1.setNextFocusableComponent(emailEditTextField);
        jPanel17.add(jDateChooser1);
        jDateChooser1.setBounds(340, 470, 252, 35);

        editUsernameLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        editUsernameLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editUsernameLabelMouseClicked(evt);
            }
        });
        jPanel17.add(editUsernameLabel);
        editUsernameLabel.setBounds(600, 220, 30, 38);

        editEmailLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        editEmailLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editEmailLabelMouseClicked(evt);
            }
        });
        jPanel17.add(editEmailLabel);
        editEmailLabel.setBounds(600, 340, 30, 38);

        SaveEdit.setBackground(new java.awt.Color(0, 204, 204));
        SaveEdit.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        SaveEdit.setForeground(new java.awt.Color(255, 255, 255));
        SaveEdit.setText("      Save");
        SaveEdit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        SaveEdit.setOpaque(true);
        SaveEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveEditMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SaveEditMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SaveEditMouseExited(evt);
            }
        });
        jPanel17.add(SaveEdit);
        SaveEdit.setBounds(190, 570, 150, 45);

        CancelEdit.setBackground(new java.awt.Color(0, 204, 204));
        CancelEdit.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        CancelEdit.setForeground(new java.awt.Color(255, 255, 255));
        CancelEdit.setText("     Cancel");
        CancelEdit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        CancelEdit.setOpaque(true);
        CancelEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CancelEditMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CancelEditMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CancelEditMouseExited(evt);
            }
        });
        jPanel17.add(CancelEdit);
        CancelEdit.setBounds(470, 570, 150, 45);

        null1.setForeground(new java.awt.Color(255, 0, 0));
        null1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                null1FocusGained(evt);
            }
        });
        jPanel17.add(null1);
        null1.setBounds(340, 260, 252, 12);

        null3.setForeground(new java.awt.Color(255, 0, 0));
        jPanel17.add(null3);
        null3.setBounds(340, 380, 252, 15);

        null4.setForeground(new java.awt.Color(255, 0, 0));
        jPanel17.add(null4);
        null4.setBounds(340, 510, 252, 14);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/EditProfileInfo.png"))); // NOI18N
        jPanel17.add(jLabel10);
        jLabel10.setBounds(60, 90, 125, 122);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel11.setText("Account Info");
        jPanel17.add(jLabel11);
        jLabel11.setBounds(190, 90, 494, 122);

        jTabbedPane2.addTab("tab3", jPanel17);

        jPanelStaffPanels.setBackground(new java.awt.Color(153, 255, 255));
        jPanelStaffPanels.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jList1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 255, 255), 5));
        jList1.setFont(new java.awt.Font("Juice ITC", 1, 24)); // NOI18N
        jList1.setForeground(new java.awt.Color(0, 51, 255));
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jList1.setDropMode(javax.swing.DropMode.ON);
        jList1.setName(""); // NOI18N
        jList1.setSelectedIndex(0);
        jScrollPane1.setViewportView(jList1);

        jPanelStaffPanels.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 810, 420));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setText("SELECT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanelStaffPanels.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 560, 160, 50));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel.png"))); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanelStaffPanels.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 560, 180, 50));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        jButton3.setText("ADD");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanelStaffPanels.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 170, 50));

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanelStaffPanels.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 560, 180, 50));

        jTabbedPane2.addTab("tab5", jPanelStaffPanels);

        jPanel12.setBackground(new java.awt.Color(255, 204, 204));
        jPanel12.setMaximumSize(new java.awt.Dimension(35767, 35767));
        jPanel12.setPreferredSize(new java.awt.Dimension(920, 501));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setText("      SSN");

        staffSsnTextField.setEditable(false);
        staffSsnTextField.setBackground(new java.awt.Color(255, 255, 255));
        staffSsnTextField.setNextFocusableComponent(staffworkingHoursTextField);
        staffSsnTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                staffSsnTextFieldKeyTyped(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel22.setText("     Salary");

        staffSalaryTextField.setEditable(false);
        staffSalaryTextField.setBackground(new java.awt.Color(255, 255, 255));
        staffSalaryTextField.setNextFocusableComponent(staffJoinDateTextField);
        staffSalaryTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffSalaryTextFieldActionPerformed(evt);
            }
        });
        staffSalaryTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                staffSalaryTextFieldKeyTyped(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel23.setText("working hours");

        staffworkingHoursTextField.setEditable(false);
        staffworkingHoursTextField.setBackground(new java.awt.Color(255, 255, 255));
        staffworkingHoursTextField.setNextFocusableComponent(staffLanguageTextField);
        staffworkingHoursTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                staffworkingHoursTextFieldKeyTyped(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel24.setText("join date");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel25.setText("languages");

        staffLanguageTextField.setEditable(false);
        staffLanguageTextField.setBackground(new java.awt.Color(255, 255, 255));
        staffLanguageTextField.setNextFocusableComponent(staffBirthDateTextField);

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel26.setText("experiance");

        staffExperinceTextField.setEditable(false);
        staffExperinceTextField.setBackground(new java.awt.Color(255, 255, 255));
        staffExperinceTextField.setNextFocusableComponent(staffPhoneTextField);

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel27.setText("Birthdate");

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel28.setText("   phone");

        staffPhoneTextField.setEditable(false);
        staffPhoneTextField.setBackground(new java.awt.Color(255, 255, 255));
        staffPhoneTextField.setNextFocusableComponent(staffUsernameTextField);
        staffPhoneTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                staffPhoneTextFieldKeyTyped(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel29.setText("  email");

        staffEmailTextField.setEditable(false);
        staffEmailTextField.setBackground(new java.awt.Color(255, 255, 255));
        staffEmailTextField.setNextFocusableComponent(staffSalaryTextField);

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel30.setText("    Name");

        staffUsernameTextField.setEditable(false);
        staffUsernameTextField.setBackground(new java.awt.Color(255, 255, 255));

        staffJoinDateTextField.setBackground(new java.awt.Color(255, 255, 255));
        staffJoinDateTextField.setEnabled(false);
        staffJoinDateTextField.setNextFocusableComponent(staffExperinceTextField);
        staffJoinDateTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                staffJoinDateTextFieldMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                staffJoinDateTextFieldMouseEntered(evt);
            }
        });

        staffBirthDateTextField.setBackground(new java.awt.Color(255, 255, 255));
        staffBirthDateTextField.setEnabled(false);
        staffBirthDateTextField.setNextFocusableComponent(staffEmailTextField);

        saveStaffLabelButton.setBackground(new java.awt.Color(255, 204, 204));
        saveStaffLabelButton.setFont(new java.awt.Font("Lucida Calligraphy", 1, 36)); // NOI18N
        saveStaffLabelButton.setForeground(new java.awt.Color(255, 255, 255));
        saveStaffLabelButton.setText("  Save");
        saveStaffLabelButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        saveStaffLabelButton.setOpaque(true);
        saveStaffLabelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveStaffLabelButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                saveStaffLabelButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                saveStaffLabelButtonMouseExited(evt);
            }
        });

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow.png"))); // NOI18N
        jLabel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel32MouseClicked(evt);
            }
        });

        editStaffLabelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit2.png"))); // NOI18N
        editStaffLabelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editStaffLabelButtonMouseClicked(evt);
            }
        });

        checkBill.setFont(new java.awt.Font("Old English Text MT", 1, 24)); // NOI18N
        checkBill.setForeground(new java.awt.Color(0, 204, 255));
        checkBill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrowright.png"))); // NOI18N
        checkBill.setText("Bill");
        checkBill.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        checkBill.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        checkBill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkBillMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel12Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(staffEmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(130, 130, 130)
                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel12Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(staffUsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel32)
                                .addGap(613, 613, 613)
                                .addComponent(editStaffLabelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel12Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(staffSsnTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(130, 130, 130)
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel12Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(staffSalaryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jLabel23)
                                .addGap(6, 6, 6)
                                .addComponent(staffworkingHoursTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(130, 130, 130)
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(staffJoinDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(190, 190, 190)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(230, 230, 230)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(staffLanguageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(130, 130, 130)
                                .addComponent(jLabel26)
                                .addGap(6, 6, 6)
                                .addComponent(staffExperinceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(190, 190, 190)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(230, 230, 230)
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel12Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(staffBirthDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(130, 130, 130)
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel12Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(staffPhoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(saveStaffLabelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(checkBill, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111)))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editStaffLabelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(staffSsnTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(staffSalaryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(12, 12, 12)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(staffworkingHoursTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(staffJoinDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(staffLanguageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(staffExperinceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(staffBirthDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(staffPhoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(staffEmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(staffUsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBill)
                    .addComponent(saveStaffLabelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        jTabbedPane2.addTab("tab6", jPanel12);

        jPanel9.add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 820, 660));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        searchJTextField.setText("");
        jTabbedPane2.setSelectedIndex(1);

    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        Login login = new Login();
        login.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jLabel9MouseClicked

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
        jLabel1null.setText("");
    }

    private void setDefaultNewPassGUIValue() {
        newPasswordTextField.setBorder(null);
        jLabel2null.setText("");
    }

    private void setDefaultConfirmNewPassGUIValues() {
        confirmNewPasswordTextField.setBorder(null);
        jLabel3null.setText("");
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
        addPlaceholder(newPasswordTextField);
        newPasswordTextField.setText("New Password");
        newPasswordTextField.setEchoChar((char) 0);
    }

    private void confirmNewPasswordFieldsLostFocus() {
        addPlaceholder(confirmNewPasswordTextField);
        confirmNewPasswordTextField.setText("Confirm New Password");
        confirmNewPasswordTextField.setEchoChar((char) 0);
    }
//    

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

    private void setEditProfileInfoUsernameDefault() {
        usernameEditTextField.setBorder(null);
        null1.setText("");
    }

    private void setEditProfileInfoEmailDefault() {
        emailEditTextField.setBorder(null);
        null3.setText("");
    }

    private void setEditProfileInfoDateDefault() {
        jDateChooser1.setBorder(null);
        null4.setText("");
    }

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
//        try {
        // TODO add your handling code here:
        jTabbedPane2.setSelectedIndex(0);

//           AdminPage a=new AdminPage(admin);
//            //string for sql query for checking ssn and password
//           String query = "SELECT * FROM hospital.staff";
//           Connection con = DBConnection.getDBConnection();
//           PreparedStatement ps = con.prepareStatement(query);
//           ResultSet res = ps.executeQuery();
//           Staff st=new Staff(res);
//            
//        } catch (Exception ex) {
//           JOptionPane.showMessageDialog(null, ex);
//        }

    }//GEN-LAST:event_jLabel8MouseClicked

    private void jTabbedPane2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane2MouseClicked

    private void RadiologicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RadiologicMouseClicked
        // TODO add your handling code here:
        jTabbedPane2.setSelectedIndex(4);
        staffType = RADIO_LOGIC_TYPE;
        createListStaffPanels(RADIO_LOGIC_TYPE);
    }//GEN-LAST:event_RadiologicMouseClicked

    private void NurseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NurseMouseClicked
        // TODO add your handling code here:
        jTabbedPane2.setSelectedIndex(4);
        staffType = NURSE_TYPE;
        createListStaffPanels(NURSE_TYPE);
    }//GEN-LAST:event_NurseMouseClicked

    private void ReceptionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReceptionMouseClicked
        // TODO add your handling code here:
        jTabbedPane2.setSelectedIndex(4);
        staffType = RECEPTION_TYPE;
        createListStaffPanels(RECEPTION_TYPE);


    }//GEN-LAST:event_ReceptionMouseClicked

    private void EngineersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EngineersMouseClicked
        // TODO add your handling code here:
        jTabbedPane2.setSelectedIndex(4);
        staffType = ENGINEER_TYPE;
        createListStaffPanels(ENGINEER_TYPE);

    }//GEN-LAST:event_EngineersMouseClicked

    private void DoctorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DoctorMouseClicked
        jTabbedPane2.setSelectedIndex(4);
        staffType = DOCTOR_TYPE;
        createListStaffPanels(DOCTOR_TYPE);

//       DefaultListModel defaultListModel = new DefaultListModel();
//          defaultListModel.addElement(staff.getSsnstaff() +": "+ staff.getUsername());
//           jList1.setModel(defaultListModel);
//           

    }//GEN-LAST:event_DoctorMouseClicked

    private void createListStaffPanels(Integer staffType) {
        try {
            staffList = new ArrayList<>();
            String query = "SELECT * FROM hospital.staff WHERE stafftype='" + staffType + "' ORDER BY username,essnstaff ASC";
            Connection c = DBConnection.getDBConnection();
            PreparedStatement p = c.prepareStatement(query);
            ResultSet rs = p.executeQuery();
            if (rs.next()) {
                // Populate staffList
                do {
                    staffList.add(new Staff(rs));
                } while (rs.next());
            }
            DefaultListModel defaultListModel = new DefaultListModel();
            // Create panels for each staff member
            for (Staff staff : staffList) {
                if (staff.getSsnstaff() != null) {
                    defaultListModel.addElement(staff.getUsername() + ": " + staff.getSsnstaff());
                }
                // jList1.setModel(defaultListModel);
                // createStaffPanels(staff);
            }
            // ListModel<String> defaultListModel = null;
            jList1.setModel(defaultListModel);

        } catch (Exception ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(this, "Error in reading Staff");
        }
    }

//    private void createStaffPanel(Staff staff) {
//        JPanel jPanelStaff = new JPanel();
//        jPanelStaff.setBorder(BorderFactory.createCompoundBorder(
//                BorderFactory.createLineBorder(Color.BLACK),
//                BorderFactory.createEmptyBorder(0, 0, 10, 0)));
//        jPanelStaff.setBackground(Color.WHITE);
//        jPanelStaff.setLayout(new FlowLayout(FlowLayout.LEFT));
//        Border rightBorder = BorderFactory.createMatteBorder(0, 0, 0, 2, Color.BLACK);
//
//        JTextField jTextFieldStaffSsn = new JTextField(staff.getSsnstaff(), 10);
//        jTextFieldStaffSsn.setEditable(false);
//        jTextFieldStaffSsn.setBorder(rightBorder);
//        jPanelStaff.add(jTextFieldStaffSsn);
//
//        JTextField jTextFieldStaffUsername = new JTextField(staff.getUsername(),10);
//        jTextFieldStaffUsername.setEditable(false);
//        jTextFieldStaffUsername.setBorder(rightBorder);
//        jPanelStaff.add(jTextFieldStaffUsername);
//
//        JTextField jTextFieldStaffType = new JTextField(STAFF_TYPE_MAP.get(staff.getStafftype()), 10);
//        jTextFieldStaffType.setBorder(rightBorder);
//        jTextFieldStaffType.setEditable(false);
//        jPanelStaff.add(jTextFieldStaffType);
//        
//        jPanelStaffPanels.add(jPanelStaff);
//        
////              for (Staff staff : staffList) {
////                DefaultListModel defaultListModel = new DefaultListModel();
////                    defaultListModel.addElement(jPanelStaff);
////                    jList1.setModel(defaultListModel);
////            }
//
//        System.out.println(staff.toString());
//    }

    private void null1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_null1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_null1FocusGained

    private void CancelEditMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelEditMouseExited
        // TODO add your handling code here:
        CancelEdit.setBackground(new Color(153, 204, 255));
    }//GEN-LAST:event_CancelEditMouseExited

    private void CancelEditMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelEditMouseEntered
        // TODO add your handling code here:
        CancelEdit.setBackground(Color.GRAY);
    }//GEN-LAST:event_CancelEditMouseEntered

    private void CancelEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelEditMouseClicked
        // TODO add your handling code here:
        jTabbedPane2.setSelectedIndex(1);
        addAdmınInfoToGUI();
        setEditProfileInfoUsernameDefault();
        setEditProfileInfoEmailDefault();
        setEditProfileInfoDateDefault();
    }//GEN-LAST:event_CancelEditMouseClicked

    private void SaveEditMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveEditMouseExited
        // TODO add your handling code here:
        SaveEdit.setBackground(new Color(153, 204, 255));
    }//GEN-LAST:event_SaveEditMouseExited

    private void SaveEditMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveEditMouseEntered
        // TODO add your handling code here:
        if (SaveEdit.isEnabled()) {
            SaveEdit.setBackground(Color.GRAY);
        }
    }//GEN-LAST:event_SaveEditMouseEntered

    private void SaveEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveEditMouseClicked

        if (SaveEdit.isEnabled()){
        try {
            // TODO add your handling code here:

            Date date = jDateChooser1.getDate();
            String gender = maleRadioButton.isSelected() ? MALE : femaleRadioButton.isSelected() ? FEMALE : "";
            String username = usernameEditTextField.getText();
            String email = emailEditTextField.getText();

            if (username.isEmpty()) {
                usernameEditTextField.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
                null1.setText("Username cannot be empty");
            } else {
                setEditProfileInfoUsernameDefault();
            }
            if (email.isEmpty()) {
                emailEditTextField.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
                null3.setText("Email cannot be empty");
            } else {
                setEditProfileInfoEmailDefault();
            }
            if (date == null) {
                jDateChooser1.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
                null4.setText("Date cannot be empty");
            } else {
                setEditProfileInfoDateDefault();
            }
            if (!username.isEmpty() && !email.isEmpty() && date != null) {

                java.sql.Date dateSql = new java.sql.Date(date.getYear(), date.getMonth(), date.getDate());
                String updateQuery = "UPDATE hospital.login SET uname = '" + username
                        + "' ,email = '" + email + "' ,birthdate = '"
                        + dateSql + "' ,gender = '" + gender
                        + "' where ssn = '" + adminUser.getSsn() + "'";
                // register the connection
                Connection c = DBConnection.getDBConnection();
                PreparedStatement p = c.prepareStatement(updateQuery);
                p.executeUpdate();

                
               updateQuery = "UPDATE hospital.staff SET birthdate = '" + dateSql
                               +"' ,email = '" + email
                                + "' ,username = '" + username
                                + "' where essnstaff = '" + adminUser.getSsn() + "'";
                        // register the connection
                p = c.prepareStatement(updateQuery);
                p.executeUpdate();
                
                adminUser.setUsername(username);
                adminUser.setEmail(email);
                adminUser.setBirthdate(dateSql);
                adminUser.setGender(gender);
                uNameLabel.setText(adminUser.getUsername());

                JOptionPane.showMessageDialog(this, "Account Info updated successfully");
            }

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
        }
    }//GEN-LAST:event_SaveEditMouseClicked

    private void editEmailLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editEmailLabelMouseClicked
        boolean isEmailEditable = !emailEditTextField.isEditable();
        SaveEdit.setEnabled(!(usernameEditTextField.isEditable() || isEmailEditable));
        emailEditTextField.setEditable(isEmailEditable);
        editEmailLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource(isEmailEditable ? "/images/done1.png" : "/images/edit.png"))); // NOI18N
    }//GEN-LAST:event_editEmailLabelMouseClicked

    private void editUsernameLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editUsernameLabelMouseClicked
        // TODO add your handling code here:
        boolean isUsernameEditable = !usernameEditTextField.isEditable();
        SaveEdit.setEnabled(!(isUsernameEditable || emailEditTextField.isEditable()));
        usernameEditTextField.setEditable(isUsernameEditable);
        editUsernameLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource(isUsernameEditable ? "/images/done1.png" : "/images/edit.png"))); // NOI18N
    }//GEN-LAST:event_editUsernameLabelMouseClicked

    private void confirmNewPasswordTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmNewPasswordTextFieldFocusLost
        if (confirmNewPasswordTextField.getText().length() == 0) {
            confirmNewPasswordFieldsLostFocus();
        }
    }//GEN-LAST:event_confirmNewPasswordTextFieldFocusLost

    private void confirmNewPasswordTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmNewPasswordTextFieldFocusGained
        if (confirmNewPasswordTextField.getText().equals("Confirm New Password")) {
            confirmNewPasswordFieldGainFocus();
        }
    }//GEN-LAST:event_confirmNewPasswordTextFieldFocusGained

    private void newPasswordTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_newPasswordTextFieldFocusLost
        if (newPasswordTextField.getText().length() == 0) {
            newPasswordFieldsLostFocus();
        }
    }//GEN-LAST:event_newPasswordTextFieldFocusLost

    private void newPasswordTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_newPasswordTextFieldFocusGained
        if (newPasswordTextField.getText().equals("New Password")) {
            newPasswordFieldGainFocus();
        }
    }//GEN-LAST:event_newPasswordTextFieldFocusGained

    private void oldPasswordTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_oldPasswordTextFieldFocusLost
        if (oldPasswordTextField.getText().length() == 0) {
            oldPasswordFieldsLostFocus();
        }
    }//GEN-LAST:event_oldPasswordTextFieldFocusLost

    private void oldPasswordTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_oldPasswordTextFieldFocusGained
        if (oldPasswordTextField.getText().equals("Old Password")) {
            oldPasswordFieldGainFocus();
        }
    }//GEN-LAST:event_oldPasswordTextFieldFocusGained

    private void CancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelMouseExited
        Cancel.setBackground(new Color(0, 153, 102));
        Cancel.setForeground(Color.WHITE);
    }//GEN-LAST:event_CancelMouseExited

    private void CancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelMouseEntered
        Cancel.setBackground(Color.WHITE);
        Cancel.setForeground(new Color(0, 153, 102));
    }//GEN-LAST:event_CancelMouseEntered

    private void CancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelMouseClicked
        jTabbedPane2.setSelectedIndex(1);
        setDefaultChangePasswordGUIValues();
    }//GEN-LAST:event_CancelMouseClicked

    private void SaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveMouseExited
        Save.setBackground(new Color(0, 153, 102));
        Save.setForeground(Color.WHITE);
    }//GEN-LAST:event_SaveMouseExited

    private void SaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveMouseEntered
        Save.setBackground(Color.WHITE);
        Save.setForeground(new Color(0, 153, 102));
    }//GEN-LAST:event_SaveMouseEntered

    private void SaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveMouseClicked
        String oldPassword = oldPasswordTextField.getText();
        String newPassword = newPasswordTextField.getText();
        String confirmNewPassword = confirmNewPasswordTextField.getText();
        boolean isEmptyInputPassword = false;
        if (oldPassword.isEmpty()) {
            oldPasswordTextField.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
            jLabel1null.setText("Old password cannot be empty");
            isEmptyInputPassword = true;
        } else {
            setDefaultOldPassGUIValue();
        }
        if (newPassword.isEmpty()) {
            newPasswordTextField.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
            jLabel2null.setText("New password cannot be empty");
            isEmptyInputPassword = true;
        } else {
            setDefaultNewPassGUIValue();
        }
        if (confirmNewPassword.isEmpty()) {
            confirmNewPasswordTextField.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
            jLabel3null.setText("Confirm new password cannot be empty");
            isEmptyInputPassword = true;
        } else {
            setDefaultConfirmNewPassGUIValues();
        }
        if (!isEmptyInputPassword) {
            if (!oldPassword.equals(adminUser.getPassword())) {
                oldPasswordTextField.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
                jLabel1null.setText("Old password is incorrect");
            } else if (newPassword.length() < 6) {
                newPasswordTextField.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
                jLabel2null.setText("Password cannot be less than 8 characters");
            } else if (!newPassword.equals(confirmNewPassword)) {
                confirmNewPasswordTextField.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
                jLabel3null.setText("Confirm new password should equal new password");
            } else {
                try {
                    int okNoChangePassResult = JOptionPane.showConfirmDialog(this, "Are you sure to change password",
                            "Confirm changing password", JOptionPane.YES_NO_OPTION);
                    if (okNoChangePassResult == JOptionPane.YES_OPTION) {
                        String updateQuery = "UPDATE hospital.login SET apassword = '" + newPassword + "' where ssn = '" + adminUser.getSsn() + "'";
                        Connection db = DBConnection.getDBConnection();
                        PreparedStatement p = db.prepareStatement(updateQuery);
                        p.executeUpdate();
                        adminUser.setPassword(newPassword);
                        setDefaultChangePasswordGUIValues();
                        JOptionPane.showMessageDialog(this, "Changing password done successfully!");
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Error in change password");
                }
            }
        }

    }//GEN-LAST:event_SaveMouseClicked

    private void ChangepasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangepasswordMouseClicked
        // TODO add your handling code here:
        jTabbedPane2.setSelectedIndex(2);
    }//GEN-LAST:event_ChangepasswordMouseClicked

    private void profileinfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileinfoMouseClicked
        // TODO add your handling code here:
        SaveEdit.setEnabled(true);
                setEditProfileInfoUsernameDefault();
        setEditProfileInfoEmailDefault();
        setEditProfileInfoDateDefault();
        
        jTabbedPane2.setSelectedIndex(3);
    }//GEN-LAST:event_profileinfoMouseClicked

    private void FinantialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FinantialMouseClicked
        // TODO add your handling code here:
        jTabbedPane2.setSelectedIndex(4);
        staffType = FINANTIAL_TYPE;
        createListStaffPanels(FINANTIAL_TYPE);
    }//GEN-LAST:event_FinantialMouseClicked

    private void SecurityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SecurityMouseClicked
        // TODO add your handling code here:
        jTabbedPane2.setSelectedIndex(4);
        staffType = SECURITY_TYPE;
        createListStaffPanels(SECURITY_TYPE);
    }//GEN-LAST:event_SecurityMouseClicked

    private void pharmacerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pharmacerMouseClicked
        // TODO add your handling code here:
        jTabbedPane2.setSelectedIndex(4);
        staffType = PHARMACER_TYPE;
        createListStaffPanels(PHARMACER_TYPE);
    }//GEN-LAST:event_pharmacerMouseClicked

    private void staffSalaryTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffSalaryTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_staffSalaryTextFieldActionPerformed

    private void searchJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchJTextFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        isFromSearch= false;
        saveStaffLabelButton.setText("Save");
                staffSsnTextField.setEditable(true);
        editStaffLabelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit2.png"))); // NOI18N
        String jListValue = jList1.getSelectedValue();
        if (jListValue == null || jListValue.isEmpty()) {
            JOptionPane.showMessageDialog(this, "There is no item selected");
        } else {
            jListValue = jListValue.trim().substring(jListValue.indexOf(':') + 1);
            for (Staff staff : staffList) {
                if (staff.getSsnstaff().equals(jListValue.trim())) {
                    staffSsnTextField.setText(staff.getSsnstaff());
                    staffworkingHoursTextField.setText("" + staff.getWorkinghours());
                    staffLanguageTextField.setText(staff.getLanguages());
                    staffBirthDateTextField.setDate(staff.getBirthdate());
                    staffEmailTextField.setText(staff.getEmail());
                    staffSalaryTextField.setText("" + staff.getSalary());
                    staffJoinDateTextField.setDate(staff.getJoindate());
                    staffExperinceTextField.setText(staff.getExperiance());
                    staffPhoneTextField.setText("" + staff.getPhone());
                    staffUsernameTextField.setText(staff.getUsername());
                    defaultStaffValues();
                    jTabbedPane2.setSelectedIndex(5);
                    break;
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void editStaffLabelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editStaffLabelButtonMouseClicked
        // TODO add your handling code here:
        staffSsnTextField.setEditable(false);
            boolean isEditable = !staffUsernameTextField.isEditable();
        staffworkingHoursTextField.setEditable(isEditable);
        staffLanguageTextField.setEditable(isEditable);
        staffBirthDateTextField.setEnabled(isEditable);
        staffEmailTextField.setEditable(isEditable);
        staffSalaryTextField.setEditable(isEditable);
        staffJoinDateTextField.setEnabled(isEditable);
        staffExperinceTextField.setEditable(isEditable);
        staffPhoneTextField.setEditable(isEditable);
        staffUsernameTextField.setEditable(isEditable);

        saveStaffLabelButton.setEnabled(!isEditable);
        editStaffLabelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource(isEditable ? "/images/done1.png" : "/images/edit2.png"))); // NOI18N
        
    }//GEN-LAST:event_editStaffLabelButtonMouseClicked

    private void saveStaffLabelButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveStaffLabelButtonMouseEntered
        // TODO add your handling code here:
        if (saveStaffLabelButton.isEnabled())
            saveStaffLabelButton.setBackground(new Color(153, 255, 255));
    }//GEN-LAST:event_saveStaffLabelButtonMouseEntered

    private void saveStaffLabelButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveStaffLabelButtonMouseExited
        // TODO add your handling code here:
        saveStaffLabelButton.setBackground(new Color(255, 204, 204));
    }//GEN-LAST:event_saveStaffLabelButtonMouseExited

    private void jLabel32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseClicked
        // TODO add your handling code here:
        if (isFromSearch){
            searchJTextField.setText("");
        }
        jTabbedPane2.setSelectedIndex(isFromSearch? 0: 4);
 
    }//GEN-LAST:event_jLabel32MouseClicked

    private void staffSalaryTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_staffSalaryTextFieldKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_staffSalaryTextFieldKeyTyped

    private void defaultStaffValues(){
          staffSsnTextField.setBorder(null);
                jLabel4.setText("");
 staffUsernameTextField.setBorder(null);
                jLabel35.setText("");
                  staffEmailTextField.setBorder(null);
                jLabel34.setText("");
                     staffPhoneTextField.setBorder(null);
                jLabel33.setText("");
                staffExperinceTextField.setBorder(null);
                jLabel21.setText("");
                   staffSalaryTextField.setBorder(null);
                jLabel12.setText("");
                   staffworkingHoursTextField.setBorder(null);
                jLabel17.setText("");
                 staffJoinDateTextField.setBorder(null);
                jLabel18.setText("");
                    staffLanguageTextField.setBorder(null);
                jLabel20.setText("");
                        staffBirthDateTextField.setBorder(null);
                jLabel31.setText("");
    }
    
    private void staffPhoneTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_staffPhoneTextFieldKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_staffPhoneTextFieldKeyTyped

    private void staffworkingHoursTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_staffworkingHoursTextFieldKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_staffworkingHoursTextFieldKeyTyped

    private void saveStaffLabelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveStaffLabelButtonMouseClicked
        // TODO add your handling code here:
        if (saveStaffLabelButton.isEnabled()) {
            String ssn = staffSsnTextField.getText();
            Date birthdate = staffBirthDateTextField.getDate();
            Date joindate = staffJoinDateTextField.getDate();
            String salary = staffSalaryTextField.getText();
            String email = staffEmailTextField.getText();
            String workinghours = staffworkingHoursTextField.getText();
            String languages = staffLanguageTextField.getText();
            String experiance = staffExperinceTextField.getText();
            String phone = staffPhoneTextField.getText();
            String name = staffUsernameTextField.getText();
        
            if(saveStaffLabelButton.getText().equals("Add")){
                        if (ssn.isEmpty()) {
                staffSsnTextField.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
                jLabel4.setText("SSN cannot be empty");
            } else if (ssn.length() != 9) {
                staffSsnTextField.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
                jLabel4.setText("SSN length should be 9");
            } else {
                staffSsnTextField.setBorder(null);
                jLabel4.setText("");
            }
            }
            if (salary.isEmpty()) {
                staffSalaryTextField.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
                jLabel12.setText("Salary cannot be empty");
            } else {
                staffSalaryTextField.setBorder(null);
                jLabel12.setText("");
            }
            if (workinghours.isEmpty()) {
                staffworkingHoursTextField.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
                jLabel17.setText("Workinghours cannot be empty");
            } else {
                staffworkingHoursTextField.setBorder(null);
                jLabel17.setText("");
            }
            if (joindate == null) {
                staffJoinDateTextField.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
                jLabel18.setText("JoinDate cannot be empty");
            } else {
                staffJoinDateTextField.setBorder(null);
                jLabel18.setText("");
            }
            if (languages.isEmpty()) {
                staffLanguageTextField.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
                jLabel20.setText("Languages cannot be empty");
            } else {
                staffLanguageTextField.setBorder(null);
                jLabel20.setText("");
            }
            if (birthdate == null) {
                staffBirthDateTextField.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
                jLabel31.setText("BirthDate cannot be empty");
            } else {
                staffBirthDateTextField.setBorder(null);
                jLabel31.setText("");
            }
            if (experiance.isEmpty()) {
                staffExperinceTextField.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
                jLabel21.setText("Experiance cannot be empty");
            } else {
                staffExperinceTextField.setBorder(null);
                jLabel21.setText("");
            }
            if (phone.isEmpty()) {
                staffPhoneTextField.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
                jLabel33.setText("Phone cannot be empty");
            } else if (phone.length() != 10) {
                staffPhoneTextField.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
                jLabel33.setText("Phone should be 10");
            } else {
                staffPhoneTextField.setBorder(null);
                jLabel33.setText("");
            }
            if (email.isEmpty()) {
                staffEmailTextField.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
                jLabel34.setText("Email cannot be empty");
            } else {
                staffEmailTextField.setBorder(null);
                jLabel34.setText("");
            }
            if (name.isEmpty()) {
                staffUsernameTextField.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
                jLabel35.setText("Username cannot be empty");
            } else {
                staffUsernameTextField.setBorder(null);
                jLabel35.setText("");
            }
            
                
            if (birthdate != null && joindate != null && !salary.isEmpty() && !email.isEmpty() && !workinghours.isEmpty()
                    && !languages.isEmpty() && (jLabel4.getText().isEmpty()) && !experiance.isEmpty() && !phone.isEmpty() && phone.length()==10 && !name.isEmpty()) {

                try {
                    java.sql.Date birthDateSql = new java.sql.Date(birthdate.getYear(), birthdate.getMonth(), birthdate.getDate());
                    java.sql.Date joinDateSql = new java.sql.Date(joindate.getYear(), joindate.getMonth(), joindate.getDate());

                    if (saveStaffLabelButton.getText().equals("Add")) {
                        String updateQuery = "INSERT INTO hospital.staff (essnstaff, workinghours, salary, joindate,"
                                + "langueges, experiance, birthdate, phone, email, username, stafftype)"
                                + "VALUES('" + ssn + "', '" + workinghours + "', '" + salary
                                + "', '" + joinDateSql + "', '" + languages + "', '" + experiance
                                + "', '" + birthDateSql + "', '" + phone + "', '" + email
                                + "', '" + name + "', '" + staffType
                                + "')";
                        // register the connection
                        Connection c = DBConnection.getDBConnection();
                        PreparedStatement p = c.prepareStatement(updateQuery);
                        p.executeUpdate();
                        
                        if (staffType == 0 || staffType==1 || staffType==2){
                            updateQuery = "INSERT INTO hospital.login (ssn, birthdate, email, uname, gender, apassword, itype)"
                                    + "VALUES('" + ssn + "', '" + birthDateSql + "', '" + email
                                    + "', '" + name + "', 'Male', '12345678', '" + staffType
                                    + "')";
                            // register the connection
                            p = c.prepareStatement(updateQuery);
                            p.executeUpdate();
                        }
                        Staff staff = new Staff();
                        staff.setSsnstaff(ssn);
                        staff.setUsername(name);
                        staff.setBirthdate(birthDateSql);
                        staff.setJoindate(joinDateSql);
                        staff.setExperiance(experiance);
                        staff.setEmail(email);
                        staff.setLanguages(languages);
                        staff.setPhone(phone);
                        staff.setSalary(Integer.valueOf(salary));
                        staff.setWorkinghours(Double.valueOf(workinghours));
                        staff.setStafftype("" + staffType);
                        staffList.add(staff);
                        JOptionPane.showMessageDialog(this, STAFF_TYPE_MAP.get(staffType) + " with SSN " + ssn + " added successfully");
                        createListStaffPanels(staffType);
                        jTabbedPane2.setSelectedIndex(4);
                    }
                    
                    else {
                        
       
                        String updateQuery = "UPDATE hospital.staff SET workinghours = '" + workinghours
                                + "' ,salary = '" + salary + "' ,joindate = '"
                                + joinDateSql + "' ,langueges = '" + languages
                                + "' ,experiance = '" + experiance + "' ,birthdate = '" + birthDateSql
                                + "' ,phone = '" + phone + "' ,email = '" + email
                                + "' ,username = '" + name
                                + "' where essnstaff = '" + ssn + "'";
                        // register the connection
                        Connection c = DBConnection.getDBConnection();
                        PreparedStatement p = c.prepareStatement(updateQuery);
                        p.executeUpdate();

                        
                        if (staffType == 0 || staffType==1 || staffType==2){
                            updateQuery = "UPDATE hospital.login SET uname = '" + name
                                + "' ,email = '" + email + "' ,birthdate = '"
                                + birthDateSql  + "' where ssn = '" +ssn + "'";
                            // register the connection
                            p = c.prepareStatement(updateQuery);
                            p.executeUpdate();
                        }
                        
                        for (Staff staff : staffList) {
                            if (staff.getSsnstaff().equals(ssn)) {
                                staff.setUsername(name);
                                staff.setBirthdate(birthDateSql);
                                staff.setJoindate(joinDateSql);
                                staff.setExperiance(experiance);
                                staff.setEmail(email);
                                staff.setLanguages(languages);
                                staff.setPhone(phone);
                                staff.setSalary(Integer.valueOf(salary));
                                staff.setWorkinghours(Double.valueOf(workinghours));
                                JOptionPane.showMessageDialog(this, "Empoyee Info updated successfully");
                                return;
                            }
                        }
                    }
                } catch (Exception ex) {
                    if (ex.getMessage().contains("duplicate key value")) {
                        JOptionPane.showMessageDialog(this, "Staff with " + ssn + " already exist");
                    } else {
                        JOptionPane.showMessageDialog(this, "Error in updating staff");
                    }
                }

            }
        }
    }//GEN-LAST:event_saveStaffLabelButtonMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jTabbedPane2.setSelectedIndex(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        isFromSearch=false;
        saveStaffLabelButton.setText("Add");
        staffSsnTextField.setText("");
        staffworkingHoursTextField.setText("");
        staffLanguageTextField.setText("");
        staffBirthDateTextField.setDate(null);
        staffEmailTextField.setText("");
        staffSalaryTextField.setText("");
        staffJoinDateTextField.setDate(null);
        staffExperinceTextField.setText("");
        staffPhoneTextField.setText("");
        staffUsernameTextField.setText("");
        editStaffLabelButton.setIcon(null);
        

        staffSsnTextField.setEditable(true);
        staffworkingHoursTextField.setEditable(true);
        staffLanguageTextField.setEditable(true);
        staffBirthDateTextField.setEnabled(true);
        staffEmailTextField.setEditable(true);
        staffSalaryTextField.setEditable(true);
        staffJoinDateTextField.setEnabled(true);
        staffExperinceTextField.setEditable(true);
        staffPhoneTextField.setEditable(true);
        staffUsernameTextField.setEditable(true);

        defaultStaffValues();
        jTabbedPane2.setSelectedIndex(5);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        isFromSearch = true;
        String searchText = searchJTextField.getText();
        if (searchText.isEmpty()){
            searchJTextField.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
            JOptionPane.showMessageDialog(this, "Please Enter SSN");
        }
        else {
             searchJTextField.setBorder(null);
            try {
                String query = "SELECT * FROM hospital.staff WHERE essnstaff='" + searchText + "'";
                Connection c = DBConnection.getDBConnection();
                PreparedStatement p = c.prepareStatement(query);
                ResultSet rs = p.executeQuery();
                if (rs.next()) {
                    saveStaffLabelButton.setText("Save");
                    editStaffLabelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit2.png"))); // NOI18N

                    Staff staff = new Staff(rs);
                    staffSsnTextField.setText(staff.getSsnstaff());
                    staffworkingHoursTextField.setText("" + staff.getWorkinghours());
                    staffLanguageTextField.setText(staff.getLanguages());
                    staffBirthDateTextField.setDate(staff.getBirthdate());
                    staffEmailTextField.setText(staff.getEmail());
                    staffSalaryTextField.setText("" + staff.getSalary());
                    staffJoinDateTextField.setDate(staff.getJoindate());
                    staffExperinceTextField.setText(staff.getExperiance());
                    staffPhoneTextField.setText("" + staff.getPhone());
                    staffUsernameTextField.setText(staff.getUsername());
                    
                    staffList = new ArrayList<>();
                    staffList.add(staff);
                    defaultStaffValues();
                    jTabbedPane2.setSelectedIndex(5);

                } else {
                    JOptionPane.showMessageDialog(this, "staff with " + searchText + " doesn't exist");
                }
                
                
                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error in Read from DB");
            }
        }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String jListValue = jList1.getSelectedValue();
        int jListIndex = jList1.getSelectedIndex();
        if (jListValue == null || jListValue.isEmpty()) {
            JOptionPane.showMessageDialog(this, "There is no item selected");
        } else {
            jListValue = (jListValue.trim().substring(jListValue.indexOf(':') + 1)).trim();
            int okNoChangePassResult = JOptionPane.showConfirmDialog(this, "Are you sure to delete " + STAFF_TYPE_MAP.get(staffType) + " with SSN " + jListValue,
                    "Confirm Delete Staff", JOptionPane.YES_NO_OPTION);
            if (okNoChangePassResult == JOptionPane.YES_OPTION) {
                final String finalJListValue = jListValue;
                try {
                    String updateQuery = "DELETE FROM hospital.staff WHERE essnstaff = '" + jListValue + "'";
                    Connection db = DBConnection.getDBConnection();
                    PreparedStatement p = db.prepareStatement(updateQuery);
                    p.executeUpdate();
                    
                        if (staffType == 0 || staffType==1 || staffType==2){
                            updateQuery = "DELETE FROM hospital.login WHERE ssn = '" + jListValue + "'";
                            // register the connection
                            p = db.prepareStatement(updateQuery);
                            p.executeUpdate();
                        }
                    staffList.removeIf(st -> finalJListValue.equals(st.getSsnstaff()));
                    DefaultListModel<String> listModel = (DefaultListModel<String>) jList1.getModel();
                    listModel.remove(jListIndex);
                    JOptionPane.showMessageDialog(this, "Deleting " + jListValue + " "+ STAFF_TYPE_MAP.get(staffType) + " done successfully!");
                } catch (Exception ex) {
                    System.out.println(ex);
                    JOptionPane.showMessageDialog(this, "Error in deleting in DB");
                }
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void staffJoinDateTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_staffJoinDateTextFieldMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_staffJoinDateTextFieldMouseClicked

    private void staffJoinDateTextFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_staffJoinDateTextFieldMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_staffJoinDateTextFieldMouseEntered

    private void checkBillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkBillMouseClicked
        InputStream input;
        JasperDesign jd;
        JasperReport jr;
        JasperPrint jp;
        OutputStream output;
        
        try {
            Connection db = DBConnection.getDBConnection();
            input=new FileInputStream(new File("StaffS.jrxml"));
            jd=JRXmlLoader.load(input);
            jr=JasperCompileManager.compileReport(jd);
            jp=JasperFillManager.fillReport(jr, null, db);
            JFrame frame=new JFrame("Staff_Salary");
            frame.getContentPane().add(new JRViewer(jp));
            frame.pack();
            frame.setVisible(true);
        } catch (Exception ex) {
           
        }
        
    }//GEN-LAST:event_checkBillMouseClicked

    private void staffSsnTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_staffSsnTextFieldKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_staffSsnTextFieldKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cancel;
    private javax.swing.JLabel CancelEdit;
    private javax.swing.JLabel Changepassword;
    private javax.swing.JLabel Doctor;
    private javax.swing.JLabel Engineers;
    private javax.swing.JLabel Finantial;
    private javax.swing.JLabel Nurse;
    private javax.swing.JLabel Radiologic;
    private javax.swing.JLabel Reception;
    private javax.swing.JLabel Save;
    private javax.swing.JLabel SaveEdit;
    private javax.swing.JLabel Security;
    private javax.swing.JLabel checkBill;
    private javax.swing.JPasswordField confirmNewPasswordTextField;
    private javax.swing.JLabel editEmailLabel;
    private javax.swing.JLabel editStaffLabelButton;
    private javax.swing.JLabel editUsernameLabel;
    private javax.swing.JTextField emailEditTextField;
    private javax.swing.JRadioButton femaleRadioButton;
    private javax.swing.ButtonGroup genderButtonGroup;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel1null;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel2null;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel3null;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelStaffPanels;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JRadioButton maleRadioButton;
    private javax.swing.JPasswordField newPasswordTextField;
    private javax.swing.JLabel null1;
    private javax.swing.JLabel null3;
    private javax.swing.JLabel null4;
    private javax.swing.JPasswordField oldPasswordTextField;
    private javax.swing.JLabel pharmacer;
    private javax.swing.JLabel profileinfo;
    private javax.swing.JLabel saveStaffLabelButton;
    private javax.swing.JTextField searchJTextField;
    private com.toedter.calendar.JDateChooser staffBirthDateTextField;
    private javax.swing.JTextField staffEmailTextField;
    private javax.swing.JTextField staffExperinceTextField;
    private com.toedter.calendar.JDateChooser staffJoinDateTextField;
    private javax.swing.JTextField staffLanguageTextField;
    private javax.swing.JTextField staffPhoneTextField;
    private javax.swing.JTextField staffSalaryTextField;
    private javax.swing.JTextField staffSsnTextField;
    private javax.swing.JTextField staffUsernameTextField;
    private javax.swing.JTextField staffworkingHoursTextField;
    private javax.swing.JLabel uNameLabel;
    private javax.swing.JTextField usernameEditTextField;
    // End of variables declaration//GEN-END:variables
}
