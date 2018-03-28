import java.io.*;
class MyFile1
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
		PrintWriter pw2 = new PrintWriter(del);
		PrintWriter pw3 = new PrintWriter(output);
		pw1.println("ABC");
		pw1.println("PQR");
	    pw1.println("123");
		pw2.println("ABC");
		pw2.println("PQR");
	    pw2.println("124");
		FileReader fr1 = new FileReader(input);
		BufferedReader br1 = new BufferedReader(fr1);
		FileReader fr2 = new FileReader(input);
		BufferedReader br2 = new BufferedReader(fr2);
		String s1 = br1.readLine();
		String s2 = br2.readLine();
		while(s1!=null)
		{
			int i=0;
			while(s2!=null)
			{
				if(s1.equals(s2))
				{
					i=1;
				}
				else 
				{
					i=0;
				}
				s2 = br2.readLine();
			}
			s1 = br1.readLine();
			if(i==0)
			{
				pw3.println(s1);
			}
		}
	}
}