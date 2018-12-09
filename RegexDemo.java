import java.util.regex.*;
public class RegexDemo
{
	public static void main(String[] a)
	{
		Pattern p = Pattern.compile(".aa");
		Matcher m = p.matcher("saa");
		boolean b = m.matches();
		System.out.println(b);
	}
}