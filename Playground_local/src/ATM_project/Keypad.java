package ATM_project;

import java.util.Scanner;

public class Keypad {
	private Scanner input;
	
	public Keypad() {
		input = new Scanner(System.in);
	}
	
	public int getInput() {
		
		return input.nextInt(); //we assume that user enter an integer
	}

}
