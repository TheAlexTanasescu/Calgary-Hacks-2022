package hackoverflow.pages;

import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import hackoverflow.main.Main;

public class ChangePetPage extends PagePanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3399736171584560442L;
	
	public ChangePetPage() {
		

		JButton btn1 = new JButton(); 
		ImageIcon petIcon = new ImageIcon("res/pet_justin3.png");
		Image img = petIcon.getImage();
		Image newimg = img.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH);
		ImageIcon newIcon = new ImageIcon(newimg);
		btn1.setIcon(newIcon);
		
		
		JButton btn2 = new JButton();
		petIcon = new ImageIcon("res/pet_friedchicken3.png");
		img = petIcon.getImage();
		
		newimg = img.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH);
		newIcon = new ImageIcon(newimg);
		btn2.setIcon(newIcon);
		
		JButton btn3 = new JButton();
		petIcon = new ImageIcon("res/pet_moomask3.png");
		img = petIcon.getImage();
		newimg = img.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH);
		newIcon = new ImageIcon(newimg);
		btn3.setIcon(newIcon);
		
		JButton btn4 = new JButton();
		petIcon = new ImageIcon("res/pet_wiggly3.png");
		img = petIcon.getImage();
		newimg = img.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH);
		newIcon = new ImageIcon(newimg);
		btn4.setIcon(newIcon);
		
		JLabel first = new JLabel("Justin Beaver", SwingConstants.CENTER);
		JLabel second = new JLabel("Phoenix", SwingConstants.CENTER);
		JLabel third = new JLabel("Bull-Dozer", SwingConstants.CENTER);
		JLabel fourth = new JLabel("Sushi", SwingConstants.CENTER);
		
		this.add(btn1);
		this.add(btn2);
		
		this.add(first);
		this.add(second);
		this.add(btn3);
		this.add(btn4);
		this.add(third);
		this.add(fourth);
		this.setLayout(new GridLayout(4, 2, 15, 20));
		this.setSize(480, 720);
		this.setVisible(true);
		
		ChangePetPage pg = this;
		 btn1.addActionListener(new ActionListener() {

	            public void actionPerformed(ActionEvent e) {
	            	ProfilePage.setImageIcon("res/pet_justin3.png");
	            	ProfilePage.petNameLbl.setText("Current Pet: Justin Beaver");
	                Main.switchToProfilePage(pg);
	            }
	        });
		 
		 btn2.addActionListener(new ActionListener() {

	            public void actionPerformed(ActionEvent e) {
	            	ProfilePage.setImageIcon("res/pet_friedchicken3.png");
	            	ProfilePage.petNameLbl.setText("Current Pet: Phoenix");
	                Main.switchToProfilePage(pg);
	            }
	        });
		 
		 btn3.addActionListener(new ActionListener() {

	            public void actionPerformed(ActionEvent e) {
	            	ProfilePage.setImageIcon("res/pet_moomask3.png");
	            	ProfilePage.petNameLbl.setText("Current Pet: Bull-Dozer");
	                Main.switchToProfilePage(pg);
	            }
	        });
		 
		 btn4.addActionListener(new ActionListener() {

	            public void actionPerformed(ActionEvent e) {
	            	ProfilePage.setImageIcon("res/pet_wiggly3.png");
	            	ProfilePage.petNameLbl.setText("Current Pet: Sushi");
	                Main.switchToProfilePage(pg);
	            }
	        });
		
		
	}

}
