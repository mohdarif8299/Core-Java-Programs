import java.util.LinkedList;
import java.util.ListIterator;
class IteratorDemo
{
	public static void main(String... args)
	{
		LinkedList<String> al  = new LinkedList<String>();
		al.add("Hello");
		al.add("World");
		System.out.println(al);
		ListIterator i = al.iterator();
		while (i.hasNext())
		{
			if("World".equals(i.next()))
			{
				i.add("Arif");
			}
		}
		System.out.println("After adding");
		System.out.println(al);
	}
}