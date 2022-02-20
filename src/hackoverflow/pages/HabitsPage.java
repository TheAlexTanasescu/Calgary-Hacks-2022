package hackoverflow.pages;

import java.awt.*;  
import javax.swing.JFrame;

import hackoverflow.popups.ImagePane;

import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HabitsPage extends javax.swing.JPanel {
    private static final long serialVersionUID = 25974988494620193L;
    private PageFrame habitsFrame;
    
    public HabitsPage(JFrame frame) {
        //setBackground(Color.LIGHT_GRAY);
        setLayout(new GridBagLayout());
        
        
        GridBagConstraints gb = new GridBagConstraints();
        JButton b = new JButton("Start");  
        b.addActionListener(new ActionListener() {  
            public void actionPerformed(ActionEvent e) {  
                /*
            	frame.dispose();
                habitsFrame = new PageFrame(120, 720, "Habits");
                habitsFrame.setVisible(true);
                Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        		habitsFrame.setSize(1280, 720);
        		habitsFrame.setLocation((int)(screenSize.getWidth()/2 - habitsFrame.getSize().getWidth()/2), (int)(screenSize.getHeight()/2 - habitsFrame.getSize().getHeight()/2));
        		habitsFrame.setResizable(false);
        		habitsFrame.setTitle("HackOverflow");
        		habitsFrame.setVisible(true);
                System.out.print("Hello");
                */
            	ImagePane.main("Enter Name of Habit you want to add", "Add Habit", null, null, null);
                
            }  
        });
       // add(b, new GridBagConstraints());
        add(b, gb);
        
        //initButtons();
    }
    
}