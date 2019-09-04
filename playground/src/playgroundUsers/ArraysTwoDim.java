package playgroundUsers;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ArraysTwoDim {
	
	static int hourglassSum(int[][] arr) {
		
		int sum = 0;
		int maxSum = Integer.MIN_VALUE;
		
		ArrayList<Integer> arrSum = new ArrayList();
		//int jj = 0;
		
		for(int i = 0; i < 4; i++) {
			
			for(int j = 0; j < 4; j++) {
				
				//if((j+2 < 6) && (i+2 < 6)) {
				
					sum = arr[i][j] + arr[i][j+1] + arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
					
					arrSum.add(sum);

					
				//}
				
			}
			
						
		}
		
		for(int iter = 0; iter<arrSum.size();iter++) {
			
			if(maxSum<arrSum.get(iter)) {
				
				maxSum = arrSum.get(iter);
				
			}
			
		}
		
		return maxSum;
		

    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr = new int[6][6];
		
		/*Scanner input = new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
			
				arr[i][j] = input.nextInt();
				
			}
			
		}*/
		
		arr[0][0] = 1;
		arr[0][1] = 1;
		arr[0][2] = 1;
		arr[0][3] = 0;
		arr[0][4] = 0;
		arr[0][5] = 0;
		
		arr[1][0] = 0;
		arr[1][1] = 1;
		arr[1][2] = 0;
		arr[1][3] = 0;
		arr[1][4] = 0;
		arr[1][5] = 0;
		
		arr[2][0] = 1;
		arr[2][1] = 1;
		arr[2][2] = 1;
		arr[2][3] = 0;
		arr[2][4] = 0;
		arr[2][5] = 0;
		
		arr[3][0] = 0;
		arr[3][1] = 0;
		arr[3][2] = 2;
		arr[3][3] = 4;
		arr[3][4] = 4;
		arr[3][5] = 0;
		
		arr[4][0] = 0;
		arr[4][1] = 0;
		arr[4][2] = 0;
		arr[4][3] = 2;
		arr[4][4] = 0;
		arr[4][5] = 0;
		
		arr[5][0] = 0;
		arr[5][1] = 0;
		arr[5][2] = 1;
		arr[5][3] = 2;
		arr[5][4] = 4;
		arr[5][5] = 0;
		
		int sum = hourglassSum(arr);
		
		System.out.print(sum);
		
		

	}

}
