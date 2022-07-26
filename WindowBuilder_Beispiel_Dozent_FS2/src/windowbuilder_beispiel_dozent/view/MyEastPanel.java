package windowbuilder_beispiel_dozent.view;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Dimension;

public class MyEastPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public MyEastPanel() {
		/*
		 * Was w�re wenn ich die Gr��e prozentual angeben m�chte?
		 * Was w�re wenn ich die Gr��e proportional zum Fenster angeben m�chte?
		 * Zugriff auf Eltern-Container erst NACHDEM der Constructor durchgelaufen ist.
		 */
//		System.out.println(this.getParent());
//		int breite = this.getParent().getWidth();
//		System.out.println(breite);
		setPreferredSize(new Dimension(ViewConfig.getFenstergroesse().width / 4, 200));
		setBorder(new LineBorder(Color.MAGENTA, 5, true));
		setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel = new JLabel("New label");
		add(lblNewLabel);
		
		JButton btnNewButton = new JButton("New button");
		add(btnNewButton);
//		btnNewButton.addMouseListener(new MyPopupMenuOpener());
//		
		JLabel lblNewLabel_1 = new JLabel("New label");
		add(lblNewLabel_1);

	}

}
