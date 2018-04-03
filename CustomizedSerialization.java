import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.FileNotFoundException;
import java.io.IOException;
class Test implements Serializable	{
	String userName = "Prolog";
	String passWord = "Academy";
	private void writeObject(ObjectOutputStream os) throws IOException,ClassNotFoundException {
		os.defaultWriteObject();
		String newPassword = "123"+passWord;
		os.writeObject(newPassword);
	}
	private void readObject(ObjectInputStream is) throws IOException,ClassNotFoundException {
		is.defaultReadObject();
		String newPassword = (String)is.readObject();
		passWord = newPassword.substring(3);
	}
}
class CustomizedSerialization	{
	public static void main(String...  args) throws FileNotFoundException,IOException,ClassNotFoundException {
		Test t = new Test();
		FileOutputStream fos = new FileOutputStream("xyz.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(t);
		FileInputStream fis = new FileInputStream("xyz.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Test t1 = (Test)ois.readObject();
		System.out.println("USERNAME: "+t1.userName);
		System.out.println("PASSWORD: "+t1.passWord);
	}
}