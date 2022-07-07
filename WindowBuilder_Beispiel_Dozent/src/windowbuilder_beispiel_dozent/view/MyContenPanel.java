package windowbuilder_beispiel_dozent.view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

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
//		myEastPanel.setPreferredSize(new Dimension(ViewConfig.getFenstergroesse().width / 4, 0));
		System.out.println(myEastPanel.getPreferredSize());
	}

}
