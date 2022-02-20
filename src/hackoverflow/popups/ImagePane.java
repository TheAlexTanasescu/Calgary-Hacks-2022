package hackoverflow.popups;
import hackoverflow.main.*;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class ImagePane 
{
	
	private static JOptionPane popup;
	public static void main(String message, String title, String[] args, User u, ImageIcon icon)
	{
		//popup = new JOptionPane();
		
		
	    //String name=popup.showInputDialog(null, "Habit to Add", "Add Habit", JOptionPane.INFORMATION_MESSAGE);
	    
		JTextField habitTitle = new JTextField();
		JTextField description = new JTextField();
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

		String[] options = new String[2];
		options[0] = "Add Habit";
		options[1] = "Cancel";
		
		//int option = JOptionPane.showConfirmDialog(null, messageArr, "Add New Habit", JOptionPane.OK_CANCEL_OPTION);
		int option = JOptionPane.showOptionDialog(null, messageArr, "Add New Habit", 0, JOptionPane.INFORMATION_MESSAGE, null, options, null);
		if (option == JOptionPane.OK_OPTION) {
		    if (habitTitle.getText().equals("h") && description.getText().equals("h")) {
		        System.out.println("Login successful");
		    } else {
		        System.out.println("login failed");
		    }
		} else {
		    System.out.println("Login canceled");
		}
	   

		
	}
}