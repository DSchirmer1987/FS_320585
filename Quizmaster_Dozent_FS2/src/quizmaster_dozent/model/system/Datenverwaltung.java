package quizmaster_dozent.model.system;

import java.util.ArrayList;

import quizmaster_dozent.model.spiel.Frage;
import quizmaster_dozent.model.spiel.Gewinntabelle;

public interface Datenverwaltung {
	public abstract ArrayList<Frage> datenLaden(Gewinntabelle gewinntabelle);
	public abstract void datenSpeichern(ArrayList<Frage> fragen);
}
