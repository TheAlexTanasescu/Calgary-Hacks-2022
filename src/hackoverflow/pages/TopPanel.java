package hackoverflow.pages;

import java.awt.Button;
import java.awt.Graphics;
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
import hackoverflow.popups.InstructionPopup;

/**
 * Top panel for the main page
 * @author skusj
 *
 */
public class TopPanel extends JPanel {
	private static final long serialVersionUID = -3265096636542863671L;

	private String bckImgPath = "res/headerbg.png";
	private String imgPath = "res/pet_justin1.png";
	private static JLabel lvlLbl;
	
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
		
		// Create Lvl label
		lvlLbl = new JLabel("Lvl: " + Main.lvl);
		c.weightx = 0.7;
		c.weighty = 0.1;
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 1;
		c.fill = GridBagConstraints.BOTH;
		c.anchor = GridBagConstraints.PAGE_START;
		c.insets = new Insets(20, 200, 0, 0);
		this.add(lvlLbl, c);
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
		c.weighty = 0.5;
		c.gridx = 0;
		c.gridy = 1;
		c.gridwidth = 1;
		c.anchor = GridBagConstraints.CENTER;
		c.insets = new Insets(0, 160, 10, 0);
		this.add(profileLbl, c);
		
		// Profile Button
		Button profileBtn = new Button("Profile");
		c.fill = GridBagConstraints.BOTH;
		c.weightx = 0.5;
		c.weighty = 0.2;
		c.gridx = 0;
		c.gridy = 2;
		c.gridwidth = 1;
		c.gridheight = 1;
		c.anchor = GridBagConstraints.LAST_LINE_START;
		c.insets = new Insets(0, 10, 5, 10);
		profileBtn.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		Main.switchToProfilePage(currentPanel);
	        }  
	    });
		this.add(profileBtn, c);
		
		// Profile Button
		Button helpBtn = new Button("Help");
		c.fill = GridBagConstraints.BOTH;
		c.weightx = 0.5;
		c.weighty = 0.2;
		c.gridx = 1;
		c.gridy = 2;
		c.gridwidth = 1;
		c.gridheight = 1;
		c.anchor = GridBagConstraints.LAST_LINE_END;
		c.insets = new Insets(0, 10, 5, 10);
		helpBtn.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		new InstructionPopup();
	        }  
	    });
		this.add(helpBtn, c);
	}
	
	public static void updateLvlLbl() {
		lvlLbl.setText("Lvl: " + Main.lvl);
	}
	
	@Override
	  protected void paintComponent(Graphics g) {
		ImageIcon backImg = new ImageIcon(bckImgPath);
		Image img = backImg.getImage();
		//Image newimg = img.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH);
	    super.paintComponent(g);
	    g.drawImage(img, 0, 0, null);
	}
}
