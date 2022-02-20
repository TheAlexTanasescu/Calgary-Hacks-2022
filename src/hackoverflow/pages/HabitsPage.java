package hackoverflow.pages;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;

import java.awt.*;  
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HabitsPage extends PagePanel {
	private static final long serialVersionUID = 25974988494620193L;
	
	public HabitsPage(JFrame frame) {
		this.setBackground(Color.LIGHT_GRAY);
		initButtons(frame);
	}
	

	public void initButtons(JFrame frame) {
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
		Button addHabit = new Button("Add Habit");
		this.add(addHabit);
		addHabit.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		System.out.print("Adding Habit");
	        }  
	    });
	}
}
