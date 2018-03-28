interface Interfac1
{
	void show();
	void display();
}
interface Interface2 extends Interface1
{
	void show();
	void display();
}
class Test implements Interface1,Interface2
{
	void show()
	{
		System.out.println("Show");
	}
	void display()
	{
		System.out.println("Display");
	}
	public static void main(String[] args)
	{
		Interface i=new Test();
		i.show();
		i.display();
	}
}