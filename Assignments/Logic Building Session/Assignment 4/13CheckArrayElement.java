import java.util.Scanner;
import java.util.*;

class CheckArrayElement{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Integer[] numbers=new Integer[5];
		System.out.println("Enter 5 intergers : ");
		for (int i = 0; i < numbers.length; i++) {
            		numbers[i] = sc.nextInt();
        	}
		List<Integer>list=Arrays.asList(numbers);
		

		System.out.println("Enter the number to search : ");
		int result=sc.nextInt();
		if(list.contains(result)){
			
			System.out.println("Found");
		}	
		else{
			System.out.println("Not Found");	
		}
	}

}