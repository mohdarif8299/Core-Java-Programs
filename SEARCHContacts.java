import java.sql.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class SEARCHContacts implements ActionListener{
  static Connection con;
  JFrame f;
  Boolean isNumeric = false;
  JLabel l1,l2,l3;
  JButton search,back;
  JTextField search_field;
       SEARCHContacts() {
      con = GetConnection.getDBConnection();
       f = new JFrame("Phone Directory");
       f.setSize(500,500);
       l1 = new JLabel("Search Contacts using Name or Number");
       search_field = new JTextField();
       search = new JButton("Search");
       back = new JButton("BACK");
       f.add(l1);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       f.add(search_field);
       f.add(search);
       f.add(back);
       f.setVisible(true);
       f.setLayout(new GridLayout(8,12));
       search.addActionListener(this);
       back.addActionListener(this);
     }
     public void actionPerformed(ActionEvent ae) {
       if (ae.getSource()==search&&search_field.getText().length()!=0) {
          String search_contact = search_field.getText();
          if(search_contact.startsWith("0")||search_contact.startsWith("1")||search_contact.startsWith("2")||search_contact.startsWith("3")||search_contact.startsWith("4")||search_contact.startsWith("5")||search_contact.startsWith("6")||search_contact.startsWith("7")||search_contact.startsWith("8")||search_contact.startsWith("9"))
            isNumeric = true;
          else
        isNumeric = false;
          try {
            con = GetConnection.getDBConnection();
               if(isNumeric==true) {
                 if(search_contact.length()==10) {
                 PreparedStatement stmt = con.prepareStatement("SELECT NAME,NUMBER FROM CONTACTS WHERE NUMBER = ?");
                 stmt.setString(1,search_contact);
                 ResultSet rs = stmt.executeQuery();
                 if(rs.next()) {
                   JOptionPane.showMessageDialog(null,"Name is "+rs.getString(1)+"\nNumber is "+rs.getString(2),"Phone Directory", JOptionPane.INFORMATION_MESSAGE);
                   search_field.setText("");
                 }
                 else {
                   JOptionPane.showMessageDialog(null,"Contact Not Found"+"\nTry Search Using Name","Phone Directory", JOptionPane.INFORMATION_MESSAGE);
                   search_field.setText("");
                 }
               }
               else if(search_contact.length()>10||search_contact.length()<10) {
                 JOptionPane.showMessageDialog(null,"Number format not correct","Phone Directory", JOptionPane.INFORMATION_MESSAGE);
               }
               }
               else {
                 PreparedStatement stmt = con.prepareStatement("SELECT NAME,NUMBER FROM CONTACTS WHERE NAME = ?");
                 stmt.setString(1,search_contact);
                 ResultSet rs = stmt.executeQuery();
                 if(rs.next()) {
                     JOptionPane.showMessageDialog(null,"Name is "+rs.getString(1)+"\nNumber is "+rs.getString(2),"Phone Directory", JOptionPane.INFORMATION_MESSAGE);
                 }
                 else {
                   JOptionPane.showMessageDialog(null,"Contact Not Found"+"\nTry Search Using Number","Phone Directory", JOptionPane.INFORMATION_MESSAGE);
                   search_field.setText("");
                 }
               }
          } catch(Exception e) {
              System.out.println(e);
      }
    }
    if(ae.getSource()==back) {
      new Phone();
      f.dispose();
    }
    else if(search_field.getText().length()==0){
      JOptionPane.showMessageDialog(null,"Enter Correct Name or Number","Phone Directory",JOptionPane.INFORMATION_MESSAGE);
    }
  }
}
