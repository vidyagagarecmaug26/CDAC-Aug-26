import java.util.Scanner;
import java.util.*;

class IndexElementInArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] numbers=new int[5];
		System.out.println("Enter 5 intergers : ");
		for (int i = 0; i < numbers.length; i++) {
            		numbers[i] = sc.nextInt();
        	}

		System.out.println("Enter the number to search : ");
		int result=sc.nextInt();
		int index=Arrays.binarySearch(numbers,result);

		if(index >=0){
			
			System.out.println("The number "+result+ " is found at index " +index);
		}	
		else{
			System.out.println("Not Found");	
		}
	}

}