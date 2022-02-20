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
		
		JLabel price1 = new JLabel("5000 Tokens", SwingConstants.CENTER);
		JLabel price2 = new JLabel("5000 Tokens", SwingConstants.CENTER);
		JLabel price3 = new JLabel("5000 Tokens", SwingConstants.CENTER);
		JLabel price4 = new JLabel("5000 Tokens", SwingConstants.CENTER);

		
		
		
		this.add(btn1); 
		this.add(btn2); 
		this.add(price1);
		this.add(price2);
		this.add(btn3);  
		this.add(btn4); 
		this.add(price3);
		this.add(price4);
		
		this.setLayout(new GridLayout(4,2)); 
		this.setSize(480,720);    
		this.setVisible(true);  
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
