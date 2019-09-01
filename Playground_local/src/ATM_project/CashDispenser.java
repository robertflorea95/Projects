package ATM_project;

public class CashDispenser {

	private final static int INITIAL_COUNT = 500;
	private int count;
	
	public CashDispenser() {
		count = INITIAL_COUNT;
	}
	
	public void dispenseCash(int amount) {
		// TODO Auto-generated method stub
		int billsRequired = amount / 20;
		count -= billsRequired;
		
	}

	public boolean isSufficientCashAvailable(int amount) {
		// TODO Auto-generated method stub
		
		int billsRequired = amount / 20;
		
		if(count >= billsRequired) {
			return true;
		}
		else {
			return false;
		
		}
	}

}
