

public class arr9 {
	
	public static void main(String[] args) {
		System.out.println("Enter Elemets");
		int size=ConsoleInput.getInt();
		
		int[] numbers=new int[size];
		
		for(int num=0; num<size; num++) {
			numbers[num]=ConsoleInput.getInt();
		}
		System.out.println("Enter Elements");
		int size1=ConsoleInput.getInt();
		int[] numbers1=new int[size];
		
		for(int num1=0; num1<size1; num1++) {
			numbers1[num1]=ConsoleInput.getInt();

		}
		boolean commonEle = false;
		for(int num=0; num<size; num++) {
			for(int num1=0; num1<size1; num1++) {
				if(numbers[num] == numbers1[num1]) {
					System.out.println("Match found " + numbers[num]);
					commonEle = true;
					break;
				}
			}
		}
		if(!commonEle) {
			System.out.println("Match not found");
		}		
		
	}	
}


