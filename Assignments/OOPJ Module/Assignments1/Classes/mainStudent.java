public class mainStudent {

	public static void main(String[] args) {
		Student s=new Student();
		s.roll_no=2;
		s.name="John";
		
		System.out.println("Roll No: "+ s.roll_no);
		System.out.println("Name: "+ s.name);
		System.out.println("\n");
		
		Student s1=new Student(101,"23568914","Mumbai");
		s1.name="Sam";
		System.out.println("Details of "+s1.name +":");
		System.out.println("Roll No: "+ s1.roll_no);
		System.out.println("Phone No: "+ s1.phone_no);
		System.out.println("Address: "+ s1.address);
		System.out.println("\n");
		
		Student s2=new Student(102,"23562214","Pune");
		s2.name="John";
		System.out.println("Details of "+s2.name +":");
		System.out.println("Roll No: "+ s2.roll_no);
		System.out.println("Phone No: "+ s2.phone_no);
		System.out.println("Address: "+ s2.address);

	}

}
