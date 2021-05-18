package raahi;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class ForgetPassword extends JFrame implements ActionListener{
    JTextField user,pass,namet,answ,sques;
    JButton search,ret,back;
    public static void main(String[] args){
        new ForgetPassword().setVisible(true);
    }
    ForgetPassword(){
        setBounds(500,250,850,400);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("raahi/icons/forgotpassword.jpg"));
        Image i2=i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel(i3);
        l1.setBounds(500,30,350,300);
        add(l1);
        
        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(100,150,200));
        p1.setBounds(30,30,500,300);
        add(p1);
        
        JLabel username=new JLabel("Username");
        username.setBounds(50,20,100,25);
        username.setBackground(Color.BLACK);
        username.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(username);
        
        user=new JTextField();
        user.setBounds(190,20,180,25);
        user.setBorder(BorderFactory.createEmptyBorder());
        p1.add(user);
        
        search=new JButton("Search");
        search.setBackground(Color.GRAY);
        search.setForeground(Color.WHITE);
        search.setBounds(380,20,90,25);
        search.addActionListener(this);
        search.setBorder(BorderFactory.createEmptyBorder());
        p1.add(search);
        
        
        JLabel name=new JLabel("Name");
        name.setBounds(50,60,100,25);
        name.setBackground(Color.BLACK);
        name.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(name);
        
        namet=new JTextField();
        namet.setBounds(190,60,180,25);
        namet.setBorder(BorderFactory.createEmptyBorder());
        p1.add(namet);
        
        
        JLabel pswrd=new JLabel("Password");
        pswrd.setBounds(50,180,100,25);
        pswrd.setBackground(Color.BLACK);
        pswrd.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(pswrd);
        
        pass=new JTextField();
        pass.setBounds(190,180,180,25);
        pass.setBorder(BorderFactory.createEmptyBorder());
        p1.add(pass);
        
        JLabel sq=new JLabel("Security Question");
        sq.setBounds(50,100,125,25);
        sq.setBackground(Color.BLACK);
        sq.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(sq);
       
        sques=new JTextField();
        sques.setBounds(190,100,280,25);
        sques.setBorder(BorderFactory.createEmptyBorder());
        p1.add(sques);
        
        JLabel ans=new JLabel("Answer");
        ans.setBounds(50,140,100,25);
        ans.setBackground(Color.BLACK);
        ans.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(ans);
        
        answ=new JTextField();
        answ.setBounds(190,140,180,25);
        answ.setBorder(BorderFactory.createEmptyBorder());
        p1.add(answ);
        
        ret=new JButton("Retrieve");
        ret.setBackground(Color.GRAY);
        ret.setForeground(Color.WHITE);
        ret.setBounds(380,140,90,25);
        ret.addActionListener(this);
        ret.setBorder(BorderFactory.createEmptyBorder());
        p1.add(ret);
        
        back=new JButton("Back");
        back.setBackground(Color.GRAY);
        back.setForeground(Color.WHITE);
        back.setBounds(150,240,90,25);
        back.addActionListener(this);
        back.setBorder(BorderFactory.createEmptyBorder());
        p1.add(back);
    }
    public void actionPerformed(ActionEvent ae){
        Conn c=new Conn();
        if(ae.getSource()==back){
            this.setVisible(false);
            new Login().setVisible(true);
        }
        else if(ae.getSource()==search){
            try{ 
               String sql="Select * from account where username= '"+user.getText()+"'";
               ResultSet rs= c.s.executeQuery(sql);
               while(rs.next()){
                   namet.setText(rs.getString("name"));
                   sques.setText(rs.getString("securityques"));
               }
            }catch(Exception e){
                System.out.println("M");
            }
        }
        else if(ae.getSource()==ret){
            try{
               String sql="Select * from account where ans= '"+answ.getText()+"' AND username ='"+user.getText()+"'";
               ResultSet rs= c.s.executeQuery(sql);// it will take the row from sql
               String ans=answ.getText();
               while(rs.next()){
                   pass.setText(rs.getString("password"));
                }
            }catch(Exception e){
                System.out.println("M");
            }
        }
    }
}
