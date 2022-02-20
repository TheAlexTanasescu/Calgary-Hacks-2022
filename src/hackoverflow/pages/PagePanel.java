package hackoverflow.pages;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.*;  
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PagePanel extends javax.swing.JPanel {
    private static final long serialVersionUID = 25974988494620193L;
    
    
    public PagePanel(JFrame frame) {
        //setBackground(Color.LIGHT_GRAY);
        setLayout(new GridBagLayout());
        
        GridBagConstraints gb = new GridBagConstraints();
        JButton b = new JButton("Start");  
        b.addActionListener(new ActionListener() {  
            public void actionPerformed(ActionEvent e) {  
                frame.dispose();
            }  
        });
       // add(b, new GridBagConstraints());
        add(b, gb);
        
        //initButtons();
    }
    
}