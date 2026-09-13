
public class Program {

	public static void main(String[] args) {
		Date objDate=new Date();
		int choice=0;
		
		do {
			System.out.println("1. Set Date");
			System.out.println("2. Add Days");
			System.out.println("3. Add Months");
			System.out.println("4. Add Years");
			System.out.println("5. Display");
			System.out.println("6. Exit");
			System.out.println("Enter your choice : ");
			
			choice=ConsoleInput.getInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter the day: ");
				int d= ConsoleInput.getInt();
				System.out.println("Enter the month: ");
				int m= ConsoleInput.getInt();
				System.out.println("Enter the year: ");
				int y= ConsoleInput.getInt();
				objDate.setDate(d, m, y);
				objDate.display();
				break;
			
			case 2: 
				System.out.println("Enter days to add: ");
				int days=ConsoleInput.getInt();
				objDate.addDays(days);
				objDate.display();
				break;
				
			case 3:
                System.out.print("Enter months to add: ");
                int months = ConsoleInput.getInt();
                objDate.addMonths(months);
                objDate.display();
                break;
            case 4:
                System.out.print("Enter years to add: ");
                int years = ConsoleInput.getInt();
                objDate.addYear(years);
                objDate.display();
                break;
            case 5:
                objDate.display();
                break;
            case 6:
                System.out.println("Exiting program...");
                break;
            default:
                System.out.println("Invalid option selected.");
			}	
			
		}while(choice !=7);
	}
}
