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
		initButtons(frame);
	}
	
	public void initButtons(PageFrame frame) {
		this.setLayout(null);
		this.setVisible(true);
		
		profileBtn = new Button("Profile");
		profileBtn.setBounds(40, 30, 100, 40);
		this.add(profileBtn);
		HabitsPage page = this;

		profileBtn.setBounds(40, 30, 100, 40);
		this.add(profileBtn);
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
	    		ImagePane.main("", "", null, null, "res/pet_moomask3.png");
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

