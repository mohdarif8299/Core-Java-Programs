import java.awt.*;
class F implements ActionListener
{
	String s;
	Frame f;
	Button b;
	TextField tf;
	F()
	{
		f = new Frame();
		b = new Button();
		tf = new TextField();
		f.add(b);
		f.add(tf);
		b.setBounds(100,100,40,30);
		tf.setBounds(200,200,50,20);
		b.addActionListener(this)
	}
		public actionPerformed(ActionEvent e)
	{
			if(e.getSource()==b)
		{
				tf.setText(s);
		}
	}
	public stati void main(String[] args)
	{
		new F(); 
	}
}