package windowbuilder_beispiel_dozent.view;

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class MyPopupMenu extends JPopupMenu {
	
	private JMenuItem mniOpen = new JMenuItem("Datei öffnen");
	private JMenuItem mniSave = new JMenuItem("Datei speichern");
	
	public MyPopupMenu() {
		this.add(mniOpen);
		this.add(mniSave);
	}
}
