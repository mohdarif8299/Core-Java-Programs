class Swap
{
	void fun()
	{
		int a=50,b=11;
		b=a^b;
		a=a^b;
		b=a^b;
		System.out.println(a);
	    System.out.println(b);

	}
	public static void main(String[] argv)
	{
		Test t= new Test();
		t.fun();
	}
}