class MyThread1 extends Thread	{
	public void run() {
		show();
	}
	public synchronized void show() {
		for(int i=0;i<5;i++)
			System.out.println("Show Method");
		notify();
		System.out.println("Heloo");
	}
}
class MyThread	{
	public static void main(String... args) {
		MyThread1 t = new MyThread1();
		t.start();
		synchronized (t) {
			for(int i=0;i<4;i++) {
				System.out.println("Main Method");
				try
				{
					t.wait();
				}
				catch (InterruptedException e)
				{
				}
				System.out.println("After joining of Another Thread");
			}
		}
	}
}