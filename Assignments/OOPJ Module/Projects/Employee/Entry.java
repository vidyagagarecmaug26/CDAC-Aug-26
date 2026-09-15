import java.util.Comparator;
import java.util.*;

public class Entry {
	
	static Employee[] arrEmployee=new Employee[50];
	static int count = 0;
	static int current = 0;
	
	//ADD EMPLOYEE
	static void addEmployee() {
		
		System.out.println("1.Manager");
		System.out.println("2.Engineer");
		System.out.println("3.Sales Person");
		int ch=ConsoleInput.getInt();
		
		final int HRA=1;
		final int OVER_TIME=2;
		final int COMMISSION=3;
		
		System.out.println("Enter Name");
		String name=ConsoleInput.getString();
		
		System.out.println("Enter Address");
		String address=ConsoleInput.getString();
		
		System.out.println("Enter Age");
		int age=ConsoleInput.getInt();
		
		System.out.println("Enter Gender (1-male, 0-Female)");
		int gender=ConsoleInput.getInt();
		
		System.out.println("Enter Basic Salary");
		float basicSalary=ConsoleInput.getFloat();
		
		if(ch==HRA) {
			System.out.println("HRA: ");
			float hra=ConsoleInput.getFloat();
			arrEmployee[count]=new Manager(name,address,age,gender,basicSalary,hra);
			count++;
		}
		else if(ch==OVER_TIME) {
			System.out.println("Over Time: ");
			int overTime=ConsoleInput.getInt();
			arrEmployee[count]=new Engineer(name,address,age,gender,basicSalary,overTime);
			count++;
		}
		else if(ch==COMMISSION) {
			System.out.println("Commission: ");
			float commission=ConsoleInput.getFloat();
			arrEmployee[count]=new SalesPerson(name,address,age,gender,basicSalary,commission);
			count++;
		}
		System.out.println("Employee added");
	}
	static void display() {
		if(count==0) {
			System.out.println("No Employees");
			return;
		}
		System.out.println("\n1.All");
		System.out.println("2.First");
		System.out.println("3.Next");
		System.out.println("4.Previous");
		System.out.println("5.Last");
		int ch=ConsoleInput.getInt();
		
		if(ch==1){
			for(int itmp=0;itmp<count;itmp++) {
				System.out.println(arrEmployee[itmp]);
			}
				
		}
		else if(ch==2) {
			current=0;
			System.out.println(arrEmployee[current]);
		}
		else if(ch==3) {
			if(current < count-1)
				current++;
			else
				System.out.println("Already at the first employee.");
			System.out.println(arrEmployee[current]);
		}
		else if(ch==4) {
			if(current>0) {
				current--;
			}	
			else { 
				System.out.println("Already at the first employee");
			}	
			System.out.println(arrEmployee[current]);
		}
		else if(ch==5) {
			current=count-1;
			System.out.println(arrEmployee[current]);
		}
	}
	
	static void sort() {
	    if (count <= 1) {
	        System.out.println("Not enough employees to sort.");
	        return;
	    }

	    System.out.println("Choose Sorting Order:");
	    System.out.println("1. Alphabetical (Ascending A-Z)");
	    System.out.println("2. Alphabetical (Descending Z-A)");
	    int orderChoice = ConsoleInput.getInt();
	    final int ASSC=1;
	    final int DESC=2;

	    if (orderChoice == ASSC) {
	        Arrays.sort(arrEmployee, 0, count, Comparator.comparing(emp -> emp.getName()));
	        System.out.println("Employees sorted in Ascending order.");
	    } 
	    else if (orderChoice == DESC) {
	        Arrays.sort(arrEmployee, 0, count, Comparator.comparing((Employee emp) -> emp.getName()).reversed());
	        System.out.println("Employees sorted in Descending order.");
	    } 
	    else {
	        System.out.println("Invalid choice.");
	    }
	}
	public static void main(String[] args) {
		int ch;
		
		do {
			System.out.println("\n EmployeeMenu");
			System.out.println("1.Add Employee");
			System.out.println("2.Display");
			System.out.println("3.Sort");
			System.out.println("4.Exit");
			
			ch=ConsoleInput.getInt();
			
			switch(ch) {
			case 1: addEmployee();
					break;
			case 2: display();
					break;		
			case 3: sort();
					break;
			case 4: System.out.println("Exit");
					break;		
			default:
				System.out.println("Invalid Choice");
			}
		}while(ch != 4);
	}

}
