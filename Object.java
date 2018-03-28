class Parent
{
	void show()
	{
		System.out.println("ParentClass");
	}
}
class Child extends Parent
{
	void show()
	{
		System.out.println("ChildClass");
	}
	public static void main(String[] args)
	{
		Parent p =new Child();
		Child c = (Child)p;
		c.show();
	}
}