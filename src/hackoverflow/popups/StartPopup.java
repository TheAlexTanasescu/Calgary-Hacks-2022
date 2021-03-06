package hackoverflow.popups;

import java.awt.Image;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import hackoverflow.main.Main;
import hackoverflow.main.User;
import hackoverflow.pages.PagePanel;
import hackoverflow.pages.ProfilePage;

public class StartPopup extends PagePanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6574452451327197543L;
	//private static JOptionPane startPopup;
	
	public static String playerName;
	public StartPopup()
	{
		JLabel intro = new JLabel("Let's begin with your name. What is it?");
		JTextField name = new JTextField();
		JLabel choice = new JLabel("I have four HabPets from you to choose from. Which one do you pick?");
		
		//JLabel first = new JLabel("Justin Beaver");
		ImageIcon petIcon = new ImageIcon("res/pet_justin0.png");
		Image img = petIcon.getImage();
		Image newimg = img.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH);
		ImageIcon newIcon = new ImageIcon(newimg);
		JLabel first = new JLabel(newIcon);
		
		JRadioButton checkBox1 = new JRadioButton("Justin Beaver");
		 petIcon = new ImageIcon("res/pet_moomask0.png");
		 img = petIcon.getImage();
		 newimg = img.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH);
		 newIcon = new ImageIcon(newimg);
		 JLabel second = new JLabel(newIcon);
        JRadioButton checkBox2 = new JRadioButton("Bull-Dozer"); 
        petIcon = new ImageIcon("res/pet_friedchicken0.png");
		 img = petIcon.getImage();
		 newimg = img.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH);
		 newIcon = new ImageIcon(newimg);
		 JLabel third = new JLabel(newIcon);
        JRadioButton checkBox3 = new JRadioButton("Phoenix");
        petIcon = new ImageIcon("res/pet_wiggly0.png");
		 img = petIcon.getImage();
		 newimg = img.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH);
		 newIcon = new ImageIcon(newimg);
		 JLabel fourth = new JLabel(newIcon);
        JRadioButton checkBox4 = new JRadioButton("Sushi"); 
        checkBox1.setBounds(100,100, 50,50); 
        checkBox2.setBounds(100,150, 50,50);  
        checkBox3.setBounds(100,100, 50,50);  
        checkBox4.setBounds(100,150, 50,50); 
        ButtonGroup bg=new ButtonGroup();    
        bg.add(checkBox1);
        bg.add(checkBox2); 
        bg.add(checkBox3);
        bg.add(checkBox4);
		Object[] messageArr = {
			intro,
		    "Name", name,
		    choice,
		    "HabPet:\n", checkBox1,first, checkBox2, second, checkBox3, third, checkBox4, fourth
		    
		};
		int option = JOptionPane.showOptionDialog(null, messageArr, "Add New Habit", 0, JOptionPane.PLAIN_MESSAGE, null, null, null);
		
		ProfilePage.changePlayerName(name.getText());
		if (checkBox1.isSelected())
		{
			ProfilePage.setImageIcon("res/pet_justin0.png");
        	ProfilePage.petNameLbl.setText("Current Pet: Justin Beaver Egg");
            
		}
		else if (checkBox2.isSelected())
		{
			ProfilePage.setImageIcon("res/pet_moomask0.png");
        	ProfilePage.petNameLbl.setText("Current Pet: Bull-Dozer Egg");
            
		}
		else if (checkBox3.isSelected())
		{
			ProfilePage.setImageIcon("res/pet_friedchicken0.png");
        	ProfilePage.petNameLbl.setText("Current Pet: Phoenix Egg");
            
		}
		else
		{
			
			ProfilePage.setImageIcon("res/pet_wiggly0.png");
        	ProfilePage.petNameLbl.setText("Current Pet: Bull-Dozer Egg");
	            
			
		}
	}

}
