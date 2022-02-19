package hackoverflow.main;

import java.util.ArrayList;

public class GroupHabits {
	String title;
	String desc;
	ArrayList<Habit> habits = new ArrayList<Habit>();
	
	GroupHabits(String inTitle, String inDesc) {
		setGroupTitle(inTitle);
		setGroupDesc(inDesc);
	}
	
	String getGroupTitle() {
		return this.title;
	}
	
	String getGroupDesc() {
		return this.desc;
	}
	
	ArrayList<Habit> getGroup() {
		return this.habits;
	}
	
	void setGroupTitle(String inTitle) {
		this.title = new String(inTitle);
	}
	
	void setGroupDesc(String inDesc) {
		this.desc = new String(inDesc);
	}
	
	void addToGroup(Habit inHabit) {
		this.habits.add(inHabit);
	}
}
