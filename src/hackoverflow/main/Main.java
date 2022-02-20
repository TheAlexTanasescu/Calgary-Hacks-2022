package hackoverflow.main;
import java.awt.*;

import javax.swing.JFrame;

import hackoverflow.pages.HabitsPage;
import hackoverflow.pages.PageFrame;
import hackoverflow.pages.PagePanel;
import hackoverflow.pages.PageProfile;
import java.util.Scanner;



public class Main {

	public final static int width = 480;
	public final static int height = 480;
	private final static String title = "Start Page";
	
	
    public static void main(String[] args) {
	    PageFrame startFrame = new PageFrame(width, height, title);
	 	PagePanel startPanel = new PagePanel(startFrame);
	 	startFrame.add(startPanel);
	 	startPanel.setBackground(Color.red);
	 	
	 	Scanner reader = new Scanner(System.in);  // Reading from System.in
	 	System.out.println("Enter a number: ");
	 	int n = reader.nextInt(); // Scans the next token of the input as an int.
	 	//once finished
	 	reader.close();
	 	
	 	test(startFrame, startPanel);
    }
    
    private static void test(PageFrame frame, PagePanel panel) {
    	
    	frame.remove(panel);
    	frame.add(new PageProfile(frame));
    	frame.validate();
    }
}
