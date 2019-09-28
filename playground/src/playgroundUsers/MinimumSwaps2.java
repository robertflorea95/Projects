package playgroundUsers;

public class MinimumSwaps2 {

	static int minimumSwaps(int[] arr) {
		 
		 int swaps = 0;
		 
		 int right = arr.length - 1;
		 int left = 0;
		 
		 while (left < arr.length) {
			 
			 int arrValue = left+1;
			 
			 if(arr[left] == arrValue) {
				 
				 left++;
				 continue;
				 
			 }
			 
			 while(arr[right] != arrValue) {
				 
				 right--;
				 
			 }
			 
			 if(right != left) {
		 	 
				 int temp = arr[right];
				 arr[right] = arr[left] ;
				 arr[left] = temp;
				 
				 swaps++;
				 
			 }
			 
			 right = arr.length -1;
			 left++;

		 }
		 
		 return swaps;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int[] arr = {4, 3, 2, 1};
		
		int[] arr = {1,3,5,2,4,6,7};
		
		System.out.println(minimumSwaps(arr));

	}

}
