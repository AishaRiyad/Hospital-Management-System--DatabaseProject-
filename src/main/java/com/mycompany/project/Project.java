/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project;
import javax.swing.JFrame;
import login.Login;

/**
 *
 * @author NTC
 */
public class Project {

    public static void main(String[] args) {
      
        Login login = new Login();
        login.setVisible(true);      
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
