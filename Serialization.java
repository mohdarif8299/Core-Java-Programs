import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.FileNotFoundException;
import java.io.IOException;
class MyClass1 implements Serializable	{
	transient int i = 100;
}
class MyClass2 implements Serializable	{
	transient int j = 200;
}
class MyClass3 implements Serializable	{
	transient int k = 300;
}
class Serialization	{
	public static void main(String... args) throws FileNotFoundException,IOException,ClassNotFoundException {
		MyClass1 m1 = new MyClass1();
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(m1);
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		MyClass1 mc1 = (MyClass1)ois.readObject();
		System.out.println("Value of i = "+mc1.i);
		MyClass2 m2 = new MyClass2();
		FileOutputStream fos1 = new FileOutputStream("abc.ser");
		ObjectOutputStream oos1 = new ObjectOutputStream(fos1);
		oos1.writeObject(m2);
		FileInputStream fis1 = new FileInputStream("abc.ser");
		ObjectInputStream ois1 = new ObjectInputStream(fis1);
		MyClass2 mc2 = (MyClass2)ois1.readObject();
		System.out.println("Value of j = "+mc2.j);
		MyClass3 m3 = new MyClass3();
		FileOutputStream fos2 = new FileOutputStream("abc.ser");
		ObjectOutputStream oos2 = new ObjectOutputStream(fos2);
		oos2.writeObject(m3);
		FileInputStream fis2 = new FileInputStream("abc.ser");
		ObjectInputStream ois2 = new ObjectInputStream(fis2);
		MyClass3 mc3 = (MyClass3)ois2.readObject();
		System.out.println("Value of k = "+mc3.k);
	}
}