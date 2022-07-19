package xml_beispiele_dozent.xml_write;

import java.io.OutputStream;
import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class WriteXMLStAXCursor {
	
	public static void writeXML(OutputStream out) throws XMLStreamException {
		XMLOutputFactory output = XMLOutputFactory.newInstance();
		
		XMLStreamWriter writer = output.createXMLStreamWriter(out, "UTF-8");
		
		writer.writeStartDocument("utf-8", "1.0");
		
		writer.writeStartElement("Company");
		
		writer.writeStartElement("Staff");
		writer.writeAttribute("id", "1001");
		
		writer.writeStartElement("Name");
		writer.writeCharacters("Schirmer");
		writer.writeEndElement();
		
		writer.writeEndElement();
		
		writer.writeStartElement("Staff");
		writer.writeAttribute("id", "1002");
		
		writer.writeStartElement("Name");
		writer.writeCharacters("Müller");
		writer.writeEndElement();
		
		writer.writeEndElement();
		
		writer.writeStartElement("Staff");
		writer.writeAttribute("id", "1003");
		
		writer.writeStartElement("Name");
		writer.writeCharacters("Schmidt");
		writer.writeEndElement();
		
		writer.writeEndElement();
		
		writer.writeEndDocument();
		
		writer.flush();
		
		writer.close();
	}
	
	public static String formatXML(String xml) throws TransformerException {
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		
		// Pretty Print by Indention (Einrückung)
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		
		// Line-Break before Root-Element
		transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");
		
		StreamSource source = new StreamSource(new StringReader(xml));
		StringWriter output = new StringWriter();
		transformer.transform(source, new StreamResult(output));
		
		return output.toString();
	}
}
