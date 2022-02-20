package hackoverflow.pages;

import java.awt.Button;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import hackoverflow.main.Main;
import hackoverflow.popups.ImagePane;

public class HPTopPanel extends JPanel {
	private static final long serialVersionUID = 5758091766734972758L;
	
	private String imgPath = "res/pet_moomask1.png";
	
	public HPTopPanel(PagePanel currentPanel, JPanel inPanel) {
		super();
		initLayout(currentPanel, inPanel);
		
	}
	
	/**
	 * 
	 * @param currentPanel the current main Panel of the frame
	 */
	private void initLayout(PagePanel currentPanel, JPanel inPanel) {
		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		// Profile Button
		Button backBtn = new Button("back");
		c.fill = GridBagConstraints.BOTH;
		c.weightx = 0.3;
		c.weighty = 0.3;
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 1;
		c.gridheight = 1;
		c.anchor = GridBagConstraints.FIRST_LINE_START;
		c.insets = new Insets(10, 5, 10, 40);
		backBtn.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		Main.switchToMainPage(currentPanel);
	        }  
	    });
		this.add(backBtn, c);
		
		// Create profile image
		ImageIcon profileImg = new ImageIcon(imgPath);
		Image img = profileImg.getImage();
		Image newimg = img.getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH);
		profileImg = new ImageIcon(newimg);
		
		// Profile Image
		JLabel profileLbl = new JLabel();
		profileLbl.setIcon(profileImg);
		c.fill = GridBagConstraints.BOTH;
		c.weightx = 0.4;
		c.weighty = 0.3;
		c.gridx = 1;
		c.gridy = 0;
		c.gridwidth = 1;
		c.anchor = GridBagConstraints.PAGE_START;
		c.insets = new Insets(0, 60, 5, 0);
		this.add(profileLbl, c);
		
		// Add Button
		Button addBtn = new Button("Add");
		c.fill = GridBagConstraints.BOTH;
		c.weightx = 0.3;
		c.weighty = 0.3;
		c.gridx = 3;
		c.gridy = 0;
		c.gridwidth = 1;
		c.gridheight = 1;
		c.anchor = GridBagConstraints.FIRST_LINE_END;
		c.insets = new Insets(10, 40, 10, 5);
		addBtn.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		new ImagePane(null, null, null, imgPath);
	        }  
	    });
		this.add(addBtn, c);
	}
}
