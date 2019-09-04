package playgroundUsers;

public class NewYearChaos {
	
	static void minimumBribes(int[] q) {
		
		for(int i = 0; i< q.length; i++) {
			
			if((q[i] - (i+1)) > 2) {
				
				System.out.println("Too chaotic");
				return;
				
			}
			
		}
		
		int bribes = 0;
		
		for (int i = 0;i < q.length-1; i++) {
			
			boolean swap = false;
			
			for(int j = 0; j<q.length-1; j++) {
				
				if (q[j] > q [j+1]) {
					
					int temp = q[j];
					q[j] = q[j+1];
					q[j+1] = temp;
					
					swap = true;
					bribes++;
					
				}
				
			}
			
			if(!swap) {
				
				break;
				
			}
			
		}
		
		System.out.println(bribes);
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] q = {1, 2, 5, 3, 7, 8, 6, 4};
		
		minimumBribes(q);

	}

}
