class MyThread1 extends Thread {
	MyThread1() {
		System.out.println("My Thread");
	}
	public void run() {
		System.out.println("bar");
	}
	public void run(String s) {
		System.out.println("baz");
	}
}
class ClassTestThreads {
	public static void main(String... args) {
		Thread t = new MyThread1() {
			public void run() {
				System.out.println("foo");
			}
		};
		t.start();
	}
}