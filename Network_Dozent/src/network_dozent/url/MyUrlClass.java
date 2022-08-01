package network_dozent.url;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class MyUrlClass {
	public static void getUrlInformation(String inurl) {
		try {
			URL url = new URL(inurl);
			System.out.println(url);
			System.out.println(url.getProtocol());
			System.out.println(url.getHost());
			System.out.println(url.getPort());
			System.out.println(url.getFile());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void readFromURL(String inurl) {
		try {
			URL url = new URL(inurl);
			InputStream is = url.openStream();
			Scanner scanner = new Scanner(is, StandardCharsets.UTF_8.name());
			System.out.println(scanner.useDelimiter("\\Z").next());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
