import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Currency_Converter implements ActionListener{
    JFrame f;
    JButton convert;
    JPanel panel;
    int p=0,q=0;
    JLabel label,label1;
    JTextField getAmountField,setAmountField;
    static double price[][] = {{ 1,71,0.012,0.011,0.0042},{ 71,1,0.88,0.79,0.30},{ 81,1.14,1,0.90,0.35},{ 90.42,1.26,1.11,1,0.38},{235.36,3.29,2.81,2.60,1}};
    String currency[] = { "Ruppess (Rs)","Dollar ($)","Euro (e)","Pound (p)","Dinar (d)" };
    String currency1[] = { "Ruppess (Rs)","Dollar ($)","Euro (e)","Pound (p)","Dinar (d)" };
    final JComboBox<String> c = new JComboBox<String>(currency);
    final JComboBox<String> c1 = new JComboBox<String>(currency1);
    Currency_Converter() {
    f = new JFrame("Currency_Conevrter");
    panel = new JPanel();
    f.setSize(500,500);
    f.setLayout(new FlowLayout());
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    panel.setLayout(new  BoxLayout(panel,BoxLayout.Y_AXIS));
    f.add(panel);
    convert = new JButton("Convert");
    label = new JLabel("Select Your Currency");
    label1 = new JLabel("Convert Into");
    panel.add(label);
    getAmountField = new JTextField();
    setAmountField = new JTextField();
                      c.setVisible(true);
                      panel.add(c);
                      panel.add(getAmountField);
                      panel.add(convert);
                      panel.add(label1);
                      panel.add(c1);
                      panel.add(setAmountField);
                      f.setVisible(true);
                      convert.addActionListener(this);
  }
  public static void main(String[] args) {
    new Currency_Converter();
  }
  public void actionPerformed(ActionEvent ae) {
    double r= 0;
    if (ae.getSource()==convert) {
      double total = Double.parseDouble(getAmountField.getText());
      String value1= c.getSelectedItem().toString();
      String value2= c1.getSelectedItem().toString();
      for (int i=0;i<currency.length;i++) {
              if (value1.equals(currency[i]))
                      p=i;
      }
      for (int j=0;j<currency1.length;j++) {
        if (value2.equals(currency1[j]))
                      q=j;
                    }
        setAmountField.setText(""+total*price[p][q]);
    }
  }
}
