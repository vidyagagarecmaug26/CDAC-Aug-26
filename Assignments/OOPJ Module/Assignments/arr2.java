
public class arr2 {
	
	public static void main(String[] args) {
		System.out.println("Enter Elements");
		int size=ConsoleInput.getInt();
		
		int[] numbers=new int[size];
		
		int sum=0;
		for(int num=0; num<size;num++) {
			numbers[num]=ConsoleInput.getInt();	
			sum += numbers[num];
		}
		
		System.out.println("Sum of Numbers :"+sum);
	}

}
