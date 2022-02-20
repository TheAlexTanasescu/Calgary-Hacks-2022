package hackoverflow.pages;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;

import java.awt.*;  
import javax.swing.JFrame;
<<<<<<< HEAD
=======

import hackoverflow.main.Main;

>>>>>>> f2ee6154f1d90f43283cce4490dd53d641d501d0
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HabitsPage extends PagePanel {
    private static final long serialVersionUID = 25974988494620193L;
    private Button addHabitBtn;
    private Button profileBtn;

<<<<<<< HEAD
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
=======
	public HabitsPage(PageFrame frame) {
		this.setName("Habits Page");
		this.setBackground(Color.LIGHT_GRAY);
		initButtons(frame);
	}
	

	public void initButtons(PageFrame frame) {
		profileBtn = new Button("P");
		this.add(profileBtn);
		HabitsPage p = this;
		profileBtn.addActionListener(new ActionListener() {  
	    	public void actionPerformed(ActionEvent e) {
	    		Main.switchPanels(frame, p, new PageProfile(frame));
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
>>>>>>> f2ee6154f1d90f43283cce4490dd53d641d501d0
