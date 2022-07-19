package xml_beispiele_dozent.xml_read;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class ReadXMLSaxParser {
	// SAX = Simple API for XML
	
	public static void printXMLBySax(String filename) {
		SAXParserFactory factory = SAXParserFactory.newInstance();
		
		try {
			SAXParser saxParser = factory.newSAXParser();
			
			/*
			 * Der SAXHandler wird benötigt um die folgenden SAX Events zu behandlen:
			 * startDocument()
			 * endDocument()
			 * startElement()
			 * endElement()
			 * characters()
			 *
			 * Diese Events werden beim parsen der XML aufgerufen.
			 */
			saxParser.parse(filename, new PrintAllHandlerSAX());
			
			
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
