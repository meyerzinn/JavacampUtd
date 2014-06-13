package inheritence;

import java.io.File;

public class PolymorphismTest {

	public static void main(String[] args) {

		// Create a message object
		Message message = new Message();
		message.timestamp = System.currentTimeMillis();
		message.maxSize = 1000;

		// Create a text message object
		TextMessage tMessage = new TextMessage();
		tMessage.timestamp = System.currentTimeMillis();
		tMessage.maxSize = 140;
		tMessage.text = "I am a text message";
		

		// Create a file message object
		FileMessage fmessage = new FileMessage();
		fmessage.timestamp = System.currentTimeMillis();
		fmessage.maxSize = 1000;
		fmessage.text = "I am a file message";
		fmessage.file = new File("K:\\sample.txt");

		printMessage(fmessage);

	}

	public static void printMessage(Message message) {
		System.out.println(message.getTimestamp());
		System.out.println(message.getMaxsize());
	}

}
