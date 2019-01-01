import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Comparator;
public class SortedSetDemo
{
	public static void main(String[] args)
	{
		TreeSet s = new TreeSet(new SortById());
		s.add(new Student("Arif",10));
		s.add(new Student("Anas",12));
		System.out.println(s);
	}
}
class SortByName implements Comparator
{
	public int compare(Object o,Object o1){
	    Student s1 = (Student)o;
		Student s2 = (Student)o1;
		return s1.name.compareTo(s2.name);
	}
}
class SortById implements Comparator
{
	public int compare(Object o,Object o1)
	{
		Student s1 = (Student)o;
		Student s2 = (Student)o1;
		if (s1.id<s2.id)
		{
			return 1;
		}
		if (s1.id>s2.id)
		{
			return -1;
		}
		else {
			return 0;
		}
	}
}
class Student
{
	String name;
	int id;
	public Student(String name,int id)
	{
		this.name = name;
		this.id = id;
	}
	public String toString()
	{
		return this.name+this.id;
	}
}