package threads;

public class ThreadTest {

	public static void main(String[] args) {

		// This is our main thread starting point

		Thread2 thread2 = new Thread2();
		thread2.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("Thread Main.. printing");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		try {
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Thread Main is finished");

	}

}
