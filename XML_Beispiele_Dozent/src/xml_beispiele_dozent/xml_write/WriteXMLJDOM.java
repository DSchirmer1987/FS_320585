package xml_beispiele_dozent.xml_write;

import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;

import org.jdom2.Document;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

public class WriteXMLJDOM {
	public static void writeSimpleXML(String fileName) {
		SAXBuilder sb = new SAXBuilder();
		try {
			String xml = "<root><child>Schirmer</child></root>";
			Document doc = sb.build(new StringReader(xml));
			
			XMLOutputter xmlOutputter = new XMLOutputter(Format.getPrettyFormat());
			FileWriter fw = new FileWriter(fileName);
			xmlOutputter.output(doc, fw);
			
		} catch (JDOMException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
