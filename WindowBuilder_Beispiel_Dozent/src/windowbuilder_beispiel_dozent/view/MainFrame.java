package windowbuilder_beispiel_dozent.view;

import javax.swing.JFrame;

public class MainFrame extends JFrame {

	private MyContenPanel contentPane;

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		setResizable(false);
		contentPane = new MyContenPanel();
		setContentPane(contentPane);
	}

}
