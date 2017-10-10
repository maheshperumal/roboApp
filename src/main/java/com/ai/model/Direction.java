package com.ai.model;
/**
 * 
 * Enum Direction.
 *
 */
public enum Direction {

	NORTH("NORTH"), SOUTH("SOUTH"), EAST("EAST"), WEST("WEST");

	String direction;

	Direction(String direction) {
		this.direction = direction;
	}

	public String getDirection() {
		return direction;
	}

}
