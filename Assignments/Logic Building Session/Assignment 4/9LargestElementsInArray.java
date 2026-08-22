import java.util.Scanner;

class LargestElementsInArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] numbers=new int[5];
		System.out.println("Enter 5 intergers : ");
		
		int sum=0;
		double avg=0;
		int max=0;
		for(int i=0; i<numbers.length;i++){
		 	numbers[i]=sc.nextInt();
			max=numbers[i];
		}
		
		System.out.println("The largest element is: " + max);
	}

}