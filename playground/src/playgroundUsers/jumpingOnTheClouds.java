package playgroundUsers;

import java.util.ArrayList;
import java.util.Scanner;

public class jumpingOnTheClouds {
	
	static int jumpingOnClouds(int[] c) {
		
		int nrOfJumps = -1;
				
		for(int i=0;i<c.length;i++,nrOfJumps++) {
						
				if(i<c.length-2 && c[i+2] == 0) {
					
						i++;					
				
				}
			
		}
		
		return nrOfJumps;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Introduce the number of clouds:");
		
		n = in.nextInt();
		
		int[] c = new int[n];
		
		//int[] c = {0,0,0,1,0,0};
		
		System.out.println("Introduce the clouds:");
		System.out.println("0 - cumulus");
		System.out.println("1 - thunderhead");
		
		for(int i=0;i<n;i++) {
			c[i] = in.nextInt();
		}
		
		
		int nrOfJumps = jumpingOnClouds(c);
		
		System.out.println(" The number of steps to win is: "+ nrOfJumps);
		
		
		
	}

}
