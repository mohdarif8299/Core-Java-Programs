import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
class ServerSide	{
	public static void main(String... args)throws Exception {
				ServerSocket server = new ServerSocket(1440);
				System.out.println("waiting for client request...");
				Socket socket = server.accept();
				System.out.println("Connect Succesfully");
		       	while (true) {
				ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
				String message = (String)ois.readObject();
				System.out.println("Recieved Message");
				System.out.println(message);
				System.out.println("Write your Message");
				Scanner s = new Scanner(System.in);
				String msg = s.nextLine();
				ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
				oos.writeObject(msg);
				if(msg.equalsIgnoreCase("bye"))
					break;
			}
			
			server.close();
	}
}