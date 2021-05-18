/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raahi;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Paytm  extends JFrame   implements ActionListener {
    
    Paytm(){              // put link in text area  
    setBounds(600, 220, 800, 600);
    JEditorPane j = new JEditorPane();
        j.setEditable(false);   // make editable false
        add(j);
        
        try {
            j.setPage("https://paytm.com");
        }catch (Exception e) {
            j.setContentType("text/html");
            j.setText("<html>Could not load,Error 404</html>");
        } 
        
        JScrollPane js = new JScrollPane(j);     
       // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(js);
       // setPreferredSize(new Dimension(800,600));
        
       
       
      JButton b1=new JButton("PAY");
        b1.setBounds(610,20,80,40);
        b1.addActionListener(this);
        j.add(b1);
    }
    
     public void actionPerformed(ActionEvent ae){
     
         this.setVisible(false);
     
     }
    
    

    
    
    public static void main(String[] args){
        new Paytm().setVisible(true);
    }
    
}

