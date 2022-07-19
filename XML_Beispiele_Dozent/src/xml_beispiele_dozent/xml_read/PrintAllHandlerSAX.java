package xml_beispiele_dozent.xml_read;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class PrintAllHandlerSAX extends DefaultHandler {
	
	private StringBuilder currentValue = new StringBuilder();

	@Override
	public void startDocument() throws SAXException {
		System.out.println("Start Document");
	}

	@Override
	public void endDocument() throws SAXException {
		System.out.println("End Document");
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		currentValue.setLength(0);
		
		System.out.println("Start Element: " + qName);
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		System.out.println("End Element: " + qName);
		
		if(qName.equalsIgnoreCase("name")) {
			System.out.println("Name: " + currentValue.toString());
		}
		if(qName.equalsIgnoreCase("price")) {
			System.out.println("Price: " + currentValue.toString());
		}
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		/*
		 * Es kann passieren dass die characters() Methode mehrmals bei Texten aufgerufen wird.
		 * 
		 * Daher verwenden wir einen StringBuilder mit der append() Methoden, damit keine Informationen 
		 * verloren gehen.
		 * 
		 * Bei z.b. currentValue = new String(ch, start, length) würde immer wieder der String überschrieben
		 * werden
		 */
		currentValue.append(ch, start, length);
	}
	
}
