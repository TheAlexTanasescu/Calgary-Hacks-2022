package hackoverflow.pages;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;

import java.awt.*;  
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.GridBagConstraints;

import hackoverflow.main.Frequency;
import hackoverflow.main.Main;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HabitsPage extends PagePanel {
	private static final long serialVersionUID = 25974988494620193L;
	private Button addHabitBtn;
	private Button profileBtn;
	
	int level;
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
	
	public HabitsPage(PageFrame frame, String inTitle, String inDesc, Frequency inFreq) {
		this.setName("Habits Page");
		this.setBackground(Color.LIGHT_GRAY);
		setHabitTitle(inTitle);
		setHabitFrequency(inFreq);
		setHabitDesc(inDesc);
		setHabitLevel(0);
		this.levelExp = 0;
		this.curExp = 0;
		initButtons(frame);
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
		b.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		//frame.
	    		//frame.add(new PagePanel(frame));
	    		System.out.print("Welcome to Javatpoint.");
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
