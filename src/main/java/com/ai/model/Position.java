package com.ai.model;

/**
 * 
 * Position to define coordinates 
 *
 */
public class Position {

	int x;
	int y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Position addPosition(Position p) {
		int newPointX = this.x + p.x;
		int newPointY = this.y + p.y;

		return new Position(newPointX, newPointY);
	}

	@Override
	public String toString() {
		return this.x + "," + this.y ;
	}

	@Override
	public boolean equals(Object obj) {
		if(null != null) {
			if((((Position)(obj)).getX() ==this.x) && (((Position)(obj)).getY() == this.y)){
				return true;
			}
		}
		return false;
	}
	

}
