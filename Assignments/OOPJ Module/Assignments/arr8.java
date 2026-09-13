
public class arr8 {
	
	public static void main(String[] args) {
		System.out.println("Enter size");
		int size=ConsoleInput.getInt();
		
		Integer[] numbers=new Integer[size];
		boolean foundDuplicate=false;
		
		for(int num=0; num<size; num++) {
			numbers[num]=ConsoleInput.getInt();
		}
		for(int num=0; num<size; num++) {	
			for(int num1=num+1; num1<size; num1++) {
				
				if(numbers[num].equals(numbers[num1])) {
					foundDuplicate=true;
					break;
				}	
			}
		}
		if(foundDuplicate) {
			System.out.println("Found");
		}
		else {
			System.out.println("Not Found");
		}
	}	
}

