package blockchains;

import java.awt.*;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;

public class Update_Employee implements ActionListener {

    JFrame f;
    JLabel id, id1, id2, id3, id4, id5, id6, id7, id8, id9, id10, id11, id12, id15, lab, lab1;
    JTextField t, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11;
    JButton b, b1, b2, b3;

    Update_Employee() {

        f.setTitle("Employee Management");
        f.getContentPane().setBackground(new Color(2, 6, 82));
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        f.setSize(1000, 650);
        f.setLocation(200, 10);
        f.setVisible(true);

        ImageIcon logo = new ImageIcon(ClassLoader.getSystemResource("blockchains/icons/logo.png"));
        Image log = logo.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        ImageIcon Logo = new ImageIcon(log);
        id = new JLabel(Logo);
        id.setBounds(30, 15, 150, 150);
        f.add(id);

        id8 = new JLabel("Update  Car  Details");
        id8.setBounds(250, 30, 1500, 100);
        id8.setFont(new Font("serif", Font.PLAIN, 60));
        id8.setForeground(Color.green);
        f.add(id8);
        


        id = new JLabel("Car Id");
        id.setVisible(true);
        id.setBounds(40, 50, 250, 30);
        id.setForeground(Color.blue);
        Font F1 = new Font("serif", Font.BOLD, 25);
        id.setFont(F1);
        f.add(id);

        t = new JTextField();
        t.setBounds(240, 50, 220, 30);
        f.add(t);

        b = new JButton("Search");
        b.setBounds(630, 50, 100, 30);
        b.addActionListener(this);
        f.add(b);

        id1 = new JLabel("Employee Id:");
        id1.setBounds(50, 100, 100, 30);
        id1.setFont(new Font("serif", Font.BOLD, 20));
        f.add(id1);

        t1 = new JTextField();
        t1.setBounds(200, 100, 150, 30);
        f.add(t1);

        id2 = new JLabel("Full name :");
        id2.setBounds(400, 100, 200, 30);
        id2.setFont(new Font("serif", Font.BOLD, 20));
        f.add(id2);

        t2 = new JTextField();
        t2.setBounds(600, 100, 150, 30);
        f.add(t2);

        id3 = new JLabel(":");
        id3.setBounds(50, 150, 100, 30);
        id3.setFont(new Font("serif", Font.BOLD, 20));
        f.add(id3);

        t3 = new JTextField();
        t3.setBounds(200, 150, 150, 30);
        f.add(t3);

        id4 = new JLabel("Car Regno:");
        id4.setBounds(400, 150, 100, 30);
        id4.setFont(new Font("serif", Font.BOLD, 20));
        f.add(id4);

        t4 = new JTextField();
        t4.setBounds(600, 150, 150, 30);
        f.add(t4);

        id5 = new JLabel("Engine Size:");
        id5.setBounds(50, 200, 100, 30);
        id5.setFont(new Font("serif", Font.BOLD, 20));
        f.add(id5);

        t5 = new JTextField();
        t5.setBounds(200, 200, 150, 30);
        f.add(t5);

        id6 = new JLabel("Price :");
        id6.setBounds(400, 200, 100, 30);
        id6.setFont(new Font("serif", Font.BOLD, 20));
        f.add(id6);

        t6 = new JTextField();
        t6.setBounds(600, 200, 150, 30);
        f.add(t6);

        b2 = new JButton("update");
        b2.setBounds(250, 300, 100, 30);
        b2.addActionListener(this);
        f.add(b2);

        b1 = new JButton("Cancel");
        b1.setBounds(450, 300, 100, 30);
        b1.addActionListener(this);
        f.add(b1);

    }

  public void actionPerformed(ActionEvent ae) {
    try {
        // establish a database connection using the conn class
        conn con = new conn();

        if (ae.getSource() == b) {
            // execute a SQL query to select data based on the car_id entered in t
            String sql = "SELECT * FROM employees WHERE car_id=?";
            PreparedStatement st = con.c.prepareStatement(sql);
            st.setString(1, t.getText());
            ResultSet rs = st.executeQuery();

            // display the retrieved data in several text fields
            while (rs.next()) {
                t1.setText(rs.getString(1));
                t2.setText(rs.getString(2));
                t3.setText(rs.getString(3));
                t4.setText(rs.getString(4));
                t5.setText(rs.getString(5));
                t6.setText(rs.getString(6));
            }
        }

        if (ae.getSource() == b2) {
            // execute a SQL query to update data in the car_db table based on the car ID entered in t1
            String sql = "UPDATE car_db SET model=?, capacity=?, car_regno=?, engine_size=?, price=? WHERE car_id=?";
            PreparedStatement pst = con.c.prepareStatement(sql);
            pst.setString(1, t2.getText());
            pst.setString(2, t3.getText());
            pst.setString(3, t4.getText());
            pst.setString(4, t5.getText());
            pst.setString(5, t6.getText());
            pst.setString(6, t1.getText());
            int rowsUpdated = pst.executeUpdate();

            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Successfully updated.");
            } else {
                JOptionPane.showMessageDialog(null, "Failed to update.");
            }
        }

        if (ae.getSource() == b1) {
            // hide the current frame and create a new instance of the Cars class
            f.dispose();
            new employers();
            //cars.setVisible(true);
        }

        // close the database connection
        con.c.close();
    } catch (Exception e) {
        // display an error message using a JOptionPane
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
    }
}

public static void main(String[] arg) {
    // create a new instance of the Update_car class
    new Update_Employee();
}
}