
public class SalesPerson extends Employee {
	
	double commission;
	
	SalesPerson(String name,String address,int age,int gender,float basicSalary,double commission){
		super(name,address,age,gender,basicSalary);
		this.commission=commission;
	}
	@Override 
	public String getRole() {
		return "Sales Person";
	}
	
}
