package hackoverflow.pages;


import javax.swing.JLabel;

import java.awt.Button;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import hackoverflow.main.Frequency;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Main page
 * @author skusj
 *
 */
public class MainPage extends PagePanel {
	private static final long serialVersionUID = 25974988494620193L;
	
	private int level;
	int curExp;
	int levelExp;
	String title;
	String desc;
	Frequency freq;
	
	
	private final int freqBtnWidth = 80;
	private final int freqBtnHeight = 30;
	
	private Button dailyBtn;
	private Button weeklyBtn;
	private Button monthlyBtn;
	private Button yearlyBtn;
	private PageFrame frame;

	public MainPage(PageFrame frame, String inTitle, String inDesc, Frequency inFreq) {
		this.frame = frame;
		init();
		setHabitTitle(inTitle);
		setHabitFrequency(inFreq);
		setHabitDesc(inDesc);
		setHabitLevel(0);
		this.levelExp = 0;
		this.curExp = 0;
	}
	
	/**
	 * Initializes the components of the main page
	 */
	private void init() {
		initButtons();
		initLayout();
	}

	/**
	 * Initializes and adds the components to the main page with a grid layout
	 */
	private void initLayout() {
		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		// Top pane
		TopPanel tPanel = new TopPanel(this);
		c.fill = GridBagConstraints.BOTH;
		c.weightx = 1;
		c.weighty = 0.3;
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 1;
		c.anchor = GridBagConstraints.PAGE_START;
		c.insets = new Insets(0, 0, 0, 0);
		this.add(tPanel, c);
		
		// Label
		JLabel nameLbl = new JLabel("Habits");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.7;
		c.weighty = 0.05;
		c.gridx = 0;
		c.gridy = 1;
		c.gridwidth = 1;
		c.gridheight = 1;
		c.insets = new Insets(0, 215, 0, 0);
		c.anchor = GridBagConstraints.CENTER;
		this.add(nameLbl, c);
		
		
		// Daily button
		c.fill = GridBagConstraints.BOTH;
		c.weightx = 0.7;
		c.weighty = 0.15;
		c.gridx = 0;
		c.gridy = 2;
		c.gridwidth = 1;
		c.insets = new Insets(2, 30, 8, 30);
		this.add(dailyBtn, c);
		
		// Weekly button
		c.fill = GridBagConstraints.BOTH;
		c.weightx = 0.7;
		c.weighty = 0.15;
		c.gridx = 0;
		c.gridy = 3;
		c.gridwidth = 1;
		c.insets = new Insets(2, 30, 8, 30);
		this.add(weeklyBtn, c);

		// Monthly button
		c.fill = GridBagConstraints.BOTH;
		c.weightx = 0.7;
		c.weighty = 0.15;
		c.gridx = 0;
		c.gridy = 4;
		c.gridwidth = 1;
		c.insets = new Insets(2, 30, 8, 30);
		this.add(monthlyBtn, c);
		
		// Yearly button
		c.fill = GridBagConstraints.BOTH;
		c.weightx = 0.7;
		c.weighty = 0.15;
		c.gridx = 0;
		c.gridy = 5;
		c.gridwidth = 1;
		c.insets = new Insets(2, 30, 8, 30);
		this.add(yearlyBtn, c);
	}
	
	/**
	 * Initializes the frequency buttons
	 */
	private void initButtons() {
		createDailyBtn();
		createWeeklyBtn();
		createMonthlyBtn();
		createYearlyBtn();
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
