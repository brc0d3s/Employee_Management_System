
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
import javax.swing.JTextField;

/**
 *
 * @author brc0d3s
 */
public class Admin extends JFrame implements ActionListener {

    public JLabel l, l1, l2, l3, l4, l5, l6, l7;
    public JButton b, b1, b2, b3,b4,b5,b6,b7;
    public JTextField t;

    public Admin(){
        setTitle(" Admin Home");
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
        
        l1=new JLabel("A D M I N    H O M E ");
        l1.setBounds(250,30,1500,100);
        l1.setFont(new Font("serif",Font.PLAIN,60));
        l1.setForeground(Color.green);
        add(l1);
        
        b = new JButton("H O M E");
	b.addActionListener(this);
        b.setBackground(new Color( 255,255, 255));
        b.setForeground(new Color(150,50,144));
	b.setBounds(30, 200, 100, 40);
	add(b);
        
        b1 = new JButton("Employees");
	b1.addActionListener(this);
        b1.setBackground(new Color( 255,255, 255));
        b1.setForeground(new Color(150,50,144));
	b1.setBounds(150, 200, 120, 40);
	add(b1);
        
        b2 = new JButton("Salary");
	b2.addActionListener(this);
        b2.setBackground(new Color( 255,255, 255));
        b2.setForeground(new Color(150,50,144));
	b2.setBounds(290, 200, 120, 40);
	add(b2);
        
        
        b3 = new JButton("View Attendance");
	b3.addActionListener(this);
        b3.setBackground(new Color( 255,255, 255));
        b3.setForeground(new Color(150,50,144));
	b3.setBounds(430, 200, 120, 40);
	add(b3);
        
        b4 = new JButton("Help Desk");
	b4.addActionListener(this);
        b4.setBackground(new Color( 255,255, 255));
        b4.setForeground(new Color(150,50,144));
	b4.setBounds(570, 200, 120, 40);
	add(b4);
        
        b5 = new JButton("About Us");
	b5.addActionListener(this);
        b5.setBackground(new Color( 255,255, 255));
        b5.setForeground(new Color(150,50,144));
	b5.setBounds(840, 200, 100, 40);
	add(b5);
        
        b6 = new JButton("Logout");
	b6.addActionListener(this);
        b6.setBackground(new Color( 255,0, 0));
        b6.setForeground(new Color(0,0,0));
	b6.setBounds(150, 500, 100, 30);
	add(b6);
    
        b7= new JButton("Exit");
	b7.addActionListener(this);
        b7.setBackground(new Color( 255,0, 0));
        b7.setForeground(new Color(0,0,0));
	b7.setBounds(550, 500, 100, 30);
	add(b7);
    
    
    }
    public void actionPerformed(ActionEvent ae){
         if(ae.getSource() == b){
                setVisible(true);
         }
         if(ae.getSource() == b1){
                setVisible(true);
                new employers();
         }
         if(ae.getSource() == b2){
                setVisible(false);
		new salarybox();
         }
         if(ae.getSource() == b3){
                setVisible(false);
		new Attendanceview();
         }
         if(ae.getSource() == b4){
                setVisible(false);
		new Help();
         }
         if(ae.getSource() == b5){
                setVisible(false);
		new AboutUs().setVisible(true);
         }
         if(ae.getSource() == b6){
                setVisible(false);
		new Admin_login();
         }
         if(ae.getSource() == b7){
                setVisible(false);
		System.exit(0);
         }
    }
    public static void main(String... args) {
        new Admin();
    }

}
