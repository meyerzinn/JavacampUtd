package threads;

public class Thread2 extends Thread{

	
	public void run(){

		for(int i=0;i<100;i++){
			
			System.out.println("Thread2.. printing");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
					
		}
		
		System.out.println("Thread2 is finished");
		
	}
}
