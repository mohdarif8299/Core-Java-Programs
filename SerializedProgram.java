import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.io.FileNotFoundException;
import java.io.IOException;
class Program implements Serializable	{
	String UserName = "mohdarif8299@gmail.com";
	String PassWord = "mohdarif";
	private void writeObject(ObjectOutputStream os) throws IOException,ClassNotFoundException{
		os.defaultWriteObject();
		String newU = "1234"+UserName;
		String newP = "xyz"+PassWord;
		os.writeObject(newU);
		os.writeObject(newP);
	}
	private void readObject(ObjectInputStream is) throws IOException,ClassNotFoundException {
		is.defaultReadObject();
		String newU = (String)is.readObject();
		UserName  = newU;//.substring(4);
		String newP = (String)is.readObject();
		PassWord = newP;//.substring(3);
	}
}
class SerializedProgram	{
	public static void main(String... args)throws FileNotFoundException ,IOException,ClassNotFoundException{
		Program p = new Program();
		FileOutputStream fos = new FileOutputStream("file.ser");
		ObjectOutputStream oo = new ObjectOutputStream(fos);
		oo.writeObject(p);
		FileInputStream fis = new FileInputStream("file.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Program p1 = (Program)ois.readObject();
		System.out.println("Username: "+p1.UserName);
		System.out.println("Password: "+p1.PassWord);
	}
}