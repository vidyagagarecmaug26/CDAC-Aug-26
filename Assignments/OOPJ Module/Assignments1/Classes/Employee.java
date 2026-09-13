
public class Employee {
	String name;
	int year;
	double salary;
	String address;
	
	Employee(String name, int year, double salary, String address){
		this.name=name;
		this.year=year;
		this.salary=salary;
		this.address=address;
	}
	public void display() {
		System.out.println("Name \t Year of Joining \t Salary \t Address");
	}
}
