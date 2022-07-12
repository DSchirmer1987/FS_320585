package quizmaster_dozent.view;

import javax.swing.JPanel;

import quizmaster_dozent.config.Dimensionen;

import java.awt.BorderLayout;
import java.awt.Dimension;

public class QM_ContentPanel extends JPanel {
	
	private QM_StufenPanel stufenPanel;
	private QM_Fenster parentFrame;
	
	public QM_StufenPanel getStufenPanel() {
		return this.stufenPanel;
	}
	public QM_ContentPanel(QM_Fenster frame) {
		this.stufenPanel = new QM_StufenPanel(frame);
		setLayout(new BorderLayout(0, 0));
		setPreferredSize(new Dimension(Dimensionen.FENSTER.breite, Dimensionen.FENSTER.hoehe));
		add(stufenPanel, BorderLayout.WEST);
	}

}
