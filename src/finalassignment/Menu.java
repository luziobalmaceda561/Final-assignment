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
    Enemies E1;
    Enemies E2;
    Enemies E3;
    Enemies E4;
    Enemies E5;
    Character ÑustaHuillac;
    private PImage bg;
    int s;
    String userInput = "";
   private Button startbutton; 
    int stage =0;
       
    public void settings() {
        size(600,600);
    }
    public void setup(){    //background and character image placement
        bg = loadImage("images/background.jpg");
        textSize(66);
        ÑustaHuillac = new Character(this, 10, 400, "images/warrior1.png");
        startbutton = new Button(this, 100, 200, "images/start-button.png");
       E1 = new Enemies(this,270, 408, "images/enemy1.png");
       E2 = new Enemies(this,310, 408, "images/enemy2.png");
       E3 = new Enemies(this,350, 408, "images/enemy3.png");
       E4 = new Enemies(this,390, 408, "images/enemy4.png");
       E5 = new Enemies(this,440, 408, "images/enemy5.png");
    }
    
    public void draw(){ //levels and character movement
        image(bg, 0, 0, width, height);
        
        if (stage == 0) {
            fill(0);
            text("Story of La Tirana:", 25, 50);
            startbutton.draw();
        } else if (stage == 1) {
            ÑustaHuillac.draw();
            E1.draw();
            E2.draw();
            E3.draw();
            E4.draw();
            E5.draw();        
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
            if(ÑustaHuillac.isCollidingWith(E1)) { //collision damage to the main character
               fill(25, 0, 0);
               E1.x = 900;
               E1.y = 900;
               this.text("ow", ÑustaHuillac.x, ÑustaHuillac.y);

           }
           if(ÑustaHuillac.isCollidingWith(E2)) { 
               fill(25, 0, 0);
               this.text("ouch", ÑustaHuillac.x, ÑustaHuillac.y);
               E2.x = 700;
           }
           if(ÑustaHuillac.isCollidingWith(E3)) { 
               fill(25, 0, 0);
               this.text(".", ÑustaHuillac.x, ÑustaHuillac.y);
               E3.x = 700;
           }if(ÑustaHuillac.isCollidingWith(E4)) { 
               fill(25, 0, 0);
               this.text(".", ÑustaHuillac.x, ÑustaHuillac.y);
               E4.x = 700;
           }if(ÑustaHuillac.isCollidingWith(E5)) { 
               fill(25, 0, 0);
               this.text(".", ÑustaHuillac.x, ÑustaHuillac.y);
               E5.x = 700;
           }
         
         
        }
        
        
        
        
    }
    public void mousePressed() { //just to start the game by pushing the start button
         if (stage == 0 ) {
        if (startbutton.isClicked(mouseX, mouseY)) {
        stage = 1;
        }
    }
  }
}