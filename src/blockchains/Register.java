
package blockchains;

/**
 *
 * @author brc0d3s
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Register extends JFrame implements ActionListener{

    
    public JTextField t,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13;
    public JLabel l, l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
    public JButton b,b1;

    public Register(){
        setTitle("REGISTER");
        setBackground(Color.blue);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(1000, 650);
        setLocation(200, 10);
        setVisible(true);

        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("blockchains/icons/FrameBG.png"));
        Image i1 = i.getImage().getScaledInstance(1000, 650, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);
        l = new JLabel(i2);
        l.setBounds(0, 0, 1000, 650);
        add(l);

        ImageIcon logo = new ImageIcon(ClassLoader.getSystemResource("blockchains/icons/logo.png"));
        Image log = logo.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        ImageIcon Logo = new ImageIcon(log);
        l1 = new JLabel(Logo);
        l1.setBounds(10,5, 150, 150);
        l.add(l1); 
 
        l2=new JLabel(" R E G I S T E R ");
        l2.setBounds(320,70,600,40);
        l2.setFont(new Font("serif",Font.BOLD,40));
        l2.setForeground(Color.green);
        l.add(l2);
        
        /*
        l3=new JLabel("BLOCKCHAINS");
        l3.setBounds(370,130,500,50);
        l3.setFont(new Font("serif",Font.BOLD,35));
        l3.setForeground(Color.green);
        l.add(l3);
        */
        
        /*
        l4 = new JLabel("New Employee Details");
        l4.setBounds(320,30,500,50);
        l4.setFont(new Font("serif",Font.ITALIC,25));
        l4.setForeground(Color.black);
        l.add(l4);
        */

 
        l5 = new JLabel("Name");
        l5.setBounds(50,150,100,30);
        l5.setFont(new Font("serif",Font.BOLD,20));
        l.add(l5);

        t1=new JTextField();
        t1.setBounds(200,150,150,30);
        l.add(t1);

        l6 = new JLabel("FUll Name");
        l6.setBounds(400,150,200,30);
        l6.setFont(new Font("serif",Font.BOLD,20));
        l.add(l6);

        t2=new JTextField();
        t2.setBounds(600,150,150,30);
        l.add(t2);

        l7= new JLabel("Age");
        l7.setBounds(50,200,100,30);
        l7.setFont(new Font("serif",Font.BOLD,20));
        l.add(l7);

        t3=new JTextField();
        t3.setBounds(200,200,150,30);
        l.add(t3);

        l8= new JLabel("DOB (yyyy-mm-dd)");  
        l8.setBounds(400,200,200,30);
        l8.setFont(new Font("serif",Font.BOLD,20));
        l.add(l8);

        t4=new JTextField();
        t4.setBounds(600,200,150,30);
        l.add(t4);

        l9= new JLabel("Address");
        l9.setBounds(50,250,100,30);
        l9.setFont(new Font("serif",Font.BOLD,20));
        l.add(l9);

        t5=new JTextField();
        t5.setBounds(200,250,150,30);
        l.add(t5);

        l10= new JLabel("Phone");
        l10.setBounds(400,250,100,30);
        l10.setFont(new Font("serif",Font.BOLD,20));
        l.add(l10);

        t6=new JTextField();
        t6.setBounds(600,250,150,30);
        l.add(t6);

        l11= new JLabel("Email Id");
        l11.setBounds(50,300,100,30);
        l11.setFont(new Font("serif",Font.BOLD,20));
        add(l11);

        t7=new JTextField();
        t7.setBounds(200,300,150,30);
        l.add(t7);

        l12= new JLabel("Education");
        l12.setBounds(400,300,100,30);
        l12.setFont(new Font("serif",Font.BOLD,20));    
        l.add(l12);

        t8=new JTextField();
        t8.setBounds(600,300,150,30);
        l.add(t8);

        l13= new JLabel("Job Post");
        l13.setBounds(50,350,100,30);
        l13.setFont(new Font("serif",Font.BOLD,20));
        l.add(l13);

        t9=new JTextField();
        t9.setBounds(200,350,150,30);
        l.add(t9);


        l14= new JLabel("National ID  No");
        l14.setBounds(400,350,100,30);
        l14.setFont(new Font("serif",Font.BOLD,20));
        l.add(l14);

        t10=new JTextField();
        t10.setBounds(600,350,150,30);
        l.add(t10);

        l15= new JLabel("Employee Id");
        l15.setBounds(50,400,150,30);
        l15.setFont(new Font("serif",Font.BOLD,20));
        l.add(l15);

        t11=new JTextField();   
        t11.setBounds(200,400,150,30);
        l.add(t11);

        
        /*

        lab=new JLabel();
        lab.setBounds(200,450,250,200);
	add(lab);

        lab1=new JLabel("");
        lab1.setBounds(600,450,250,200);
        add(lab1);
        */

        b = new JButton("Submit");
        b.setBackground(Color.BLACK);
        b.addActionListener(this);
        b.setForeground(Color.WHITE);
        b.setBounds(250,550,150,40);
        add(b);

        b1=new JButton("Cancel");   
        b1.setBackground(Color.BLACK);
         b1.addActionListener(this);
        b1.setForeground(Color.WHITE);
        b1.setBounds(450,550,150,40);
        add(b1);


    }

    public void actionPerformed(ActionEvent ae){
        
        String a = t1.getText();
        String bb = t2.getText();
        String c = t3.getText();
        String d = t4.getText();
        String e = t5.getText();
        String ff = t6.getText();
        String g = t7.getText();
        String h = t8.getText();
        String i = t9.getText();
        String j = t10.getText();
        String k = t11.getText();
        if(ae.getSource() == b){
            try{
                conn cc = new conn();
                String q = "insert into employees values('"+a+"','"+bb+"','"+c+"','"+d+"','"+e+"','"+ff+"','"+g+"','"+h+"','"+i+"','"+j+"','"+k+"')";
                cc.s.executeUpdate(q);
                JOptionPane.showMessageDialog(null,"Details Successfully Inserted. \n Login to continue ");
                setVisible(false);
                new User_login();
            }catch(Exception ee){
                System.out.println("The error is:"+ee);
            }
        }else if(ae.getSource() == b1){
            setVisible(false);
            new User_login();
        }
    }
    public static void main(String[ ] arg){
        new Register();
    }
}
