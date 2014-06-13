import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * This class represents the Worker
 * 
 * @author
 */
public class Worker implements Runnable {

	private final int index;
	private final Socket socket;

	/**
	 * 
	 * @param index
	 * @param socket
	 */
	public Worker(int index, Socket socket) {
		this.index = index;
		this.socket = socket;
	}

	/**
	 * Thread start execute from here
	 */
	@Override
	public void run() {

		System.out.println("Processing connection " + index);

		PrintWriter out = null;
		Scanner in = null;

		try {

			out = new PrintWriter(socket.getOutputStream(), true);
			in = new Scanner(socket.getInputStream());

			// Wait for incoming requests
			MessageLoop: while (in.hasNextLine()) {
				// Request are of form "MessageType,UserName,text"
				String[] requestTokens = in.nextLine().split(",");
				switch (Integer.parseInt(requestTokens[0])) {
				case 1: {
					System.out.println(requestTokens[1] + " says: "
							+ requestTokens[2]);
					break;
				}
				case 2: {
					break MessageLoop;
				}
				}
				out.flush();
			}
		} catch (IOException ex) {

		} finally {
			if (out != null) {
				out.close();
			}
			if (in != null) {
				in.close();
			}
		}
	}
}
