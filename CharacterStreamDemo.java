import java.io.*;
public class CharacterStreamDemo
{
	public static void main(String[] a) throws Exception
	{
		char ch[] = {'A','R','I','F'};
		FileInputStream fis = new FileInputStream("data.sat");
		FileOutputStream fos = new FileOutputStream("copy.txt");
		try
		{
			int i;
			while((i=fis.read())!=-1)
			{
				fos.write((char)i);
			}
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}