package hackoverflow.pages;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class HabitsPage extends PagePanel {
	private static final long serialVersionUID = 25974988494620193L;
	private Button profileBtn;
	private Button addBtn;
	private JPanel topPanel;
	
	public HabitsPage() {
		this.setBackground(Color.LIGHT_GRAY);
		addButtons();

		JPanel listPane = new JPanel();
		listPane.setLayout(new BoxLayout(listPane, BoxLayout.PAGE_AXIS));
		JLabel label = new JLabel("Hi");
		listPane.add(label);
		listPane.add(Box.createRigidArea(new Dimension(0,5)));
		
		topPanel = new JPanel();
		topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.LINE_AXIS));
		topPanel.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));
		topPanel.add(Box.createHorizontalGlue());
		topPanel.add(profileBtn);
		topPanel.add(Box.createRigidArea(new Dimension(10, 0)));
		topPanel.add(addBtn);
		
		this.add(topPanel, BorderLayout.CENTER);
		this.add(topPanel, BorderLayout.PAGE_END);
		//topPanel.add(profileBtn, Component.LEFT_ALIGNMENT);
		//topPanel.add(addBtn, Component.RIGHT_ALIGNMENT);
		
		setVisible(true);
	}
	
	public void addButtons() {
		// Buttons
		profileBtn = new Button("profile");
		addBtn = new Button("add");
		
		profileBtn.setSize(30, 30);
		addBtn.setSize(30, 30);
		
		
	}
}
