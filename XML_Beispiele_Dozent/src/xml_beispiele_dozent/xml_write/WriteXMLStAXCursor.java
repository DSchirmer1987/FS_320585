package xml_beispiele_dozent.xml_write;

import java.io.OutputStream;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

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
}
