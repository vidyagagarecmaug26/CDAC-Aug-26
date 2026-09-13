
public class mainTriangle {

	public static void main(String[] args) {
		
		Triangle t=new Triangle();
		t.perimeter=t.a+t.b+t.c;
		System.out.println("Perimeter of Triangle: "+t.perimeter);
		
		double s=t.perimeter/2.0;
		
		t.area=Math.sqrt(s*(s-t.a)*(s-t.b)*(s-t.c));
		System.out.println("Area of Triangle: "+t.area);
	}

}
