package hackoverflow.pages;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

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
	        setLayout(new GridBagLayout());	 //set default layout for frame.
	        setVisible(true);           //set frame visibilty true.

	        this.add(btn);
			ProfilePage p = this;
			btn.addActionListener(new ActionListener() {  
		    	public void actionPerformed(ActionEvent e) {
		    		frame.remove(p);
		    		frame.add(new HabitsPage(null));
		    		frame.validate();
		        }  
		    }); 
	

	     	 
	    }

}
	
