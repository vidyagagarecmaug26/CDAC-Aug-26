package org.vidya;

public class Square implements RegularPolygon {
	
	private double sides;
	
	Square(double sides){
		this.sides=sides;
	}
	@Override
	public int getNumSides() {
		return 4;
	}

	@Override
	public double getSideLength() {
		return sides;
	}

}
