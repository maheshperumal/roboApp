package com.ai.model;

public class QuadrilateralBoard implements GameBoard{
	int rows;
    int columns;

	public QuadrilateralBoard(int rows, int columns) {
		this.rows = rows;
        this.columns = columns;		
	}
	
	@Override
	public boolean isValidPosition(Position position) {
		return !(
                position.getX() >= this.columns || position.getX() < 0 ||
                        position.getY() >= this.rows || position.getY() < 0
        );
	}

}
