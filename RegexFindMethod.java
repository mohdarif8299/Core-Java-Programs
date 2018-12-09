import java.util.regex.*;
public class RegexFindMethod
{
	public static void main(String[] a)
	{
		String text = "This is reges in java";
		String input = "is";
		Pattern pattern = Pattern.compile(input);
		Matcher matcher = pattern.matcher(text);
		int count=0;
		while (matcher.find())
		{
			count++;
			System.out.println("Found "+count+ ": "+matcher.start()+" - "+matcher.end());
		}
	}
}