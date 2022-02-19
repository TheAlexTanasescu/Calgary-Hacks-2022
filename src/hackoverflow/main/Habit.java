package hackoverflow.main;
public class Habit {
	int level;
	String title;
	String desc;
	Frequency freq;
	
	/**
	 * Create a new Habit 
	 * @param inTitle
	 * @param inDesc
	 * @param inFreq
	 */
	Habit(String inTitle, String inDesc, Frequency inFreq) {
		setHabitTitle(inTitle);
		setHabitFrequency(inFreq);
		setHabitDesc(inDesc);
		setHabitLevel(0);
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
}