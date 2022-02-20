package hackoverflow.main;
import java.awt.*;

import javax.swing.JFrame;

import hackoverflow.pages.HabitsPage;
import hackoverflow.pages.PageFrame;
import hackoverflow.pages.PageLayout;
import hackoverflow.pages.PagePanel;
import hackoverflow.pages.PageProfile;


public class Main {
	public HabitsPage hp;
	public final static int width = 480;
	public final static int height = 720;
	private final static String title = "Hackoverflow";
	
	
    public static void main(String[] args) {
    	// Frame
	    PageFrame startFrame = new PageFrame(width, height, title);

	 //	PagePanel startPanel = new PagePanel(startFrame);
	 	PagePanel habitPanel = new HabitsPage(startFrame);
	 	PagePanel profilePage = new PageProfile(startFrame);
	 	startFrame.add(habitPanel);
	 	startFrame.validate();
	 	
	 	
    }
    
    
    
    private static void switchToHabitsPage(PageFrame frame, PagePanel panel) {

    	//frame.remove(panel);
    	frame.add(panel);
    	
    }
    
    
}
