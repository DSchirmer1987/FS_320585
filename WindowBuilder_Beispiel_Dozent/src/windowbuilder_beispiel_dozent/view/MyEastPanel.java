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
		setPreferredSize(new Dimension(250, 400));
		setBorder(new LineBorder(Color.MAGENTA, 5, true));
		setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel = new JLabel("New label");
		add(lblNewLabel);
		
		JButton btnNewButton = new JButton("New button");
		add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		add(lblNewLabel_1);

	}

}
