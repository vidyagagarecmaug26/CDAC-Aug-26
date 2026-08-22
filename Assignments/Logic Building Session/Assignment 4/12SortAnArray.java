import java.util.Scanner;
import java.util.*;

class SortAnArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] numbers=new int[5];
		System.out.println("Enter 5 intergers : ");
		
		for(int i=0; i<numbers.length;i++){
		 	numbers[i]=sc.nextInt();
			
		}
		Arrays.sort(numbers);
		System.out.println("Sorted Array:"+ Arrays.toString(numbers));
		
	}

}