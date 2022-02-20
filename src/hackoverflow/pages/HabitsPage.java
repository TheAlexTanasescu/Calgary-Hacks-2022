package hackoverflow.pages;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;

import java.awt.*;  
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.GridBagConstraints;
import hackoverflow.main.Main;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HabitsPage extends PagePanel {
	private static final long serialVersionUID = 25974988494620193L;
	private Button addHabitBtn;
	private Button profileBtn;

	public HabitsPage(PageFrame frame) {
		this.setName("Habits Page");
		initButtons(frame);
	}
	
	public void initButtons(PageFrame frame) {
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
		HabitsPage page = this;
		profileBtn.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		Main.switchToProfilePage(frame, page);
	        }  
	    });
		
		
		
		Button addHabit = new Button("Add Habit");
		addHabit.setBounds(320, 30, 100, 40);
		this.add(addHabit);
		addHabit.addActionListener(new ActionListener() {
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
