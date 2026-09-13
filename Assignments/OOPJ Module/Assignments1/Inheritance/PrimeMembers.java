
public class PrimeMembers extends Member {
	int joiningYear;
	int joiningFees;
	boolean isActive;
	
	public void display() {
		System.out.println("DETAILS :");
		System.out.println("Name: "+getName());
		System.out.println("Age: "+getAge());
		System.out.println("Phone No.: "+getPhone_no());
		System.out.println("Address: "+getAddress());
		System.out.println("Salary: "+getSalary());
		System.out.println("Joining Year: "+joiningYear);
		System.out.println("Joining Fees: "+joiningFees);
		System.out.println("Is Active: "+isActive);
	}

	public int getJoiningYear() {
		return joiningYear;
	}

	public void setJoiningYear(int joiningYear) {
		this.joiningYear = joiningYear;
	}

	public int getJoiningFees() {
		return joiningFees;
	}

	public void setJoiningFees(int joiningFees) {
		this.joiningFees = joiningFees;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
		
		
	}
	
}
