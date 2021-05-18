/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raahi;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Payment  extends JFrame implements ActionListener {
    
    JButton  b1,b2;
    String user;
    Payment(String username){
    user=username;
    setLayout(null);
    setBounds(600, 220, 800, 600);
    getContentPane().setBackground(Color.WHITE);
        
        JLabel label=new JLabel("Pay using Paytm");
        label.setFont(new Font("Raleway", Font.BOLD, 40));
        label.setBounds(50, 20, 350, 45);
        add(label);
        
         ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("raahi/icons/paytm.jpeg"));
        Image i2=i1.getImage().getScaledInstance(800,570 ,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l10=new JLabel(i3);
        l10.setBounds(0,0,800,600);
        add(l10);
        
        b1=new JButton("PAY");
        b1.setBounds(300,200,100,40);
        b1.addActionListener(this);
        l10.add(b1);
        
        
      b2=new JButton("BACK");
      b2.setBounds(400,200,100,40);
      b2.addActionListener(this);
      l10. add(b2);
        
        
    
    
    }
    public void actionPerformed(ActionEvent ae){
     
     if(ae.getSource()==b2){
        
        this.setVisible(false);
       // new Dashboard(user).setVisible(true);
   }
     else if(ae.getSource()==b1){
     this.setVisible(false);
     
     new Paytm().setVisible(true);
     }
     
     }
    
    
    
    
    
     public static void main(String[] args){
        new Payment("Mohit").setVisible(true);
    }
}