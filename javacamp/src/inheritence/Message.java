package inheritence;

/*
 * 
 * This is super class
 */
public class Message {

	// private variables cannot be inherited in the subclass
	// protected variables can be intherited in the subclass
	protected long timestamp;
	protected long maxSize;

	// This method sets or assigns the argument time to the class variable
	// timestamp
	public void setTimestamp(long time) {
		timestamp = time;
	}

	// This method sets or assigns the argument time to the class variable
	// maxSize
	public void setMaxSize(long max) {
		maxSize = max;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public long getMaxsize() {
		return maxSize;
	}

	public void printMessage() {
		System.out.println("Message Timestamp:" + timestamp);
		System.out.println("Message MaxSize:" + maxSize);
	}
}
