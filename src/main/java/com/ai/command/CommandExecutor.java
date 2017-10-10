package com.ai.command;

import com.ai.model.Direction;
import com.ai.model.GameBoard;
import com.ai.model.IRobot;
import com.ai.model.Position;
import com.ai.utils.DirectionEvaluator;
import com.ai.utils.PositionEvaluator;

/*
 * Class CommandExecutor for processing the input command string.
 */
public class CommandExecutor {

	private IRobot robot;
	private GameBoard board;

	public CommandExecutor(IRobot robot, GameBoard board) {
		this.robot = robot;
		this.board = board;

	}

	/**
	 * Validates the input string and initiate the appropriate command.
	 * 
	 * @param command
	 *            - line read from the input reader
	 */
	public void processCommand(String command) {

		final Command cmd = CommandFactory.getCommand(command);
		if ("exit".equalsIgnoreCase(command)) {
			System.out.println("Thank you for using Robot Simulator. \nGood Bye !!  ");
			System.exit(0);
		} else {
			if (null != cmd) {
				if (cmd instanceof PlaceCommand) {
					Position position = PositionEvaluator.evaluatePosition(command);
					Direction direction = DirectionEvaluator.evaluateDirection(command);
					((PlaceCommand) cmd).setDirection(direction);
					((PlaceCommand) cmd).setPosition(position);
				}
				cmd.execute(robot, board);

			} else {
				System.out.println("The command is not valid, " + command);
			}
		}

		System.out.println(">>>Please enter the next command.>>>");
	}
}
