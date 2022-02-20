package hackoverflow.popups;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;    
public class InstructionPopup  
{     
JFrame jframe;    
// constructor  
int count = 0;
public InstructionPopup()  
{  
	
	String[] titleArray = new String[] {"Welcome to HabPetica", "Making A Habit", "Leveling Up and Earning Tokens", "Buying other pets and swag"};
	String[] instructionArray = new String[] {"Hello there! Welcome to Habpetica!\n\nHabpetica is a game designed to assist you in acquiring"
			+ " and maintaining a healthy lifestyle. The game rewards you when maintain a habit that you set out to accomplish. \n\n"
			+ "Press the next button for more info", "Making a habit is quite easy! All you have to do is click the \"Add Habit\" button "
					+ "in the top right corner of the habits page. After that you can add the title of the habit you want to add, the description,"
					+ " the frequency or how often you want to do the habit you want to maintain. After that it will be added to the habits page"
					+ " and soon enough you will be able to earn tokens for performing your habit!\n\nClick next for more info on how to do this", "To "
							+ "level up you have to complete your habits to the frequency you specified, everytime you do this, you earn experience. Once"
							+ " you earn a certain amount of experience, you level up. When you level up, you earn a certain amount of tokens.These can be used "
							+ "to buy other pets and swag\n\nPress the "
							+ "next button for more info", "Once you have enough tokens, you can click the \"Shop\" button on the right side "
									+ "of the profile page. Here you will find a number of pet eggs and accessories to add to your collection.\n\nPress the \"X\" in the corner to close this window and start playing!!!" };
	
    // creating a Frame   
    jframe = new JFrame();    
    // create buttons  
    JLabel title = new JLabel();  
    title.setFont(new Font("Verdana", Font.PLAIN, 18));
    title.setBorder(new EmptyBorder(20,0,0,0));
    JTextArea instruction = new JTextArea();  
    instruction.setMargin(new Insets(10,10,10,10));
    instruction.setWrapStyleWord(true);
    instruction.setLineWrap(true);
    JButton nextBtn = new JButton("  next  ");    
    JButton prevBtn = new JButton("previous");  
    
    title.setText(titleArray[count]);
    title.setHorizontalAlignment(JLabel.CENTER);
    
    instruction.setText(instructionArray[count]);
    
    
    
    
     // creating an object of the BorderLayout class using   
     // the parameterized constructor where the horizontal gap is 20   
     // and vertical gap is 15. The gap will be evident when buttons are placed   
     // in the frame  
    jframe.setLayout(new BorderLayout(0, 15));  
    jframe.add(title, BorderLayout.NORTH);      
    jframe.add(nextBtn, BorderLayout.EAST);    
    jframe.add(prevBtn, BorderLayout.WEST);    
    jframe.add(instruction, BorderLayout.CENTER); 
    jframe.setLocation(495, 300);
    jframe.setSize(450,400);    
    jframe.setVisible(true);    
    
    nextBtn.addActionListener(new ActionListener()  
    {  
	    public void actionPerformed(ActionEvent ae)  
	    {  
	      
		    if (count < 3)  
		    {  
		      
		    // increase the value of currCard by 1  
		    	count += 1;
		    	title.setText(titleArray[count]);
		    	instruction.setText(instructionArray[count]);
		    	
		    }  
	    }  
    });  
    
    prevBtn.addActionListener(new ActionListener()  
    {  
	    public void actionPerformed(ActionEvent ae)  
	    {  
	      
		    if (count > 0)  
		    {  
		      
		    // increase the value of currCard by 1  
		    	count -= 1;
		    	title.setText(titleArray[count]);
		    	instruction.setText(instructionArray[count]);
		    	prevBtn.setEnabled(true);
		    }
		    
		   
	    }  
    });  
}    
// main method  
public static void main()   
{    
    new InstructionPopup();    
}    
}    

