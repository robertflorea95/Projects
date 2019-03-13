package Playground;

public class MyThread implements Runnable{
	
	String name;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread myThread = new Thread();
		myThread.setName("Jenny");
		
		Thread t2 = new Thread();
		t2.setName("from the block");
		
		int i = 0;
		
		while (i < 10) {
			myThread.run();
			
			t2.run();
			
			try {
				t2.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			i++;
		}
		
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Mesaj");
	}

	



}
