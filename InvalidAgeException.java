import java.util.Scanner;
class MyException extends Exception{
	MyException(String s)
	{
		super(s);
	}
}
class InvalidAgeException implements Runnable{

    public void run(){
     boolean condition=true;	
     try
		{
			while(condition){
			   condition=this.show();
			   System.out.println("Enter age of Next Voter");
			}
		}
		catch (Exception e)
		{
			System.out.println(e);
		}


    }

	boolean show() throws MyException
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
			return true;
		}

	}
	public static void main(String[] args)
	{
		Thread t=new Thread(new InvalidAgeException());
		t.start();
		
	}
}
