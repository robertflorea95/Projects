package playgroundUsers;

public class RepeatedString {
	
	static long repeatedString(String s, long n) {
		
		long occurences = 0;
		
		long repeat = n/s.length();
		
		long remainder = n%s.length();
		
		for (char c: s.toCharArray()) {
			
			if(c == 'a') {
				occurences++;
			}
			
		}
		
		occurences = occurences*repeat;
		
		for(int i=0;i<remainder;i++) {
			if(s.charAt(i)=='a') {
				
				occurences++;
				
			}
			
		}
		
		return occurences;

    }
	
	public static void main(String[] args) {
		
		String s ="aba";
		
		//String s ="a";
		
		long n = 10;
		
		System.out.println(repeatedString(s,n));
		
		
	}
	
}
