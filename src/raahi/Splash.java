/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raahi;
import javax.swing.*;
import java.awt.*;
public class Splash {
    public static void main(String[] args){
       SplashFrame frame= new SplashFrame();
       frame.setVisible(true);
       int x=1;
       for(int i=1;i<=700;i+=6,x+=7){
         frame.setLocation(950-(x+i)/2,500-i/2);
         frame.setSize(x+i,i);
         try{
             Thread.sleep(10);
         }
         catch(Exception e){ }
       }
       
    }
}
class SplashFrame extends JFrame implements Runnable{
    Thread t1;
    SplashFrame(){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("raahi/icons/splash.jpg"));//to get icons from system
        Image i2=i1.getImage().getScaledInstance(1600, 700, Image.SCALE_DEFAULT);//to fit image in our box
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel(i3);// to convert image into label
        add(l1);//to add into frame
       //setLocation(500,100);
       //setSize(600,500);
      // setBounds(500,100,600,500);// first two argu for location then two for l&b
      t1=new Thread(this);
      t1.start();
    }
    @Override
    public void run(){
        try{
            t1.sleep(5000);
            this.setVisible(false);
            new Login().setVisible(true);
        }catch(Exception e){
            
        }
    }
}
