package xml_beispiele_dozent.xml_read;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.ArrayList;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import xml_beispiele_dozent.Food;

public class ReadXMLStAXEventParser {
	private static ArrayList<Food> foodlist = new ArrayList<>();
	
	public static void printXMLByXMLEventParser(Path path) throws FileNotFoundException, XMLStreamException {
		XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
		
		// XMLEventReader um die einzelnen Events der XML zu lesen
		XMLEventReader reader = xmlInputFactory.createXMLEventReader(new FileInputStream(path.toFile()));
		
		Food food = null;
		
		while(reader.hasNext()) {
			XMLEvent event = reader.nextEvent();
			if(event.isStartElement()) {
				StartElement element = event.asStartElement();
				System.out.println(element.getName());
				System.out.println(element.getName().getLocalPart());
				switch(element.getName().getLocalPart()) {
					case "food":{
						food = new Food();
						break;
					}
					case "name":{
						if((event = reader.nextEvent()).isCharacters()) {
							food.setName(event.asCharacters().getData());
						}
						break;
					}
					case "price":{
						event = reader.nextEvent();
						if(event.isCharacters()) {
							food.setPrice(event.asCharacters().getData());
						}
						break;
					}
				}
			}
			if(event.isEndElement()) {
				EndElement element = event.asEndElement();
				System.out.println(element.getName());
				System.out.println(element.getName().getLocalPart());
				if(event.asEndElement().getName().getLocalPart().equals("food")) {
					foodlist.add(food);
				}
			}
		}
		System.out.println(foodlist);
	}
}
