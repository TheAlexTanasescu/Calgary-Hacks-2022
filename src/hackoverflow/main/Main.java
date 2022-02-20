package hackoverflow.main;
import java.awt.*;

import javax.swing.JFrame;

import hackoverflow.pages.HabitsPage;
import hackoverflow.pages.PageFrame;
import hackoverflow.pages.PageLayout;
import hackoverflow.pages.PagePanel;
import hackoverflow.pages.ProfilePage;


public class Main {
	public HabitsPage hp;
	public final static int width = 480;
	public final static int height = 720;
	private final static String title = "Hackoverflow";
	private static HabitsPage hPage;
	private static ProfilePage pPage;
	
    public static void main(String[] args) {
    	// Frame
	    PageFrame startFrame = new PageFrame(width, height, title);

	    //Panel
	    hPage = new HabitsPage(startFrame);
	    pPage = new ProfilePage(startFrame);
	 	startFrame.add(hPage);
	 	
	 	startFrame.validate();
	 	
    }
    
    
    public static void switchToProfilePage(PageFrame frame, PagePanel currentPage) {
    	frame.remove(currentPage);
    	frame.add(pPage);
    	frame.validate();
    }
    
    public static void switchToHabitsPage(PageFrame frame, PagePanel currentPage) {
    	frame.remove(currentPage);
    	frame.add(hPage);
    	frame.validate();
    }
    /**
     * Switches the current panel to the new panel
     * @param frame The frame which contains the panels
     * @param currentPanel the current panel displayed
     * @param newPanel the new panel to be displayed
     */
    public static void switchPanels(PageFrame frame, PagePanel currentPanel, PagePanel newPanel) {
    	frame.remove(currentPanel);
    	frame.add(newPanel);
    	frame.validate();
    }
}
