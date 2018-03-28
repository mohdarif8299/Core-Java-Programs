class Address
{
	int b;
	public Address()
	{
		b=10;
		System.out.println("Address Constructor");
	}

}
class OuterClass 
{
	Address a;
	int x;
	public OuterClass(Address a)
	{
		System.out.println("OuterClass Constructor");
		System.out.println(a.b);
	}
	public static void main(String[] args)
	{
		Address a = new Address();
		OuterClass o = new OuterClass(a);
	}
}