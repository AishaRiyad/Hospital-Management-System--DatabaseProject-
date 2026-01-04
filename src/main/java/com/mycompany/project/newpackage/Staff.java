/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project.newpackage;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author NTC
 */
public class Staff {

    public static final String SSN = "essnstaff";
    public static final String Joindate = "joindate";
    public static final String BIRTHDATE = "birthdate";
    public static final String Phone = "phone";
    public static final String EMAIL = "email";
    public static final String salary = "salary";
    public static final String TYPE = "stafftype";
    public static final String Experiance = "experiance";
    public static final String Languages = "langueges";
    public static final String Workinghours = "workinghours";
    public static final String uname = "Username";

    private String ssnstaff;
    private Date birthdate;
    private String email;
    private String phone;
    private Integer Salary;
    private String experiance;
    private String languages;
    private Double workinghours;
    private Date joindate;
    private String stafftype;
    private String Username;

    public Staff(ResultSet res) {
        try {
            ssnstaff = res.getString(SSN);
            phone = res.getString(Phone);
            birthdate = (Date) res.getObject(BIRTHDATE);
            joindate = (Date) res.getObject(Joindate);
            email = res.getString(EMAIL);
            experiance = res.getString(Experiance);
            stafftype = res.getString(TYPE);
            Salary = res.getInt(salary);
            languages = res.getString(Languages);
            workinghours = res.getDouble(Workinghours);
            Username = res.getString(uname);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public Staff() {
    }

    public String getSsnstaff() {
        return ssnstaff;
    }

    public void setSsnstaff(String ssnstaff) {
        this.ssnstaff = ssnstaff;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getSalary() {
        return Salary;
    }

    public void setSalary(Integer Salary) {
        this.Salary = Salary;
    }

    public String getExperiance() {
        return experiance;
    }

    public void setExperiance(String experiance) {
        this.experiance = experiance;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public Double getWorkinghours() {
        return workinghours;
    }

    public void setWorkinghours(Double workinghours) {
        this.workinghours = workinghours;
    }

    public Date getJoindate() {
        return joindate;
    }

    public void setJoindate(Date joindate) {
        this.joindate = joindate;
    }

    public String getStafftype() {
        return stafftype;
    }

    public void setStafftype(String stafftype) {
        this.stafftype = stafftype;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    @Override
    public String toString() {
        return "Staff{" + "ssnstaff=" + ssnstaff + ", birthdate=" + birthdate + ", email=" + email + ", phone=" + phone + ", Salary=" + Salary + ", experiance=" + experiance + ", languages=" + languages + ", workinghours=" + workinghours + ", joindate=" + joindate + ", stafftype=" + stafftype + ", Username=" + Username + '}';
    }
}
