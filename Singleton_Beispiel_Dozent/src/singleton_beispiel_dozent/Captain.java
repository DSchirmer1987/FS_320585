package singleton_beispiel_dozent;

public class Captain {
	private static Captain captain;
	
	private Captain() {
		
	}
	
	public static synchronized Captain getCaptain() {
		if(captain == null) {
			captain = new Captain();
			System.out.println("Captain erstellt");
		} else {
			System.out.println("Der Captain wurde schon erstellt");
		}
		return captain;
	}
}
