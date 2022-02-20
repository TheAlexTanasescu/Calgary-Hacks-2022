package hackoverflow.pages;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
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


public class ProfilePage extends PagePanel {

	private static final long serialVersionUID = 7496382167255611538L;

		String imageString = "res/pet_moomask3.png";
		static String name = "Bull-Dozer";
		String petName;
		private static JLabel imageLabel;
		public static JLabel petNameLbl;
		
	public ProfilePage() {            
        
		imageLabel = getImageIcon(imageString);
		petName = getName();

        JLabel label = new JLabel("Profile", SwingConstants.CENTER);
        label.setFont(new Font("Verdana", Font.PLAIN, 36));
        
        JButton backBtn = new JButton("Back");
        JButton shopBtn = new JButton("Shop");
        
        JButton changeBtn = new JButton("Change Pet");
      
        petNameLbl = new JLabel(petName,SwingConstants.CENTER);
        
        setLayout(new BorderLayout(0, 20));
        
        
        JPanel petPanel = new JPanel();
        petPanel.setBorder(new EmptyBorder(40, 10, 10, 10));
        petPanel.add(petNameLbl);
        petPanel.add(imageLabel);
        
        petPanel.add(changeBtn);
        
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


}