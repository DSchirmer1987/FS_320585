package beispiele_dozent_fs2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

public class App {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Schreiben von Objekten direkt in dateien
		Customer james = new Customer(0, "James");
		
		// JFilechoose, FileSystemView für Dateisystemangaben
		JFileChooser jfc = new JFileChooser();
		FileSystemView fw = jfc.getFileSystemView();
		//.getDefaultDirectory = Standard-Benutzer-Ordner
		File file = new File(fw.getDefaultDirectory().toString() + "/person.dat");
		
		try(FileOutputStream fos = new FileOutputStream(file); ObjectOutputStream oos = new ObjectOutputStream(fos)){
			oos.writeObject(james);
			oos.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void beispiel() {
		ArrayList<Customer> liste = new ArrayList<>();
		Customer james = new Customer(0, "James");
		liste.add(new Customer(0, "James"));
		liste.add(new Customer(1, "Daniel"));
		liste.add(new Customer(2, "Fred"));
//		liste.add(james);
		
		/*
		 * Herausfinden ob ein Element in einer Arraylist ist.
		 * 
		 * Vergleicht die Addressen der Objekte
		 */
		System.out.println(liste.contains(james));
		
		/*
		 * Herausfinden des Index eines Elementes in einer Arraylist.
		 * 
		 * Bei negativen Ergebnis ist das Element nicht vorhanden
		 */
		System.out.println(liste.indexOf(james));
		
		/*
		 * Iterieren durch die Arraylist
		 */
		for(Customer c : liste) {
			if(c.getName() == "Fred") {
				System.out.println(liste.indexOf(c));
			}
		}
		
		/*
		 * Möglichkeit seit Java 8:
		 * 
		 * Nutzen eines Streams
		 * 
		 * Liste in einen Stream umwandeln ( .stream()
		 * Filter anwenden ( .stream(Predicate) ) - Predicate = Die behauptung definieren.
		 * FindAny aufrufen ( .findAny() ) - Gibt das erste gefunden Element zurück
		 * .orElse() - um den fall einer erfolglosen Suche darzustellen
		 */
		Customer fred = liste.stream().filter(customer -> "Fred".equals(customer.getName())).findAny().orElse(null);
		System.out.println(fred);
		
		
		
		// Java 13 Switch Case Yield
		int zahl = 5;
		int result = switch(zahl) {
			case 1 :{
				System.out.println("Ist 1");
				yield 1;
			}
			case 2:{
				System.out.println("ist 2");
				yield 2;
			}
			case 5:{
				System.out.println("ist 5");
				yield 5;
			}
		default:
			throw new IllegalArgumentException("Unexpected value: " + zahl);
		};
		System.out.println(result);
	}

}
