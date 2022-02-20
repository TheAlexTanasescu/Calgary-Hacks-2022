package hackoverflow.main;
import java.awt.*;

import javax.swing.JFrame;

import hackoverflow.pages.HabitsPage;
import hackoverflow.pages.PageFrame;
import hackoverflow.pages.PageLayout;
import hackoverflow.pages.PagePanel;


public class Main {
	public HabitsPage hp;
	public final static int width = 480;
	public final static int height = 720;
	private final static String title = "Hackoverflow";
	
	
    public static void main(String[] args) {
    	// Frame
	    PageFrame startFrame = new PageFrame(width, height, title);

	    //Panel
	 	PagePanel startPanel = new PagePanel();
	 	startFrame.add(new HabitsPage(startFrame, "Title", "Description", null));
	 	
	 	startFrame.validate();
	 	
    }
    
    public static void switchPanels(PageFrame frame, PagePanel currentPanel, PagePanel newPanel) {
    	frame.remove(currentPanel);
    	frame.add(newPanel);
    	frame.validate();
    }
}
