package hackoverflow.main;
import java.awt.Color;
//import java.awt.GridBagConstraints;
//import java.awt.GridBagLayout;


public class HabitFrame extends javax.swing.JFrame {

	public StartPanel panel;
	public HabitFrame() {		
		
		panel = new StartPanel(this);
		panel.setLocation(0, 0);
		panel.setSize(this.getSize());
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setVisible(true);
		
		this.add(panel);
		
		
	}
	
	public boolean isFinished() {
		return panel.isFinished;
	}
}
    

