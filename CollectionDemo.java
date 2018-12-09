import java.util.TreeSet;
import java.util.Comparator;
class MyComp implements Comparator
{
   public int compare(Object a,Object b)
	{
		String s1 = (String)a;
		String s2 = (String)b;
		if (s1.length()<s2.length())
		{
			return -1;
		}
		else if (s1.length()>s2.length())
		{
			return +1;
		}
		else if (s1.length()==s2.length())
		{
			return s1.compareTo(s2);
		}
		return 0;
	}
}
public class CollectionDemo
{
	public static void main(String... s) 
	{
		TreeSet t = new TreeSet(new MyComp());
		t.add("arif");
		t.add("sam");
		t.add("amil");
		t.add("irfan");
		t.add("umar");
		System.out.println(t);
	}
}