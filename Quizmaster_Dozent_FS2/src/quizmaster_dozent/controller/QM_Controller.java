package quizmaster_dozent.controller;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JLabel;

import quizmaster_dozent.model.spiel.Gewinntabelle;
import quizmaster_dozent.model.spiel.Spielrunde;
import quizmaster_dozent.model.spiel.Stufe;
import quizmaster_dozent.view.QM_Fenster;

public class QM_Controller {
	
	private Gewinntabelle gewinntabelle;
	private QM_Fenster frame;
	private Spielrunde spielrunde;
	
	public QM_Controller() {
		/**
		 * Launch the application.
		 */
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new QM_Fenster();
					init();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	private void init() {
		this.spielrunde = new Spielrunde(null, null, null, 1, null);
		this.spielrunde.spielrundeAufbauen();
//		System.out.println(this.spielrunde.getFragen());
		var tmp = 0;
		this.gewinntabelle = this.spielrunde.getGewinntabelle();
		
		for(Stufe stufe : this.gewinntabelle.getStufen()) {
			this.frame.getContentPane().getStufenPanel().getStufen().add(new JLabel(String.valueOf(stufe.getBetrag())));
			if(stufe.isSafezone()) {
				this.frame.getContentPane().getStufenPanel().getStufen().get(tmp).setBackground(Color.YELLOW);
			}
			tmp++;
		}
		this.frame.getContentPane().getStufenPanel().stufenAnzeigen();
		
	}
	
}
