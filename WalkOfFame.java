
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package loops;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot("mini");
		// 1. Set the X position of the robot so that it starts on the left.
		rob.moveTo(100, 100);
		rob.penDown();
		rob.setPenColor(0, 0, 0);
		rob.setSpeed(100);
		// You also need to show the robot to see the result of this line.

		// 2. Make the robot draw a star shape. Hint: 144.

		// // 3. Set the size of the star to 30.
		for (int i = 0; i < 6; i++) {
			rob.moveTo(i * 50, 100);
			for (int j = 0; j < 5; j++) {
				rob.move(100);
				rob.turn(144);
			}
		}

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this:
		 * http://bit.ly/walk-of-fame
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
