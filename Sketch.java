import processing.core.PApplet;

public class Sketch extends PApplet {
  // Variables
  double randomx = random(-width, width);
  double randomy = random(-50, 50);

  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(300, 300);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(54, 50, 50);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    drawFlower(80, 90, 75);
    drawFlower(215, 80, 45);
    drawFlower(75, 225, 55);
    drawFlower(220, 220, 65);
  }

    void drawFlower(float flowerX, float flowerY, float petalSize){
      float petalDistance = petalSize / 2;

      fill(255, 8, 0);

      // Upper left petal of flower
      ellipse(flowerX - petalDistance, flowerY - petalDistance, petalSize, petalSize);

      // Upper right petal of flower
      ellipse(flowerX + petalDistance, flowerY - petalDistance, 
    petalSize, petalSize);

    // Lower left petal of flower
    ellipse(flowerX - petalDistance, flowerY + petalDistance, petalSize, petalSize);

    // Lower right petal of flower
    ellipse(flowerX + petalDistance, flowerY + petalDistance, petalSize, petalSize);

    // Centre petal of flower
    fill(255);
    ellipse(flowerX, flowerY, petalSize, petalSize);
  }
	
	
  // define other methods down here.
}