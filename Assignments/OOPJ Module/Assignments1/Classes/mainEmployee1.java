
public class mainEmployee1 {

	public static void main(String[] args) {
		Employee1 e1 =new Employee1();
		
		e1.getInfo(400.00, 5);
		System.out.println("Salary :"+e1.salary); 
		System.out.println("Hours :"+e1.hrs); 
		e1.addSal();
		e1.addWork();
		
		
		
		
	}

}
