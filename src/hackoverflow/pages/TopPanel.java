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

/**
 * Top panel for the main page
 * @author skusj
 *
 */
public class TopPanel extends JPanel {
	private static final long serialVersionUID = -3265096636542863671L;
	private String imgPath = "res/pet_justin1.png";
	
	public TopPanel(PagePanel currentPanel) {
		super();
		initLayout(currentPanel);
	}
	
	/**
	 * Adds the profile Image and profile button to the Top Panel
	 * @param currentPanel the current main Panel of the frame
	 */
	private void initLayout(PagePanel currentPanel) {
		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		// Create profile image
		ImageIcon profileImg = new ImageIcon(imgPath);
		Image img = profileImg.getImage();
		Image newimg = img.getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH);
		profileImg = new ImageIcon(newimg);
		
		// Profile Image
		JLabel profileLbl = new JLabel();
		profileLbl.setSize(30, 30);
		profileLbl.setIcon(profileImg);
		c.fill = GridBagConstraints.BOTH;
		c.weightx = 0.7;
		c.weighty = 0.7;
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 1;
		c.anchor = GridBagConstraints.FIRST_LINE_START;
		c.insets = new Insets(0, 160, 0, 0);
		this.add(profileLbl, c);
		
		// Profile Button
		Button profileBtn = new Button("Profile");
		c.fill = GridBagConstraints.BOTH;
		c.weightx = 0.7;
		c.weighty = 0.2;
		c.gridx = 0;
		c.gridy = 1;
		c.gridwidth = 1;
		c.gridheight = 1;
		c.anchor = GridBagConstraints.LINE_START;
		c.insets = new Insets(0, 40, 5, 40);
		profileBtn.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		Main.switchToProfilePage(currentPanel);
	        }  
	    });
		this.add(profileBtn, c);
	}
}
