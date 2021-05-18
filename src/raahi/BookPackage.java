package raahi;

import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;

public class BookPackage extends JFrame implements ActionListener {
   
    Choice c1;
    JLabel l11,l12,l13,l14,l15;
    JTextField t1;
    JButton b1,b2,b3;
    String user;
    BookPackage(String username){
          user =username;
          setBounds(500,300,1100,520);
          getContentPane().setBackground(Color.WHITE);
          setLayout(null);
          
          
          
          
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("raahi/icons/bookapackage.jpg"));
        Image i2=i1.getImage().getScaledInstance(500,600 ,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l10=new JLabel(i3);
        l10.setBounds(500,20,500,600);
        add(l10);
          
          
               JLabel l1= new JLabel("BOOK PACKAGE");
		l1.setFont(new Font("Yu Mincho", Font.BOLD, 20));
		l1.setBounds(125, 11, 300, 53);
		add(l1);
                
                 JLabel l2= new JLabel("USER NAME");
		l2.setFont(new Font("Yu Mincho", Font.PLAIN, 15));
		l2.setBounds(40, 70, 100, 30);
		add(l2);
                
                l11= new JLabel();
		l11.setFont(new Font("Yu Mincho", Font.PLAIN, 15));
		l11.setBounds(250, 70, 200, 30);
		add(l11);
                
                JLabel l3= new JLabel("Select Package");
		l3.setFont(new Font("Yu Mincho", Font.PLAIN, 15));
		l3.setBounds(40, 110, 150, 30);
		add(l3);
        
                c1=new Choice();
               // c1.setBackground(Color.RED);
                c1.add("GOLD PACKAGE");
                c1.add("SILVER PACKAGE");
                c1.add("PLATINIUM PACKAGE");
                c1.setBounds(250,110,200,30);
                add(c1);
                
                JLabel l4= new JLabel("TOTAL PERSONS");
		l4.setFont(new Font("Yu Mincho", Font.PLAIN, 15));
		l4.setBounds(40, 150, 200, 30);
		add(l4);
                
                
                t1=new JTextField("1");
                t1.setBounds(250,150,200,25);
                add(t1);
                
                
                
                
                JLabel l5= new JLabel("ID");
		l5.setFont(new Font("Yu Mincho", Font.PLAIN, 15));
		l5.setBounds(40, 190, 100, 30);
		add(l5);
                
                l12= new JLabel();
		l12.setFont(new Font("Yu Mincho", Font.PLAIN, 15));
		l12.setBounds(250, 190, 200, 30);
		add(l12);
                
                  JLabel l6= new JLabel("IDNumber");
		l6.setFont(new Font("Yu Mincho", Font.PLAIN, 15));
		l6.setBounds(40, 230, 100, 40);
		add(l6);
                
                l13= new JLabel();
		l13.setFont(new Font("Yu Mincho", Font.PLAIN, 15));
		l13.setBounds(250, 230, 200, 30);
		add(l13);
                
                
                  JLabel l7= new JLabel("PhoneNUMBER");
		l7.setFont(new Font("Yu Mincho", Font.PLAIN, 15));
		l7.setBounds(40, 270, 200, 30);
		add(l7);
                
                l14= new JLabel();
		l14.setFont(new Font("Yu Mincho", Font.PLAIN, 15));
		l14.setBounds(250,270, 200, 30);
		add(l14);
                
                
                JLabel l8= new JLabel("TotalPrice");
		l8.setFont(new Font("Yu Mincho", Font.PLAIN, 15));
		l8.setBounds(40, 310, 100, 30);
		add(l8);
                
                l15= new JLabel();
		l15.setFont(new Font("Yu Mincho", Font.PLAIN, 15));
                l15.setForeground(Color.CYAN);
		l15.setBounds(250,310, 200, 30);
		add(l15);
                
                
               try{
                   Conn c=new Conn();
                   ResultSet rs = c.s.executeQuery("select * from customer where username = '"+user+"'");
                    while(rs.next()){
                        l11.setText(rs.getString("username"));
                        l12.setText(rs.getString("id"));
                        l13.setText(rs.getString("number"));
                        l14.setText(rs.getString("phone"));
                     }
               }catch(Exception e){}
                           
                
                
                
                
                
                
                
                b1=new JButton("Check Price");
                b1.setBackground(Color.BLACK);
                b1.setForeground(Color.WHITE);
                b1.addActionListener(this);
                b1.setBounds(60,380,120,25);
                add(b1);
                
                
                b2=new JButton("Book Package");
                b2.setBackground(Color.BLACK);
                b2.setForeground(Color.WHITE);
                b2.setBounds(200,380,120,25);
                b2.addActionListener(this);
                add(b2);
                
                
                b3=new JButton("Back");
                b3.setBackground(Color.BLACK);
                b3.setForeground(Color.WHITE);
                b3.setBounds(340,380,120,25);
                b3.addActionListener(this);
                add(b3);
                
                
                
                
          
                  
                  }
    
    public void actionPerformed(ActionEvent ae){
          int cost=0;  
          String p = c1.getSelectedItem();
                  
                if(p.equals("GOLD PACKAGE")) {
                               cost =cost+ 12000;
                            
                }else if(p.equals("SILVER PACKAGE")){
                                cost =cost+ 13000;
                            
                } else if(p.equals("PLATINIUM PACKAGE")){
                                cost =cost+ 16000;
                            }
                int persons=Integer.parseInt(t1.getText());//t1.getText() for  count of persons in textfield 
                 cost=cost*persons;
                 if(ae.getSource()==b1){
                l15.setText("Rs "+ cost);                
   }else if(ae.getSource()==b2){
                        try{
                                 Conn c = new Conn();
                                 String sql="insert into bookPackage values('"+l11.getText()+"','"+
                                       c1.getSelectedItem()+"','"+
                                       t1.getText()+"','"+
                                       l12.getText()+"','"+
                                       l13.getText()+"','"+
                                       l14.getText()+"','"+
                                       cost+"')";
	    			
                                
                               c.s.executeUpdate(sql);
                             
                                
	    			JOptionPane.showMessageDialog(null, "Package Booked Successfully");
                               this.setVisible(false);
                            }catch(Exception ee){
	    			System.out.println(ee.getMessage());
                            }
        
        
   }
    else if(ae.getSource()==b3){
        
        this.setVisible(false);
   }
    
    }
    
    
    
    public static void main(String[] args){
        new BookPackage("Mohit").setVisible(true);
            
        }
    
}

