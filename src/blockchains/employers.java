

package blockchains;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class employers  extends JFrame implements ActionListener{

    
    JLabel l,l1,l2;
    JButton b1,b2,b3,b4,b5,b6;

    employers(){
        setTitle("Employee Management");
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

        l1 = new JLabel("Employee Details");
        l1.setBounds(250, 30, 1500, 100);
        l1.setFont(new Font("serif", Font.PLAIN, 60));
        l1.setForeground(Color.green);
        add(l1);
        

        b1=new JButton("Add");
        b1.setBounds(420,80,100,40);
        b1.setFont(new Font("serif",Font.BOLD,15));
        b1.addActionListener(this);
        add(b1);


        b2=new JButton("View");
        b2.setBounds(530,80,100,40);
        b2.setFont(new Font("serif",Font.BOLD,15));
        b2.addActionListener(this);
        add(b2);

        b3=new JButton("Update");
        b3.setBounds(420,140,100,40);
        b3.setFont(new Font("serif",Font.BOLD,15));
        b3.addActionListener(this);
        add(b3);

        b4=new JButton("Remove");
        b4.setBounds(530,140,100,40);
        b4.setFont(new Font("serif",Font.BOLD,15));
        b4.addActionListener(this);
        add(b4);
        
        b5=new JButton(" BACK ");
        b5.setBounds(420,210,100,40);
        b5.setFont(new Font("serif",Font.BOLD,15));
        b5.addActionListener(this);
        add(b5);


        b6=new JButton(" EXIT ");
        b6.setBounds(530,210,100,40);
        b6.setFont(new Font("serif",Font.BOLD,15));
        b6.addActionListener(this);
        b6.setForeground(Color.red);
        add(b6);

 

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            setVisible(false);
            new Add_Employee();
        }
        if(ae.getSource()==b2){
            setVisible(false);
            new View_Employee();
        }
        if(ae.getSource()==b3){
            setVisible(false);
            new Update_Employee();
        }
        
        if(ae.getSource()==b4){
            setVisible(false);
            new Remove_Employee();
        }
        
        if(ae.getSource()==b5){
            setVisible(false);
             new Admin(); 
        }
        
        if(ae.getSource()==b6){
            setVisible(false);
           System.exit(0);
        }
        
    }

    public static void main(String[ ] arg){
        new employers();
    }
}