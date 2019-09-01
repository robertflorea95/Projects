package playground;

public class test implements sumMethods {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		test t = new test();
		
		System.out.println(t.sum("1","2"));
		
	}

	@Override
	public int sum(String a, String b) {
		// TODO Auto-generated method stub
		int nr1 = Integer.parseInt(a);
		int nr2 = Integer.parseInt(b);
		
		return nr1 + nr2;
	}

}
