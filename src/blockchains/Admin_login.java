/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blockchains;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;

/**
 *
 * @author brc0d3s
 */
public class Admin_login extends JFrame implements ActionListener{
    
    public JLabel l,l1,l2,l3,l4,l5,l6,l7;
    public JButton b,b1,b2,b3;
    public JTextField t;
    public JPasswordField p;
    
    
    public Admin_login(){
        setTitle("Admin Login");
        getContentPane().setBackground(new Color(2 ,6, 82));
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
        l.setBounds(30,15, 150, 150);
        add(l);
        
        ImageIcon login = new ImageIcon(ClassLoader.getSystemResource("blockchains/icons/log.jpeg"));
        Image logi = login.getImage().getScaledInstance(600, 400, Image.SCALE_DEFAULT);
        ImageIcon Login = new ImageIcon(logi);
        l1 = new JLabel(Login);
        l1.setBounds(180,190, 600, 400);
        add(l1);
        
        l2=new JLabel("A D M I N   L O G I N");
        l2.setBounds(250,30,1500,100);
        l2.setFont(new Font("serif",Font.PLAIN,60));
        l2.setForeground(Color.green);
        add(l2);
        
        l5=new JLabel("Username :");
        l5.setBounds(130,80,250,30);
        l5.setFont(new Font("serif",Font.PLAIN,25));
        l5.setForeground(Color.black);
        l1.add(l5);
        
        l6=new JLabel("Password :");
        l6.setBounds(130,200,250,30);
        l6.setFont(new Font("serif",Font.PLAIN,25));
        l6.setForeground(Color.black);
        l1.add(l6);
        
 
        b = new JButton("BACK");
	b.addActionListener(this);
        b.setBackground(new Color( 255,0, 0));
	b.setBounds(100, 300, 150, 50);
	l1.add(b);
        
        
        b1 = new JButton("SUBMIT");
	b1.addActionListener(this);
        b1.setBackground(new Color( 255,0, 0));
	b1.setBounds(390, 300, 150, 50);
	l1.add(b1);
        

        t = new JTextField();
	t.setBounds(300, 80, 250, 35);
	l1.add(t);
        
        
        p = new JPasswordField();
	p.setBounds(300, 200, 250, 35);
	l1.add(p);
        
        
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
         if(ae.getSource() == b){
                setVisible(false);
		Login l= new Login();
                l.setVisible(true);
         }
                     if(ae.getSource() == b1){
                Boolean status = false;
		try {
                    conn con = new conn();
                    String sql = "select * from admin  where username=? and password=?";
                    PreparedStatement st = con.c.prepareStatement(sql);

                    st.setString(1, t.getText());
                    st.setString(2, p.getText());

                    ResultSet rs = st.executeQuery();
                    if (rs.next()) {
                        this.setVisible(false);
                        new Admin();
                    } else
			JOptionPane.showMessageDialog(null, "Invalid Login...!.");
                       
		} catch (Exception e2) {
                    e2.printStackTrace();
		}
      
    }
    }
     
    public static void main(String... args){
       new  Admin_login();
    }

}
