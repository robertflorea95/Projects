package playgroundUsers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class findElementInArray {

		static String findNumber(List<Integer> arr, int k) {
			
			String result = new String();
			
			Collections.sort(arr);
				
				if(arr.contains(k) == true) {
					
					result = "YES";
					
				}else {
					
					result = "NO";
					
				}
				
			return result;
			
			
		}
	
	
	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> arr = new ArrayList();
		
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		
		int k = 10;
		
		System.out.println(findNumber(arr,k));
		
		
		
		
	}

}
