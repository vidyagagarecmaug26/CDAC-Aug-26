import java.util.Arrays;

public class arr4 {

	public static void main(String[] args) {
		System.out.println("Enter Elements");
		int size=ConsoleInput.getInt();
		
		int[] numbers=new int[size];
		int[] copied=new int[numbers.length];
		
		
		for(int num=0; num<numbers.length;num++) {
			numbers[num]=ConsoleInput.getInt();	
			copied[num]=numbers[num];
		}
		
		System.out.println("Original :"+Arrays.toString(numbers));
		System.out.println("Copied :"+Arrays.toString(copied));
	}

}

