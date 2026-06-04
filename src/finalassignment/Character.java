/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalassignment;

/**
 *
 * @author 343120135
 */
 import processing.core.PApplet;
 import processing.core.PImage;

public class Character extends PApplet {
    public int x;
    public int y;
    private PImage image;
    private PApplet app;
    
    public Character(PApplet p, int x, int y, String imagePath){
	this.app = p;
        this.x = x;
        this.y = y;
        this.image = app.loadImage(imagePath);
    }
    
    public void move(int dx, int dy){
        x += dx;
        y+= dy;
    }
    
    public void draw(){
        app.image(image, x, y);
    }
}