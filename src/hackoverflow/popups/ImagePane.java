package hackoverflow.popups;
import hackoverflow.main.*;
import hackoverflow.pages.HabitPanel;
import hackoverflow.pages.ProfilePage;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ImagePane {
	
	private static JOptionPane popup;

	public ImagePane(String message, String title, User u, String icon, JPanel inPanel) {
		//popup = new JOptionPane();
		
	    //String name=popup.showInputDialog(null, "Habit to Add", "Add Habit", JOptionPane.INFORMATION_MESSAGE);
	    
		JTextField habitTitle = new JTextField();
		JTextArea description = new JTextArea(3,20);
	    description.setLineWrap(true);
	    description.setWrapStyleWord(true); 
//		JRadioButton checkBox1 = new JRadioButton("Daily");   
//        JRadioButton checkBox2 = new JRadioButton("Weekly");  
//        JRadioButton checkBox3 = new JRadioButton("Monthly");  
//        JRadioButton checkBox4 = new JRadioButton("Yearly");  
//        checkBox1.setBounds(100,100, 50,50); 
//        checkBox2.setBounds(100,150, 50,50);  
//        checkBox3.setBounds(100,100, 50,50);  
//        checkBox4.setBounds(100,150, 50,50);  
//        
//        
//        ButtonGroup bg = new ButtonGroup();    
//        bg.add(checkBox1);
//        bg.add(checkBox2); 
//        bg.add(checkBox3);
//        bg.add(checkBox4);
		Object[] messageArr = {
		    "Title:", habitTitle,
		    "Description:", description,
		    //"Frequency:", checkBox1, checkBox2, checkBox3, checkBox4
		    
		};

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
			Habit habit = new Habit(habitTitle.getText(), description.getText());
			inPanel.add(habit.getHabitPanel());
			inPanel.revalidate();
			inPanel.repaint();

		    if (habitTitle.getText().equals("h") && description.getText().equals("h")) {
		        //System.out.println("Login successful");
		    } else {
		        //System.out.println("login failed");
		    }
		} else {
		    //System.out.println("Login canceled");
		}
	}
}