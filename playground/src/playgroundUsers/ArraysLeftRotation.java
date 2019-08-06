package playgroundUsers;

import java.util.ArrayList;

public class ArraysLeftRotation {

	static int[] rotLeft(int[] a, int d) {
		int rotate = 0;
		int firstElement = 0;
		if(d != 0) {
			
			while(rotate < d) {
				
				firstElement = a[0];
				
				for(int i = 0;i<a.length;i++) {
					
					if((i+1) != a.length) {
						a[i] = a[i+1];
					}
					else {
						a[a.length-1]=firstElement;
					}
			}
				rotate++;
		}
			return a;
			
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
