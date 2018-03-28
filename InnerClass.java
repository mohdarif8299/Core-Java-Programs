interface I1
{
	void fun();
	interface I2
	{
		void show();
	}
}
class InnerClass implements I1.I2,I1
{
	public void show()
	{
		System.out.println("Show method");
	}
	public void fun()
	{
		System.out.println("fun method");
	}
	public static void main(String[] args)
	{
		I1.I2 i = new InnerClass();
		i.show();
		I1 i1 = new InnerClass();
		i1.fun();
	}
}