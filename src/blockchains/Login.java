package blockchains;



import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author brc0d3s
 */
public class Login extends JFrame implements ActionListener {

    JLabel l, l1,l2,l3,l4;
    JButton b,b1;

   public Login() {
        setTitle("Login");
        setBackground(Color.blue);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(1000, 650);
        setLocation(200, 10);
        setVisible(true);

        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("blockchains/icons/Login.png"));
        Image i1 = i.getImage().getScaledInstance(1000, 650, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);
        l = new JLabel(i2);
        l.setBounds(0, 0, 1000, 650);
        add(l);

        ImageIcon logo = new ImageIcon(ClassLoader.getSystemResource("blockchains/icons/logo.png"));
        Image log = logo.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        ImageIcon Logo = new ImageIcon(log);
        l1 = new JLabel(Logo);
        l1.setBounds(120,60, 150, 150);
        l.add(l1); 
 
        l2=new JLabel("W E L C O M E   T O");
        l2.setBounds(320,70,600,40);
        l2.setFont(new Font("serif",Font.BOLD,40));
        l2.setForeground(Color.green);
        l.add(l2);
        
        l3=new JLabel("BLOCKCHAINS");
        l3.setBounds(370,130,500,50);
        l3.setFont(new Font("serif",Font.BOLD,35));
        l3.setForeground(Color.green);
        l.add(l3);
        
        l4=new JLabel("E . M . S");
        l4.setBounds(420,200,400,40);
        l4.setFont(new Font("serif",Font.PLAIN,40));
        l4.setForeground(Color.red);
        l.add(l4);

        
        
        ImageIcon user = new ImageIcon(ClassLoader.getSystemResource("blockchains/icons/user.jpeg"));
        Image us = user.getImage().getScaledInstance(150, 60, Image.SCALE_DEFAULT);
        ImageIcon User = new ImageIcon(us);
        b = new JButton(User);
	b.addActionListener(this);
	b.setBounds(440, 320, 150, 60);
	l.add(b);
        
        ImageIcon admin = new ImageIcon(ClassLoader.getSystemResource("blockchains/icons/admin.jpeg"));
        Image ad = admin.getImage().getScaledInstance(150, 60, Image.SCALE_DEFAULT);
        ImageIcon Admin = new ImageIcon(ad);
        b1= new JButton(Admin);
        b1.addActionListener(this);
	b1.setBounds(440, 460, 150, 60);
	l.add(b1);
        
                
        while(true){
            l4.setVisible(false); // l4 =  j label
            try{
                Thread.sleep(500); //1000 = 1 second
            }catch(Exception e){} 
            l4.setVisible(true);
            try{
                Thread.sleep(500);
            }catch(Exception e){}
        }
        

    }

     public void actionPerformed(ActionEvent ae){
         if(ae.getSource() == b){
                setVisible(false);
		new User_login();
         
     } 
         if(ae.getSource() == b1){
                setVisible(false);
		new Admin_login();
		
         }
     }
    public static void main(String... args) {
        new Login();
    }

}
