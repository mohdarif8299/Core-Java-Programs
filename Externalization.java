import java.io.*;
class Externalization implements Externalizable
{
	int i = 20;
	int j = 200;
	public Externalization() {
		this.i = i;
		this.j = j;
	}
	public void  writeExternal(ObjectOutput oo) throws IOException {
		oo.writeInt(i);
	}
	public void readExternal(ObjectInput oi) throws IOException {
		 i = oi.readInt();
	}
	public static void main(String... args) throws Exception {
		Externalization e = new Externalization();
		FileOutputStream fos = new FileOutputStream("extern.ser");
		ObjectOutputStream oo = new ObjectOutputStream(fos);
		oo.writeObject(e);
		FileInputStream fis = new FileInputStream("extern.ser"); 
		ObjectInputStream ois= new ObjectInputStream(fis);
		Externalization e1 = (Externalization)ois.readObject();
		System.out.println(e1.i);
	}
}