import java.io.*;
class FileExtraction
{
  public static void main(String[] args) throws IOException
  {
	int x=0,y=0,i=0,j=0,z=0;
    File f1=new File("abc.txt");
	f1.createNewFile();
    PrintWriter pw1=new PrintWriter(f1);
    pw1.println("abc");
    pw1.println("123");
    pw1.println("xyz");
    File f2=new File("pqr.txt");
	f2.createNewFile();
    PrintWriter pw2=new PrintWriter(f2);
    pw2.println("def");
    pw2.println("abc");
    pw2.println("pqr");
    FileReader fr1=new FileReader(f1);
    BufferedReader br1=new BufferedReader(fr1);
    FileReader fr2=new FileReader(f2);
    BufferedReader br2=new BufferedReader(fr2);
    String line1=br1.readLine();
    String line2=br2.readLine();
    String a[]=new String[3];
    String b[]=new String[3];
    while(line1!=null)
    {
      a[i]=line1;
      i++;
      line1=br1.readLine();
    }
    while(line2!=null)
    {
      b[j]=line2;
      j++;
      line2=br2.readLine();
    }	
    File f3=new File("result.txt");
	f3.createNewFile();
    PrintWriter pw=new PrintWriter(f3);
    for(x=0;x<3;x++)
    {
      z=0;
	 for(y=0;y<3;y++)
			{
		    
			     try
			     {
					 if(a[x]==(b[y]))
			        {
				  z+=1;
			        }
			     }
			     catch (NullPointerException e)
			     {
			     }
			}
      if(z==0)
      {
        pw.println(line1);
      }
    }
     for(y=0;y<3;y++)
     {
       pw.println(line2);
     }
	   pw1.close();
	   pw2.close();
	   pw.close();
   }
}