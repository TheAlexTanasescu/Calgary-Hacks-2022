package hackoverflow.pages;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;

import javax.swing.JFrame;

public class PageProfile extends PagePanel {

	public PageProfile(JFrame frame)
	 
	    {			super();

	        Button btn=new Button("Helloo World");
	        add(btn); 		//adding a new Button.
	        setSize(300,300);        //setting size.
	        setName("StudyTonight");  //setting title.
	        setLayout(new GridBagLayout());	 //set default layout for frame.
	        setVisible(true);           //set frame visibilty true.
	     	 
	        }

}
