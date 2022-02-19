package hackoverflow.main;

import java.util.ArrayList;

public class GroupHabits {
	String title;
	String desc;
	ArrayList<Habit> habits = new ArrayList<Habit>();
	
	/**
	 * Create a new Group with a give title and description based on inTitle and inDesc
	 * @param inTitle
	 * @param inDesc
	 */
	GroupHabits(String inTitle, String inDesc) {
		setGroupTitle(inTitle);
		setGroupDesc(inDesc);
	}
	
	/**
	 * Gives title of Group
	 * @return title
	 */
	String getGroupTitle() {
		return this.title;
	}
	
	/**
	 * Gives description of Group
	 * @return desc
	 */
	String getGroupDesc() {
		return this.desc;
	}
	
	/**
	 * Gives habits arraylist of Group
	 * @return habits
	 */
	ArrayList<Habit> getGroup() {
		return this.habits;
	}
	
	/**
	 * Sets the title of Group based on inTitle
	 * @param inTitle
	 */
	void setGroupTitle(String inTitle) {
		this.title = new String(inTitle);
	}
	
	/**
	 * Sets the description of the Group based on inDesc
	 * @param inDesc
	 */
	void setGroupDesc(String inDesc) {
		this.desc = new String(inDesc);
	}
	
	/**
	 * Add a Habit to the Group based on inHabit
	 * @param inHabit
	 */
	void addToGroup(Habit inHabit) {
		this.habits.add(inHabit);
	}
}
