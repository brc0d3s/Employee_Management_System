package blockchains;

import java.sql.*;
import javax.swing.*;
import java.awt.event.*;


public class View_Employee extends JFrame implements ActionListener{
  
    JTable j1;
    JButton b1;
    String h[]={"Car id","Model","Capacity","Car Reg No.","Engine Size","Price"};
    String d[][]=new String[500][6];  
    int i=0,j=0;
    
    View_Employee(){
        setTitle("View Employees Details");
        setSize(900,500);
        setLocation(400,150);
        
        try{
            String q="select * from employees";
            conn c1=new conn();
            ResultSet rs=c1.s.executeQuery(q);
            while(rs.next()){
                d[i][j++]=rs.getString("car_id");
                d[i][j++]=rs.getString("model");
                d[i][j++]=rs.getString("capacity");
                d[i][j++]=rs.getString("car_regno");
                d[i][j++]=rs.getString("engine_size");
                d[i][j++]=rs.getString("price");
                
                i++;
                j=0;
            }
        
            j1=new JTable(d,h);

        }catch(Exception e){}
        
        b1=new JButton("Back");
        add(b1,"South");
        JScrollPane s1=new JScrollPane(j1);
        add(s1);
        
        b1.addActionListener(this);
        setVisible(true);

    
    }
    public void actionPerformed(ActionEvent ae){
        /*try{
            j1.print();
        }catch(Exception e){}
        */
        if(ae.getSource()==b1){
            setVisible(false);
            new employers();
        }
      
    }
    
    public static void main(String[] args){
        new View_Employee();
    }
}