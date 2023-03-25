package Employeee;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.sql.*;
import java.awt.event.*;

public class Forgot extends JFrame implements ActionListener{

    private JPanel contentPane;
    private JTextField t1,t2,t3,t4,t5;
    private JButton b1,b2,b3;

    public static void main(String[] args) {
	new Forgot().setVisible(true);
    }

    public Forgot() {

        setBounds(400, 200, 650, 500);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
        contentPane.setBackground(Color.WHITE);
	contentPane.setLayout(null);

	JLabel l1 = new JLabel("First Name");
	l1.setFont(new Font("Tahoma", Font.BOLD, 13));
	l1.setBounds(109, 83, 87, 29);
	l1.setForeground(new Color(0, 0, 0));
	contentPane.add(l1);

	JLabel l2 = new JLabel("Last Name");
	l2.setFont(new Font("Tahoma", Font.BOLD, 13));
	l2.setBounds(109, 122, 75, 21);
	l2.setForeground(new Color(0, 0, 0));
	contentPane.add(l2);

	JLabel l3 = new JLabel("Your Security Question");
	l3.setFont(new Font("Tahoma", Font.BOLD, 13));
	l3.setBounds(109, 154, 156, 27);
	l3.setForeground(new Color(0, 0, 0));
	contentPane.add(l3);

	JLabel l4 = new JLabel("Answer");
	l4.setFont(new Font("Tahoma", Font.BOLD, 13));
	l4.setBounds(109, 192, 104, 21);
	l4.setForeground(new Color(0, 0, 0));
	contentPane.add(l4);

	JLabel l5 = new JLabel("Password");
	l5.setFont(new Font("Tahoma", Font.BOLD, 13));
	l5.setBounds(109, 224, 104, 21);
	l5.setForeground(new Color(0, 0, 0));
	contentPane.add(l5);

	t1 = new JTextField();
	t1.setFont(new Font("Tahoma", Font.BOLD, 13));
	t1.setForeground(new Color(0, 0, 0));
	t1.setBounds(277, 88, 139, 20);
	contentPane.add(t1);
	t1.setColumns(10);

	t2 = new JTextField();
	t2.setEditable(false);
	t2.setFont(new Font("Tahoma", Font.BOLD, 13));
	t2.setForeground(new Color(165, 42, 42));
	t2.setColumns(10);
	t2.setBounds(277, 123, 139, 20);
	contentPane.add(t2);

	t3 = new JTextField();
	t3.setEditable(false);
	t3.setFont(new Font("Tahoma", Font.BOLD, 12));
	t3.setForeground(new Color(72, 61, 139));
	t3.setColumns(10);
	t3.setBounds(277, 161, 221, 20);
	contentPane.add(t3);

	t4 = new JTextField();
	t4.setFont(new Font("Tahoma", Font.BOLD, 13));
	t4.setForeground(new Color(205, 92, 92));
	t4.setColumns(10);
	t4.setBounds(277, 193, 139, 20);
	contentPane.add(t4);

	t5 = new JTextField();
	t5.setEditable(false);
	t5.setFont(new Font("Tahoma", Font.BOLD, 13));
	t5.setForeground(new Color(50, 205, 50));
	t5.setColumns(10);
	t5.setBounds(277, 225, 139, 20);
	contentPane.add(t5);

	b1 = new JButton("Search");
	b1.addActionListener(this);
	b1.setFont(new Font("Tahoma", Font.BOLD, 11));
	b1.setBounds(428, 83, 80, 29);
	b1.setForeground(new Color( 0,0,0));
	b1.setBackground(new Color(204, 255, 255));
        contentPane.add(b1);

	b2 = new JButton("Retrieve");
	b2.addActionListener(this);
	b2.setFont(new Font("Tahoma", Font.BOLD, 11));
	b2.setBounds(426, 188, 85, 29);
	b2.setForeground(new Color( 0,0,0));
	b2.setBackground(new Color(204, 255, 255));
	contentPane.add(b2);

	b3 = new JButton("Back");
	b3.addActionListener(this);
	b3.setFont(new Font("Tahoma", Font.BOLD, 13));
	b3.setBounds(233, 270, 101, 29);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
	contentPane.add(b3);

	JPanel panel = new JPanel();
	panel.setBorder(new TitledBorder(new LineBorder(new Color(139, 69, 19), 2), "Forgot-Panel",
			TitledBorder.LEADING, TitledBorder.TOP, null, new Color(178, 34, 34)));
	panel.setBounds(47, 45, 508, 281);
        panel.setBackground(Color.WHITE);
	contentPane.add(panel);
    }
    
    public void actionPerformed(ActionEvent ae){
        try{
            conn con = new conn();
            if(ae.getSource() == b1){
                String sql = "select * from account where username=?";
		PreparedStatement st = con.c.prepareStatement(sql);

		st.setString(1, t1.getText());
		ResultSet rs = st.executeQuery();

		while (rs.next()) {
                    t2.setText(rs.getString("name"));
                    t3.setText(rs.getString("sec_q"));
		}

            }
            if(ae.getSource() == b2){
                String sql = "select * from account where sec_ans=?";
		PreparedStatement st = con.c.prepareStatement(sql);

		st.setString(1, t4.getText());
		ResultSet rs = st.executeQuery();

		while (rs.next()) {
                    	t5.setText(rs.getString("password"));
		}

            }
            if(ae.getSource() == b3){
                this.setVisible(false);
		new Login_user().setVisible(true);
			
            }
        }catch(Exception e){
            
        }
    }

}