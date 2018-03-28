import java.io.*;
class NewFile
{
	public static void main(String... args) throws IOException
	{
		int i=0,j=0;
		PrintWriter pw = new PrintWriter("result.txt");
		BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
		String s1 = br.readLine();
		String[] a = new String[3];
		while (s1!=null)
		{
			a[i]=s1;
			i++;
			s1 = br.readLine();
		}
		int c = 0;
		BufferedReader br1 = new BufferedReader(new FileReader("pqr.txt"));
		String s2 = br1.readLine();
		String[] b = new String[3];
		while (s2!=null)
		{
			b[j] = s2;
			j++;
			s2 = br.readLine();
		}
		for (i=0;i<3;i++)
		{
			for (j=0;j<3;j++)
			{
				if(a[i]==b[j])
				{
					c=c+1;
				}
				else 
				{
				   c=0;
				}
			}
			if(c==0)
			{
				System.out.println(a[i]);
			}
		}
	}
}