
package raahi;
import javax.swing.*;
import java.awt.*;
public class Loading extends JFrame implements Runnable{
    public static void main(String []args){
        new Loading("").setVisible(true);
    }
    JProgressBar pBar;
    Thread t1;
    String user;
    @Override
    public void run(){
        try{
            for(int i=1;i<101;i++){
                int a=pBar.getMaximum();
                int b=pBar.getValue();
                if(b<a){
                    pBar.setValue(pBar.getValue()+2);
                }else{
                    i=101;
                    setVisible(false);
                    new Dashboard(user).setVisible(true);
                }
                Thread.sleep(50);
            }
        }catch(Exception e){
            
        }
    }
    Loading(String username){
        user=username;
        t1=new Thread(this);
        setBounds(700,300,650,350);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
       
        JLabel l1=new JLabel("RaaHI");
        l1.setBounds(240,10,150,80);
        l1.setFont(new Font("Raleway",Font.BOLD,40));
        l1.setForeground(Color.BLACK);
        add(l1);
        
     
        
        
        pBar=new JProgressBar();
        pBar.setStringPainted(true);// for numbers in progressBar
        pBar.setBounds(150,100,300,25);
        add(pBar);
        
        JLabel l2=new JLabel("Please Wait....");
        l2.setBounds(260,120,120,25);
        l2.setFont(new Font("Raleway",Font.BOLD,14));
        l2.setForeground(Color.BLACK);
        add(l2);
        
        JLabel l3=new JLabel("Welcome "+username);
        l3.setBounds(20,230,400,25);
        l3.setFont(new Font("Raleway",Font.BOLD,16));
        l3.setForeground(Color.RED);
        add(l3);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("raahi/icons/loading.jpg"));
        Image i2=i1.getImage().getScaledInstance(650,350,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l=new JLabel(i3);
        l.setBounds(0,0,650,350);
        add(l);
        t1.start();
    }
}
