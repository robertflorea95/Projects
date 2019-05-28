package playgroundUsers;

public class SockMerchantProblem {

	private static int sockMerchant(int n, int ar[]) {
		
		int nrOfSocksPair = 0;
		
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				
				if(ar[i] == ar[j]) {
					
					nrOfSocksPair++;
					break;
					
				}
				
			}
			
			
		}
		
		
		
		return n;

	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int ar[] = {1,2,1,2,1,3,2};
			int n = ar.length;
			
			
			
		
	}

}
