/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reception;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author NTC
 */
public class Patient {
    
    public static final String SSN = "patientssn";
    public static final String BIRTHDATE = "birthdate";
    public static final String MaterialStatus = "materialstatus";
    public static final String Gender = "gender";
    public static final String Address = "address";
    public static final String patientname = "patientname";
    
    private String ssnpatient;
    private Date birthdate;
    private String gender;
    private String address;
    private String ms;
    private String name;
    
    
    public Patient(ResultSet res) {
        try {
            ssnpatient = res.getString(SSN);
            gender = res.getString(Gender);
            birthdate = (Date) res.getObject(BIRTHDATE);
            ms = res.getString(MaterialStatus);
            address = res.getString(Address);
            name = res.getString(patientname);
            
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    
    public Patient() {
    }

    public String getSsnpatient() {
        return ssnpatient;
    }

    public void setSsnpatient(String ssnpatient) {
        this.ssnpatient = ssnpatient;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMs() {
        return ms;
    }

    public void setMs(String ms) {
        this.ms = ms;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    @Override
    public String toString() {
        return "Patient{" + "ssnpatient=" + ssnpatient + ", birthdate=" + birthdate + ", address=" + address + ", ms=" + ms + ", gender=" + gender + ", name=" + name + '}';
    }
    
}
