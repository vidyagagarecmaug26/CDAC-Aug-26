
public class mainEmployee {

	public static void main(String[] args) {
		
		Employee e=new Employee("Robert", 1994, 25500.00, "64C-WallsStreat");
		e.display();
		System.out.print(e.name+"\t"+"\t");
		System.out.print(e.year+"\t"+"\t");
		System.out.print(e.salary+"\t"+"\t");
		System.out.println(e.address);
		
		
		Employee e1=new Employee("Sam", 2000, 50000.00, "68D-WallsStreat");
		System.out.print(e1.name+"\t"+"\t");
		System.out.print(e1.year+"\t"+"\t");
		System.out.print(e1.salary+"\t"+"\t");
		System.out.println(e1.address);
		
		
		Employee e2=new Employee("John", 1999, 75000.00, "26B-WallsStreat");
		System.out.print(e2.name+"\t"+"\t");
		System.out.print(e2.year+"\t"+"\t");
		System.out.print(e2.salary+"\t"+"\t");
		System.out.print(e2.address);
		
	}

}
