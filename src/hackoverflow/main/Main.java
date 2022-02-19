package hackoverflow.main;
import java.awt.*;

import javax.swing.JFrame;
import hackoverflow.pages.StartFrame;


public class Main {

    public static void main(String[] args) {
	    StartFrame startFrame = new StartFrame();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		startFrame.setSize(480, 720);
		startFrame.setLocation((int)(screenSize.getWidth()/2 - startFrame.getSize().getWidth()/2), (int)(screenSize.getHeight()/2 - startFrame.getSize().getHeight()/2));
		startFrame.setResizable(false);
		startFrame.setTitle("HackOverflow");
		startFrame.setVisible(true);
		startFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
