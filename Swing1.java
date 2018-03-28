import javax.swing.*;
import java.awt.*;
class Swing1
{
	JFrame f;
	JButton b;
	Swing1()
	{
		f = new JFrame();
		b = new JButton("C");
		b.setBounds(100,100,40,40);
		f.setSize(300,300);
		f.add(b);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String[] agrs)
	{
		new Swing1();
	}
}