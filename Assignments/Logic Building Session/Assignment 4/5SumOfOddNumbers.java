import java.util.Scanner;

class SumOfOddNumbers{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<=num;i++){
			
			if(i%2!=0){	
				sum=sum+i;
			}
		 	
		}
		System.out.println("The Sum of odd numbers from 1 to " +num+ " is: "+sum);
	}
}