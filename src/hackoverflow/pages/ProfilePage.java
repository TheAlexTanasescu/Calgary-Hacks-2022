package hackoverflow.pages;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import hackoverflow.main.Main;


public class ProfilePage extends PagePanel {
    
    
    

    public ProfilePage(PageFrame frame)
     
        {            
    	
    	
	    	ImageIcon petIcon = new ImageIcon("res/pet_moomask3.png");
			Image img = petIcon.getImage();
			Image newimg = img.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH);
			ImageIcon newIcon = new ImageIcon(newimg);
    	
    
    		JLabel label = new JLabel("Profile", SwingConstants.CENTER);
    		label.setFont(new Font("Verdana", Font.PLAIN, 36));
    		JLabel imageLabel = new JLabel(newIcon);
            JButton btn = new JButton("Back");
            JButton btn2 = new JButton("Shop");
            setLayout(new BorderLayout(20, 15));  
            this.add(label, BorderLayout.NORTH);    
            this.add(btn, BorderLayout.WEST);
            this.add(btn2, BorderLayout.EAST);
            //this.add(btn3, BorderLayout.EAST);    
            //this.add(btn4, BorderLayout.WEST);    
            this.add(imageLabel, BorderLayout.CENTER);  
                //adding a new Button.
            ProfilePage pg = this;
            btn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    Main.switchToHabitsPage(frame, pg);
                }
            });
            setSize(300,300);        //setting size.
            setName("StudyTonight");  //setting title.
        
            setVisible(true);           //set frame visibilty true.

        }

}