package playgroundUsers;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nr = 54321;
		long reversed = 0;
		
		while(nr!=0) {
			
			reversed = reversed * 10 + nr % 10;
			
			nr /= 10;
			
			if(reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
				
				System.out.print("0");
				
			}
			
		}		
		
		System.out.print(reversed);

	}

}
