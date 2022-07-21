package xml_beispiele_dozent.xml_read;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

public class ReadXMLJDOM {
	public static void readXML(String filename) {
		SAXBuilder sax = new SAXBuilder();
		try {
			Document doc = sax.build(new File(filename));
			Element rootNode = doc.getRootElement();
			
			List<Element> list = rootNode.getChildren("food");
			for(Element target : list) {
				String name = target.getChildText("name");
				String price = target.getChildText("price");
				String desc = target.getChildText("description");
				/*
				 * Wenn Attribut
				 */
//				String id = target.getAttributeValue("id");
				
				System.out.println(name + " | " + price + " | " + desc);
			}
		} catch (JDOMException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
