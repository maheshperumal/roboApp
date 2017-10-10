package com.ai.model;

/**
 * 
 * @see Robot
 *
 */
public class Robot implements IRobot{

	Position position;
	Direction direction;
	
	
	public Robot(){
		
	}
	public Robot(Position position,Direction direction){
		this.position = position;
		this.direction = direction;
	} 
	
	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

}
