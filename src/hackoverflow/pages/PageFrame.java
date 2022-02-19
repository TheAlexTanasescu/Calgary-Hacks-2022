package hackoverflow.pages;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;


public class PageFrame extends javax.swing.JFrame {
	private static final long serialVersionUID = 1L;
	private PagePanel panel;
	
	public PageFrame(int width, int height, String title) {	
		// Initialize
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		this.setSize(width, height);
		this.setLocation((int)(screenSize.getWidth()/2 - this.getSize().getWidth()/2), (int)(screenSize.getHeight()/2 - this.getSize().getHeight()/2));
		this.setResizable(false);
		this.setTitle(title);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}