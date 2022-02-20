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

	//buttons here
	
	
	public HabitsPage(JFrame frame) {

		this.setBackground(Color.LIGHT_GRAY);
		initButtons(frame);
	}
	private static void test(PageFrame frame, PagePanel panel, PagePanel panel2) {
    	frame.remove(panel);
    	frame.add(panel2);
    	frame.validate();
    }

	public void initButtons(JFrame frame) {
		GridBagConstraints gb = new GridBagConstraints();
		this.setLayout(new GridBagLayout());
		this.setVisible(true);
		
		Button b = new Button("P");
		this.add(b);
		b.addActionListener(new ActionListener() {  
	    	public void actionPerformed(ActionEvent e) {
	    		frame.dispose();
	    		System.out.print("Welcome to Javatpoint.");
	    		
	        }  
	    });
		
		Button addHabit = new Button("Add Habit");
		this.add(addHabit);
		addHabit.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		System.out.print("Adding Habit");
	        }
	    });
	}
	
	public void addHabit() {
		GridBagConstraints gb = new GridBagConstraints();
		this.setLayout(new GridBagLayout());
		this.setVisible(true);
		
		
		Button addHabit = new Button("Add Habit");
		this.add(addHabit);
		addHabit.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		System.out.print("Adding Habit");
	        }  
	    });
	}
}
