package inheritence;

public class InheritenceTest {

	public static void main(String[] args) {
		
		//This is a superclass object
		Message message = new Message();		
		message.timestamp = System.currentTimeMillis();
				
		//This is a subclass object
		TextMessage textMessage = new TextMessage();
				
		// Inherited property from the super class 'Message'	
		textMessage.timestamp = System.currentTimeMillis();
		textMessage.text = "A simple message";
		textMessage.maxSize = 100000000000L;
		
		//Inherited method from the super class Message
		System.out.println(textMessage.getTimestamp());		
		System.out.println(textMessage.getText());
		System.out.println(textMessage.getMaxsize());
		
	}

}
