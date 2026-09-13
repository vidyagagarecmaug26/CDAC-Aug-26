
public class arr5 {

	public static void main(String[] args) {
		System.out.println("Enter size");
		int size=ConsoleInput.getInt();
		
		int[] numbers=new int[size];
		
		numbers[0] = ConsoleInput.getInt();
		int min=numbers[0];
		int max=numbers[0];
	
		for(int num=1; num<numbers.length;num++) {
			numbers[num]=ConsoleInput.getInt();
			
			if(numbers[num]<min) {
				min=numbers[num];
			}
			if(numbers[num]>max) {
				max=numbers[num];
			}			
		}
		System.out.println("Minimum value array: "+min);
		System.out.println("Maximum value array: "+max);
	}

}
