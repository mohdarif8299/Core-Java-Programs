import java.util.Scanner;
class TooYoungException extends RuntimeException
{
	TooYoungException(String s)
	{
		super(s);
	}
}
class TooOldException extends RuntimeException
{
	TooOldException(String s)
	{
		super(s);
	}
}
class ExceptionHandling
{
	public static void main(String[] args)
	{
		System.out.println("Enter your Age");
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		if(i<=25)
		{
			throw new TooYoungException("Not Eligible for Marriage");
		}
		else if (i>50)
		{
			throw new TooOldException("Overflow Age");
		}
		else 
			System.out.println("Congratulations!!!!");
	}
}