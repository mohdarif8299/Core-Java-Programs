class Display	{
	public synchronized void wish(String name)	{
		for (int i=0;i<5;i++)	{
			System.out.println("Good Morning");
			try	{
				Thread.sleep(1000);
			}
			catch (InterruptedException ie)	{ }
			System.out.println(name);
		}
	}
}
class MyThread extends Thread	{
	Display d;
	String name;
	MyThread(Display d,String name) {
		this.d = d;
		this.name = name;
	}
	public void run() {
		d.wish(name);
	}
}
class SynchronizedMethod	{
	public static void main(String... args)	{
	Display d1 = new Display();
	MyThread t1 = new MyThread(d1,"Arif");
	MyThread t2 = new MyThread(d1,"Shirley");
	t1.start();
	t2.start();
	}
}