import java.io.*;
class MyFile5
{
	public static void main(String[] args) throws IOException
	{
		File input = new File("input.txt");
		input.createNewFile();
		File del = new File("del.txt");
		del.createNewFile();
		File output = new File("output.txt");
		output.createNewFile();
		PrintWriter pw1 = new PrintWriter(input);
		pw1.println("ABC");
		pw1.println("123");
		pw1.println("PQR");
		pw1.close();
		PrintWriter pw2 = new PrintWriter(del);
		pw2.println("PQR");
		pw2.println("456");
		pw2.println("XYZ");
		pw2.close();
		FileReader fr1 = new FileReader(input);
		BufferedReader br1 = new BufferedReader(fr1);
		FileReader fr2 = new FileReader(del);
		BufferedReader br2 = new BufferedReader(fr2);
		PrintWriter pw3 = new PrintWriter(output);
		String s1 = br1.readLine();
		String s2 = br2.readLine();
		 while(s1!=null|s2!=null) 
         {
            if(s1.equals(s2))
				{
				}
				else 
			 {
					pw3.println(s1);
					 s1 = br1.readLine();
				    s2 = br2.readLine();
			 }
	     }
	}
}