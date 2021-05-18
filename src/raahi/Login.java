/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raahi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.sql.*;
public class Login extends JFrame implements ActionListener {
    JButton signup,login,fpswrd;
    JTextField user,psw;
    Login(){
        setBounds(500,300,900,400);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
 
        JPanel p1=new JPanel();
        p1.setBounds(0,0,400,400);
        p1.setLayout(null);
       // p1.setBackground(new Color(100,150,200));
        add(p1);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("raahi/icons/login7.jpg"));
        Image i2=i1.getImage().getScaledInstance(400,400,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel(i3);
        l1.setBounds(0,0,400,400);
        p1.add(l1);
        

        
        JPanel p2=new JPanel();
        p2.setBounds(400,0,450,350);
        p2.setLayout(null);
        add(p2);
        
       //forUsername ans password
       
       JLabel username=new JLabel("Username");
       username.setBounds(60,20,100,25);
       username.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
       p2.add(username);
       
       user=new JTextField();
       user.setBounds(60,50,300,25);
       user.setBorder(BorderFactory.createEmptyBorder());
       p2.add(user);
       
       JLabel password=new JLabel("Password");
       password.setBounds(60,100,100,25);
       password.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
       p2.add(password);
       
       psw=new JPasswordField();
       psw.setBounds(60,130,300,25);
       psw.setBorder(BorderFactory.createEmptyBorder());
       p2.add(psw);
       
       //Button login 
       
       login=new JButton("Login");
       login.setBounds(60,200,130,30);
       login.setBackground(new Color(100,150,200));
       login.setForeground(Color.WHITE);
       login.setBorder(BorderFactory.createEmptyBorder());
       login.addActionListener(this);
       p2.add(login);
      
       signup=new JButton("Signup");
       signup.setBounds(230,200,130,30);
       signup.setBackground(Color.WHITE);
       signup.setForeground(new Color(100,150,200));
       signup.setBorder(new LineBorder(new Color(100,150,200)));
       signup.addActionListener(this);
       p2.add(signup);
       
       fpswrd=new JButton("Forget Password");
       fpswrd.setBounds(130,250,160,30);
       fpswrd.setBackground(Color.WHITE);
       fpswrd.setForeground(new Color(100,150,200));
       fpswrd.setBorder(new LineBorder(new Color(100,150,200)));
       fpswrd.addActionListener(this);
       p2.add(fpswrd);
       
       
       setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==login){
            String username=user.getText();
            String password=psw.getText();
            try{
                Conn c=new Conn();
                String sql="Select * from account where username = '"+username+"' AND password='"+password+"'";
                ResultSet rs=c.s.executeQuery(sql);
                if(rs.next()){
                    this.setVisible(false);
                    new Loading(username).setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Invalid Login");
                }
            }catch(Exception ex){
                
            }
        }else if(e.getSource()==signup){
            this.setVisible(false);
            new Signup().setVisible(true);
      
        }
        else if(e.getSource()==fpswrd)
        {
            this.setVisible(false);
            new ForgetPassword().setVisible(true);
        }
    }
    public static void main(String[] args){
        new Login();
    }
}
