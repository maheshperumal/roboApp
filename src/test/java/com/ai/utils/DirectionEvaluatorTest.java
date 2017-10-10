package com.ai.utils;

import org.junit.Assert;

import com.ai.model.Direction;

public class DirectionEvaluatorTest {
	
	
	public void testEvaluateDirection() {
		
		String command ="Place 2,3,east";
		Assert.assertEquals(Direction.EAST,DirectionEvaluator.evaluateDirection(command));
		
	}

}
