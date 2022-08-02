package singleton_beispiel_dozent;

public class App {

	public static void main(String[] args) {
		System.out.println("Singleton Beispiel");
		System.out.println("Versuche Captain zu erstellen");
		Captain c1 = Captain.getCaptain();
		System.out.println("Versuche weiteren Captain zu erstellen");
		Captain c2 = Captain.getCaptain();
	}

}
