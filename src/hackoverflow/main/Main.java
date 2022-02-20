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
<<<<<<< HEAD
	 	PagePanel startPanel = new PagePanel(startFrame);
	 	PagePanel habitPanel = new HabitsPage(startFrame);
	 	PagePanel profilePage = new PageProfile(startFrame);
	 	startFrame.add(startPanel);
	 	
	 	test(startFrame, startPanel,habitPanel);
	 	
    }
    
    private static void test(PageFrame frame, PagePanel panel, PagePanel panel2) {
=======

	    //Panel
	 	PagePanel startPanel = new PagePanel();
	 	startFrame.add(new HabitsPage(startFrame));
	 	startFrame.validate();
	 	
	 	//Layout
	 	PageLayout layout = new PageLayout();
	 	layout.setGrid(startPanel);
	 	
    }
    
    private static void switchToHabitsPage(PageFrame frame, PagePanel panel) {
>>>>>>> 3091032b018356da347a69480b3bd9d0cb758355
    	frame.remove(panel);
    	frame.add(panel2);
    	frame.validate();
    }
    
    
}
