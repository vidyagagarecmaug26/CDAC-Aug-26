
public class Engineer extends Employee {
	
	int overTime;
	public Engineer(String name,String address,int age,int gender,float basicSalary,int overTime) {
		super(name,address,age,gender,basicSalary);
		this.overTime=overTime;
	}
	@Override public String getRole() {
		return "Engineer";
	}
	
	
}
