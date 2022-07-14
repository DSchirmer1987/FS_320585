package beispiele_dozent_fs2;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		
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
	}

}
