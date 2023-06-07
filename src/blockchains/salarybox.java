package blockchains;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class salarybox extends JFrame implements ActionListener {


    JLabel l, l1, l2;
    JButton b1, b2, b3, b5, b6;

    salarybox() {
        setTitle("Reset");
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

        b1 = new JButton("Add salary");
        b1.setBounds(420, 30, 210, 40);
        b1.setFont(new Font("serif", Font.BOLD, 15));
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Update salary");
        b2.setBounds(420, 80, 210, 40);
        b2.setFont(new Font("serif", Font.BOLD, 15));
        b2.addActionListener(this);
        add(b2);

        b3 = new JButton("Generate Payment slip");
        b3.setBounds(420, 130, 210, 40);
        b3.setFont(new Font("serif", Font.BOLD, 15));
        b3.addActionListener(this);
        add(b3);

        b5 = new JButton(" BACK ");
        b5.setBounds(420, 200, 100, 40);
        b5.setFont(new Font("serif", Font.BOLD, 15));
        b5.addActionListener(this);
        add(b5);

        b6 = new JButton(" EXIT ");
        b6.setBounds(530, 200, 100, 40);
        b6.setFont(new Font("serif", Font.BOLD, 15));
        b6.addActionListener(this);
        b6.setForeground(Color.red);
        add(b6);

        setVisible(true);
        setSize(700, 500);
        setLocation(375, 175);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            setVisible(false);
            new Add_salary();
        }
        if (ae.getSource() == b2) {
            setVisible(false);
            new Update_salary();
        }

        if (ae.getSource() == b3) {
            setVisible(false);
            new pay_slip().setVisible(true);
        }

        if (ae.getSource() == b5) {
            setVisible(false);
            new Admin();
        }

        if (ae.getSource() == b6) {
            setVisible(false);
            System.exit(0);
        }
    }

    public static void main(String[] arg) {
        new salarybox();
    }
}
