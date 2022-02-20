package hackoverflow.popups;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class StartPopup {
	
	private static JOptionPane startPopup;
	
	public static void main()
	{
		JLabel intro = new JLabel("Let's begin with your name. What is it?");
		JTextField name = new JTextField();
		JRadioButton checkBox1 = new JRadioButton("Justin Biever");   
        JRadioButton checkBox2 = new JRadioButton("Big Mac");  
        JRadioButton checkBox3 = new JRadioButton("Firequacker");  
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
			"Intro", intro,
		    "Name", name,
		    "Habpet:", checkBox1, checkBox2, checkBox3, checkBox4
		    
		};
	}

}
