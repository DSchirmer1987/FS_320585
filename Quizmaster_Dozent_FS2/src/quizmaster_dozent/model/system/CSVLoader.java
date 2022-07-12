package quizmaster_dozent.model.system;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import quizmaster_dozent.model.spiel.Antwort;
import quizmaster_dozent.model.spiel.Frage;
import quizmaster_dozent.model.spiel.Gewinntabelle;

public class CSVLoader implements Datenverwaltung {
	

	@Override
	public ArrayList<Frage> datenLaden(Gewinntabelle gewinntabelle) {
		ArrayList<Frage> fragen = new ArrayList<>();
		try {
			BufferedReader br = new BufferedReader(new FileReader("src/WWM.csv"));
			String zeile;
			while((zeile = br.readLine()) != null) {
				String[] werte = zeile.split(";");
				if(Integer.valueOf(werte[0]) <= gewinntabelle.getStufen().size()) {
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
