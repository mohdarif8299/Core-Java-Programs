import java.io.*;
class MyFile4
{
	public static void main(String[] args) throws IOException
	{
		File f = new File("File");
		int count = 0;
		String [] s = f.list();
		for(String s1:s)
		{
			count++;
			System.out.println(s1);
		}
		File f1 = new File("File","abc1.txt");
		File fnew = new File("File","Output.txt");
		fnew.createNewFile();
		FileReader fr1 = new FileReader(f1);
		BufferedReader br1 = new BufferedReader(fr1);
		PrintWriter pw = new PrintWriter(fnew);
		String file1 = br1.readLine();
		while(file1!=null)
		{
			pw.println(file1);
			file1=br1.readLine();
		}
		pw.close();
		File f2 = new File("File","abc2.txt");
		FileReader fr2 = new FileReader(f2);
		BufferedReader br2 = new BufferedReader(fr2);
		FileWriter fw1 = new FileWriter(fnew,true);
		BufferedWriter bw1 = new BufferedWriter(fw1);
		PrintWriter pw2 = new PrintWriter(bw1);
		String file2 = br2.readLine();
		while(file2!=null)
		{
			pw2.println(file2);
			file2=br2.readLine();
		}
		pw2.close();
		File f3 = new File("File","abc3.txt");
		FileReader fr3 = new FileReader(f3);
		BufferedReader br3 = new BufferedReader(fr3);
		FileWriter fw2 = new FileWriter(fnew,true);
		BufferedWriter bw2 = new BufferedWriter(fw2);
		PrintWriter pw3 = new PrintWriter(bw2);
		String file3 = br3.readLine();
		while(file3!=null)
		{
			pw3.println(file3);
			file3=br3.readLine();
		}
		pw3.close();
	}
}