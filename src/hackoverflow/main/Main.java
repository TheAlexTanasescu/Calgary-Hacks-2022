package hackoverflow.main;
import java.awt.*;

import javax.swing.JFrame;

import hackoverflow.pages.HabitsPage;
import hackoverflow.pages.PageFrame;
import hackoverflow.pages.PageLayout;
import hackoverflow.pages.PagePanel;


public class Main {

	public final static int width = 480;
	public final static int height = 720;
	private final static String title = "Hackoverflow";
	
	
    public static void main(String[] args) {
    	// Frame
	    PageFrame startFrame = new PageFrame(width, height, title);
	    
	    //Panel
	 	PagePanel startPanel = new PagePanel();
	 	startFrame.setContentPane(new HabitsPage());
	 	
	 	//Layout
	 	PageLayout layout = new PageLayout();
	 	layout.setGrid(startPanel);
	 	
	 	//switchToHabitsPage(startFrame, startPanel);
	 	
    }
    
    private static void switchToHabitsPage(PageFrame frame, PagePanel panel) {
    	frame.remove(panel);
    	frame.add(new HabitsPage());
    }
}
