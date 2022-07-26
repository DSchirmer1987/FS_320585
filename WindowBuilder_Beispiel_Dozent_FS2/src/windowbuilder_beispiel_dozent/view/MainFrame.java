package windowbuilder_beispiel_dozent.view;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;

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
		
		JMenuBar menuBar = new JMenuBar();
		FlowLayout fl_menuBar = new FlowLayout();
		fl_menuBar.setAlignment(FlowLayout.LEFT);
		menuBar.setLayout(fl_menuBar);
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("New menu");
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("New menu");
		mnNewMenu_1.setHorizontalAlignment(SwingConstants.TRAILING);
		menuBar.add(mnNewMenu_1);
		contentPane = new MyContenPanel();
		setContentPane(contentPane);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		contentPane.add(chckbxNewCheckBox, BorderLayout.WEST);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Text", "Test", "Bla"}));
		contentPane.add(comboBox, BorderLayout.CENTER);
		addMouseListener(new MyPopupMenuOpener());
	}

}
