/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blockchains;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author brc0d3s
 */
public class Help extends JFrame implements ActionListener {
    
    JLabel l,l1,l8,l9,l3,l4,l5;
    JTextField t,t1,t2,t3;
    JButton b,b1;
    
    Help(){
        
        setTitle(" Help");
        getContentPane().setBackground(new Color(2, 6, 82));
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(1000, 650);
        setLocation(200, 10);
        setVisible(true);

        ImageIcon logo = new ImageIcon(ClassLoader.getSystemResource("blockchains/icons/logo.png"));
        Image log = logo.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        ImageIcon Logo = new ImageIcon(log);
        l = new JLabel(Logo);
        l.setBounds(30, 15, 150, 150);
        add(l);
        
        l1=new JLabel("H E L P  P A G E");
        l1.setBounds(200,30,1500,100);
        l1.setFont(new Font("serif",Font.PLAIN,60));
        l1.setForeground(Color.green);
        add(l1);
        
        l8= new JLabel("Employee ID :");  
        l8.setBounds(400,150,200,30);
        l8.setForeground(Color.black);
        l8.setFont(new Font("serif",Font.BOLD,20));
        add(l8);
        
        t=new JTextField();
        t.setBounds(620,150,150,30);
        add(t);

        
        l3= new JLabel("Date (yyyy-mm-dd)");  
        l3.setBounds(400,250,200,30);
        l3.setForeground(Color.black);
        l3.setFont(new Font("serif",Font.BOLD,20));
        add(l3);
        
        t1=new JTextField();
        t1.setBounds(620,250,150,30);
        add(t1);

        
        
        l4= new JLabel("Comment");  
        l4.setBounds(400,350,200,30);
        l4.setForeground(Color.black);
        l4.setFont(new Font("serif",Font.BOLD,20));
        add(l4);
        
        
        t2=new JTextField();
        t2.setBounds(400,380,400,150);
        add(t2);
        
        
        
        b = new JButton("Submit");
        b.setBackground(Color.red);
        b.addActionListener(this);
        b.setForeground(Color.black);
        b.setBounds(450,550,150,40);
        add(b);
        
        b1 = new JButton("Back");
        b1.setBackground(Color.BLACK);
        b1.addActionListener(this);
        b1.setForeground(Color.WHITE);
        b1.setBounds(250,550,150,40);
        add(b1);

    }
      public void actionPerformed(ActionEvent ae){
        
        String a = t1.getText();
        String bb = t.getText();
        String c = t2.getText();
        if(ae.getSource() == b){
            try{
                conn cc = new conn();
                String q = "insert into help_desk values('"+a+"','"+bb+"','"+c+"')";
                cc.s.executeUpdate(q);
                JOptionPane.showMessageDialog(null,"Complain submitted Successfully.");
                setVisible(false);
                new User();
            }catch(Exception ee){
                System.out.println("The error is:"+ee);
            }
        }
        if(ae.getSource() == b1){
                setVisible(false);
		new User();
		
         }
      }
    
    
    public static void main(String... args){
        new Help();
    }
}


