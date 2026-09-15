
public class mainCalculator {

	public static void main(String[] args) {
	
		int ch=0;
		do {
			System.out.println("Calculator Menu");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Modulo");
			System.out.println("6. Exit");
			System.out.println("Enter your choice: ");
			
			int choice= ConsoleInput.getInt();
			
			if(choice >=1 && choice<=5) {
				System.out.println("Enter first number: ");
				int num1=ConsoleInput.getInt();
				System.out.println("Enter Second number: ");
				int num2=ConsoleInput.getInt();
				
				Calculator c=new Calculator(num1,num2);
				
				switch(choice) {
				case 1 : 
						 System.out.println("Result: "+c.add());
						 break;
				
				case 2 :
						 System.out.println("Result: "+c.sub());
						 break;
						 
				case 3 : 
				 		 System.out.println("Result: "+c.mul());
				 		 break;
				 		 
				case 4 : 
				 		 System.out.println("Result: "+c.div());
				 		 break;
				 		 
				case 5 : 
				 		 System.out.println("Result: "+c.mod());
				 		 break;
				} 		 
			}
			else if(choice==6){
				System.out.println("Exiting Calculator Application");
				
			}
			else {
				System.out.println("Invalid choice");
			}
		}while(ch!=6);
	
	}

}
