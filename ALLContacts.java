import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ALLContacts implements ActionListener {
  JFrame f;
  static Connection con;
  JLabel l;
  int count=0;
  JPanel jp;
  int i;
  JButton back;
  JLabel field[] = new JLabel[10];
    ALLContacts() {
    f = new JFrame("Phone Directory");
    l = new JLabel("All Contacts are");
    f.setLayout(new GridLayout(8,12));
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    back = new JButton("Back");
    f.add(l);
    for (i=1;i<10;i++) {
      field[i] = new JLabel();
      f.add(field[i]);
    }
    f.add(back);
    back.addActionListener(this);
    try {
      con = GetConnection.getDBConnection();
      PreparedStatement stmt = con.prepareStatement("SELECT *FROM CONTACTS");
      ResultSet rs = stmt.executeQuery();
      while(rs.next()) {
        count++;
        String RowName1 = rs.getString("NAME");
        String RowName2 = rs.getString("NUMBER");
        field[count].setText("Name -> "+RowName1+": Number -> "+RowName2);
      }
    } catch(Exception e) {
             System.out.println(e);
    }

    f.setSize(500,500);
    f.setVisible(true);
  }
  public void actionPerformed(ActionEvent ae) {
    if (ae.getSource()==back) {
          new Phone();
          f.dispose();
    }
  }
}
