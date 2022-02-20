package hackoverflow.pages;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;


public class PageFrame extends javax.swing.JFrame {
	private static final long serialVersionUID = 1L;
	private HabitsPage hp;
	
	public PageFrame(int width, int height, String title) {	
		// Initialize
		//Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		this.setLocation(0, 0);
		this.setSize(this.getSize());
        this.setBackground(Color.LIGHT_GRAY);
        this.setVisible(true);
       

		//this.setLocation((int)(screenSize.getWidth()/2 - this.getSize().getWidth()/2), (int)(screenSize.getHeight()/2 - this.getSize().getHeight()/2));
		//this.setResizable(false);
		//this.setTitle(title);
		//this.setVisible(true);
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}