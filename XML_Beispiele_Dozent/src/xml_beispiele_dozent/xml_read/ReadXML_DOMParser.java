package xml_beispiele_dozent.xml_read;

import java.io.File;
import java.io.IOException;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ReadXML_DOMParser {
	
	public static void printXMLByDOM(String filename) throws ParserConfigurationException, SAXException, IOException {
		
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
		
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.parse(new File(filename));
		
		// Normaliesieren - Text Nodes werden korrekt gesetzt.
		doc.getDocumentElement().normalize();
		
		System.out.println("Root Element: " + doc.getDocumentElement().getNodeName());
		System.out.println("-----");
		
		// Knotenliste holen
		NodeList list = doc.getElementsByTagName("food");
		for(int i = 0; i < doc.getElementsByTagName("food").getLength(); i++) {
			//Einzelnen Knoten holen
			Node node = list.item(i);
			
			if(node.getNodeType() == Node.ELEMENT_NODE) {
				// Knoten zu einem Element umwandeln
				Element element = (Element) node;
				
				// Inhalt eines Elementes holen und abspeichern
				String name = element.getElementsByTagName("name").item(0).getTextContent();
				String price = element.getElementsByTagName("price").item(0).getTextContent();
				
				System.out.println("Name: " + name);
				System.out.println("Preis: " + price);
				System.out.println();
			}
		}
	}
}
