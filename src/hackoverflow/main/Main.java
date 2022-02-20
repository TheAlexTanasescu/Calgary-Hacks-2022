package hackoverflow.main;
import java.awt.*;

import javax.swing.JFrame;

import hackoverflow.pages.HabitsPage;
import hackoverflow.pages.PageFrame;
import hackoverflow.pages.PagePanel;
import hackoverflow.pages.PageProfile;



public class Main {

	public final static int width = 480;
	public final static int height = 720;
	private final static String title = "Hackoverflow";
	
	
    public static void main(String[] args) {
	    PageFrame startFrame = new PageFrame(width, height, title);
	 	PagePanel startPanel = new PagePanel(startFrame);
	 	startFrame.add(startPanel);
	 	
	 	
	 	
	 	test(startFrame, startPanel);
    }
    
    private static void test(PageFrame frame, PagePanel panel) {
    	
    	frame.remove(panel);
    	frame.add(new PageProfile(frame));
    }
}
