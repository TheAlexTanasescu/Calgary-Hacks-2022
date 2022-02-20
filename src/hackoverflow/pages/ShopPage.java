package hackoverflow.pages;


import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import hackoverflow.main.Main;

public class ShopPage extends PagePanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1525111320889364829L;

	
	 
	
	public ShopPage() 
	{
		
		JPanel panel = new JPanel();   
		  
		
	
		JButton btn1 = new JButton(); 
		ImageIcon petIcon = new ImageIcon("res/pet_justin0.png");
		Image img = petIcon.getImage();
		Image newimg = img.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH);
		ImageIcon newIcon = new ImageIcon(newimg);
		
		btn1.setIcon(newIcon);
		JButton btn2 = new JButton();
		petIcon = new ImageIcon("res/pet_friedchicken0.png");
		img = petIcon.getImage();
		
		newimg = img.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH);
		newIcon = new ImageIcon(newimg);
		btn2.setIcon(newIcon);
		JButton btn3 = new JButton();
		petIcon = new ImageIcon("res/pet_moomask0.png");
		img = petIcon.getImage();
		newimg = img.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH);
		newIcon = new ImageIcon(newimg);
		btn3.setIcon(newIcon);
		JButton btn4 = new JButton();
		petIcon = new ImageIcon("res/pet_wiggly0.png");
		img = petIcon.getImage();
		newimg = img.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH);
		newIcon = new ImageIcon(newimg);
		btn4.setIcon(newIcon);
		
		JLabel price1 = new JLabel("500 Tokens", SwingConstants.CENTER);
		JLabel price2 = new JLabel("500 Tokens", SwingConstants.CENTER);
		JLabel price3 = new JLabel("500 Tokens", SwingConstants.CENTER);
		JLabel price4 = new JLabel("500 Tokens", SwingConstants.CENTER);

		
		JButton backBtn = new JButton("Back");
		this.setLayout(new BorderLayout(0, 15)); 
		JLabel filler = new JLabel(" ");
		JLabel filler2 = new JLabel(" ");
		JLabel filler3 = new JLabel(" ");
		JLabel filler4 = new JLabel(" ");
		this.add(backBtn, BorderLayout.WEST);
		this.add(panel, BorderLayout.CENTER);
		
		ShopPage pg = this;
		 backBtn.addActionListener(new ActionListener() {

	            public void actionPerformed(ActionEvent e) {
	                Main.switchToProfilePage(pg);
	            }
	        });
		 
		 btn1.addActionListener(new ActionListener() {

	            public void actionPerformed(ActionEvent e) {
	            	ProfilePage.count -= 500;
	    			ProfilePage.tokenLabel.setText("Tokens: "+ Integer.toString(ProfilePage.count));
	            }
	        });
		 
		 btn2.addActionListener(new ActionListener() {

	            public void actionPerformed(ActionEvent e) {
	            	ProfilePage.count -= 500;
	    			ProfilePage.tokenLabel.setText("Tokens: "+ Integer.toString(ProfilePage.count));
	            }
	        });
		 
		 btn3.addActionListener(new ActionListener() {

	            public void actionPerformed(ActionEvent e) {
	            	ProfilePage.count -= 500;
	    			ProfilePage.tokenLabel.setText("Tokens: "+ Integer.toString(ProfilePage.count));
	            }
	        });
		 
		 btn4.addActionListener(new ActionListener() {

	            public void actionPerformed(ActionEvent e) {
	            	ProfilePage.count -= 500;
	    			ProfilePage.tokenLabel.setText("Tokens: "+ Integer.toString(ProfilePage.count));
	            }
	        });
		 
		//this.add(filler3, BorderLayout.EAST);
		
		panel.add(btn1); 
		panel.add(btn2); 
		panel.add(price1);
		panel.add(price2);
		panel.add(btn3);  
		panel.add(btn4); 
		panel.add(price3);
		panel.add(price4);
		
		panel.setLayout(new GridLayout(4,2)); 
		panel.setSize(480,720);    
		panel.setVisible(true);  
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
