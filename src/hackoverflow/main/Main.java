package hackoverflow.main;
import java.awt.*;


import hackoverflow.pages.ChangePetPage;

import hackoverflow.pages.DailyHabitsPage;

import hackoverflow.pages.HabitsPage;
import hackoverflow.pages.MainPage;
import hackoverflow.pages.MonthlyHabitsPage;
import hackoverflow.pages.PageFrame;
import hackoverflow.pages.PagePanel;
import hackoverflow.pages.ProfilePage;
import hackoverflow.pages.ShopPage;
import hackoverflow.pages.WeeklyHabitsPage;
import hackoverflow.pages.YearlyHabitsPage;
import hackoverflow.popups.StartPopup;


public class Main {
	public final static int width = 480;
	public final static int height = 720;
	private final static String title = "Hackoverflow";
	
	private static MainPage mPage;
	private static ProfilePage pPage;
	private static HabitsPage hPage;
	private static ShopPage sPage;

	private static ChangePetPage cPage;

	private static DailyHabitsPage dlyPage;
	private static WeeklyHabitsPage wlyPage;
	private static MonthlyHabitsPage mlyPage;
	private static YearlyHabitsPage ylyPage;

	private static PageFrame startFrame;
	
	public static int lvl;
	public static int exp;
	public static final int maxExp = 10;
	
    public static void main(String[] args) {
    	lvl = 0;
    	exp = 0;
    	// Frame
	    startFrame = new PageFrame(width, height, title);

	    //Panel
    	new StartPopup();
	    
	    mPage = new MainPage(startFrame, exp, exp);
	    pPage = new ProfilePage(startFrame);
	    hPage = new HabitsPage(lvl, exp);
	    sPage = new ShopPage(startFrame);
	    
	    dlyPage = new DailyHabitsPage(lvl, exp);
	    wlyPage = new WeeklyHabitsPage(lvl, exp);
	    mlyPage = new MonthlyHabitsPage(lvl, exp);
	    ylyPage = new YearlyHabitsPage(lvl, exp);


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
    
    public static void switchToChangePetPage(PagePanel currentPage) {
    	startFrame.remove(currentPage);
    	startFrame.add(cPage);
    	cPage.repaint();
    	startFrame.validate();
    }

    /**
     * Switch from the currentPage to the Daily page
     * @param currentPage the current page
     */
    public static void switchToDailyHabitsPage(PagePanel currentPage) {
    	startFrame.remove(currentPage);
    	startFrame.add(dlyPage);
    	dlyPage.repaint();
    	startFrame.validate();
    }
    /**
     * Switch from the currentPage to the Weekly page
     * @param currentPage the current page
     */
    public static void switchToWeeklyHabitsPage(PagePanel currentPage) {
    	startFrame.remove(currentPage);
    	startFrame.add(wlyPage);
    	wlyPage.repaint();
    	startFrame.validate();
    }
    /**
     * Switch from the currentPage to the Monthly page
     * @param currentPage the current page
     */
    public static void switchToMonthlyHabitsPage(PagePanel currentPage) {
    	startFrame.remove(currentPage);
    	startFrame.add(mlyPage);
    	mlyPage.repaint();
    	startFrame.validate();
    }
    
    /**
     * Switch from the currentPage to the Yearly page
     * @param currentPage the current page
     */
    public static void switchToYearlyHabitsPage(PagePanel currentPage) {
    	startFrame.remove(currentPage);
    	startFrame.add(ylyPage);
    	ylyPage.repaint();
    	startFrame.validate();
    }
}