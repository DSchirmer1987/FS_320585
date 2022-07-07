package windowbuilder_beispiel_dozent.view;

import java.awt.Dimension;

import javax.swing.JFrame;

public class MainFrame extends JFrame {

	private MyContenPanel contentPane;
	private static Dimension fenstergroesse;
	
	public static Dimension getFenstergroesse() {
		return fenstergroesse;
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenstergroesse = new Dimension(1280, 720);
		setBounds(100, 100, fenstergroesse.width, fenstergroesse.height);
		setResizable(false);
		contentPane = new MyContenPanel();
		setContentPane(contentPane);
	}

}
