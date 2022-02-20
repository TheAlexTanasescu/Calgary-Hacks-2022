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
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HabitsPage extends PagePanel {
	private static final long serialVersionUID = 25974988494620193L;
	private Button addHabitBtn;
	private Button profileBtn;

	public HabitsPage(JFrame frame) {
		this.setBackground(Color.LIGHT_GRAY);
		initButtons(frame);
	}
	

	public void initButtons(JFrame frame) {
		profileBtn = new Button("P");
		this.add(profileBtn);
		profileBtn.addActionListener(new ActionListener() {  
	    	public void actionPerformed(ActionEvent e) {
	    		frame.dispose();
	    		System.out.print("Welcome to Javatpoint.");
	        }  
	    });
		
		addHabitBtn = new Button("Add Habit");
		this.add(addHabitBtn);
		addHabitBtn.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		System.out.print("Adding Habit");
	        }
	    });
	}
	
	public void addHabit() {
		addHabitBtn = new Button("Add Habit");
		this.add(addHabitBtn);
		addHabitBtn.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		System.out.print("Adding Habit");
	        }  
	    });
	}
}
