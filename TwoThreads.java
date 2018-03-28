public class TwoThreads	{
	static Thread laurel,hardy;
	public static void main(String... args) {
		laurel = new Thread() {
			public void run() {
				System.out.println("A");
				try
				{
					hardy.sleep(1000);
				}
				catch (Exception e)	{ 
					System.out.println("B");
				}
				System.out.println("C");
			}
		};
		hardy = new Thread() {
			public void run() {
				System.out.println("D");
				try
				{
					laurel.wait();
				}
				catch (Exception e) {
					System.out.println("E");
				}
				System.out.println("F");
			}
		};
		laurel.start();
		hardy.start();
	}
}