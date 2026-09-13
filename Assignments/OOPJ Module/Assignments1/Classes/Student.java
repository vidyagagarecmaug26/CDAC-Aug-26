
public class Student {
	
	protected String name;
	protected int roll_no;
	protected String phone_no;
	protected String address;
	
	Student(){
		roll_no=0;
		name=" ";
	}
	Student(int roll_no,String phone_no,String address){
		this.roll_no=roll_no;
		this.phone_no=phone_no;
		this.address=address;
	}
	
}
