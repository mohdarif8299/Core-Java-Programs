import java.sql.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ADDContacts implements ActionListener{
  static Connection con;
  static int numbersOfUser=0;
  JFrame f;
  boolean checkUser = true;
  JLabel l1,l2;
  JTextField name,number;
  JButton addContact,back;
  ADDContacts() {
    f = new JFrame();
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    l1 = new JLabel("Enter Name");
    l2 = new JLabel("Enter Number");
    name = new JTextField();
    number = new JTextField();
    addContact = new JButton("ADD CONTACT");
    back = new JButton("BACK");
    f.add(l1);
    f.add(name);
    f.add(l2);
    f.add(number);
    addContact.addActionListener(this);
    back.addActionListener(this);
    f.add(addContact);
    f.add(back);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setLayout(new GridLayout(4,0));
    f.setSize(500,500);
    f.setVisible(true);
  }
  public void actionPerformed(ActionEvent ae) {
      if (ae.getSource()==addContact&&name.getText().length()!=0&&number.getText().length()!=0) {
        String user_name = name.getText().toString();
        String user_number = number.getText().toString();
          try {
            con = GetConnection.getDBConnection();
            if(checkUser) {
               PreparedStatement stmt = con.prepareStatement("SELECT NAME,NUMBER FROM CONTACTS WHERE NAME = ? AND NUMBER = ?");
               stmt.setString(1,user_name);
               stmt.setString(2,user_number);
               ResultSet rs = stmt.executeQuery();
               if(rs.next()) {
                 JOptionPane.showMessageDialog(null,"User Already Exits","Phone Directory", JOptionPane.INFORMATION_MESSAGE);
                 name.setText("");
                 number.setText("");
               }
               checkUser = false;
            }
            if(checkUser==false) {
            PreparedStatement stmt = con.prepareStatement("INSERT INTO CONTACTS VALUES (?,?)");
              stmt.setString(1,user_name);
              stmt.setString(2,user_number);
            int i = stmt.executeUpdate();
            if (i==1) {
                 JOptionPane.showMessageDialog(null,"CONTACTS ADDED SUCCESSFULLY","Phone Directory", JOptionPane.INFORMATION_MESSAGE);
                 name.setText("");
                 number.setText("");
                 numbersOfUser = numbersOfUser+1;
            }
          }
        } catch(Exception e) {
          JOptionPane.showMessageDialog(null,"Name or Number Already Exists","Phone Directory", JOptionPane.INFORMATION_MESSAGE);
            System.out.println(e);
          }
    }
      if(ae.getSource()==back) {
        new Phone();
        f.dispose();
      }
      else if(name.getText().length()==0||number.getText().length()==0){
        JOptionPane.showMessageDialog(null,"Enter Correct Name or Number","Phone Directory",JOptionPane.INFORMATION_MESSAGE);
      }
  }
}
