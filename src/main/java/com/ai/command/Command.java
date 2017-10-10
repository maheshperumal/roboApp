package com.ai.command;

import com.ai.model.GameBoard;
import com.ai.model.IRobot;

/**
 * 
 * Interface Command - for generalized command action.
 *
 */
public interface Command {
	/**
	 * 
	 * @param robot
	 * @param board
	 */
	public void execute(IRobot robot, GameBoard board);
}


