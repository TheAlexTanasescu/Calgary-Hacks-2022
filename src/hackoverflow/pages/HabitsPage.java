package hackoverflow.pages;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class HabitsPage extends PagePanel {
	private static final long serialVersionUID = -7676600580151846300L;
	
	public HabitsPage() {
		init();
	}
	
	/**
	 * Initializes the components of the main page
	 */
	private void init() {
		initLayout();
	}

	private void initLayout() {
		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		JPanel inPanel = new JPanel();
		
		// Top pane
		HPTopPanel tPanel = new HPTopPanel(this, inPanel);
		c.fill = GridBagConstraints.BOTH;
		c.weightx = 1;
		c.weighty = 0.1;
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 1;
		c.anchor = GridBagConstraints.PAGE_START;
		c.insets = new Insets(0, 0, 0, 0);
		this.add(tPanel, c);
		
		//Scroll Pane
		
		inPanel.setBackground(Color.WHITE);
		inPanel.setLayout(new BoxLayout(inPanel, BoxLayout.PAGE_AXIS));
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setViewportView(inPanel);
		// Test Habits
		/*
		inPanel.add(new HabitPanel(name, flags, name, flags));
		inPanel.add(Box.createRigidArea(new Dimension(0, 10)));
		inPanel.add(new HabitPanel());
		inPanel.add(Box.createRigidArea(new Dimension(0, 10)));
		inPanel.add(new HabitPanel());
		inPanel.add(Box.createRigidArea(new Dimension(0, 10)));
		inPanel.add(new HabitPanel());
		inPanel.add(new HabitPanel());
		inPanel.add(new HabitPanel());*/
		// End test
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.7;
		c.weighty = 0.8;
		c.gridx = 0;
		c.gridy = 1;
		c.gridwidth = 1;
		c.gridheight = 1;
		c.insets = new Insets(10, 10, 0, 10);
		c.anchor = GridBagConstraints.CENTER;
		this.add(scrollPane, c);
	}


}
