import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {

	/**
	 * Send message to the server
	 * 
	 */
	public static void sendMessage(PrintWriter out, Scanner in, String message) {
		out.append(message);
		out.println();
		out.flush();
	}

	/**
	 * Send exit message to server
	 * 
	 */
	public static void exit(PrintWriter out, Scanner in) {
		out.append("2");
		out.println();
		out.flush();
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {

		// Logical operators
		if (args == null || (args.length != 3)) {
			System.out.println("Run as : java Client host port userName");
			System.exit(-1);
		}

		// Read server information
		String host = args[0];
		System.out.println("Connecting to server: " + host);
		int port = Integer.parseInt(args[1]);
		System.out.println("Connecting to port: " + port);
		String userName = args[2];

		System.out.println("Welcome:" + userName);

		// Input,Output
		PrintWriter out = null;
		Scanner in = null;

		try {
			// Get socket connection to server
			Socket socket = new Socket(host, port);

			// Input,output to socket streams
			// Create a PrintWriter object by giving it the sockets output
			// stream
			// sockets output stream is used to send text out of the socket
			out = new PrintWriter(socket.getOutputStream(), true);

			// Create a Scanner object by giving it the sockets input stream
			// sockets input stream is used to read text from the socket
			in = new Scanner(socket.getInputStream());

			while (true) {
				// Check for input
				Scanner input = new Scanner(System.in);

				while (input.hasNextLine()) {

					String inputLine = input.nextLine();

					if (inputLine.equals("exit")) {

						System.out.println("Exiting chat...");
						exit(out, input);
						System.exit(0);

					} else {

						String message = "1" + "," + userName + ","
								+ inputLine;
						sendMessage(out, input, message);
					}
				}
				break;
			}

		} catch (IOException ex) {

			System.out.println("Error occurred:" + ex.getMessage());

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
