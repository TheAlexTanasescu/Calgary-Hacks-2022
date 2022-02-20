package hackoverflow.pages;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

import hackoverflow.main.Main;


public class ProfilePage extends PagePanel {
	
	
	

	public ProfilePage(PageFrame frame)
	 
	    {			super();

	        Button btn=new Button("Helloo World");
	        this.add(btn); 		//adding a new Button.
	        ProfilePage pg = this;
	        btn.addActionListener(new ActionListener() {
		    	public void actionPerformed(ActionEvent e) {
		    		Main.switchToHabitsPage(frame, pg);
		        }
		    });
	        setSize(300,300);        //setting size.
	        setName("StudyTonight");  //setting title.
	        setLayout(new GridBagLayout()); //set default layout for frame.
	        JLabel label = new JLabel("Profile");
	        
	        this.add(label);
	        
	        
	        setVisible(true);           //set frame visibilty true.

	       
			
			
		    
	

	     	 
	    }

}
	
