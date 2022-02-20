package hackoverflow.main;
import java.awt.*;

import javax.swing.JFrame;

import hackoverflow.pages.HabitsPage;
import hackoverflow.pages.PageFrame;
import hackoverflow.pages.PagePanel;


public class Main {

	public final static int width = 480;
	public final static int height = 720;
	private final static String title = "Hackoverflow";
	
	
    public static void main(String[] args) {
	    PageFrame startFrame = new PageFrame(width, height, title);
	 	//PagePanel startPanel = new PagePanel(startFrame);
	    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		startFrame.setSize(1280, 720);
		startFrame.setLocation((int)(screenSize.getWidth()/2 - startFrame.getSize().getWidth()/2), (int)(screenSize.getHeight()/2 - startFrame.getSize().getHeight()/2));
		startFrame.setResizable(false);
		startFrame.setTitle("HackOverflow");
		startFrame.setVisible(true);
		startFrame.add(new HabitsPage(startFrame));
	 	
	 	//test(startFrame, startPanel);
    }
    
   // private static void test(PageFrame frame, PagePanel panel) {
    //	frame.remove(panel);
    //	frame.add(new HabitsPage(frame));
    //}
}
