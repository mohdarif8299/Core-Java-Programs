import java.util.Scanner;
class MyException extends Exception
{
	MyException(String s)
	{
		super(s);
	}
}
class InvalidAgeException
{
	void show() throws MyException
	{
		System.out.println("Enter your Age");
		Scanner s = new Scanner(System.in);
		int age = s.nextInt();
		if(age<18)
		{
			throw new MyException("not Eligible for voting");
		}
		else 
		{
			System.out.println("Please Vote!!");
		}
	}
	public static void main(String[] args)
	{
		InvalidAgeException i = new InvalidAgeException();
		try
		{
			i.show();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}