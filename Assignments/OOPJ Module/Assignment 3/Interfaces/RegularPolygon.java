package org.vidya;

public interface RegularPolygon {
	
	int getNumSides();
	double getSideLength();
	
	static int totalSides(RegularPolygon[] polygons) {
		int total= 0;
		
		for(RegularPolygon p : polygons) {
			total += p.getNumSides();
		}
		return total;
	}
	
	default double getPerimeter() {
		double n = getNumSides();
		return n* getSideLength();
	}
	default double getInteriorAngle() {
		double n = getNumSides();
		return (n-2)*Math.PI/n;
	}
	
}
