import java.net.Socket;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
class ClientSide	{
	public static void main(String... args)throws Exception	 {
			Boolean b = true;
				Socket socket = new Socket("127.0.0.1",1440);
				System.out.println("Sending Request to Server");
			while (b)	{
				ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
				Scanner s = new Scanner(System.in);
				System.out.println("Write Message");
				String name = s.nextLine();
				oos.writeObject(name);
				if(name.equalsIgnoreCase("bye")) 
					break;
				ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
				String message = (String)ois.readObject();
				if(message.equalsIgnoreCase("bye"))
					b = false;
				System.out.println("Message from Server");
				System.out.println(message);
			}
			socket.close();
	}
}