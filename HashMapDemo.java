import java.util.*;
public class HashMapDemo
{
	public  static void main(String[] srhx)
	{
		HashMap m = new HashMap();
		Test t1 = new Test("Hello");
		Test t2 = new Test("World");
		m.put(t1,"First");
		m.put(t2,"Second");
		System.out.println(m);
		System.out.println(m.size());
		System.out.println(t1.equals(t2));
		System.out.println(t1);
		System.out.println(t2);
	}
}
class Test
{
	String newS;
	Test (String s)
	{
		this.newS = s;
	}
	public boolean equals(Object o)
	{
		return true;
	}
	public int hashCode()
	{
		return 9;
	}
}