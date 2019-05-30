package playgroundUsers;

import java.util.ArrayList;

public class SockMerchantProblem {

	private static int sockMerchant(int n, int ar[]) {
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		
		for(int i=0;i<n;i++) {
			
			ar1.add(ar[i]);
			
		}
		
		int nrOfSocksPair = 0;
		
		for(int a=0;a<ar1.size();a++) {
			for(int j=a+1;j<ar1.size();j++) {
				
					if(ar1.get(a) == ar1.get(j)) {
						
						nrOfSocksPair++;
						
						ar1.remove(j);
						break;
						
					}
				
					
			}
			
		}
		
		
		
		return nrOfSocksPair;

	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int ar[] = {4,5,5,5,6,6,4,1,4,3,6,6,3,6,1,4,5,5,5};
			int n = ar.length;
			
			
			System.out.println(sockMerchant(n, ar));
			
			
		
	}

}
