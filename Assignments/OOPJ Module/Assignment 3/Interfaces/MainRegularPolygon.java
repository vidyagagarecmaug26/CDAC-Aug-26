package org.vidya;

public class MainRegularPolygon {

	public static void main(String[] args) {
		
		RegularPolygon rp = new EquilateralTriangle(5.5);
		System.out.println("====Equilateral Triangle====");
		System.out.println("Number of sides: "+rp.getNumSides());
		System.out.println("Total length of EquilateralTriangle: "+rp.getSideLength());
		System.out.println("Perimeter of Equilateral Triangle: "+rp.getPerimeter());
		System.out.println("Interior Angle of Equilateral Triangele: "+rp.getInteriorAngle()+"\n");

		RegularPolygon rp1=new Square(10.0);
		System.out.println("====Square====");
		System.out.println("Number of sides: "+rp1.getNumSides());
		System.out.println("Total length of Square: "+rp1.getSideLength());
		System.out.println("Perimeter of Square: "+rp1.getPerimeter());
		System.out.println("Interior Angle of Square: "+rp1.getInteriorAngle()+"\n");
		
		
		System.out.println("====================");
		RegularPolygon trp1 = new EquilateralTriangle(5.5);
		RegularPolygon trp2 = new EquilateralTriangle(3.5);
		RegularPolygon ts1 = new Square(10.0);
		
		RegularPolygon[] shapes = {trp1, trp2,ts1};
		
		int total=RegularPolygon.totalSides(shapes);
		
		System.out.println("Total sides of all shapes: " +total);
		
		System.out.println("====================");
		
		
	}

}
