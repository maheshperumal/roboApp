package com.ai.command;

import com.ai.model.Direction;
import com.ai.model.GameBoard;
import com.ai.model.Position;
import com.ai.model.IRobot;

public class PlaceCommand implements Command {
	
	
	public static final String NAME = "place";
	Position position;
	Direction direction;
	
	public PlaceCommand() {
		super();
	}
	/*
	 * (non-Javadoc)
	 * @see com.ai.command.Command#execute(com.ai.model.IRobot, com.ai.model.GameBoard)
	 */
	public void execute(IRobot robot, GameBoard board) {
		robot.setDirection(direction);
		if(board.isValidPosition(position)){
			robot.setPosition(position);
		}else {
			System.out.println("Invalid position");
		}	
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

}
