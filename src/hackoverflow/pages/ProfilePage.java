package hackoverflow.pages;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Component;
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


import javax.swing.BoxLayout;
import javax.swing.GroupLayout.Alignment;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import javax.swing.SwingConstants;


import hackoverflow.main.Main;


public class ProfilePage extends PagePanel {
    
    
    

    public ProfilePage(PageFrame frame)
     
        {            

        
        
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
            
            
          //  this.add(btn4, BorderLayout.BEFORE_LINE_BEGINS);
            //this.add(btn3, BorderLayout.EAST);    
            //this.add(btn4, BorderLayout.WEST);    
              
                //adding a new Button.
            ProfilePage pg = this;
            backBtn.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    Main.switchToHabitsPage(frame, pg);
                }
            });
            setSize(300,300);        //setting size.
            setName("StudyTonight");  //setting title.
        
            setVisible(true);           //set frame visibilty true.

        }

}