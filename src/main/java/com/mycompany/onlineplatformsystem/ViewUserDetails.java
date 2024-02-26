
package com.mycompany.onlineplatformsystem;

import javax.swing.*;

public class ViewUserDetails {
    private JFrame fr1;
    private JTable t1;
    
    ViewUserDetails()
    {
        fr1 = new JFrame();
        t1 = new JTable();
    
        String data[][] = { 
            {"100","Kavin","1998/10/10"}, 
            {"101","Dilini","1985/12/01"}, 
            {"102","Dilum","1995/05/04"}
        };
        String columns[] = {"User ID","Full Name","DOB"};
            
        t1 = new JTable(data,columns);
        t1.setBounds(30,40,250,350);
            
        JScrollPane sp = new JScrollPane(t1);
        
        fr1.add(sp);
        fr1.setSize(350,450);
        fr1.setVisible(true);
        
        
    }
      
    public static void main(String[]args)
    {
        new ViewUserDetails();
    }
}
