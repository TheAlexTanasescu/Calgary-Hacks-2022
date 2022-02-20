package hackoverflow.pages;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import hackoverflow.main.Main;
import hackoverflow.popups.StartPopup;


public class ProfilePage extends PagePanel {

	private static final long serialVersionUID = 7496382167255611538L;

		String imageString = "res/pet_moomask3.png";
		static String name = "Bull-Dozer";
		String petName;
		private static JLabel imageLabel;
		public static JLabel petNameLbl;
		public static int count = 0;
		public static JLabel tokenLabel;
		public static String playerName;
		private static JLabel label;
		
	public ProfilePage() {            
        
		imageLabel = getImageIcon(imageString);
		petName = getName();

		String nameThing = StartPopup.playerName + "'s Profile";
        label = new JLabel(nameThing, SwingConstants.CENTER);
        label.setFont(new Font("Verdana", Font.PLAIN, 36));
        
        JButton backBtn = new JButton("Back");
        JButton shopBtn = new JButton("Shop");
        
        JButton changeBtn = new JButton("Change Pet");
      
        String petNameThing = "Current Pet: " + petName;
        petNameLbl = new JLabel(petNameThing,SwingConstants.CENTER);
        tokenLabel = new JLabel("Tokens: " + Integer.toString(count), SwingConstants.CENTER);
        tokenLabel.setBorder(new EmptyBorder(0,0,80,0));
        setLayout(new BorderLayout(0, 20));
        
        
        JPanel petPanel = new JPanel();
        petPanel.setBorder(new EmptyBorder(40, 10, 10, 10));
        petPanel.add(tokenLabel);
        petPanel.add(petNameLbl);
        petPanel.add(imageLabel);
        
        petPanel.add(changeBtn);
        petPanel.setBorder(new EmptyBorder(0, 50, 0, 0));
        
        petPanel.setLayout(new BoxLayout(petPanel, BoxLayout.Y_AXIS));
        imageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        petNameLbl.setAlignmentX(Component.CENTER_ALIGNMENT);
        changeBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
      
        
        this.add(label, BorderLayout.NORTH);    
        this.add(backBtn, BorderLayout.WEST);
        this.add(shopBtn, BorderLayout.EAST);
        this.add(petPanel, BorderLayout.CENTER);
        
        ProfilePage pg = this;
        backBtn.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                Main.switchToMainPage(pg);
            }
        });
        shopBtn.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                Main.switchToShopsPage(pg);
            }
        });
        
        changeBtn.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                Main.switchToChangePetPage(pg);
            }
        });
        
        
    
        setVisible(true);  //set frame visibilty true.
        this.validate();

    }
	
	public static JLabel getImageIcon(String icon) {
		
		ImageIcon petIcon = new ImageIcon(icon);
        Image img = petIcon.getImage();
        Image newimg = img.getScaledInstance(200, 200,  java.awt.Image.SCALE_SMOOTH);
        ImageIcon newIcon = new ImageIcon(newimg);
        JLabel imageLabel = new JLabel(newIcon);
		return imageLabel;
		
	}
	
	public static void setImageIcon(String icon) {
		
		ImageIcon petIcon = new ImageIcon(icon);
        Image img = petIcon.getImage();
        Image newimg = img.getScaledInstance(200, 200,  java.awt.Image.SCALE_SMOOTH);
        ImageIcon newIcon = new ImageIcon(newimg);
        imageLabel.setIcon(newIcon);
	
		
	}
	public  String getName() {
		return this.name;
	}
	
	public  void setName(String nameToChange)
	{
		petNameLbl.setText(nameToChange);
	}
	
	@Override
	  protected void paintComponent(Graphics g) {
		ImageIcon backImg = new ImageIcon("res/bghd.png");
		Image img = backImg.getImage();
		//Image newimg = img.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH);
	    super.paintComponent(g);
	    g.drawImage(img, 0, 0, null);
	}
	
	public static void changePlayerName(String name) {
		
		label.setText(name + "'s Profile");
		
		
		
	}


}