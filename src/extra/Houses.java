package extra;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot rob = new Robot();
	Random rand = new Random();
	 static String house = new String();
	 static Color color;
public static void main(String[] args) {
	
	Houses h = new Houses();
	h.start();
	
	for (int i = 0; i < 9; i++) {
		h.random();
		h.flat(house, color);
	}
	
	
	
	
	
	
}
void random() {
	int r = rand.nextInt(3);
	if(r == 0) {
		house = "small";
		color = color.RED;
	}
	else if(r==1) {
		house = "medium";
		color = color.BLUE;
	}
	else if(r==2) {
		house = "large";
		color = color.PINK;
	}
}
void start() {
	rob.penDown();
	rob.miniaturize();
	rob.setSpeed(100);
	rob.setX(20);
	rob.setY(500);
}
void flat(int height) {
	
	
	rob.move(height);
	rob.turn(90);
	rob.move(20);
	rob.turn(90);
	rob.move(height);
	rob.turn(-90);
	rob.setPenColor(0, 119, 17);
	rob.move(20);
	rob.setPenColor(0,0,0);
	rob.setAngle(0);
}
void flat(String s, Color c) {
	if(s.equals("small")) {
		flat(60);
		rob.setPenColor(c.RED);
	}
	else if(s.equals("medium")) {
		flat(120);
		rob.setPenColor(c.BLUE);
	}
	else if(s.equals("large")) {
		flat(250);
		rob.setPenColor(c.PINK);
	}
	
}
}
