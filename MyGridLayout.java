import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyGridLayout implements ActionListener
{
	JFrame f;
	JButton b;
	JTextField tf;
	MyGridLayout()
	{
		f = new JFrame();
		for(int i=1;i<=10;i++)
		{
			b[i] = new JButton(i);
			f.add(b);
		}
		f.setLayout(new GridLayout(3,3));
		f.setSize(500,500);
		f.setVisible(true);
	}
	public static void main(String[] args)
	{
		new MyGridLayout();
	}
}