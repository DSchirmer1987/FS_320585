package windowbuilder_beispiel_dozent.view;

import javax.swing.JFrame;

public class MainFrame extends JFrame {

	private MyContenPanel contentPane;

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(ViewConfig.getFenstergroesse());
		setLocationRelativeTo(null);
		setResizable(false);
		contentPane = new MyContenPanel();
		setContentPane(contentPane);
	}

}
