package Playground;

public class MyThread implements Runnable{
	
	String name;
	
	public MyThread(String s) {
		// TODO Auto-generated constructor stub
		
		this.name = s;
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		int i = 0;
		
		while (i < 10) {
			
			System.out.println(name+ " " + i);
			
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			i++;
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		MyThread r = new MyThread("runnable");
		
		MyThread r2 = new MyThread("r2");
		
		Thread t2 = new Thread(r2);
		
		Thread t1 = new Thread(r);
		
		//t1.start();
		
		t2.run();
		
	}


}
