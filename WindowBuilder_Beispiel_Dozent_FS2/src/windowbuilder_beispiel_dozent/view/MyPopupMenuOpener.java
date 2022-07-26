package windowbuilder_beispiel_dozent.view;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyPopupMenuOpener extends MouseAdapter {

	@Override
	public void mousePressed(MouseEvent e) {
		if (e.isPopupTrigger()){
			MyPopupMenu mpm = new MyPopupMenu();
			mpm.show(e.getComponent(), e.getX(), e.getY());
		}
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if (e.isPopupTrigger()){
			MyPopupMenu mpm = new MyPopupMenu();
			mpm.show(e.getComponent(), e.getX(), e.getY());
		}
	}

}
