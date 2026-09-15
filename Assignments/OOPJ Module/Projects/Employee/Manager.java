
public class Manager extends Employee {
	protected float hra;

	public Manager(String name,String address,int age,int gender,float basicSalary,float hra) {
		super(name,address,age,gender,basicSalary);
		this.hra=hra;
	
	}
	@Override 
	public String getRole() {
		return "Manager";
	}
	
}
