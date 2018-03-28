class Account	{
	private int balance = 50;
	public int getBalance() {
		return balance;
	}
	public void withDraw(int amount) {
		balance = balance - amount;
	}
}
public class AccountDanger implements Runnable	{
	private Account acc = new Account();
	public static void main(String... args) {
		AccountDanger r = new AccountDanger();
		Thread one = new Thread(r);
		Thread two = new Thread(r);
		one.setName("Fred");
		two.setName("Lucy");
		one.start();
		two.start();
	}
	public void run()	{
		for (int i=0;i<5;i++)	{
			makeWithdrawl(10);
			if(acc.getBalance()<0) {
				System.out.println("account is over drawn!");
				}
			}
		}
		private void makeWithdrawl(int amount) {
			if(acc.getBalance>=amount) {
				System.out.println(Thread.currentThread().getName()+"is going to withdraw");
				try	{
					Thread.sleep(500);
				}
				catch (InterruptedException e){ }
				accc.withdraw(amount);
				System.out.println(Thread.currentThread().getName()+"completes the withdraw");
			}
			else {
				System.out.println("Not enough Money for "+Thread.currentThread().getName());
			}
	}
}