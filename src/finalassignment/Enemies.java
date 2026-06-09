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

public class Enemies extends Character {
    public int x;
    public int y;
    private PImage images;
    private PApplet app;

    

public Enemies(PApplet p, int x, int y, String imagePath){
    super(p,x,y,imagePath);
}

}