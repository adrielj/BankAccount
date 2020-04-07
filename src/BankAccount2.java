
public class BankAccount2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount mySavings = new BankAccount(1000.00);
		
		mySavings.withdraw(1001);
		
		mySavings.deposit(999);
		
		System.out.println(mySavings.getBalance());
		
		
		
	}

}
