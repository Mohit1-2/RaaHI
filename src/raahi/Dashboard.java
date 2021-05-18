
package raahi;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.*;
import java.awt.event.*;
;


public class Dashboard  extends JFrame implements ActionListener{
    
    JButton b13,b14,b1,b2,b3,b5,b6,b7,b8,b9,b10,b11,b12,b15,b4;
    String user;
    
    Dashboard(String username){
        user=username;
    setExtendedState(JFrame.MAXIMIZED_BOTH);//to make full screen we use jframe.maximized both
    setLayout(null);// frames 
    
    // for top most panel
    JPanel p1=new JPanel();
    p1.setLayout(null);//panels ayout
    p1.setBounds(0,0,1950,70);
    //p1.setBackground(Color.blue);
    p1.setBackground(new Color(60,20,100));
    add(p1);
    
    // top most panel
    
   ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("raahi/icons/Dashboard.JPG"));// to load a class from our folder project and pic name is home.jpg inside travel->management
    Image i5=i4.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);// to make image scale full size we use this command
    ImageIcon i6=new ImageIcon(i5);// to covert image into image icon again
    JLabel l2=new JLabel(i6);//to set image in label and show on eun
    l2.setBounds(7,0,80,70);// to set dimensions
    p1.add(l2);// for coming at top of p1
    
    
        
    
    
        JLabel l3 = new JLabel("WELCOME");
	l3.setForeground(Color.WHITE);
        l3.setFont(new Font("Tahoma", Font.PLAIN, 40));
	l3.setBounds(80, 10, 1000, 40);   // dimension for setting text
	p1.add(l3);
    
    
    // for leftmost panel
    JPanel p2=new JPanel();
    p2.setLayout(null);//panels ayout
    p2.setBounds(0,65,300,1000);
    p2.setBackground(new Color(60,60,80));
    add(p2);
    
    
    //for buttons 
    
   
   b1=new  JButton("ADD PERSONAL DETAILS");
    b1.setBackground(new Color(60,60,80));
    b1.setFont(new Font("TimesRoman", Font.ITALIC, 18));
    b1.setForeground(Color.WHITE);
   // b1.setMargin(new Insets(0,0,0,35));
    b1.setBounds(0,0,300,50);
    b1.addActionListener(this);
    p2.add(b1);
    
    b2=new  JButton("UPDATE PERSONAL DETAILS");
    b2.setBackground(new Color(60,60,80));
    b2.setFont(new Font("TimesRoman", Font.ITALIC, 18));
    b2.addActionListener(this);
    b2.setForeground(Color.WHITE);
   // b2.setMargin(new Insets(0,0,0,30));
    b2.setBounds(0,50,300,50);
    p2.add(b2);
    
    b3=new  JButton("VIEW  DETAILS");
    b3.setBackground(new Color(60,60,80));
    b3.setFont(new Font("TimesRoman", Font.ITALIC, 18));
    b3.setForeground(Color.WHITE);
     b3.addActionListener(this);
    //b2.setMargin(new Insets(0,0,0,80));
    b3.setBounds(0,100,300,50);
    p2.add(b3);
    
    b4=new  JButton("DELETE PERSONAL DETAILS");
    b4.setBackground(new Color(60,60,80));
    b4.setFont(new Font("TimesRoman", Font.ITALIC, 18));
    b4.setForeground(Color.WHITE);
    b4.addActionListener(this);
  //  b4.setMargin(new Insets(0,0,0,30));
    b4.setBounds(0,150,300,50);
    p2.add(b4);
    
    b5=new  JButton("CHECK PACKAGE");
    b5.setBackground(new Color(60,60,80));
    b5.setFont(new Font("TimesRoman", Font.ITALIC, 18));
    b5.setForeground(Color.WHITE);
    b5.setBounds(0,200,300,50);
    b5.addActionListener(this);
    p2.add(b5);
    
    
    b6=new  JButton("BOOK PACKAGE");
    b6.setBackground(new Color(60,60,80));
    b6.setFont(new Font("TimesRoman", Font.ITALIC, 18));
    b6.setForeground(Color.WHITE);
    b6.setBounds(0,250,300,50);
    b6.addActionListener(this);
    p2.add(b6);
    
    
    b7=new  JButton("VIEW PACKAGE");
    b7.setBackground(new Color(60,60,80));
    b7.setFont(new Font("TimesRoman", Font.ITALIC, 18));
    b7.setForeground(Color.WHITE);
    b7.setBounds(0,300,300,50);
    b7.addActionListener(this);
    p2.add(b7);
    
    b8=new  JButton("VIEW HOTELS");
    b8.setBackground(new Color(60,60,80));
    b8.setFont(new Font("TimesRoman", Font.ITALIC, 18));
    b8.setForeground(Color.WHITE);
    b8.setBounds(0,350,300,50);
    b8.addActionListener(this);
    p2.add(b8);
    
    b9=new  JButton("BOOK HOTELS");
    b9.setBackground(new Color(60,60,80));
    b9.setFont(new Font("TimesRoman", Font.ITALIC, 18));
    b9.setForeground(Color.WHITE);
    b9.setBounds(0,400,300,50);
    b9.addActionListener(this);
    p2.add(b9);
    
    
    b10=new  JButton("VIEW BOOKED HOTEL");
    b10.setBackground(new Color(60,60,80));
    b10.setFont(new Font("TimesRoman", Font.ITALIC, 18));
    b10.setForeground(Color.WHITE);
    b10.setBounds(0,450,300,50);
    b10.addActionListener(this);
    p2.add(b10);
    
    
    b11=new  JButton("DESTINATIONS");
    b11.setBackground(new Color(60,60,80));
    b11.setFont(new Font("TimesRoman", Font.ITALIC, 18));
    b11.setForeground(Color.WHITE);
    b11.setBounds(0,500,300,50);
    b11.addActionListener(this);
    p2.add(b11);
    
    
    b12=new  JButton("PAYMENT");
    b12.setBackground(new Color(60,60,80));
    b12.setFont(new Font("TimesRoman", Font.ITALIC, 18));
    b12.setForeground(Color.WHITE);
    b12.setBounds(0,550,300,50);
    b12.addActionListener(this);
    p2.add(b12);
    
    
    b13=new  JButton("CALCULATOR");
    b13.setBackground(new Color(60,60,80));
    b13.setFont(new Font("TimesRoman", Font.ITALIC, 18));
    b13.setForeground(Color.WHITE);
    b13.setBounds(0,600,300,50);
    b13.addActionListener(this);
    p2.add(b13);
    
    b14=new  JButton("NOTES");
    b14.setBackground(new Color(60,60,80));
    b14.setFont(new Font("TimesRoman", Font.ITALIC, 18));
    b14.setForeground(Color.WHITE);
    b14.setBounds(0,650,300,50);
    b14.addActionListener(this);
    p2.add(b14);
    
    
    b15=new  JButton("ABOUT");
    b15.setBackground(new Color(60,60,80));
    b15.setFont(new Font("TimesRoman", Font.ITALIC, 18));
    b15.setForeground(Color.WHITE);
    b15.setBounds(0,700,300,50);
    b15.addActionListener(this);
    p2.add(b15);
    
    
    
    
    
    //for background image ;---->>>>>>
    ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("raahi/icons/home.jpg"));// to load a class from our folder project and pic name is home.jpg inside travel->management
    Image i2=i1.getImage().getScaledInstance(1950, 1000, Image.SCALE_DEFAULT);// to make image scale full size we use this command
    ImageIcon i3=new ImageIcon(i2);      // to covert image into image icon again
    JLabel l1=new JLabel(i3);           //to set image in label and show on eun
    l1.setBounds(0,0,1950,1000);        // to set dimensions
    add(l1);
         
     JLabel l4 = new JLabel("RaaHI");
	l4.setForeground(new Color(100,150,160));
        l4.setFont(new Font("Tahoma", Font.PLAIN, 95));
	l4.setBounds(950, 100, 1000, 100);   // dimension for setting text
	l1.add(l4);
        
        
        
        
        
        
        
    
    }

//upon implemeting actionlistner need this function fir som action by button when click
    public void actionPerformed(ActionEvent ae){
            
            if(ae.getSource()==b13){
                try{
                    Runtime.getRuntime().exec("calc.exe");//for opening of calci
                    
                }catch(Exception e){}
            }
            else if (ae.getSource()==b14){
                try{
                    Runtime.getRuntime().exec("notepad.exe");//for opening of notepad
                    
                }catch(Exception e){}
                
            }
            
            else if(ae.getSource()==b1){
                new AddCustomer(user).setVisible(true);
            }
            
            else if(ae.getSource()==b2){
               // this.setVisible(false);
                new UpdateCustomer(user).setVisible(true);
            }
            else if(ae.getSource()==b3){
                     new ViewCustomer(user).setVisible(true);
            }
            else if(ae.getSource()==b5)
                new CheckPackage().setVisible(true);
            else if(ae.getSource()==b6)
                new BookPackage(user).setVisible(true);
            else if(ae.getSource()==b7)
                new ViewPackage(user).setVisible(true);
            else if(ae.getSource()==b12)
                new Payment(user).setVisible(true);
            else if(ae.getSource()==b8)
                new CheckHotels().setVisible(true);
            else if(ae.getSource()==b9)
                new BookHotel(user).setVisible(true);
            else if(ae.getSource()==b10)
                new viewBookedHotel(user).setVisible(true);
            else if(ae.getSource()==b11)
                new Destinations().setVisible(true);
            else if(ae.getSource()==b15)
                new About().setVisible(true);
            else if(ae.getSource()==b4){
                try{
                    new DeleteCustomer().setVisible(true);
                }catch(Exception e ){}
            }
        }
    
    
    
    public static void main(String[] args){
        
        new Dashboard("Mohit").setVisible(true);
    }
    
}
