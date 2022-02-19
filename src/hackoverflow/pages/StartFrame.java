package hackoverflow.pages;

import java.awt.Color;


public class StartFrame extends javax.swing.JFrame {
	private static final long serialVersionUID = 1L;
	public StartPanel panel;
	public StartFrame() {		
		
		panel = new StartPanel(this);
		panel.setLocation(0, 0);
		panel.setSize(this.getSize());
		panel.setBackground(Color.WHITE);
		panel.setVisible(true);
		
		this.add(panel);
	}
}