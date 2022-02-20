package hackoverflow.pages;


import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Button;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import hackoverflow.main.Frequency;
import hackoverflow.main.Main;
import hackoverflow.popups.ImagePane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HabitsPage extends PagePanel {
	private int level;
	int curExp;
	int levelExp;
	String title;
	String desc;
	Frequency freq;
	
	/**
	 * Create a new Habit 
	 * @param inTitle
	 * @param inDesc
	 * @param inFreq
	 */
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

	public HabitsPage(PageFrame frame, String inTitle, String inDesc, Frequency inFreq) {
		this.frame = frame;
		init();
		setHabitTitle(inTitle);
		setHabitFrequency(inFreq);
		setHabitDesc(inDesc);
		setHabitLevel(0);
		this.levelExp = 0;
		this.curExp = 0;
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
		
		Button profile = new Button("Profile");
		c.fill = GridBagConstraints.HORIZONTAL;
		topPanel.add(profile, c);
		profile.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		System.out.println("Profile");
	        }
	    });
		
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
		
		Button addHabit = new Button("Add Habit");
		//topPanel.setBounds(320, 30, 200, 40);
		//topPanel.add(addHabit);
		//this.add(addHabit);
		c.fill = GridBagConstraints.HORIZONTAL;
//		gb.weightx = 0.5;
//		gb.gridx = 1;
//		gb.gridy = -1;
		topPanel.add(addHabit, c);
		addHabit.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		ImagePane.main("", "", null, null, "res/pet_moomask3.png");
	        }
	    });
		
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
	
	/**
	 * 
	 */
	private void initButtons() {
		//this.setLayout(null);
		this.setVisible(true);
		
		createProfileBtn();
		
		createAddHabitBtn();
		
		
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
	
	private void createProfileBtn() {
		profileBtn = new Button("Profile");
		HabitsPage page = this;
		profileBtn.setBounds(40, 30, 100, 40);
		//this.add(profileBtn);
		profileBtn.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		Main.switchToProfilePage(frame, page);
	        }  
	    });
	}
	
	private void createAddHabitBtn() {
		addHabitBtn = new Button("Add Habit");
		HabitsPage page = this;
		addHabitBtn.setBounds(40, 30, 100, 40);
		//this.add(profileBtn);
		addHabitBtn.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		Main.switchToProfilePage(frame, page);
	        }  
	    });
	}
	
	/**
	 * Create Button for daily habits
	 */
	private void createDailyBtn() {
		dailyBtn = new Button("Daily");
		dailyBtn.setSize(freqBtnWidth, freqBtnHeight);
		dailyBtn.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		//ImagePane.main("", "", null, null, "res/pet_moomask3.png");
	        }
	    });
	}
	
	/**
	 * Create Button for weekly habits
	 */
	private void createWeeklyBtn() {
		weeklyBtn = new Button("Weekly");
		weeklyBtn.setSize(freqBtnWidth, freqBtnHeight);
		weeklyBtn.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		//ImagePane.main("", "", null, null, "res/pet_moomask3.png");
	        }
	    });
	}
	
	/**
	 * Create Button for monthly habits
	 */
	private void createMonthlyBtn() {
		monthlyBtn = new Button("Monthly");
		monthlyBtn.setSize(freqBtnWidth, freqBtnHeight);
		monthlyBtn.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		//ImagePane.main("", "", null, null, "res/pet_moomask3.png");
	        }
	    });
	}
	
	/**
	 * Create Button for yearly habits
	 */
	private void createYearlyBtn() {
		yearlyBtn = new Button("Yearly");
		yearlyBtn.setSize(freqBtnWidth, freqBtnHeight);
		yearlyBtn.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		//ImagePane.main("", "", null, null, "res/pet_moomask3.png");
	        }
	    });
	}
	
	/**
	 * Gives the current amount of EXP
	 * @return curExp
	 */
	int getHabitCurExp() {
		return this.curExp;
	}
	
	/**
	 * Gives the current amount of EXP needed for next Level
	 * @return levelExp
	 */
	int getHabitLevelExp() {
		return this.levelExp;
	}
	
	/**
	 * Gets the level of the habit
	 * @return
	 */
	int getHabitLevel() {
		return this.level;
	}
	
	/**
	 * Gives the title of the habit
	 * @return title
	 */
	String getHabitTitle() {
		return this.title;
	}
	
	/**
	 * Gives the description of the habit
	 * @return desc
	 */
	String getHabitDesc() {
		return this.desc;
	}
	
	/**
	 * Gives the frequency of the habit
	 * @return freq
	 */
	Frequency getHabitFrequency() {
		return this.freq;
	}
	
	/**
	 * Sets the title of the habit based on inTitle
	 * @param inTitle
	 */
	void setHabitTitle(String inTitle) {
		this.title = new String(inTitle);
	}
	
	/**
	 * Sets the description of the habit based on inDesc
	 * @param inDesc
	 */
	void setHabitDesc(String inDesc) {
		this.desc = new String(inDesc);
	}
	
	/**
	 * Sets the frequency of the habit based on inFreq
	 * @param inFreq
	 */
	void setHabitFrequency(Frequency inFreq) {
		this.freq = inFreq;
	}
	
	/**
	 * Sets the level of the habit based on inLevel
	 * @param inLevel
	 */
	void setHabitLevel (int inLevel) {
		this.level = inLevel;
	}
	
	/**
	 * Sets the amount of EXP needed for next Level
	 * @param inLevel
	 */
	void setHabitLevelExp (int inLevel) {
		this.levelExp = (int) Math.pow(inLevel, 1.5);
	}
	
	/**
	 * Sets the current EXP based on inExp
	 * @param inExp
	 */
	void setHabitExp (int inExp) {
		this.curExp = inExp;
	}
	
	/**
	 * Adds an amount of EXP to current EXP
	 * @param inExp
	 */
	void addHabitExp (int inExp) {
		this.curExp += inExp;
	}
	
	/**
	 * Updates the Exp and level
	 * @param inExp
	 */
	void updateHabitExp(int inExp) {
		if(curExp >= levelExp) {
			int tempEXP = curExp - levelExp;
			setHabitLevel(getHabitLevel() + 1);
			setHabitLevelExp(getHabitLevel());
			setHabitExp(tempEXP);
		}
	}
}

