package hackoverflow.popups;
import hackoverflow.main.*;
import hackoverflow.pages.ProfilePage;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ImagePane {
	
	private static JOptionPane popup;
	public ImagePane(String message, String title, User u, String icon) {
		//popup = new JOptionPane();
		
		
	    //String name=popup.showInputDialog(null, "Habit to Add", "Add Habit", JOptionPane.INFORMATION_MESSAGE);
	    
		JTextField habitTitle = new JTextField();
		JTextArea description = new JTextArea(3,20);
	    description.setLineWrap(true);
	    description.setWrapStyleWord(true); 
		JRadioButton checkBox1 = new JRadioButton("Daily");   
        JRadioButton checkBox2 = new JRadioButton("Weekly");  
        JRadioButton checkBox3 = new JRadioButton("Monthly");  
        JRadioButton checkBox4 = new JRadioButton("Yearly");  
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
		    "Title:", habitTitle,
		    "Description:", description,
		    "Frequency:", checkBox1, checkBox2, checkBox3, checkBox4
		    
		};
		
		String tempTitle = habitTitle.getText();
		System.out.println(habitTitle.getText());
		String tempDescription = description.getText();
		System.out.println(description.getText());
		Frequency frequency = null;
		if(checkBox1.isSelected()) {
			frequency = Frequency.Daily;
			System.out.println(1);
		} else if(checkBox2.isSelected()) {
			frequency = Frequency.Weekly;
			System.out.println(2);
		} else if(checkBox3.isSelected()) {
			frequency = Frequency.Monthly;
			System.out.println(3);
		} else if(checkBox4.isSelected()) {
			frequency = Frequency.Anually;
			System.out.println(4);
		}
		
		

		String[] options = new String[2];
		options[0] = "Add Habit";
		options[1] = "Cancel";
		
		ImageIcon petIcon = new ImageIcon(icon);
		Image img = petIcon.getImage();
		Image newimg = img.getScaledInstance(100, 100,  java.awt.Image.SCALE_SMOOTH);
		ImageIcon newIcon = new ImageIcon(newimg);

		
		//int option = JOptionPane.showConfirmDialog(null, messageArr, "Add New Habit", JOptionPane.OK_CANCEL_OPTION);
		int option = JOptionPane.showOptionDialog(null, messageArr, "Add New Habit", 0, JOptionPane.INFORMATION_MESSAGE, newIcon, options, null);
		if (option == JOptionPane.OK_OPTION) {
		    if (habitTitle.getText().equals("h") && description.getText().equals("h")) {
		    	Habit habit = new Habit(tempTitle, tempDescription, frequency);
		        //System.out.println("Login successful");
		    } else {
		        //System.out.println("login failed");
		    }
		} else {
		    //System.out.println("Login canceled");
		}
	}
}