package hackoverflow.pages;

import java.awt.Color;


public class StartFrame extends javax.swing.JFrame {
	private static final long serialVersionUID = 1L;
	public PagePanel panel;
	public StartFrame() {		
		panel = new PagePanel(this);
		this.add(panel);
	}
}