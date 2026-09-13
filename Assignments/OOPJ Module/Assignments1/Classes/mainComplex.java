
public class mainComplex {

	public static void main(String[] args) {
		
		
		System.out.println("Enter real Number :");
		int r1=ConsoleInput.getInt();
		System.out.println("Enter Imagenary Number :");
		int i1=ConsoleInput.getInt();
		Complex c=new Complex(r1,i1);
		
	
		System.out.println("Enter another real Number :");
		int r2=ConsoleInput.getInt();
		System.out.println("Enter another Imagenary Number :");
		int i2=ConsoleInput.getInt();
		Complex c1=new Complex(r2,i2);
		
		Complex sum=c.sum(c1);
		Complex difference=c.difference(c1);
		Complex product=c.product(c1);
		
		System.out.println("Sum of two Complex Numbers: "+sum.real+" + "+sum.img+"i");
		System.out.println("Difference of two Complex Numbers: "+difference.real+" + "+difference.img+"i");
		System.out.println("Product of two Complex Numbers: "+product.real+" + "+product.img+"i");
		
				
	}

}
