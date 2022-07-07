package windowbuilder_beispiel_dozent.view;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.BorderLayout;

public class MyContenPanel extends JPanel {
	
	private MyEastPanel myEastPanel;
	
	public MyEastPanel getMyEastPanel() {
		return myEastPanel;
	}

	/**
	 * Create the panel.
	 */
	public MyContenPanel() {
		setBorder(new LineBorder(Color.BLUE, 5, true));
		setLayout(new BorderLayout(0, 0));
		
		myEastPanel = new MyEastPanel();
		add(myEastPanel, BorderLayout.EAST);

	}

}
