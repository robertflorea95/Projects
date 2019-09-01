package ATM_project;

public class ATM {
	
	private boolean userAuthenticated;
	private int currentAccountNumber;
	private Screen screen;
	private Keypad keypad;
	private CashDispenser cashDispenser;
	private DepositSlot depositSlot;
	private BankDatabase bankDatabase;
	
	//constants corresponding to the main menu options
	private static final int BALANCE_INQUIRY = 1;
	private static final int WITHDRAWAL = 2;
	private static final int DEPOSIT = 3;
	private static final int EXIT = 4;
	
	//constructor with no arguments
	public ATM() {
		userAuthenticated = false;
		currentAccountNumber = 0;
		screen = new Screen();
		keypad = new Keypad();
		cashDispenser = new CashDispenser();
		depositSlot = new DepositSlot();
		bankDatabase = new BankDatabase();
		
	}
	
	//start the ATM
	
	public void run() {
		while(true) {
			
			while(!userAuthenticated) {
				
				screen.displayMessageLine("\nWelcome!");
				authenticateUser();  //authenticate the user
			}
			
			performTransactions();
			userAuthenticated = false;	//reset before next ATM session
			currentAccountNumber = 0; //reset before the next ATM session
			screen.displayMessageLine("\nThank you! Goodbye!");
			
		}
	}


	private void authenticateUser() {
				
		screen.displayMessageLine("\nPlease enter your account number:");
		int accountNumber = keypad.getInput(); //enter the account number
		screen.displayMessageLine("\nEnter your PIN number:");
		int pin = keypad.getInput(); //enter the PIN number
 		
		userAuthenticated = bankDatabase.authenticateUser(accountNumber, pin);
		
		//check whether authentication succeeded
		if(userAuthenticated) {
			currentAccountNumber = accountNumber;	//save user's account number

		}
		else {
			screen.displayMessageLine("Invalid account number or PIN. Please try again");
			
		}
		
	}
	
	private void performTransactions() {
		
		Transaction currentTransaction = null;
		
		boolean userExited = false; //the user is still logged in and has not chosen to exit
		
		while(!userExited) {
			
			int mainMenuSelection = displayMainMenu(); //display the menu
			
			switch (mainMenuSelection) {
			
			case BALANCE_INQUIRY:
			case WITHDRAWAL:
			case DEPOSIT:
				currentTransaction = createTransaction(mainMenuSelection);
				currentTransaction.execute();
				break;
			case EXIT:
				screen.displayMessageLine("\nExiting the system...");
				userExited = true;
				break;
			default:
				screen.displayMessageLine("\nYou did not enter a valid transaction.\nTry again.");
				break;
				
			}
		}
		
	}

	private Transaction createTransaction(int mainMenuSelection) {
		
		Transaction temp = null; //temporary transaction
		
		switch(mainMenuSelection) {
		
		case BALANCE_INQUIRY:
			temp = new BalanceInquiry(currentAccountNumber, screen, bankDatabase);
			break;
		case WITHDRAWAL:
			temp = new Withdrawal(currentAccountNumber, screen, bankDatabase, keypad, cashDispenser);
			break;
		case DEPOSIT:
			temp = new Deposit(currentAccountNumber, screen, bankDatabase, keypad, depositSlot);
			break;
		
		}
		
		return temp;
	}

	private int displayMainMenu() {
		// TODO Auto-generated method stub
		screen.displayMessageLine("\nMain menu:");
		screen.displayMessageLine("1 - View my balance");
		screen.displayMessageLine("2 - Withdraw cash");
		screen.displayMessageLine("3 - Deposit funds");
		screen.displayMessageLine("4 - Exit\n");
		screen.displayMessage("Enter a choice:");
		return keypad.getInput();
	}

}
