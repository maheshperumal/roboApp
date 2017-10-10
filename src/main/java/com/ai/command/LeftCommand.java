package com.ai.command;

import com.ai.model.Direction;
import com.ai.model.GameBoard;
import com.ai.model.IRobot;

public class LeftCommand implements Command {
	
	public static final String NAME = "left";

/*
 * (non-Javadoc)
 * @see com.ai.command.Command#execute(com.ai.model.IRobot, com.ai.model.GameBoard)
 */
	public void execute(IRobot robot, GameBoard board) {

		switch (robot.getDirection()) {

		case NORTH:
			robot.setDirection(Direction.WEST);
			break;
		case WEST:
			robot.setDirection(Direction.SOUTH);
			break;
		case SOUTH:
			robot.setDirection(Direction.EAST);
			break;
		case EAST:
			robot.setDirection(Direction.NORTH);
			break;
		default:
			break;
		}

	}

}
