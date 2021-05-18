/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raahi;

import java.awt.*;
import javax.swing.*;




public class CheckPackage extends JFrame  {
    
    CheckPackage(){
        
        String [] package1 =new String[]{
            "GOLD PACKAGE","6 NIGHT AND 7 DAYS","AIRPORT ASSISTANCE","HALF CITY TOUR","DAILY BUFFET","WELCOME DRINKS","FULL DAY IN CRUISE","BOOK NOW","SUMMER SPECIAL","Rs.12000","package1.jpg"
            };
        
        String [] package2=new String[]{
               "SILVER PACKAGE","4 NIGHT AND 5 DAYS","AIRPORT ASSISTANCE","FULL CITY TOUR","OWN FOOD ","NO DRINKS OFFER","FREE TRIP TO MONUMENTS","BOOK NOW","SUMMER SPECIAL","RS.6000","package2.jpg"
        };
        
        
        String [] package3=new String[] {
        
              "PLATINIUM PACKAGE","10 DAYS AND 10 NIGHT","AIRPORT ASSISTANCE","FULL TOUR","DAILY BUFFET","WELCOME OFFERS","FREE TRIP AND CAB","BOOK NOW","VACCATION SPECIAL","RS 15000","package3.jpg"
        };
        
    
        setBounds(500,300,900,500);
        JTabbedPane pane=new JTabbedPane();
        
        JPanel p1=createPackage(package1);// first package
        //JLabel l1=new JLabel("Hello");
        //p1.add(l1);
        pane.addTab("Package 1",null,p1);
                
        JPanel p2=createPackage(package2);// second pacakage
        //JLabel l2=new JLabel("Hello");
        //p1.add(l2);
       
        pane.addTab("Package 2",null,p2);
       
        
        
        JPanel p3=createPackage(package3);
        pane.addTab("Package 3",null,p3);
        
        add(pane,BorderLayout.CENTER);
        
       }
    
    public JPanel createPackage(String[] pack){
    
        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.WHITE);
        
        
       
       JLabel l1 = new JLabel(pack[0]);
        l1.setForeground(Color.orange);
        l1.setFont(new Font("Yu Mincho", Font.PLAIN, 25));
        l1.setBounds(50, 5, 300, 50);
        p1.add(l1);
        
        JLabel l2 = new JLabel(pack[1]);
        l2.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
        l2.setForeground(Color.BLACK);
        l2.setBounds(30, 60, 300, 30);
        p1.add(l2);
        
         JLabel l3 = new JLabel(pack[2]);
        l3.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
        l3.setForeground(Color.red);
        l3.setBounds(30, 110, 300, 30);
        p1.add(l3);
        
        JLabel l4 = new JLabel(pack[3]);
        l4.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
      //  l4.setForeground(Color.red);
        l4.setBounds(30, 160, 300, 30);
        p1.add(l4);
        
        JLabel l5 = new JLabel(pack[4]);
        l5.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
      l5.setForeground(Color.BLACK);
        l5.setBounds(30, 210, 300, 30);
        p1.add(l5);
        
        
        
        JLabel l6 = new JLabel(pack[5]);
        l6.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
         l6.setForeground(Color.RED);
        l6.setBounds(30, 260, 300, 30);
        p1.add(l6);
        
        
        
        
        JLabel l7 = new JLabel(pack[6]);
        l7.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
       
        l7.setBounds(30, 310, 300, 30);
        p1.add(l7);
        
        
        
        
         JLabel l8 = new JLabel(pack[7]);
        l8.setFont(new Font("Tahoma", Font.BOLD, 35));
         l8.setForeground(Color.CYAN);
        l8.setBounds(30, 370, 300, 30);
        p1.add(l8);
        
        
        
        
        JLabel l9 = new JLabel(pack[8]);
        l9.setFont(new Font("Tahoma", Font.BOLD, 30));
         l9.setForeground(Color.RED);
        l9.setBounds(250, 360, 350, 30);
        p1.add(l9);
        
        
         JLabel l10 = new JLabel(pack[9]);
        l10.setFont(new Font("Tahoma", Font.BOLD, 30));
         l10.setForeground(Color.BLUE);
        l10.setBounds(600, 350, 300, 30);
        p1.add(l10);
        
        
        
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("raahi/icons/"+pack[10]));
        Image i2=i1.getImage().getScaledInstance(700,300 ,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l13=new JLabel(i3);
        l13.setBounds(400,20,500,300);
         p1.add(l13);
        
        
        
       
       
       return p1;
    }
    
    public static void main(String[] args){
        new CheckPackage().setVisible(true);
    }
    
    
}

