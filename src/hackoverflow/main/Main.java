package hackoverflow.main;
import java.awt.*;

import hackoverflow.pages.HabitsPage;
import hackoverflow.pages.MainPage;
import hackoverflow.pages.PageFrame;
import hackoverflow.pages.PagePanel;
import hackoverflow.pages.ProfilePage;
import hackoverflow.pages.ShopPage;
import hackoverflow.popups.InstructionPopup;
import hackoverflow.popups.StartPopup;


public class Main {
	public final static int width = 480;
	public final static int height = 720;
	private final static String title = "Hackoverflow";
	
	private static MainPage mPage;
	private static ProfilePage pPage;
	private static HabitsPage hPage;
	private static ShopPage sPage;

	private static PageFrame startFrame;
	
    public static void main(String[] args) {
    	// Frame
	    startFrame = new PageFrame(width, height, title);
	    
	   

	    //Panel
    	InstructionPopup popup = new InstructionPopup();
    	StartPopup startPopup = new StartPopup();
	    

	    //Panel
	
//Pages
	    mPage = new MainPage(startFrame);
	    pPage = new ProfilePage();
	    hPage = new HabitsPage(startFrame);
	    sPage = new ShopPage();

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
     * Switch from the currentPage to the Main page
     * @param currentPage the current page
     */
    public static void switchToMainPage(PagePanel currentPage) {
    	startFrame.remove(currentPage);
    	startFrame.add(mPage);
    	mPage.repaint();
    	startFrame.validate();
    }
    
    /**
     * Switch from the currentPage to the Habits page
     * @param currentPage the current page
     */
    public static void switchToHabitsPage(PagePanel currentPage) {
    	startFrame.remove(currentPage);
    	startFrame.add(hPage);
    	hPage.repaint();
    	startFrame.validate();
    }
    
    /**
     * Switch from the currentPage to the Shop page
     * @param currentPage the current page
     */
    public static void switchToShopsPage(PagePanel currentPage) {
    	startFrame.remove(currentPage);
    	startFrame.add(sPage);
    	sPage.repaint();
    	startFrame.validate();
    }

}