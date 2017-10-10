package com.ai;

import java.util.Scanner;

import com.ai.command.CommandExecutor;
import com.ai.model.GameBoard;
import com.ai.model.QuadrilateralBoard;
import com.ai.model.Robot;
import com.ai.model.IRobot;

/**
 * 
 * Main class to execute the application
 *
 */

public class MainApp {

	/**
	 * This is the main method which makes use of addNum method.
	 * 
	 * @param args Unused.
	 * @return Nothing.
	 * @exception Excepion -   On input error.
	 * @see Exception
	 */
	
	public static void main(String[] args) {

		IRobot robot = new Robot();
		GameBoard board = new QuadrilateralBoard(5, 5);
		CommandExecutor executor = new CommandExecutor(robot, board);
		System.out.println(">>>Please enter the command.>>> Using place command first");
		Scanner in = new Scanner(System.in);
		try {
			String command = "";
			while (true) {

				command = in.nextLine();

				executor.processCommand(command);

			}
		} catch (Exception e) {
			System.err.println("System Error !!");
		} finally {
			in.close();
		}

	}

}
