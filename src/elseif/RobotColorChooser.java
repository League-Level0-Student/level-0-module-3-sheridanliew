//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot r2d2=new Robot();
		r2d2.setSpeed(50);
		//3. Ask the user what color they would like the robot to draw
		String answer=JOptionPane.showInputDialog("What color do you want the robot to use?");
		//5. Use an if/else statement to set the pen color that the user requested
if(answer.equals("red")) {
	r2d2.setPenColor(Color.red);
}
        //6. If the user doesn’t enter anything, choose a random color
else {
			JOptionPane.showMessageDialog(null, "Since you did not pick a color, I will pick a random color for you.");
	r2d2.setRandomPenColor();
}
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		r2d2.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
r2d2.penDown();
		for (int i = 0; i < 4; i++) {
			r2d2.move(100);
			r2d2.turn(360/4);
		}
		

	}
}
