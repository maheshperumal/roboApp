package com.ai.utils;

import org.junit.Assert;
import org.junit.Test;



public class PositionEvaluatorTest {
	@Test
	public void testEvaluatePosition() {
		
		String command ="Place 2,3,north";
		Assert.assertEquals(2,PositionEvaluator.evaluatePosition(command).getX());
		Assert.assertEquals(3,PositionEvaluator.evaluatePosition(command).getY());
		
	}

}
