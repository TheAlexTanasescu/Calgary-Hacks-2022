package hackoverflow.pages;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

import javax.swing.JFrame;

public class PageProfile extends PagePanel {

	public PageProfile(JFrame frame)
	 
	    {
			super(frame);
	        Button btn=new Button("Hello World");
	        add(btn); 		//adding a new Button.
	        setSize(400, 500);        //setting size.
	        setName("StudyTonight");  //setting title.
	        setLayout(new FlowLayout());	 //set default layout for frame.
	        setVisible(true);           //set frame visibilty true.
	    
	  }

}
