package hackoverflow.pages;

import java.awt.Button;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;

import hackoverflow.main.Habit;
import hackoverflow.main.Main;

public class HabitPanel extends JPanel {
	private static final long serialVersionUID = 4842251332912377960L;

	public HabitPanel(String title, int level, String description, int EXP) {
		super();
		this.setSize(Main.width - 40, 150);
		this.setBorder(BorderFactory.createLineBorder(Color.black));
		this.setLayout(new GridBagLayout());
		
		GridBagConstraints c = new GridBagConstraints();
		
		// Title
		JLabel titleLbl = new JLabel(title);
		c.weightx = 0.15;
		c.gridwidth = 1;
		c.gridx = 0;
		c.gridy = 0;
		c.insets = new Insets(0,2,2,2);
		c.anchor = GridBagConstraints.FIRST_LINE_START;
		this.add(titleLbl, c);
		
		// filler
		JLabel empty = new JLabel("");
		c.weightx = 0.7;
		c.gridwidth = 1;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 0;
		c.anchor = GridBagConstraints.PAGE_START;
		this.add(empty, c);
		
		//Conversion of Level from integer to String.
		String lvl = String.valueOf(level);
		
		// Level
		JLabel lvlLbl = new JLabel(lvl);
		c.weightx = 0.15;
		c.gridwidth = 1;
		c.insets = new Insets(0,2,2,2);
		c.gridx = 2;
		c.gridy = 0;
		c.anchor = GridBagConstraints.FIRST_LINE_END;
		this.add(lvlLbl, c);
		
		// Description
		JTextField descTxtField = new JTextField("Description");
		descTxtField.setEditable(false);
		descTxtField.setSize(20, 40);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weighty = 0.3;
		c.gridx = 0;
		c.gridy = 1;
		c.gridwidth = 3;
		c.gridheight = 1;
		c.anchor = GridBagConstraints.LINE_START;
		c.insets = new Insets(5, 10, 5, 10);
		this.add(descTxtField, c);
			
		//Progress Bar
		JProgressBar prgBar = new JProgressBar();
		prgBar.setValue(EXP);
		prgBar.setStringPainted(true);
		prgBar.setSize(20, 100);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.7;
		c.weighty = 0.1;
		c.gridx = 0;
		c.gridy = 2;
		c.gridwidth = 3;
		c.gridheight = 1;
		c.anchor = GridBagConstraints.CENTER;
		c.insets = new Insets(5, 50, 5, 50);
		this.add(prgBar, c);
		
		// Complete habit button
		Button completeBtn = new Button("Complete");
		c.weightx = 0.5;
		c.gridx = 0;
		c.gridy = 3;
		c.gridwidth = 3;
		c.anchor = GridBagConstraints.PAGE_END;
		c.insets = new Insets(20,50,10,50);
		this.add(completeBtn, c);
		
	}
}
