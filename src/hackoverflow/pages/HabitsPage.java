package hackoverflow.pages;

import java.awt.*;  


public class HabitsPage extends javax.swing.JPanel {
    private static final long serialVersionUID = 25974988494620193L;
    
    
    public HabitsPage() {
    	
    	PageFrame startFrame = new PageFrame();
 	    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
 		startFrame.setSize(1280, 720);
 		startFrame.setLocation((int)(screenSize.getWidth()/2 - startFrame.getSize().getWidth()/2), (int)(screenSize.getHeight()/2 - startFrame.getSize().getHeight()/2));
 		startFrame.setResizable(false);
 		startFrame.setTitle("HackOverflow");
 		startFrame.setVisible(true);
      
    }
    
}