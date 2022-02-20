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
    
    /**
     * Switch from the currentPage to the Profile page
     * @param frame the frame which contains the current page
     * @param currentPage the current page
     */
    public static void switchToProfilePage(PageFrame frame, PagePanel currentPage) {
    	frame.remove(currentPage);
    	frame.add(pPage);
    	frame.validate();
    }
    
    /**
     * Switch from the currentPage to the Habits page
     * @param frame the frame which contains the current page
     * @param currentPage the current page
     */
    public static void switchToHabitsPage(PageFrame frame, PagePanel currentPage) {
    	frame.remove(currentPage);
    	frame.add(hPage);
    	frame.validate();
    }

}
