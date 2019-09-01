package ATM_project;

public class Screen {

	public void displayMessageLine(String string) {
		
		System.out.println(string);
		
	}
	
	public void displayMessage(String message) {
		System.out.print(message);
		
	}
	
	public void displayDollarAmount(double amount) {
		System.out.printf("$%,.2f",amount);
	}

}
