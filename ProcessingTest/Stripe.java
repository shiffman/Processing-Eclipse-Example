import processing.core.PApplet;

public class Stripe {
	float x;       // horizontal location of stripe
	float speed;   // speed of stripe
	float w;       // width of stripe
	boolean mouse; // state of stripe (mouse is over or not?)
	PApplet parent; // The parent PApplet that we will render ourselves onto

	Stripe(PApplet p) {
		parent = p;
		x = 0;              // All stripes start at 0
		speed = parent.random(1);  // All stripes have a random positive speed
		w = parent.random(10,30);
		mouse = false;
	}

	// Draw stripe
	void display() {
		parent.fill(255,100);
		parent.noStroke();
		parent.rect(x,0,w,parent.height);
	}

	// Move stripe
	void move() {
		x += speed;
		if (x > parent.width+20) x = -20;
	}
}
