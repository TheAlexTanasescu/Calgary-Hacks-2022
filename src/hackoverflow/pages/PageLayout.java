package hackoverflow.pages;

import java.awt.Button;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JPanel;

public class PageLayout extends GridBagLayout {
	private static final long serialVersionUID = -5633332195431721717L;
	private GridBagConstraints gbc;
	private Button profileBtn;
	private Button addBtn;
	
	public PageLayout() {
		initButtons();
		
		// GridBagConstraints
		gbc = new GridBagConstraints();
		gbc.weightx = 1;
		gbc.weighty = 1;
		gbc.fill = GridBagConstraints.BOTH;
	}
	
	private void initButtons() {
		// Buttons
		profileBtn = new Button("profile");
		addBtn = new Button("add");
		
		profileBtn.setSize(30, 30);
		addBtn.setSize(30, 30);
				
	}
	public void setGrid(PagePanel panel) {
		panel.setLayout(this);
		//
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.anchor = GridBagConstraints.FIRST_LINE_START;
		gbc.gridx = 0;  
	    gbc.gridy = 0;
	    gbc.weightx = 1;
	    gbc.gridwidth = 1;
	    gbc.gridheight = 1;
	    gbc.insets = new Insets(10,10,10,180);
	    this.setConstraints(profileBtn, gbc);
	    panel.add(profileBtn);
	    
	    gbc.anchor = GridBagConstraints.FIRST_LINE_END;
	    gbc.gridx = 1;  
	    gbc.gridy = 0;  
	    gbc.insets = new Insets(10,180,10,10);
	    this.setConstraints(addBtn, gbc);
	    panel.add(addBtn);
	    
	    
	    /*gbc.gridy = 1;
	    JPanel p = new JPanel();
	    p.setBounds(0, 0, 200, 200);
	    this.setConstraints(p, gbc);
	    panel.add(p);*/
	}
}
