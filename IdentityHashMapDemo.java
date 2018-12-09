import java.util.*;
public class IdentityHashMapDemo
{
	public  static void main(String[] srhx)
	{
		IdentityHashMap m = new IdentityHashMap();
		m.put(new Integer(10),"First");
		m.put(new Integer(10),"Second");
		System.out.println(m);
	}
}