package com.ai.command;

import com.ai.model.Direction;
import com.ai.model.GameBoard;
import com.ai.model.Position;
import com.ai.model.Steps;
import com.ai.model.IRobot;

public class MoveCommand implements Command {

	
	public static final String NAME = "move";
	
	/*
	 * (non-Javadoc)
	 * @see com.ai.command.Command#execute(com.ai.model.IRobot, com.ai.model.GameBoard)
	 */
	
	public void execute(IRobot robot, GameBoard board) {

		Direction robotCurrentDirection = robot.getDirection();
		Position position = null;
		switch (robotCurrentDirection) {

		case EAST:
			position = Steps.EAST.getPosition();
			newPosition(robot,board,position);		
			break;

		case WEST:
			position = Steps.WEST.getPosition();newPosition(robot,board,position);	
			break;

		case NORTH:
			position = Steps.NORTH.getPosition();
			newPosition(robot,board,position);	
			break;

		case SOUTH:
			position = Steps.SOUTH.getPosition();
			newPosition(robot,board,position);	
			break;
		}

	}
	
	void newPosition(IRobot robot, GameBoard board,Position position) {
		Position currentPosition = robot.getPosition();
		if(board.isValidPosition(currentPosition.addPosition(position))) {
			robot.setPosition(currentPosition.addPosition(position));
		}else {
			System.out.println("Invalid position");
		}	
	}

}
