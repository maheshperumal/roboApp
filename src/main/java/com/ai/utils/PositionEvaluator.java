package com.ai.utils;

import com.ai.model.Position;
/**
 * 
 * Class PositionEvaluator
 *
 */
public class PositionEvaluator {
	/**
	 * Method evaluates the position.
	 * @param command
	 * @return Position
	 */
	public static Position evaluatePosition(String command) {
		int x = 0, y = 0;
		String[] params = command.split(" ")[1].split(",");

		String xpos = params[0];
		String ypos = params[1];

		x = Integer.valueOf(xpos);
		y = Integer.valueOf(ypos);

		return new Position(x, y);
	}
}
