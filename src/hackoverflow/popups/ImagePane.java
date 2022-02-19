package hackoverflow.popups;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ImagePane 
{
	

	public static void main(String message, String title, String[] args, User u, ImageIcon icon)
	{
		JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE, icon);
		
	}
}