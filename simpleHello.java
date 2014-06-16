/**
 * The simpleHello class implements an application that simply displays
 * "Hello World!" to the standard output.
 * 
 * Print Y Combinator's Hacker News in JSON format using iHackerNews.com API
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

class simpleHello {
	public static void main(String[] args) {
		System.out.println("Hello World!"); // Display the string.
		String urlText = "http://api.ihackernews.com/page";
		BufferedReader in = null;
		try {
			URL url = new URL(urlText);
			in = new BufferedReader(new InputStreamReader(url.openStream()));
			String inputLine;
			while ((inputLine = in.readLine()) != null) {
				System.out.println(inputLine);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}