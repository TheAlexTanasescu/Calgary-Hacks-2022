package hackoverflow.main;
import java.awt.*;

import javax.swing.JFrame;

import hackoverflow.pages.HabitsPage;
import hackoverflow.pages.PageFrame;
import hackoverflow.pages.PagePanel;
import hackoverflow.pages.PageProfile;


public class Main {
	public HabitsPage hp;
	public final static int width = 480;
	public final static int height = 720;
	private final static String title = "Hackoverflow";
	
	
    public static void main(String[] args) {
	    PageFrame startFrame = new PageFrame(width, height, title);
	 	PagePanel startPanel = new PagePanel(startFrame);
	 	PagePanel habitPanel = new HabitsPage(startFrame);
	 	PagePanel profilePage = new PageProfile(startFrame);
	 	startFrame.add(startPanel);
	 	
	 	test(startFrame, startPanel,habitPanel);
	 	
    }
    
    private static void test(PageFrame frame, PagePanel panel, PagePanel panel2) {
    	frame.remove(panel);
    	frame.add(panel2);
    	frame.validate();
    }
    
    
}
