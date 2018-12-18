import java.sql.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class DELETEContact implements ActionListener{
  JFrame f,f1;
  static Connection con;
  JButton delete,back,back1,delete1;
  JTextField tf;
  boolean isNumeric = true;
  JLabel l,l1;
  JLabel name,number,name1,number1;
  DELETEContact() {
    f = new JFrame("Phone Directory");
    tf = new JTextField();
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    l = new JLabel("Enter Name or Number to Delete");
    delete = new JButton("Delete");
    back = new JButton("Back");
    f.add(l);
    f.add(tf);
    f.add(delete);
    f.add(back);
    f.setSize(500,500);
    f.setVisible(true);
    f.setLayout(new GridLayout(8,12));
    back.addActionListener(this);
    delete.addActionListener(this);
  }
  public void actionPerformed(ActionEvent ae) {
    if(ae.getSource()==back) {
      new Phone();
      f.dispose();
    }
  if(ae.getSource()==delete1) {
    try {
      PreparedStatement stmt1 = con.prepareStatement("DELETE FROM CONTACTS WHERE NAME = ?");
      stmt1.setString(1,tf.getText().toString());
      int i = stmt1.executeUpdate();
      if(i==1) {
        JOptionPane.showMessageDialog(null,"Contact Deleted","Phone Directory",JOptionPane.INFORMATION_MESSAGE);
        f1.dispose();
        tf.setText("");
      }
    } catch(Exception e) {

    }
  }
  if(ae.getSource()==back1) {
    f1.dispose();
  }
    if (ae.getSource()==delete) {
      if(tf.getText().length()!=0){
        try {
          con = GetConnection.getDBConnection();
          PreparedStatement stmt = con.prepareStatement("SELECT *FROM CONTACTS WHERE NAME = ?");
          stmt.setString(1,tf.getText().toString());
          ResultSet rs = stmt.executeQuery();
          if(rs.next()) {
            f1 = new JFrame("Phone Directory");
            f1.setSize(500,500);
            name = new JLabel("Your Name");
            l1 = new JLabel(" *Are you sure you want to delete your contact ?");
            name1 = new JLabel("");
            name1.setText(rs.getString(1));
            number = new JLabel("Your Number");
            number1 = new JLabel("");
            number1.setText(rs.getString(2));
            delete1 = new JButton("Yes, Delete it");
            back1 = new JButton("No, Go Back");
            f1.add(name);
            f1.add(name1);
            f1.add(number);
            f1.add(number1);
            f1.add(l1);
            f1.add(delete1);
            f1.add(back1);
            delete1.addActionListener(this);
            back1.addActionListener(this);
            f1.setVisible(true);
            f1.setLayout(new GridLayout(8,12));
          }
          else {
              JOptionPane.showMessageDialog(null,"Contact Not Found","Phone Directory",JOptionPane.INFORMATION_MESSAGE);
              tf.setText("");
          }

        } catch(Exception e) {
          System.out.print(e);
        }
      }
      else {
        JOptionPane.showMessageDialog(null,"Enter Contact Name to Deleted Contact","Phone Directory",JOptionPane.INFORMATION_MESSAGE);
      }
    }
  }
}
