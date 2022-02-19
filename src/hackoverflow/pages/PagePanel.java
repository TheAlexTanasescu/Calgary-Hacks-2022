package hackoverflow.pages;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;


public class PagePanel extends javax.swing.JPanel {
	private static final long serialVersionUID = 1L;
	
	public PagePanel(JFrame frame) {
		this.setLocation(0, 0);
		this.setSize(this.getSize());
		this.setBackground(Color.WHITE);
		this.setVisible(true);
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D gtd = (Graphics2D) g;
		
		//gtd.drawImage(background, 0, 0, 1280, 720, null);

	}

}