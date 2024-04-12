package ch11;

class InsufficientException extends Exception{
	public InsufficientException () {}
	
		
	public InsufficientException (String message) {
		super(message);
		}
	}

class Account{
	private long balance;
	
	public Account() {}
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) throws InsufficientException {
		if(balance < money) {
			throw new InsufficientException("잔고 부족 "+(money-balance)+"모자람");
		}
		balance -= money;
	}
}

public class AccountEx {

	public static void main(String[] args) {
		
		Account account = new Account();
		
		account.deposit(10000);
		System.out.println("예금액: "+account.getBalance());
		
		try {
			account.withdraw(30000);
		}catch(InsufficientException e) {
			 
			System.out.println(e.getMessage());
		}

	}

}
