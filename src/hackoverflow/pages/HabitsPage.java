package hackoverflow.pages;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.*;  
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HabitsPage extends PagePanel {
	private static final long serialVersionUID = 25974988494620193L;
	JFrame f;

	public HabitsPage(JFrame frame) {
		super(frame);
		setBackground(Color.LIGHT_GRAY);
		setLayout(new GridBagLayout());
		
		GridBagConstraints gb = new GridBagConstraints();
		JButton b = new JButton("Level 1");  
	    b.addActionListener(new ActionListener() {  
	    	public void actionPerformed(ActionEvent e) {  
	            frame.dispose();
	        }  
	    });
	    add(b, new GridBagConstraints());
	    add(b, gb);
		
		//initButtons();
	}
	
//	public void initButtons() {
//		JButton b = new JButton("Click Here");  
//	    b.setBounds(50,100,95,30);  
//	    b.addActionListener(new ActionListener(){  
//	    	public void actionPerformed(ActionEvent e){  
//	            System.out.print("Welcome to Javatpoint.");  
//	        }
//	    });
//	    add(b, f);
//	    
//	}
}
