package auxClasses;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

public abstract class ButtonDone {
	
	// Method
	
	public static void onButton(JButton btn) {
		btn.setBackground(new Color(44, 44, 44));
		btn.setForeground(Color.white);
		btn.setFocusPainted(false);
		btn.setBorderPainted(false);
		btn.addMouseListener(new MouseAdapter() {
	        public void mouseEntered(MouseEvent e) {
	        	btn.setBackground(new Color(184, 147, 0));
	    		btn.setForeground(Color.black);
	        }
	        public void mouseExited(MouseEvent e) {
	    		btn.setBackground(new Color(44, 44, 44));
	    		btn.setForeground(Color.white);
	        }
		});
	}

}