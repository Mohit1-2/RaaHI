/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raahi;


import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;

public class viewBookedHotel extends JFrame implements ActionListener {
    
    
    JLabel l11,l12,l13,l14,l15,l16,l17,l18,l19,l20;
    JButton b1;
    String user;
    
    public viewBookedHotel(String username){
        user=username;
   setBounds(610,240,1000,600);
   setLayout(null);
   getContentPane().setBackground(Color.WHITE);
   
   
   
       ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("raahi/icons/bookeddetails.jpg"));
        Image i2=i1.getImage().getScaledInstance(500,380 ,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l30=new JLabel(i3);
        l30.setBounds(450,20,500,380);
        add(l30);
   
   JLabel heading=new JLabel("BOOKED HOTEL DETAILS");
  heading.setBounds(60,0,300,30);
   heading.setFont(new Font("Yu Mincho", Font.BOLD, 20));
   add(heading);
   
   
   
   JLabel l1= new JLabel("USERNAME:");
   l1.setFont(new Font("Yu Mincho", Font.PLAIN, 15));
   l1.setBounds(30, 50, 100, 30);
   add(l1);
                
    l11= new JLabel();
    l11.setFont(new Font("Yu Mincho", Font.PLAIN, 15));
    l11.setBounds(250, 50, 200, 30);
    add(l11);
    
    
    
    JLabel l2= new JLabel("HOTEL NAME:");
   l2.setFont(new Font("Yu Mincho", Font.PLAIN, 15));
   l2.setBounds(30, 90, 100, 30);
   add(l2);
                
    l12= new JLabel();
    l12.setFont(new Font("Yu Mincho", Font.PLAIN, 15));
    l12.setBounds(250, 90, 200, 30);
    add(l12);
    
    
   JLabel l3= new JLabel("TOTALPERSONS:");
   l3.setFont(new Font("Yu Mincho", Font.PLAIN, 15));
   l3.setBounds(30, 130, 200, 30);
   add(l3);
                
    l13= new JLabel();
    l13.setFont(new Font("Yu Mincho", Font.PLAIN, 15));
    l13.setBounds(250, 130, 200, 30);
    add(l13);
    
    
    JLabel l4= new JLabel("TOTAL DAYS: ");
   l4.setFont(new Font("Yu Mincho", Font.PLAIN, 15));
   l4.setBounds(30, 170, 100, 30);
   add(l4);
                
    l14= new JLabel();
    l14.setFont(new Font("Yu Mincho", Font.PLAIN, 15));
    l14.setBounds(250, 170, 200, 30);
    add(l14);
    
    JLabel l5= new JLabel("AC Included");
   l5.setFont(new Font("Yu Mincho", Font.PLAIN, 15));
   l5.setBounds(30, 210, 140, 30);
   add(l5);
                
    l15= new JLabel();
    l15.setFont(new Font("Yu Mincho", Font.PLAIN, 15));
    l15.setBounds(250, 210, 200, 30);
    add(l15);
    
    JLabel l6= new JLabel("FOOD Included");
   l6.setFont(new Font("Yu Mincho", Font.PLAIN, 15));
   l6.setBounds(30, 250, 200, 30);
   add(l6);
                
    l16= new JLabel();
    l16.setFont(new Font("Yu Mincho", Font.PLAIN, 15));
    l16.setBounds(250, 250, 200, 30);
    add(l16);
    
    JLabel l7= new JLabel("ID: ");
   l7.setFont(new Font("Yu Mincho", Font.PLAIN, 15));
   l7.setBounds(30, 290, 100, 30);
   add(l7);
                
    l17= new JLabel();
    l17.setFont(new Font("Yu Mincho", Font.PLAIN, 15));
    l17.setBounds(250, 290, 200, 30);
    add(l17);
    
    JLabel l8= new JLabel("ID Number: ");
   l8.setFont(new Font("Yu Mincho", Font.PLAIN, 15));
   l8.setBounds(30, 330, 100, 30);
   add(l8);
                
    l18= new JLabel();
    l18.setFont(new Font("Yu Mincho", Font.PLAIN, 15));
    l18.setBounds(250, 330, 200, 30);
    add(l18);
    
    JLabel l9= new JLabel("PHONE: ");
   l9.setFont(new Font("Yu Mincho", Font.PLAIN, 15));
   l9.setBounds(30, 370, 100, 30);
   add(l9);
                
    l19= new JLabel();
    l19.setFont(new Font("Yu Mincho", Font.PLAIN, 15));
    l19.setBounds(250, 370, 200, 30);
    add(l19);

JLabel l10= new JLabel("TOTAL COST: ");
   l10.setFont(new Font("Yu Mincho", Font.PLAIN, 15));
   l10.setBounds(30, 410, 150, 30);
   add(l10);
                
    l20= new JLabel();
    l20.setFont(new Font("Yu Mincho", Font.PLAIN, 15));
    l20.setBounds(250, 410, 200, 30);
    add(l20);
    
    // for taking value from the table in dbms
   
               try{
                     Conn c = new Conn();
                     ResultSet rs = c.s.executeQuery("select * from bookedhotel where username = '"+user+"'");
                    while(rs.next()){
                        l11.setText(rs.getString(1));         //use index with l11 label 
                        l12.setText(rs.getString(2));
                        l13.setText(rs.getString(3));
                        l14.setText(rs.getString(4));
                        l15.setText(rs.getString(5));
                        l16.setText(rs.getString(6));
                        l17.setText(rs.getString(7));
			l18.setText(rs.getString(8));
			l19.setText(rs.getString(9));
                        l20.setText(rs.getString(10));
                    }

                    rs.close();
                }catch(SQLException e){}
          
    
    
                b1=new JButton("Back");
                b1.setBackground(Color.BLACK);
                b1.setForeground(Color.WHITE);
                b1.addActionListener(this);
                b1.setBounds(150,460,150,25);
                add(b1);
    
    
    
   
   
   
    }
    
     public void actionPerformed(ActionEvent ae){
     
     if(ae.getSource()==b1){
        
        this.setVisible(false);
       // new Dashboard(user).setVisible(true);
   }
     
     }
    
    
    
    
    
    
    
    public static void main(String[] args){
    
    new viewBookedHotel("Mohit").setVisible(true);
    
    }
}

