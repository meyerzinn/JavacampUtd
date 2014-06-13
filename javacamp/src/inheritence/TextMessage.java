package inheritence;

public class TextMessage extends Message {

	protected String text;

	public String getText() {
		return text;
	}

	public void setText(String t) {
		text = t;
	}

	public void printMessage() {
		System.out.println("Text Message text:" + text);
	}

	/*
	 * This is overloading method
	 */
	public void printMessgae(String str) {
		System.out.println("Text Message text:" + text + str);
	}

}
