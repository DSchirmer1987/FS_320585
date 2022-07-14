package quizmaster_dozent.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuActionListener implements ActionListener{
	
	private final static MenuActionListener instance = new MenuActionListener(1);
	private int AntwortAuswahl;
	
	public MenuActionListener(int Auswahl) {
		this.AntwortAuswahl = Auswahl;
	}
	
	public static MenuActionListener getInstance() {
		return MenuActionListener.instance;
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(this.AntwortAuswahl == 1) {
			System.out.println("Richtig");
		}
		switch(e.getActionCommand().toLowerCase()) {
			case "neu":{
				System.out.println("Neu ausgewählt.");
				QM_Controller.halloSagen();
				break;
			}
			case "öffnen":{
				System.out.println("Öffnen gewählt.");
				break;
			}
			case "beenden":{
				System.out.println("Beenden gewählt.");
				break;
			}
			case "über":{
				System.out.println("Über gewählt.");
				break;
			}
		}
		
	}

}
