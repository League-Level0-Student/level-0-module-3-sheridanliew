import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot robot= new Robot();
public static void main(String[] args) {
	robot.penDown();
	robot.setSpeed(30);
	String draw=JOptionPane.showInputDialog("What color would you like me to draw with? (red, blue, or green)");
	if(draw.equals("red")) {
		robot.setPenColor(Color.red);
	}
	else if(draw.equals("blue")) {
		robot.setPenColor(Color.blue);
	}
	else {
		robot.setPenColor(Color.green);
	}
	String shape=JOptionPane.showInputDialog("What shape would you like the obedient robot to draw? (square, circle, or triangle)");
	if(shape.equals("square")) {
		drawSquare();
	}
	else if(shape.equals("circle")) {
		drawCircle();
	}
	else {
		drawTriangle();
	}
}

static void drawSquare(){
	for (int i = 0; i < 4; i++) {
		robot.move(250);
		robot.turn(90);
	}
}

static void drawCircle() {
	robot.setSpeed(100);
	for (int i = 0; i < 361; i++) {
		robot.move(1);
		robot.turn(1);
	}
}

static void drawTriangle() {
	for (int i = 0; i < 3; i++) {
		robot.move(250);
		robot.turn(120);
	}
}
}
