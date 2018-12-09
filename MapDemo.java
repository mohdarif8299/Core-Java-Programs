import java.util.*;
public class MapDemo 
{
	public static void main(String[] args)
	{
		Map<Test,String> m = new HashMap<Test,String>();
		Test t1 = new Test("Hello");
		Test t2 = new Test("Hello");
		Test t3 = new Test("Hello");
		m.put(t1,"doLaundry");
		m.put(t2,"payBills");
		m.put(t3,"cleanAttic");
		System.out.println(m);
		System.out.println(m.size());
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(m.get("t3"));
		}
}
class Test
{
	String s;
	Test(String o)
	{
    this.s = o;
	}
	public int hashCode()
	{
		return 9;
	}
}