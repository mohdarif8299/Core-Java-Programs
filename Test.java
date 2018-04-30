import java.util.TreeSet;
import java.util.Comparator;
class Test
{
	public static void main(String... args) 
	{
		TreeSet<StringBuffer> t = new TreeSet<StringBuffer>(new MyCompare());
		t.(String)add("ABC");
		t.add("AB");
		t.add("A");
		t.add("ABCD");
		t.add("EFGH");
		t.add("BCDE");
		System.out.println(t);
	}
}
class MyCompare implements Comparator<StringBuffer>
{
	public int compare(StringBuffer s,StringBuffer s1) {
		if (s.length()>s1.length())
		{
			return +1;
		}
		else if (s.length()<s1.length())
		{
			return -1;
		}
		else if (s.length()==s1.length()||s.equals(s1))
		{
				return s.compareTo(s1);
		}
		return 0;
	}
}