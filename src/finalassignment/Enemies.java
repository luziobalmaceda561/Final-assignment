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

public class Enemies extends Character { //child class of the character class for the enemies
    private PImage images;
    private PApplet app;

    

public Enemies(PApplet p, int x, int y, String imagePath){ //a super to call from the parent class
    super(p,x,y,imagePath);
}

}