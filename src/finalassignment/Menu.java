package finalassignment;
import processing.core.PApplet;
import processing.core.PImage;
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
    private PImage bg;
    int s;
    String userInput = "";
   private Button startbutton; 
    int stage =0;
       
    public void settings() {
        size(600,600);
    }
    public void setup(){    
        bg = loadImage("images/background.jpg");
        textSize(66);
        ÑustaHuillac = new Character(this, 0, 200, "images/warrior1.png");
        startbutton = new Button(this, 100, 200, "images/start-button.png");
    }
    
    public void draw(){
        image(bg, 0, 0, width, height);
        
        if (stage == 0) {
            fill(0);
            text("Story of La Tirana:", 25, 50);
            startbutton.draw();
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
        
        if(ÑustaHuillac.isCollidingWith(enemy1)) {
            fill(255, 0, 0);
            this.text("ow", ÑustaHuillac.x, ÑustaHuillac.y);
        }
        
    }
    public void mousePressed() {
         if (stage == 0 ) {
        if (startbutton.isClicked(mouseX, mouseY)) {
        stage = 1;
        }
    }
  }
}