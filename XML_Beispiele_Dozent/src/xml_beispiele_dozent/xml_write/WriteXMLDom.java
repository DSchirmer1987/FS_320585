package xml_beispiele_dozent.xml_write;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class WriteXMLDom {
	
	public static void writeXMLDom(String filename) {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = null;
		try {
			db = dbf.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Document doc = db.newDocument();
		
		Element rootElement = doc.createElement("Company");
		doc.appendChild(rootElement);
		
		Element staff = doc.createElement("Staff");
		rootElement.appendChild(staff);
		staff.setAttribute("id", "1001");
		Element name = doc.createElement("Name");
		name.setTextContent("Schirmer");
		staff.appendChild(name);
		
		try {
			FileOutputStream output = new FileOutputStream(filename);
			writeXML(doc, output);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private static void writeXML(Document doc, OutputStream output) {
		TransformerFactory tf = TransformerFactory.newInstance();
		try {
			Transformer transformer = tf.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(output);
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.transform(source, result);
		} catch (TransformerConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
