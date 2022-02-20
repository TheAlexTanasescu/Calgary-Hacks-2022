package hackoverflow.main;

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

    public User(int level, int experience, String name, String avatarImage) {
        this.level = level;
        this.experience = experience;
        this.name = name;
        this.avatarImage = avatarImage;
    }
    
    int getLevel() {
    	return this.level;
    }
    
    int getExperience() {
    	return this.experience;
    }
    
    String getName() {
    	return this.name;
    }
    
    String getAvatarImage() {
    	return this.avatarImage;
    }
    
    void setLevel(int levelToSet) {
    	this.level = levelToSet;
    }
    
    void setExperience(int experienceToSet) {
    	this.experience = experienceToSet;
    }
    
    void setName(String nameToSet) {
    	this.name = nameToSet;
    }
    
    void setAvatarImage(String imageToSet) {
    	this.avatarImage = imageToSet;
    }



    
}
