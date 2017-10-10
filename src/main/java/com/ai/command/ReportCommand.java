package com.ai.command;

import com.ai.model.GameBoard;
import com.ai.model.IRobot;

public class ReportCommand implements Command {

	public static final String NAME = "report";
	
	/*
	 * (non-Javadoc)
	 * @see com.ai.command.Command#execute(com.ai.model.IRobot, com.ai.model.GameBoard)
	 */
	public void execute(IRobot robot, GameBoard board) {
		
		System.out.println(robot.getPosition().toString() +","+ robot.getDirection().getDirection());
	}

}
