import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * @author
 */
public class Server {
	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {

		ServerSocket serverSocket = null;
		try {
			System.out.println("Creating server... ");
			// Port number
			int port = Integer.parseInt(args[0]);
			// Create and start server
			serverSocket = new ServerSocket(port);

			System.out.println("Server started: listening on port " + port);

			int count = 0;
			while (true) {
				Socket clientSocket = serverSocket.accept();
				System.out.println("Connection " + ++count + " accepted");
				new Thread(new Worker(count, clientSocket)).start();
			}

		} catch (FileNotFoundException ex) {
			System.out.println("Exception occurred:" + ex.getMessage());
		} catch (IOException ex) {
			System.out.println("Exception occurred:" + ex.getMessage());
		}

	}
}
