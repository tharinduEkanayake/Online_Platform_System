
package com.mycompany.onlineplatformsystem;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Registration extends Frame{
     
    Registration(){
    
        JPanel p1= new JPanel();
        p1.setLayout(new GridLayout(3,2));
        
        FlowLayout layout = new FlowLayout();
        JPanel p2 = new JPanel();
        p2.setLayout(layout);
        
        JLabel cusId,fullName,DOB;
        JTextField tCusId,tFullName,tDOB;
        JButton bRegister;
        
        cusId = new JLabel(" Custermer ID ");
        tCusId = new JTextField(30);
        fullName = new JLabel(" Full Name");
        tFullName = new JTextField(30);
        DOB = new JLabel(" Password");
        tDOB = new JTextField(30);
        bRegister = new JButton("Register");
        
        p1.add(cusId);
        p1.add(tCusId);
        p1.add(fullName);
        p1.add(tFullName);
        p1.add(DOB);
        p1.add(tDOB);
        p2.add(bRegister);
        
        add(p1,"North");
        add(p2,"South");
        
        this.setTitle("Online Register");
        this.setVisible(true);
        this.setSize(400,200);
        bRegister.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                try {
                    String UserName = "tharindu",Password ="1234";
                    
                    Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/online_store","root","");
                    
                    Statement stmt = con.createStatement();
                    
                    stmt.executeUpdate("insert into authenticate(username,password) values('"+ UserName +"','"+ Password +"')");
                    
                    System.out.println("Insert Successfully");
                    
                } catch (SQLException ex) {
                    System.out.println("error");
                    System.out.println(ex);
                }
                
            }
        });
           
        addWindowListener( new WindowAdapter() {
        public void windowClosing(WindowEvent we){
         System.exit(0);
        }
    });
    
        
    }
    
    public static void main(String[]args){
        System.out.println("");
        new Registration();
    }
}
