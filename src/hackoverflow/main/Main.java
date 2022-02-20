package hackoverflow.main;
import java.awt.*;

import javax.swing.JFrame;

import hackoverflow.pages.MainPage;
import hackoverflow.pages.PageFrame;
import hackoverflow.pages.PageLayout;
import hackoverflow.pages.PagePanel;
import hackoverflow.pages.ProfilePage;
import hackoverflow.popups.InstructionPopup;


public class Main {
	public final static int width = 480;
	public final static int height = 720;
	private final static String title = "Hackoverflow";
	
	private static MainPage mPage;
	private static ProfilePage pPage;
	private static PageFrame startFrame;
	
    public static void main(String[] args) {
    	// Frame
	    startFrame = new PageFrame(width, height, title);

	    //Panel
    	InstructionPopup popup = new InstructionPopup();
	    
	    //Panel
	    mPage = new MainPage(startFrame, "Title", "Description", null);
	    pPage = new ProfilePage(startFrame);
	 	startFrame.add(mPage);
	 	startFrame.validate();
	 	
    }
    
    /**
     * Switch from the currentPage to the Profile page
     * @param currentPage the current page
     */
    public static void switchToProfilePage(PagePanel currentPage) {
    	startFrame.remove(currentPage);
    	startFrame.add(pPage);
    	pPage.repaint();
    	startFrame.validate();
    }
    
    /**
     * Switch from the currentPage to the Habits page
     * @param currentPage the current page
     */
    public static void switchToHabitsPage(PagePanel currentPage) {
    	startFrame.remove(currentPage);
    	startFrame.add(mPage);
    	mPage.repaint();
    	startFrame.validate();
    }
    

}