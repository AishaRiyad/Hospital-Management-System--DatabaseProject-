/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author NTC
 */
public class DBConnection {

    //string for postgresuser login
    private static final String SQL_USERNAME = "aisha";
    private static final String SQL_PASSWORD = "555333555@aisha";

    public static Connection getDBConnection() throws Exception{
        try {
            //get driver class name
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",SQL_USERNAME,SQL_PASSWORD);
        } catch(Exception e){
            throw e;
        }
    }

    public PreparedStatement prepareStatement(String updateQuery) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
