package playground;

import java.util.Scanner;

public class sumUpStrings  {

	public static String a;
	public static String b;
	
	public static int sum(String a, String b) {
		
		int nr1, nr2;
		
		nr1 = Integer.parseInt(a);
		
		nr2 = Integer.parseInt(b);
		
		return nr1+nr2;
		
		
	}
	
	static public void main(String args[]) {
		
		System.out.println("This program sums up two strings");
		
		System.out.println("Nr 1: ");
		
		
		Scanner in = new Scanner(System.in);
		
		a = in.nextLine();
		
		System.out.println("Nr 2: ");
		
		b = in.nextLine();
		
		int s = sum(a,b);
		
		System.out.println("The sum of "+ a +" and " + b + " is: " + sum(a,b));

	}
	
}

