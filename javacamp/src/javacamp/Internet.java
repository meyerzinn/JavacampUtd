package javacamp;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Internet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			URL url = new URL("http://example.com");
			URLConnection urlConnection = url.openConnection();
			urlConnection.connect();

			// System.out.println(urlConnection.getContentLength());

			Scanner webScraper = new Scanner(url.openStream());

			while (webScraper.hasNext()) {
				System.out.println(webScraper.nextLine());
			}

			webScraper.close();

		} catch (MalformedURLException e) {
			// new URL() failed
			// ...
		} catch (IOException e) {
			// openConnection() failed
			// ...
		}
	}

}
