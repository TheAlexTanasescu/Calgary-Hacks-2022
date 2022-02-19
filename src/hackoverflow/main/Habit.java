package hackoverflow.main;
public class Habit {
	int level;
	String title;
	String desc;
	Frequency freq;
	
	Habit(String inTitle, String inDesc, Frequency inFreq) {
		setHabitTitle(inTitle);
		setHabitFrequency(inFreq);
		setHabitDesc(inDesc);
		setHabitLevel(0);
	}
	
	String getHabitTitle() {
		return this.title;
	}
	
	String getHabitDesc() {
		return this.desc;
	}
	
	Frequency getHabitFrequency() {
		return this.freq;
	}
	
	void setHabitTitle(String inTitle) {
		this.title = new String(inTitle);
	}
	
	void setHabitDesc(String inDesc) {
		this.desc = new String(inDesc);
	}
	
	void setHabitFrequency(Frequency inFreq) {
		this.freq = inFreq;
	}
	
	void setHabitLevel (int inLevel) {
		this.level = inLevel;
	}
}