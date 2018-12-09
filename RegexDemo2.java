import java.util.regex.*;
public class RegexDemo2
{
	public static void main(String[] ar)
	{
		System.out.println(Pattern.matches("[a-z&&[def]]","f"));
	}
}