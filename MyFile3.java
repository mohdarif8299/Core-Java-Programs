import java.io.*;
class MyFile3
{
	public static void main(String[] args) throws IOException
	{
		File f = new File("abc4.txt");
		f.createNewFile();
		File f1 = new File("abc1.txt");
		File f2 = new File("abc2.txt");
		FileReader fr = new  FileReader("abc1.txt");
		BufferedReader br = new BufferedReader(fr);
		FileReader fr1 = new FileReader("abc2.txt");
		BufferedReader br1 = new BufferedReader(fr1);
		PrintWriter pw = new PrintWriter(f);
		String ch = br.readLine();
		String ch1 = br1.readLine();
		while(ch!=null||ch1!=null)
		{
			if(ch!=null)
			{
				pw.println(ch);
				ch=br.readLine();
			}
			if(ch1!=null)
			{
				pw.println(ch1);
				ch1=br1.readLine();
			}
		}
		pw.flush();
		pw.close();
		br1.close();
		br.close();
	}
}