import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
class Password implements Serializable	{
	String userName = "Prolog";
	String passWord = "Academy";
	String pin = "162313";
	private void writeObject(ObjectOutputStream os)  throws IOException,ClassNotFoundException{
		os.defaultWriteObject();
		String newPassword = "123"+passWord;
		String newPin = "123"+pin;
		os.writeObject(newPassword);
		os.writeObject(newPin);
	}
	private void readObject(ObjectInputStream is)throws IOException,ClassNotFoundException {
		is.defaultReadObject();
		String newPassword = (String)is.readObject();
		passWord = newPassword.substring(3);
		String newPin = (String)is.readObject();
		 pin = newPin.substring(3); 
	}
}
class EncryptionPassword {
	public static void main(String... args) throws IOException,ClassNotFoundException{
			Password p = new Password();
			FileOutputStream fos = new FileOutputStream("pass.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(p);
			FileInputStream fis = new FileInputStream("pass.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Password p1 = (Password)ois.readObject();
			System.out.println("UserName: "+p1.userName);
			System.out.println("PassWord: "+p1.passWord);
			System.out.println("Pin: "+p1.pin);
	}
}