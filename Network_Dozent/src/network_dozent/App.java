package network_dozent;

import java.net.SocketException;

import network_dozent.sockets.MySocketClass;
import network_dozent.url.MyUrlClass;

public class App {

	public static void main(String[] args) {
		//URL Informationen
//		MyUrlClass.getUrlInformation("http://www.tutego.com");
		
		// Von URL lesen
//		MyUrlClass.readFromURL("http://www.tutego.de/javabuch/aufgaben/bond.txt");
		
		
		// Socket Informationen
//		MySocketClass.socketInformationen();
//		MySocketClass.inetInformation();
		
		try {
			MySocketClass.networkInterfaces();
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
