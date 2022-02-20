package hackoverflow.pages;

import java.awt.Color;


public class PagePanel extends javax.swing.JPanel {
	private static final long serialVersionUID = -9178269319786112894L;

	public PagePanel() {
		this.setLocation(0, 0);
		this.setSize(this.getSize());
		this.setBackground(Color.WHITE);
		this.setVisible(true);
		System.out.println("Panel");
	}

}
