package quizmaster_dozent.view;

import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

import quizmaster_dozent.config.Dimensionen;
import java.awt.GridLayout;
import java.util.ArrayList;

public class QM_StufenPanel extends JPanel {
	
	private ArrayList<JLabel> stufen = new ArrayList<JLabel>();
	private QM_Fenster parentFrame;
	
	public ArrayList<JLabel> getStufen(){
		return this.stufen;
	}

	/**
	 * Create the panel.
	 */
	public QM_StufenPanel(QM_Fenster frame) {
		this.parentFrame = frame;
		setPreferredSize(new Dimension(Dimensionen.GEWINNE.breite, Dimensionen.GEWINNE.hoehe));
		setLayout(new GridLayout(0, 1, 0, 0));
		System.out.println(frame);
		System.out.println(this.parentFrame);
	}
	
	public void stufenAnzeigen() {
		for(JLabel label : stufen) {
			label.setOpaque(true);
			add(label);
		}
	}
	
}
