package ATM_project;

public class Account {

	private int accountNumber;
	private int pin;
	private double availableBalance;
	private double totalBalance;
	
	public Account (int theAccountNumber, int thePIN, double theAvailableBalance, double theTotalBalance) {
		
		this.accountNumber = theAccountNumber;
		this.pin = thePIN;
		this.availableBalance = theAvailableBalance;
		this.totalBalance = theTotalBalance;
		
	}
	
	public boolean validatePIN (int userPIN) {
		
		if(userPIN == pin) {
			return true;
		}
		else return false;
		
	}
	
	public double getAvailableBalance() {
		
		return this.availableBalance;
		
	}
	
	public double getTotalBalance() {
		
		return this.totalBalance;
		
	}
	
	public void credit(double amount) {
		
		totalBalance += amount;
		
	}
	
	public void debit(double amount) {
		availableBalance -= amount;
		totalBalance -= amount;
	}
	
	public int getAccountNumber() {
		
		return accountNumber;
		
	}
	
}
