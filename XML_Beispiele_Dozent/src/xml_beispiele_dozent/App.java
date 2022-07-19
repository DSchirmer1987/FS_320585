package xml_beispiele_dozent;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Paths;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;

import org.xml.sax.SAXException;

import xml_beispiele_dozent.xml_read.ReadXMLSaxParser;
import xml_beispiele_dozent.xml_read.ReadXMLStAXCursorParser;
import xml_beispiele_dozent.xml_read.ReadXMLStAXEventParser;
import xml_beispiele_dozent.xml_read.ReadXML_DOMParser;
import xml_beispiele_dozent.xml_write.WriteXMLStAXCursor;

public class App {

	public static void main(String[] args) {
		/*
		 * Lesen von XML
		 */
//		try {
//			ReadXMLStAXCursorParser.printXMLByXMLCursorReader(Paths.get("resources/beispiel.xml"));
//			ReadXMLStAXEventParser.printXMLByXMLEventParser(Paths.get("resources/beispiel.xml"));
//			ReadXML_DOMParser.printXMLByDOM("resources/beispiel.xml");
//			ReadXMLSaxParser.printXMLBySax("resources/beispiel.xml");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (XMLStreamException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (ParserConfigurationException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SAXException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		/*
		 * Schreiben von XML
		 */
		try {
			WriteXMLStAXCursor.writeXML(new FileOutputStream("resources/STAXCursor.xml"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (XMLStreamException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
