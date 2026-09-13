
public class Employee1 {
	double salary;
	int hrs;
	
	public void getInfo(double salary,int hrs) {
		this.salary=salary;
		this.hrs=hrs;
	}

	public void addSal() {
		int add=10;
		if(salary<500)
			salary += add;
		System.out.println("Total Salary :"+salary);
	}
	public void addWork() {
		int add=5;
		if(hrs>6)
			salary += add;
		System.out.println("Final Salary : "+salary);
	}
}
