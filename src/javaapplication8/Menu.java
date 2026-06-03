package javaapplication8;
import processing.core.PApplet;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 343120135
 */
public class Menu extends PApplet {
    Character ÑustaHuillac;
    int s;
    String userInput = "";
   private Button startbutton, helpbutton; 
    int stage =0;
       
    public void settings() {
        size(600,600);
    }
    public void setup(){    
        background(100,100,100);
        textSize(20);
        
    }
    
    public void draw(){
        background(132,37,147);
        
        if (stage == 0) {
            fill(0);
            text("Story of La Tirana:", 20, 50);
            text(userInput, 20, 100);
        } else if (stage == 1) {
            ÑustaHuillac.draw();
            
         if (keyPressed) {
         if (keyCode == LEFT) {
         ÑustaHuillac.move(-(5+s), 0);
        } else if (keyCode == RIGHT) {
          ÑustaHuillac.move(5, 0);
        } else if (keyCode == UP) {
          ÑustaHuillac.move(0, -5);
        } else if (keyCode == DOWN) {
          ÑustaHuillac.move(0, 5);
        }
  
            }
        }
        
        
        
    }
    public void keyPressed() {
        if (stage == 0) {
            if (keyCode == ENTER) {
                stage = 1;
                s = Integer.parseInt(userInput);
                ÑustaHuillac = new Character(this, 0, 200, s);
            } else if (key != CODED) {
                userInput += key;
            }
        }
    }
}

