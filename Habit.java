public class Habit {
	String text;
	Frequency freq;
	Habit(String inText, Frequency inFreq) {
		this.text = inText;
		this.freq = inFreq;
	}
	
	String getHabitText() {
		return this.text;
	}
	
	Frequency getHabitFrequency() {
		return this.freq;
	}
}