
public class arr7 {
	
	public static void main(String[] args) {
		System.out.println("Enter size");
		int size=ConsoleInput.getInt();
		
		int[] numbers=new int[size];
		boolean foundDuplicate=false;
		
		for(int num=0; num<size;num++) {
			numbers[num]=ConsoleInput.getInt();
			
			for(int num1=0; num1<num; num1++) {
				if(numbers[num] == numbers[num1] ) {
					foundDuplicate=true;
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
