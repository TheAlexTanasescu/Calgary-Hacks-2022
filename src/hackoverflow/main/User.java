package src.hackoverflow.main;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class User {

    private int level;
    private int experience;
    private String name;
    private String avatarImage;

    public User(int level, int experience, String name, String avatarImage)
    {
        this.level = level;
        this.experience = experience;
        this.name = name;
        this.avatarImage = avatarImage;
    }


    
}
