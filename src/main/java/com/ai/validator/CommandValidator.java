package com.ai.validator;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Class CommandValidator
 *
 */
public class CommandValidator {
	
	
	
	@SuppressWarnings("serial")
	public static List<String> validCommands = new ArrayList<String>(){

	{
		add("move");
		add("left");
		add("right");
		add("report");
		add("exit");
		
	}};
	
	@SuppressWarnings("serial")
	public static List<String> validFacePosition = new ArrayList<String>(){{
		add("north");
		add("west");
		add("east");
		add("south");
	
	}};
	

	
	

}
