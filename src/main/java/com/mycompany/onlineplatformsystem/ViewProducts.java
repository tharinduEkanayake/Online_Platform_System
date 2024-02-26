
package com.mycompany.onlineplatformsystem;

import javax.swing.*;

public class ViewProducts {
    private JFrame fr1;
    private JTable t1;
    
    ViewProducts()
    {
        fr1 = new JFrame();
        t1 = new JTable();
    
        String data[][] = { 
            {"100","Kavin","Software Engineer"}, 
            {"101","Dilini","QA Engineer"}, 
            {"102","Dilum","System Engineer"}
        };
        String columns[] = {"Products","Categories","Brands"};
            
        t1 = new JTable(data,columns);
        t1.setBounds(30,40,250,350);
            
        JScrollPane sp = new JScrollPane(t1);
        
        fr1.add(sp);
        fr1.setSize(350,450);
        fr1.setVisible(true);
        
        
    }
      
    public static void main(String[]args)
    {
        new ViewProducts();
    }
    
    
}
