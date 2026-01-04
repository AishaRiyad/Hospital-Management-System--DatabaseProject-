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
public class History {
    public static final String Cost = "cost";
    public static final String Enterdate = "enterdate";
    public static final String Exitdate = "exitdate";
    public static final String Desease = "patientdesease";
    public static final String Name = "patientname";
    public static final String SSN = "patientssn";
    public static final String PAYORNOT = "payornot";
    
    
    private Date exitdate;
    private Date enterdate;
    private Integer cost;
    private String desease;
    private String ssn;
    private String name;
    private boolean payOrNot;
   
    public History(ResultSet res){
        try {
            cost = res.getInt(Cost);
            desease = res.getString(Desease);
            enterdate = (Date) res.getObject(Enterdate);
            exitdate= (Date) res.getObject(Exitdate);
            ssn = res.getString(SSN);
            name = res.getString(Name);
            payOrNot = res.getBoolean(PAYORNOT);
            
            
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    
    public History() {
    }

    public Date getExitdate() {
        return exitdate;
    }

    public void setExitdate(Date exitdate) {
        this.exitdate = exitdate;
    }

    public Date getEnterdate() {
        return enterdate;
    }

    public void setEnterdate(Date enterdate) {
        this.enterdate = enterdate;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   

    public String getDesease() {
        return desease;
    }

    public void setDesease(String desease) {
        this.desease = desease;
    }

    @Override
    public String toString() {
        return "The patient " + name + " with ssn " + ssn +" enter in " + enterdate + " exit in " + exitdate + " had the desease " + desease + " and his/her cost is " + cost  
                + " and it was " + (payOrNot ? "paid" : "not paied") ;
    }  
}
