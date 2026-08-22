import java.util.Scanner;

class AverageOfElementsOfArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] numbers=new int[5];
		System.out.println("Enter 5 intergers : ");
		
		int sum=0;
		double avg=0;
		for(int i=0; i<numbers.length;i++){
		 	numbers[i]=sc.nextInt();
		
			sum=sum+numbers[i];
			avg=sum/numbers.length;
		}
		
					
		
		System.out.println("The average of the numbers is: " + avg);
	}

}