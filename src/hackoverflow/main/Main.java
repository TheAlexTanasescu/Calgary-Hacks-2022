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
	public MainPage hp;
	public final static int width = 480;
	public final static int height = 720;
	private final static String title = "Hackoverflow";
	private static MainPage hPage;
	private static ProfilePage pPage;
	
    public static void main(String[] args) {
    	// Frame
    	PageFrame startFrame = new PageFrame(width, height, title);
    	InstructionPopup popup = new InstructionPopup();
	    

	    //Panel
	 	PagePanel startPanel = new PagePanel();
	 	startFrame.add(new MainPage(startFrame));
	    hPage = new MainPage(startFrame);
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
    	pPage.repaint();
    	frame.validate();
    	pPage.repaint();
    }
    
    /**
     * Switch from the currentPage to the Habits page
     * @param frame the frame which contains the current page
     * @param currentPage the current page
     */
    public static void switchToHabitsPage(PageFrame frame, PagePanel currentPage) {
    	frame.remove(currentPage);
    	frame.add(hPage);
    	hPage.repaint();
    	frame.validate();
    	hPage.repaint();
    }
    


}
