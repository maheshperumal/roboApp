package com.ai.model;

/**
 * 
 * Enum defining the incremental position
 *
 */
public enum Steps {

	EAST(1, 0), WEST(-1, 0), NORTH(0, 1), SOUTH(0, -1);
	
	Position position;
	
	Steps(int x, int y) {
		position = new Position(x,y);	
	}

	public Position getPosition(){
		return position;
	}
}
