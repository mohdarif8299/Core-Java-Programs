class test 
{ 
	void fun(int a,int k)
	{
        int x=a&(1<<(k-1));
		if(x==0)
		{
					System.out.println("unset");
		}
		else 
		{
					System.out.println("Set");
		}
		}
    public static void main(String[] args) 
	{
		test t =new test();
		t.fun(12,3);
	}
}
