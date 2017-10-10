package com.ai.command;

import com.ai.model.Direction;
import com.ai.model.GameBoard;
import com.ai.model.IRobot;

public class RightCommand implements Command {

	public static final String NAME = "right";
	
	/*
	 * (non-Javadoc)
	 * @see com.ai.command.Command#execute(com.ai.model.IRobot, com.ai.model.GameBoard)
	 */
	public void execute(IRobot robot, GameBoard board) {

		switch (robot.getDirection()) {

		case NORTH:
			robot.setDirection(Direction.EAST);
			break;
		case WEST:
			robot.setDirection(Direction.NORTH);
			break;
		case SOUTH:
			robot.setDirection(Direction.WEST);
			break;
		case EAST:
			robot.setDirection(Direction.SOUTH);
			break;
		default:
			break;
		}

	}

}
