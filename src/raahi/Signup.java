package raahi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Signup extends JFrame implements ActionListener{
    JButton create,back;
    JTextField user,pass,answ,namet;
    Choice sques;
    public static void main(String[] args){
        new Signup().setVisible(true);
    }
    Signup(){
        setBounds(600,250,900,360);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JPanel p1=new JPanel();
        p1.setBounds(0,0,500,400);
        p1.setLayout(null);
        p1.setBackground(new Color(100,150,200));
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
        pswrd.setBounds(50,100,100,25);
        pswrd.setBackground(Color.BLACK);
        pswrd.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(pswrd);
        
        pass=new JTextField();
        pass.setBounds(190,100,180,25);
        pass.setBorder(BorderFactory.createEmptyBorder());
        p1.add(pass);
        
        JLabel sq=new JLabel("Security Question");
        sq.setBounds(50,140,125,25);
        sq.setBackground(Color.BLACK);
        sq.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(sq);
        
        sques=new Choice();
        sques.setBounds(190,140,180,25);
        sques.add("Your favourite cricketer");
        sques.add("Your first school's name");
        sques.add("Your favourite food");
        sques.setFont(new Font("Tahoma",Font.PLAIN,14));
        p1.add(sques);
        
        JLabel ans=new JLabel("Answer");
        ans.setBounds(50,180,100,25);
        ans.setBackground(Color.BLACK);
        ans.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(ans);
        
        answ=new JTextField();
        answ.setBounds(190,180,180,25);
        answ.setBorder(BorderFactory.createEmptyBorder());
        p1.add(answ);
        
        create=new JButton("Create");
        create.setBounds(50,250,100,35);
        create.setForeground(new Color(100,150,200));
        create.setBackground(Color.WHITE);
        create.setFont(new Font("Tahoma",Font.BOLD,14));
        create.addActionListener(this);
        p1.add(create);
        
        back=new JButton("Back");
        back.setBounds(250,250,100,35);
        back.setForeground(new Color(100,150,200));
        back.setBackground(Color.WHITE);
        back.setFont(new Font("Tahoma",Font.BOLD,14));
        back.addActionListener(this);
        p1.add(back);
        
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("raahi/icons/login7.jpg"));
        Image i2=i1.getImage().getScaledInstance(400,360,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel(i3);
        l1.setBounds(450,0,500,360);
        add(l1);
  
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==back){
            this.setVisible(false);
            new Login().setVisible(true);
        }else if(ae.getSource()==create){
            String username=user.getText();String name=namet.getText();
            String password=pass.getText();
            String secques=sques.getSelectedItem();String ans=answ.getText();
            String query="insert into account values ('"+username+"', '"+name+"','"+password+"','"+secques+"','"+ans+"')";
            try{
                Conn c=new Conn();
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Account Successfully Created");
                this.setVisible(false);
                new Login().setVisible(true);
            }catch(Exception e){
                System.out.println("M");
            }
        }
    }
}
