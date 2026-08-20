import java.util.Scanner;

class SumOfNumbers{
	int sumOfTwoNumbers(int num1, int num2){
		int result=num1+num2;
		return result;
		
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:");
		int num1=sc.nextInt();
		
		System.out.println("Enter second number:");
		int num2=sc.nextInt();

		SumOfNumbers obj =new SumOfNumbers();

		int sum=obj.sumOfTwoNumbers(num1,num2);


		System.out.println("The Sum of "+ num1 + " and " + num2 + " are:" +sum);
		
		
		
}




}