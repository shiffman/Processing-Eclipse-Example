import processing.core.*;

public class MyProcessingSketch extends PApplet {
	
	public static void main(String[] args) {
		PApplet.main(new String[] {"MyProcessingSketch"});
	}
	
	//	An array of stripes
	Stripe[] stripes = new Stripe[50];

	public void settings() {
		size(200,200);

	}

	public void setup() {
		// Initialize all "stripes"
		for (int i = 0; i < stripes.length; i++) {
			stripes[i] = new Stripe(this);
		}
	}

	public void draw() {
		background(100);
		// Move and display all "stripes"
		for (int i = 0; i < stripes.length; i++) {
			stripes[i].move();
			stripes[i].display();
		}
	}
}
