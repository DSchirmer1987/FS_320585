package xml_beispiele_dozent.xml_read;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.ArrayList;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.events.XMLEvent;

import xml_beispiele_dozent.Food;

public class ReadXMLStAXCursorParser {
	/*
	 * StAX = Streaming API for XML
	 */
	
	private static ArrayList<Food> foodlist = new ArrayList<>();
	
	public static void printXMLByXMLCursorReader(Path path) throws FileNotFoundException, XMLStreamException {
		// XMLInputFactory behandelt Inputs von XML
		XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
		
		// XMLStreamreader - Wird benutzt um die XML als Stream zu lesen
		XMLStreamReader reader = xmlInputFactory.createXMLStreamReader(new FileInputStream(path.toFile()));
		
		//Eventtype - Typ des Events - Sagt aus, welches Ereignis beim lesen stattfand
		int eventType = reader.getEventType();
		System.out.println(eventType); //7 = START_DOCUMENT
		System.out.println(reader);
		
		Food food = null;
		while(reader.hasNext()) {
			eventType = reader.next();
			// ÷ffnendes Tag
			if (eventType == XMLEvent.START_ELEMENT) {
				switch(reader.getName().getLocalPart()) {
					case "food":{
						food = new Food();
						break;
					}
					case "name":{
						eventType = reader.next();
//						System.out.println("HasText: " + reader.hasText());
						if(eventType == XMLEvent.CHARACTERS) {
							System.out.println("Name: " + reader.getText());
						}
						food.setName(reader.getText());
						break;
					}
					case "price":{
						reader.next();
						if(reader.hasText()) {
							System.out.println("Price: " + reader.getText());
						}
						food.setPrice(reader.getText());
						break;
					}
				}
			}
			// Schlieﬂendes Tag
			if(eventType == XMLEvent.END_ELEMENT) {
				if(reader.getName().getLocalPart().equals("food")) {
					System.out.println();
					foodlist.add(food);
				}
			}
		}
		System.out.println(foodlist);
	}
}
