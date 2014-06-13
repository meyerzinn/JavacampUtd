package inheritence;

public class OverridingTest {

	public static void main(String[] args) {

		/*
		Message message = new Message();
		message.setMaxSize(1000);
		message.setTimestamp(System.currentTimeMillis());
	    */
		
		//Message message = new Message();
		Message message = new TextMessage();
		
		message.setMaxSize(10000);
		message.setTimestamp(System.currentTimeMillis());
		
		message.printMessage();

	}

}
