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

public class Button { //the button class so you can move to the game
  private PApplet p;
  private float x, y;
  private PImage img;

  // Constructor accepts the path to the PNG image file
  public Button(PApplet p, float x, float y, String imagePath) {
    this.p = p;
    this.x = x;
    this.y = y;
    this.img = p.loadImage(imagePath); // Load the PNG
  }

  public void draw() {
    // Draw the image at its designated x and y coordinates
    p.image(img, x, y);
  }

  // Rectangular collision detection using image dimensions
  public boolean isClicked(float mx, float my) { //being able to push the button to take you to the first level
    return (mx >= x && mx <= x + img.width && my >= y && my <= y + img.height);
  }
}