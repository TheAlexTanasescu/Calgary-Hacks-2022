package hackoverflow.main;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import hackoverflow.pages.HabitPanel;

import hackoverflow.pages.HabitPanel;

public class Habit {

	private int level;
	int curExp;
	int levelExp;
	String title;
	String desc;
	Frequency freq;
	HabitPanel hPanel;
	
	/**
	 * Create a new Habit 
	 * @param inTitle
	 * @param inDesc
	 * @param inFreq
	 */
	public Habit(String inTitle, String inDesc) {
		setHabitTitle(inTitle);
		//setHabitFrequency(inFreq);
		setHabitDesc(inDesc);
		setHabitLevel(1);
		this.levelExp = 0;
		this.curExp = 0;
		
		int temp1 = getHabitLevelExp();
		hPanel = new HabitPanel(title, 1, desc, 0, temp1);
		Button cmpBtn = hPanel.getCmpBtn();
		cmpBtn.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		System.out.println("Pressed");
	    		updateHabitExp(2);
	    		hPanel.update(curExp);
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
	 * Gives the HabitPanel
	 * @param hp
	 * @return
	 */
	public HabitPanel getHabitPanel() {
		return hPanel;
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
		curExp += inExp;
		if(curExp >= levelExp) {
			int tempEXP = curExp - levelExp;
			setHabitLevel(getHabitLevel() + 1);
			setHabitLevelExp(getHabitLevel());
			setHabitExp(tempEXP);
		}
	}
}