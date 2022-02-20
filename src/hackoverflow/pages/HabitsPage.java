package hackoverflow.pages;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;

import java.awt.*;  
import javax.swing.JFrame;
import javax.swing.JOptionPane;
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
		this.setBackground(Color.LIGHT_GRAY);
		initButtons(frame);
	}
	
	public void initButtons(JFrame frame) {
		int test = 0;
		GridBagConstraints gb = new GridBagConstraints();
		//this.setLayout(new GridBagLayout());
		this.setLayout(null);
		this.setVisible(true);
		
		Button b = new Button("Profile");
		
		//gb.fill = GridBagConstraints.HORIZONTAL;
		b.setBounds(40, 30, 100, 40);
		this.add(b);
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
		b.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		//frame.
	    		//frame.add(new PagePanel(frame));
	    		System.out.print("Welcome to Javatpoint.");
	        }  
	    });
		
		String[] optionsToChoose = {"Apple", "Orange", "Banana", "Pineapple", "None of the listed"};

		JComboBox<String> jComboBox = new JComboBox<>(optionsToChoose);
        jComboBox.setBounds(150, 40, 150, 20);

        frame.add(jComboBox);
        
        //frame.setLayout(null);
        //frame.setSize(350, 250);
        //frame.setVisible(true);
		
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
