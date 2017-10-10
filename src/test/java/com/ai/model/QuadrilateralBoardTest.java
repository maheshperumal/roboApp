package com.ai.model;

import org.junit.Assert;
import org.junit.Test;

public class QuadrilateralBoardTest {

	@Test
	public void testIsValidPosition() {
		GameBoard board = new QuadrilateralBoard(5,5);
		Assert.assertTrue(board.isValidPosition(new Position(4, 3)));
		Assert.assertFalse(board.isValidPosition(new Position(5, 5)));
	}
	
}
