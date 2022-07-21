package xml_beispiele_dozent.xml_modify;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
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
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ModifyXMLDom {
	
	public static void modifyXML(String filename) {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		
		try {
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse(new File(filename));
			
			NodeList listOfStaff = doc.getElementsByTagName("Staff");
			
			for(int i = 0; i< listOfStaff.getLength(); i++) {
				Node staff = listOfStaff.item(i);
				if(staff.getNodeType() == Node.ELEMENT_NODE) {
					String id = staff.getAttributes().getNamedItem("id").getTextContent();
					if("1002".equals(id.trim())) {
						NodeList childs = staff.getChildNodes();
						for(int j = 0; j<childs.getLength(); j++) {
							Node item = childs.item(j);
							if(item.getNodeType() == Node.ELEMENT_NODE) {
								if("name".equalsIgnoreCase(item.getNodeName())) {
									item.setTextContent("Meier");
								}
							}
						}
					}
				}
			}
			
			FileOutputStream output = new FileOutputStream(new File(filename));
			writeXML(doc, output);
			
		} catch (ParserConfigurationException | SAXException | IOException e) {
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
//			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
//			transformer.setOutputProperty(OutputKeys.STANDALONE, "no");
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
