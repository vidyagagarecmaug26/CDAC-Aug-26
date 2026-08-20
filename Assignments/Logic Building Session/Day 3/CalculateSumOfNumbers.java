import java.util.Scanner;

class CalculateSumOfNumbers{
	int calculateSum(int num){
		int sum=0;
		
		for(int i=1;i<=num;i++){
			sum +=i;
		}
		return sum;	
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int num=sc.nextInt();

		CalculateSumOfNumbers cal=new CalculateSumOfNumbers();
		int total=cal.calculateSum(num);
		
		System.out.println("The sum of numbers from 1 to" + num + "is:" + total);
	
	}
}