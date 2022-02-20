package hackoverflow.pages;


import javax.swing.JComboBox;

import java.awt.Button;
import java.awt.Color;
import java.awt.GridBagConstraints;
import hackoverflow.main.Main;
import hackoverflow.popups.ImagePane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HabitsPage extends PagePanel {
	private static final long serialVersionUID = 25974988494620193L;
	private Button addHabitBtn;
	private Button profileBtn;

	public HabitsPage(PageFrame frame) {
		this.setName("Habits Page");
		this.setBackground(Color.LIGHT_GRAY);
		initButtons(frame);
	}
	
	public void initButtons(PageFrame frame) {
		int test = 0;
		GridBagConstraints gb = new GridBagConstraints();
		//this.setLayout(new GridBagLayout());
		this.setLayout(null);
		this.setVisible(true);
		
		profileBtn = new Button("Profile");
		
		//gb.fill = GridBagConstraints.HORIZONTAL;
		profileBtn.setBounds(40, 30, 100, 40);
		this.add(profileBtn);
//		gb.ipady = 0;
//		gb.weightx = 0.5; 
//		gb.weighty = 0.0; 
//		gb.gridwidth = 1; 
//		gb.anchor = GridBagConstraints.CENTER; 
//		gb.insets = new Insets(0,0,0,0); 
//		gb.gridx = 0; 
//		gb.gridy = 0;
//		this.add(b, gb);
		//b.setBounds(0, 0, 0, 0);
		profileBtn.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		//frame.
	    		//frame.add(new PagePanel(frame));
	    		System.out.print("Welcome to Javatpoint.");
	        }  
	    });
		
		
		
		Button addHabit = new Button("Add Habit");
		addHabit.setBounds(320, 30, 100, 40);
		this.add(addHabit);
		//gb.fill = GridBagConstraints.HORIZONTAL;
//		gb.weightx = 0.5;
//		gb.gridx = 1;
//		gb.gridy = -1;
//		this.add(addHabit, gb);
		addHabit.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		ImagePane.main("Enter Name of Habit you want to add", "Add Habit", null, null, null);
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

