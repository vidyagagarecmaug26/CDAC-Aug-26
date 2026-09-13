
public class mainMember {

	public static void main(String[] args) {
		PrimeMembers p=new PrimeMembers();
		
		System.out.println("Enter Name :");
		p.setName(ConsoleInput.getString());
		
		System.out.println("Enter Age :");
		p.setAge(ConsoleInput.getInt());

		System.out.println("Enter Phone Number :");
		p.setPhone_no(ConsoleInput.getInt());
		
		System.out.println("Enter Address :");
		p.setAddress(ConsoleInput.getString());
		
		System.out.println("Enter Salary :");
		p.setSalary(ConsoleInput.getInt());
		
		System.out.println("Enter Joining Year :");
		p.setJoiningYear(ConsoleInput.getInt());
		
		System.out.println("Enter Joining Fees :");
		p.setJoiningFees(ConsoleInput.getInt());
	
		System.out.println("Is Active Member");
		int active=ConsoleInput.getInt();
		p.setActive(active==1);
		
		p.display();

	}

}
