package hackoverflow.pages;


import javax.swing.JLabel;

import java.awt.Button;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import hackoverflow.main.Frequency;
import hackoverflow.main.Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Main page
 * @author skusj
 *
 */
public class MainPage extends PagePanel {
	private static final long serialVersionUID = 25974988494620193L;
	private final int freqBtnWidth = 80;
	private final int freqBtnHeight = 30;
	
	private Button dailyBtn;
	private Button weeklyBtn;
	private Button monthlyBtn;
	private Button yearlyBtn;
	private PageFrame frame;

	public MainPage(PageFrame frame) {
		this.frame = frame;
		init();
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
	 * 
	 * 
	 */
	private void initButtons() {
		//this.setLayout(null);
		this.setVisible(true);
		createDailyBtn();
		createWeeklyBtn();
		createMonthlyBtn();
		createYearlyBtn();
	}
	
	/**
	 * Create Button for daily habits
	 */
	private void createDailyBtn() {
		dailyBtn = new Button("Daily");
		dailyBtn.setSize(freqBtnWidth, freqBtnHeight);
		PagePanel p = this;
		dailyBtn.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		Main.switchToHabitsPage(p);
	        }
	    });
	}
	
	/**
	 * Create Button for weekly habits
	 */
	private void createWeeklyBtn() {
		weeklyBtn = new Button("Weekly");
		weeklyBtn.setSize(freqBtnWidth, freqBtnHeight);
		weeklyBtn.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		//ImagePane.main("", "", null, null, "res/pet_moomask3.png");
	        }
	    });
	}
	
	/**
	 * Create Button for monthly habits
	 */
	private void createMonthlyBtn() {
		monthlyBtn = new Button("Monthly");
		monthlyBtn.setSize(freqBtnWidth, freqBtnHeight);
		monthlyBtn.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		//ImagePane.main("", "", null, null, "res/pet_moomask3.png");
	        }
	    });
	}
	
	/**
	 * Create Button for yearly habits
	 */
	private void createYearlyBtn() {
		yearlyBtn = new Button("Yearly");
		yearlyBtn.setSize(freqBtnWidth, freqBtnHeight);
		yearlyBtn.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		//ImagePane.main("", "", null, null, "res/pet_moomask3.png");
	        }
	    });
	}
}
