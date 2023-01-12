package practice;

public class BankAccount {

	//필드
	private String accNo;
	private long balance;

	
	// 생성자
	public BankAccount(String accNo, long balance) {
		this.accNo = accNo;
		this.balance = balance;
	}
	
	// 메소드(입급, 출금, 이제, 조회)
	
	// 입금 (마이너스 입금 불가 처리)
	public void deposit(long money) {
		
		}
	// 출금 (잔액보다 큰 출금 불가 처리)
	public long withdrawal(long money) {
		
		
	}
	// 이체
	public void transfer(BankAccount other, long money) {
		
	}
	// 조회
	public void inquiry( ) {
		System.out.println("계좌번호:" + accNo);
		System.out.println("잔액 : " + balance + "원");
	}
}


