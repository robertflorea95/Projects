package playgroundUsers;

import java.util.ArrayList;
import java.util.Scanner;

public class CountingValleys {
	
	public static int countingValleys(int n, String s) {
		
		int seaLevel = 0, nrOfValleys = 0;
		
		char[] path = s.toCharArray();
		
		for(int i=0;i<n;i++) {
			
			if(path[i]=='U') {
				
				seaLevel++;
				if(seaLevel == 0) {
					
					nrOfValleys++;
					
				}
				
			}else {
				seaLevel--;
				/*if(seaLevel < 0) {
					
					nrOfValleys++;
					
				}*/
				
			}
			
		}
		
		return nrOfValleys;
		
	}
	
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce the path:");
		
		String s = input.next();
		
		int n =s.length();
		
		System.out.println(countingValleys(n,s));
		
		
		
	}

}
