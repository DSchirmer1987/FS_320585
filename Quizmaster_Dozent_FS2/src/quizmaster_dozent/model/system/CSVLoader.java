package quizmaster_dozent.model.system;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

import quizmaster_dozent.model.spiel.Antwort;
import quizmaster_dozent.model.spiel.Frage;
import quizmaster_dozent.model.spiel.Gewinntabelle;

public class CSVLoader implements Datenverwaltung {
	

	@Override
	public ArrayList<Frage> datenLaden(Gewinntabelle gewinntabelle) {
		ArrayList<Frage> fragen = new ArrayList<>();
		// Classloader holen, damit wir Zugriff auf ein Objekt haben dass alle Dinge vom Programm sieht.
		// Der Classloader ist der Teil von der JVM der zuständig ist alle Klassen zu laden
		ClassLoader classloader = getClass().getClassLoader();
		// InputStream öffnen über den Classloader, um die Datei als Datenstrom in den Speicher zu laden
		InputStream is = classloader.getResourceAsStream("csv/WWM.csv");
		if(is == null) {
			System.out.println("Datei nicht gefunden!");
		}
		try {
			// Einen Reader aufbauen, der den Inputstream liest und zur Verfügung stellt
			InputStreamReader isr = new InputStreamReader(is, StandardCharsets.UTF_8);
			BufferedReader br = new BufferedReader(isr);
			String zeile;
			while((zeile = br.readLine()) != null) {
				/*  CSV Dateien sind  immer im Schema   "Wert;Wert;Wert" aufgebaut
				 *  Da der BufferedReader immer eine Zeile liest, muss diese nach dem Lesen gesplittet werden.
				 */
				String[] werte = zeile.split(";");
				if(Integer.valueOf(werte[0]) <= gewinntabelle.getStufen().size()) {
					// Die verschiedenen Werte zu den richtigen Attributen zuweisen
					Antwort[] antworten = new Antwort[4];
					antworten[0] = new Antwort(werte[2]);
					fragen.add(new Frage(gewinntabelle.getStufen().get(Integer.valueOf(werte[0]) - 1), werte[1], antworten, 1));
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return fragen;
	}

	@Override
	public void datenSpeichern(ArrayList<Frage> fragen) {
		// TODO Auto-generated method stub

	}

}
