import java.util.Scanner;

class SumOfElementsOfArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] numbers=new int[5];
		System.out.println("Enter 5 intergers : ");
		
		int sum=0;
		for(int i=0; i<numbers.length;i++){
		 	numbers[i]=sc.nextInt();
		}
		
		for(int number : numbers){
			sum += number;
		}
		System.out.println("The sum of all numbers is: " + sum);
	}

}