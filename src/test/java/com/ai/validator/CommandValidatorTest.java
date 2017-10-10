package com.ai.validator;

import org.junit.Assert;
import org.junit.Test;

public class CommandValidatorTest {
	@Test
	public void testIsValidCommand() {
		
		String command = "Place 2,3,west";
		Assert.assertTrue(CommandValidator.validCommands.contains(command));
		
	}
	
	

}
