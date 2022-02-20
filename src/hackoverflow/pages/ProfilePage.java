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

	public ProfilePage() {            
        ImageIcon petIcon = new ImageIcon("res/pet_moomask3.png");
        Image img = petIcon.getImage();
        Image newimg = img.getScaledInstance(200, 200,  java.awt.Image.SCALE_SMOOTH);
        ImageIcon newIcon = new ImageIcon(newimg);
    

        JLabel label = new JLabel("Profile", SwingConstants.CENTER);
        label.setFont(new Font("Verdana", Font.PLAIN, 36));
        JLabel imageLabel = new JLabel(newIcon);
        JButton backBtn = new JButton("Back");
        JButton shopBtn = new JButton("Shop");
        
        JButton changeBtn = new JButton("Change Pet");
      
        JLabel petName = new JLabel("PetName 3.0",SwingConstants.CENTER);
        
        setLayout(new BorderLayout(0, 20));
        
        
        JPanel petPanel = new JPanel();
        petPanel.setBorder(new EmptyBorder(40, 10, 10, 10));
        petPanel.add(petName);
        petPanel.add(imageLabel);
        
        petPanel.add(changeBtn);
        
        petPanel.setLayout(new BoxLayout(petPanel, BoxLayout.Y_AXIS));
        imageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        petName.setAlignmentX(Component.CENTER_ALIGNMENT);
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
    
        setVisible(true);           //set frame visibilty true.

    }


}