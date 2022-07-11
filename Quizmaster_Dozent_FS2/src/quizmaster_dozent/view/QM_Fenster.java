package quizmaster_dozent.view;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;

import quizmaster_dozent.config.Dimensionen;

public class QM_Fenster extends JFrame {

	private QM_ContentPanel contentPane;
	
	
	public QM_ContentPanel getContentPane() {
		return this.contentPane;
	}
	/**
	 * Create the frame.
	 */
	public QM_Fenster() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(Dimensionen.FENSTER.breite, Dimensionen.FENSTER.hoehe));
		setLocationRelativeTo(null);
		contentPane = new QM_ContentPanel();
		setContentPane(contentPane);
	}

}
