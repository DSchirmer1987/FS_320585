package windowbuilder_beispiel_dozent;

import java.awt.EventQueue;

import windowbuilder_beispiel_dozent.view.MainFrame;

public class App {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void ausgeben() {
		var text = "Hallo";
		var ausgabe = new String();
		text = "Welt";
	}

}
