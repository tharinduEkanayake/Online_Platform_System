package com.mycompany.onlineplatformsystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Login extends Frame{
    Login() {
    
        JPanel p1= new JPanel();
        p1.setLayout(new GridLayout(2,2));
        
        FlowLayout layout = new FlowLayout();
        JPanel p2 = new JPanel();
        p2.setLayout(layout);
        
        JLabel userName,Password;
        JTextField tUName,tPassword;
        JButton bLogin;
        
        userName = new JLabel(" User Name ");
        tUName = new JTextField(30);
        Password = new JLabel(" Password");
        tPassword = new JTextField(30);
        bLogin = new JButton("Login");
        
        p1.add(userName);
        p1.add(tUName);
        p1.add(Password);
        p1.add(tPassword);
        p2.add(bLogin);
        
        add(p1,"North");
        add(p2,"South");
        
        this.setTitle("Login");
        this.setVisible(true);
        this.setSize(400,200);
        bLogin.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            setVisible(false);
            }
        });
           
        addWindowListener( new WindowAdapter() {
            public void windowClosing(WindowEvent we){
             System.exit(0);
            }
        });
    
        
    }
    
    public static void main(String[]args){
        new Login();
    }
    
}

