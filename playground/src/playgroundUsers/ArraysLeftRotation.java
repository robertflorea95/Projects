package playgroundUsers;

public class ArraysLeftRotation {

	static int[] rotLeft(int[] a, int d) {
		
		if(d != 0) {
				
				d %= a.length;
				
				int[] ret = new int[a.length];
				
				for(int i = 0;i<a.length;i++) {
					
					ret[i] = a[(i+d) % a.length];
					
			}
				return ret;
			
			
    }else return a;
		

}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1, 2, 3, 4, 5};
		
		int d = 4;
		
		int arr[] = rotLeft(a,d);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
	}

}
