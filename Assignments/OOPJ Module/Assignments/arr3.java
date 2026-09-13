
public class arr3 {

	public static void main(String[] args) {
		System.out.println("Enter Elements");
		int size=ConsoleInput.getInt();
		
		int[] numbers=new int[size];
		
		int sum=0;
		double avg=0;
		for(int num=0; num<size;num++) {
			numbers[num]=ConsoleInput.getInt();	
			sum += numbers[num];
			avg=sum/size;
		}
		
		System.out.println("Average of Numbers :"+avg);
	}

}

