import java.util.Scanner;

class ElementsOfArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] numbers=new int[5];
		System.out.println("Enter 5 intergers : ");
		
		for(int i=0; i<numbers.length;i++){
		 	numbers[i]=sc.nextInt();
		}
		
		for(int number : numbers){
			System.out.println(number);
		}
		
	}

}