/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author NTC
 */
public class LoginUser {

    private static final String USERNAME = "uname";
    private static final String PASSWORD = "apassword";
    private static final String BIRTHDATE = "birthdate";
    private static final String SSN = "ssn";
    private static final String EMAIL = "email";
    private static final String GENDER = "gender";
    private static final String TYPE = "itype";

    private String username;
    private Date birthdate;
    private String ssn;
    private String password;
    private String email;
    private String gender;
    private String type;

    public LoginUser(ResultSet rs) {
        try {
            username = rs.getString(USERNAME);
            password = rs.getString(PASSWORD);
            birthdate = (Date)rs.getObject(BIRTHDATE);
            ssn = rs.getString(SSN);
            email = rs.getString(EMAIL);
            gender = rs.getString(GENDER);
            type = rs.getString(TYPE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Failed in class " + LoginUser.class.getName());
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    

}
