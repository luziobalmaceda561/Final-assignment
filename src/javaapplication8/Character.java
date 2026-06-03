/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication8;

/**
 *
 * @author 343120135
 */
 import processing.core.PApplet;

public class Character extends PApplet {
    public int x;
    public int y;
    private int speed;
    private PApplet app;
    
    public Character(PApplet p, int x, int y, int speed){
	this.app = p;
        this.x = x;
        this.y = y;
        this.speed = speed;
    }
    
    public void move(int dx, int dy){
        x += (dx + speed);
        y+= dy;
    }
    
    public void draw(){
        app.fill(255, 0, 0); 
        app.rect(x, y, 60, 25);
        
        app.fill(0);
        app.ellipse(x + 10, y + 25, 15, 15);
        app.ellipse(x + 50, y + 25, 15, 15); 
    }
}