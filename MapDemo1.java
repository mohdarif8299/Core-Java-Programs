import java.util.*;
public class MapDemo1
{
	public static void main(String[] args)
	{
		Map<Student,String> m = new HashMap<Student,String>();
		  Student s1 = new Student();
		  Student s2 = new Student();
		  Student s3 = new Student();
		  m.put(s1,"Monday");
		  m.put(s2,"Tuesday");
		  m.put(s3,"Friday");
		  System.out.println(m);
		  System.out.println(m.size());
		  System.out.println(s1.hashCode());
		   System.out.println(s2.hashCode());
		    System.out.println(s3.hashCode());
			System.out.println(s2.equals(s3));
	}
}
class Student extends Object
{
	public boolean equals(Object o)	{	return true;	}
	//public int hashCode()  {  return 10; }
}