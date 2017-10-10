package com.ai.model;

/**
 * 
 * Interface IRobot
 *
 */
public interface IRobot {
	
	public Position getPosition();
	public void setPosition(Position position);
	public Direction getDirection();
	public void setDirection(Direction direction);

}
