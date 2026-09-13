import java.util.Arrays;

public class arr1 {

	public static void main(String[] args) {
		System.out.println("Enter size");
		int size=ConsoleInput.getInt();
		
		int[] numbers=new int[size];
		
		for(int num=0; num<size;num++) {
			numbers[num]=ConsoleInput.getInt();
		}
		Arrays.sort(numbers);
		
		
		System.out.println("Sorted array: "+Arrays.toString(numbers));
	}

}
