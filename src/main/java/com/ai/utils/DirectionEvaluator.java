package com.ai.utils;

import com.ai.model.Direction;

/**
 * 
 * Class DirectionEvaluator
 *
 */
public class DirectionEvaluator {
	/**
	 * Method evaluates the direction of the robot.
	 * @param command
	 * @return Direction
	 */
	public static Direction evaluateDirection(String command) {
		String faceDirection = command.split(" ")[1].split(",")[2];
		for (Direction direction : Direction.values()) {
			if (direction.getDirection().equalsIgnoreCase(faceDirection))
				return direction;
		}
		return null;
	}
}
