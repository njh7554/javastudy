package practice;

public class MainClass {

	public static void main(String[] args) {
		
		BankAccount myAcc = new BankAccount("010-8622-0710", 50_000);
		BankAccount yourAcc = new BankAccount("010-1234-5678", 100_000);
		
		myAcc.transfer(yourAcc, 50_000);
		
		myAcc.inquiry();
		yourAcc.inquiry();
	}

}
