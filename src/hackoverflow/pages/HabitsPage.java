package hackoverflow.pages;


import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Button;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import hackoverflow.main.Main;
import hackoverflow.popups.ImagePane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HabitsPage extends PagePanel {
	private static final long serialVersionUID = 25974988494620193L;
	private Button addHabitBtn;
	
	private final int freqBtnWidth = 80;
	private final int freqBtnHeight = 30;
	
	private Button profileBtn;
	private Button dailyBtn;
	private Button weeklyBtn;
	private Button monthlyBtn;
	private Button yearlyBtn;
	
	private PageFrame frame;

	public HabitsPage(PageFrame frame) {
		this.frame = frame;
		init();
		
		//TEST
		//addHabit(frame);
	}
	
	private void init() {
		initButtons();
		initLayout();
	}

	private void initLayout() {
		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		// Top pane
		JPanel topPanel = new JPanel();
		topPanel.add(new JLabel("Top Panel"));
		topPanel.setSize(Main.width, 200);
		c.fill = GridBagConstraints.BOTH;
		c.weightx = 1;
		c.weighty = 0.4;
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 1;
		c.anchor = GridBagConstraints.PAGE_START;
		c.insets = new Insets(0, 0, 5, 0);
		this.add(topPanel, c);
		
		// Daily button
		c.fill = GridBagConstraints.BOTH;
		c.weightx = 0.7;
		c.gridx = 0;
		c.gridy = 1;
		c.gridwidth = 1;
		c.insets = new Insets(8, 30, 8, 30);
		this.add(dailyBtn, c);
		
		// Weekly button
		c.fill = GridBagConstraints.BOTH;
		c.weightx = 0.7;
		c.gridx = 0;
		c.gridy = 2;
		c.gridwidth = 1;
		c.insets = new Insets(8, 30, 8, 30);
		this.add(weeklyBtn, c);

		// Monthly button
		c.fill = GridBagConstraints.BOTH;
		c.weightx = 0.7;
		c.gridx = 0;
		c.gridy = 3;
		c.gridwidth = 1;
		c.insets = new Insets(8, 30, 8, 30);
		this.add(monthlyBtn, c);
		
		// Yearly button
		c.fill = GridBagConstraints.BOTH;
		c.weightx = 0.7;
		c.gridx = 0;
		c.gridy = 4;
		c.gridwidth = 1;
		c.insets = new Insets(8, 30, 8, 30);
		this.add(yearlyBtn, c);
	}
	
	private void initButtons() {
		//this.setLayout(null);
		this.setVisible(true);
		
		profileBtn = new Button("Profile");
		HabitsPage page = this;
		profileBtn.setBounds(40, 30, 100, 40);
		//this.add(profileBtn);
		profileBtn.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		Main.switchToProfilePage(frame, page);
	        }  
	    });
		
		Button addHabit = new Button("Add Habit");
		addHabit.setBounds(320, 30, 100, 40);
		//this.add(addHabit);
		addHabit.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		ImagePane.main("", "", null, null, "res/pet_moomask3.png");
	        }
	    });
		
		createDailyBtn();
		createWeeklyBtn();
		createMonthlyBtn();
		createYearlyBtn();
	}
	
	// TEST
	// Add Habit to a fixed location
	private void addHabit(PageFrame frame) {
		HabitPanel h = new HabitPanel();
		h.setBounds(10,100, Main.width - 40, 150);
		this.add(h);
		frame.validate();
	}
	
	private void createDailyBtn() {
		dailyBtn = new Button("Daily");
		dailyBtn.setSize(freqBtnWidth, freqBtnHeight);
		dailyBtn.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		//ImagePane.main("", "", null, null, "res/pet_moomask3.png");
	        }
	    });
	}
	
	private void createWeeklyBtn() {
		weeklyBtn = new Button("Weekly");
		weeklyBtn.setSize(freqBtnWidth, freqBtnHeight);
		weeklyBtn.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		//ImagePane.main("", "", null, null, "res/pet_moomask3.png");
	        }
	    });
	}
	private void createMonthlyBtn() {
		monthlyBtn = new Button("Monthly");
		monthlyBtn.setSize(freqBtnWidth, freqBtnHeight);
		monthlyBtn.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		//ImagePane.main("", "", null, null, "res/pet_moomask3.png");
	        }
	    });
	}
	
	private void createYearlyBtn() {
		yearlyBtn = new Button("Yearly");
		yearlyBtn.setSize(freqBtnWidth, freqBtnHeight);
		yearlyBtn.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		//ImagePane.main("", "", null, null, "res/pet_moomask3.png");
	        }
	    });
	}
	/*
	private void addHabit() {
		addHabitBtn = new Button("Add Habit");
		this.add(addHabitBtn);
		addHabitBtn.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		System.out.print("Adding Habit");
	        }  
	    });
	}*/
}

