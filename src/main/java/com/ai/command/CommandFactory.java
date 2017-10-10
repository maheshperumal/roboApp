package com.ai.command;

import com.ai.model.Direction;
import com.ai.model.Position;
import com.ai.utils.DirectionEvaluator;
import com.ai.utils.PositionEvaluator;
import com.ai.validator.CommandValidator;

/*
 * CommandFactory - Factory class to  
 */

public class CommandFactory {

	static boolean placeCommandCheck;

	/**
	 * This method will initiate command object on input string value.
	 * 
	 * @param commandName
	 * @return Command Object
	 */
	public static Command getCommand(final String commandName) {

		Command cmd = null;
		if (isValidCommand(commandName)) {
			final String commandIdentifier = commandName.split("[ ]")[0].toLowerCase();

			switch (commandIdentifier) {

			case MoveCommand.NAME:
				cmd = new MoveCommand();
				break;
			case LeftCommand.NAME:
				cmd = new LeftCommand();
				break;
			case RightCommand.NAME:
				cmd = new RightCommand();
				break;
			case ReportCommand.NAME:
				cmd = new ReportCommand();
				break;
			case PlaceCommand.NAME:
				cmd = new PlaceCommand();
				Position position = PositionEvaluator.evaluatePosition(commandName);
				Direction direction = DirectionEvaluator.evaluateDirection(commandName);
				((PlaceCommand) cmd).setDirection(direction);
				((PlaceCommand) cmd).setPosition(position);
				break;
			default:
				break;
			}
			return cmd;
		} else {
			return null;
		}

	}

	/**
	 * 
	 * Methods check for the valid comand format.
	 * 
	 * @param command
	 * @return boolean value
	 */
	public static boolean isValidCommand(String command) {
		boolean isValidCommand = false;
		if (CommandValidator.validCommands.contains(command)) {
			if (command.trim().toLowerCase().equalsIgnoreCase("exit"))
				isValidCommand = true;
			else if (!placeCommandCheck)
				isValidCommand = false;
			else if (command.trim().toLowerCase().equalsIgnoreCase("move"))
				isValidCommand = true;
			else if (command.trim().toLowerCase().equalsIgnoreCase("left"))
				isValidCommand = true;
			else if (command.trim().toLowerCase().equalsIgnoreCase("right"))
				isValidCommand = true;
			else if (command.trim().toLowerCase().equalsIgnoreCase("report"))
				isValidCommand = true;

		} else {

			if (!placeCommandCheck && command.toLowerCase().startsWith("place")) {
				isValidCommand = validatePlaceCommand(command);
				placeCommandCheck = isValidCommand;
			} else if (command.toLowerCase().startsWith("place")) {
				isValidCommand = validatePlaceCommand(command);
			}
		}

		return isValidCommand;
	}

	/**
	 * Method validates the place command.
	 * 
	 * @param command
	 * @return boolean
	 */
	public static boolean validatePlaceCommand(String command) {

		String[] splitCommands = command.split(" ");
		if (splitCommands != null && splitCommands.length == 2) {
			String[] pointsValue = splitCommands[1].split(",");
			return validatePointValue(pointsValue) && validateFaceValue(pointsValue);
		} else
			return false;

	}

	/**
	 * Method validates individual values of place method.
	 * 
	 * @param pointsValue
	 * @return
	 */
	public static boolean validateFaceValue(String[] pointsValue) {

		if (CommandValidator.validFacePosition.contains(pointsValue[2].toLowerCase()))
			return true;
		return false;

	}

	/**
	 * Method validates individual values of place method.
	 * 
	 * @param pointsValue
	 * @return
	 */
	public static boolean validatePointValue(String[] pointsValue) {

		if (pointsValue != null && pointsValue.length == 3)
			return true;
		return false;

	}
}
