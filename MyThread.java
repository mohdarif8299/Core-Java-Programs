class MyThread implements Runnable
{
	public void run()
	{
		for (int i=0;i<10;i++)
		{
			System.out.println("run()");
		}
	}
	public static void main(String... args) throws InterruptedException
	{
		Thread th = new Thread(new MyThread());
		th.start();
		for (int i=0;i<10;i++)
		{
			System.out.println("main()");
		}
	}
}