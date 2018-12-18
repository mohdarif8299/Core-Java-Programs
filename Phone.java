import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Phone implements ActionListener{
  JFrame f;
  int i;
  JButton contacts[] = new JButton[5];
  JButton exit;
  static String info[] = {"ALL CONTACTS","ADD CONTACT","SEARCH CONTACT","UPDATE CONTACT","DELETE CONTACT"};
  Phone() {
    f = new JFrame("Phone Directory");
    exit = new JButton("EXIT");
    f.setSize(500,500);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    for (i=0;i<5;i++) {
        contacts[i] = new JButton("");
        contacts[i].setText(info[i]);
        f.add(contacts[i]);
        contacts[i].addActionListener(this);
    }
    f.add(exit);
    exit.addActionListener(this);
    f.setLayout(new GridLayout(3,3));
    f.setVisible(true);
  }
  public static void main(String[] args) {
    new Phone();
  }
  public void actionPerformed(ActionEvent ae){
    if(ae.getSource()==exit) {
      System.exit(0);
    }
    if (ae.getSource()==contacts[0]) {
             new ALLContacts();
             f.dispose();
           }
    if (ae.getSource()==contacts[1]) {
             new ADDContacts();
             f.dispose();
           }
           if (ae.getSource()==contacts[2]) {
             new SEARCHContacts();
             f.dispose();
           }
           if (ae.getSource()==contacts[3]) {
             new UPDATEContacts();
             f.dispose();
           }
           if(ae.getSource()==contacts[4]) {
             new DELETEContact();
             f.dispose();
           }
           // else if (i==1) {
           //      new SAVEDContacts();
           //      f.dispose();
           //    }
           //    else if (i==2) {
           //         new ADDContacts();
           //         f.dispose();
           //       }
           //       else if (i==3) {
           //            new SEARCHContacts();
           //            f.dispose();
           //          }
           //          else if (i==4) {
           //               new UPDATEContacts();
           //               f.dispose();
           //             }
           //             else if (i==5) {
           //                  new DELETEContacts();
           //                  f.dispose();
           //
  }
}
