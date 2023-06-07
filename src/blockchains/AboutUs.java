package blockchains;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;

public class AboutUs extends JFrame{

    
    public static void main(String[] args) {
            new AboutUs().setVisible(true);			
	}
    
    
        AboutUs() {
            
            setTitle("About Us");
            setBackground(new Color(173, 216, 230));
            setBounds(350, 150, 700, 500);

            JPanel contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JLabel l1 = new JLabel("New label");
            ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("blockchains/icons/logo.png"));
            Image i2 = i1.getImage().getScaledInstance(250, 100,Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            l1 = new JLabel(i3);
            l1.setBounds(400, 40, 250, 100);
            contentPane.add(l1);


            JLabel l3 = new JLabel("Employee");
            l3.setForeground(new Color(0, 0, 255));
            l3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l3.setBounds(140, 40, 200, 55);
            contentPane.add(l3);

            JLabel l4 = new JLabel("Management System");
            l4.setForeground(new Color(0, 0, 255));
            l4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l4.setBounds(70, 90, 405, 40);
            contentPane.add(l4);

            /*JLabel l5 = new JLabel("brc0d3s");
            l5.setForeground(new Color(255, 0, 0));
            l5.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
            l5.setBounds(185, 140, 100, 21);
            contentPane.add(l5);*/


            JLabel l6 = new JLabel("Developed By : BLOCKCHAINS");
            l6.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
            l6.setBounds(70, 198, 600, 35);
            contentPane.add(l6);

            JLabel l7 = new JLabel("Copyright @ 2023");
            l7.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            l7.setBounds(70, 260, 600, 34);
            contentPane.add(l7);

            JLabel l8 = new JLabel("Contact : www.cuea.edu ");
            l8.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            l8.setBounds(70, 290, 600, 34);
            contentPane.add(l8);

            JLabel l9 = new JLabel("Department - Comp Sci. ( COMPUTER SCIENCE  )");
            l9.setFont(new Font("Trebuchet MS", Font.BOLD , 20));
            l9.setBounds(70, 320, 600, 34);
            contentPane.add(l9);


            JLabel l10 = new JLabel("Phone - +254 770872383");
            l10.setForeground(new Color(47, 79, 79));
            l10.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
            l10.setBounds(70, 400, 600, 34);
            contentPane.add(l10);
                
                
            contentPane.setBackground(Color.blue);
	}
        

}

