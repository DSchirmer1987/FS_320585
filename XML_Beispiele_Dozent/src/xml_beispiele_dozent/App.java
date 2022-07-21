package xml_beispiele_dozent;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import javax.xml.transform.TransformerException;

import org.xml.sax.SAXException;

import xml_beispiele_dozent.xml_modify.ModifyXMLDom;
import xml_beispiele_dozent.xml_read.ReadXMLJDOM;
import xml_beispiele_dozent.xml_read.ReadXMLSaxParser;
import xml_beispiele_dozent.xml_read.ReadXMLStAXCursorParser;
import xml_beispiele_dozent.xml_read.ReadXMLStAXEventParser;
import xml_beispiele_dozent.xml_read.ReadXML_DOMParser;
import xml_beispiele_dozent.xml_write.WriteXMLDom;
import xml_beispiele_dozent.xml_write.WriteXMLJDOM;
import xml_beispiele_dozent.xml_write.WriteXMLStAXCursor;
import xml_beispiele_dozent.xml_write.WriteXMLStAXIterator;

public class App {

	public static void main(String[] args) {
		/*
		 * Lesen von XML
		 */
//		ReadXMLJDOM.readXML("resources/beispiel.xml");
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
		WriteXMLJDOM.writeSimpleXML("resources/JDOMSimple.xml");
		WriteXMLJDOM.writeXML("resources/JDOM.xml");
//		try {
//			WriteXMLStAXCursor.writeXML(new FileOutputStream("resources/STAXCursor.xml"));
//			prettyPrintXML();
//			WriteXMLStAXIterator.writeXML(new FileOutputStream("resources/STAXIterator.xml"));
//			WriteXMLDom.writeXMLDom("resources/DOM.xml");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		/*
		 * Modifizieren von XML
		 */
//		ModifyXMLDom.modifyXML("resources/STAXCursorPretty.xml");

	}
	
	public static void prettyPrintXML() throws XMLStreamException, TransformerException, IOException {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		WriteXMLStAXCursor.writeXML(out);
		
		String xml = new String(out.toByteArray(), StandardCharsets.UTF_8);
		
		String prettyXML = WriteXMLStAXCursor.formatXML(xml);
		
		Files.writeString(Paths.get("resources/STAXCursorPretty.xml"), prettyXML, StandardCharsets.UTF_8);
	}

}
