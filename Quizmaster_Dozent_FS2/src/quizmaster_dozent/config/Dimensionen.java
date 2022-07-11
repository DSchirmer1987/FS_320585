package quizmaster_dozent.config;

public enum Dimensionen {
	FENSTER(1280, 720), 
	MENU(1280, 50), 
	GEWINNE(Dimensionen.FENSTER.breite  / 4 , Dimensionen.FENSTER.hoehe - Dimensionen.MENU.hoehe);
	
	public int breite;
	public int hoehe;
	
	Dimensionen(int a, int b) {
		this.breite = a;
		this.hoehe = b;
	}
	
}
