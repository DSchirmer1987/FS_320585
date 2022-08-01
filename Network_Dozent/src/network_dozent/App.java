package network_dozent;

import network_dozent.url.MyUrlClass;

public class App {

	public static void main(String[] args) {
		//URL Informationen
//		MyUrlClass.getUrlInformation("http://www.tutego.com");
		
		// Von URL lesen
		MyUrlClass.readFromURL("http://www.tutego.de/javabuch/aufgaben/bond.txt");
	}

}
