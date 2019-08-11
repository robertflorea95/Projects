package ATM_project;

public class Withdrawal extends Transaction {
	
	private int amount;
	private Keypad keypad;
	private CashDispenser cashDispenser;
	
	
	private final static int CANCELED = 6;
	
	
	public Withdrawal(int userAccountNumber, Screen atmScreen, BankDatabase atmBankDatabase, Keypad atmKeypad, CashDispenser atmCashDispenser){
		
		super(userAccountNumber, atmScreen, atmBankDatabase);
		
		keypad = atmKeypad;
		
		cashDispenser = atmCashDispenser;
		
	}
	
	
	@Override
	public void execute() {
		
		boolean cashDispensed = false;
		double availableBalance = 0;
		
		BankDatabase bankDatabase = getBankDatabase();
		Screen screen = getScreen();
		
		do {
			amount = displayMenuOfAmounts();
			
			if(amount != CANCELED) {
				
				availableBalance = bankDatabase.getAvailableBalance(getAccountNumber());
			
				 if(amount <= availableBalance) {
					 if(cashDispenser.isSufficientCashAvailable(amount)) {
						 
						 bankDatabase.debit(getAccountNumber(), amount);
						
						 cashDispenser.dispenseCash(amount);
						 cashDispensed = true;
					 
						 screen.displayMessageLine("\nYour cash has been" + " dispensed. Please take your cash now.");
						 
					 }
				 
				 }
				 else {
					 
					 screen.displayMessageLine("\n Insufficient funds in your account." + "\n\n Please choose a smaller account");
					 
				 }
				 
			}
			else {
				screen.displayMessageLine("\n Cancelling transaction...");
				return;
			}
		
		}while (!cashDispensed);
		
	}

	private int displayMenuOfAmounts() {
		// TODO Auto-generated method stub
		int userChoice = 0;
		
		Screen screen = getScreen();
		
		int[] amounts = {0, 20, 40, 60, 100, 200};
		
		while(userChoice == 0) {
			
			screen.displayMessage("\nWithdrawal Menu:");
			screen.displayMessage("\n1 - $20");
			screen.displayMessage("\n2 - $40");
			screen.displayMessage("\n3 - $60");
			screen.displayMessage("\n4 - $100");
			screen.displayMessage("\n5 - $200");
			screen.displayMessage("\n6 - Cancel transaction");
			screen.displayMessage("\n Choose a withdrawal amount: ");
			
			int input = keypad.getInput();
			
			switch(input) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				userChoice = amounts[input];
				break;
			case CANCELED:
				userChoice = CANCELED;
				break;
			default:
				screen.displayMessageLine("\n Invalid selection. Try again.");
			}
			
		}
		
		return userChoice;
	}

}
