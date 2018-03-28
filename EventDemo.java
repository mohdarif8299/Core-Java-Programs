import java.awt.*;
import java.awt.event.*;
class EventDemo implements ActionListener
{
	Frame f;
	Button b1,b2;
	TextField tf;
	EventDemo(String s)
	{
		f = new Frame(s);
		tf = new TextField():
		b1 = new Button("OK");
		b2 = new Button("Cancel");
		f.setSize(400,400);
		tf.setBounds(100,100,40,30);
		b1.setBounds(150,150,30,20);
		b2.setBounds(170,150,30,40);
		b1.addActionListener(this);
		b2.addActionListener(this);
		f.setLayout(null);
		f.add(b1);
		f.add(tf);
		f.add(b2);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent a)
	{
		if(a.getSource()==b1)
		{
			tf.setText("it's ok ");
		}
		if(a.getSource()==b2)
		{
			tf.setText("Cancelled");
		}
	}
	public static void main(String[] args) 
	{
		EventDemo f = new EventDemo("Event Demo");
	}
}
