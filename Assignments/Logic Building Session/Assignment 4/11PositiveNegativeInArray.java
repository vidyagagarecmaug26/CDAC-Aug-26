import java.util.Scanner;

class PositiveNegativeInArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] numbers=new int[6];
		System.out.println("Enter 6 intergers : ");
		
		int positivecount=0;
		int negativecount=0;
		int zerocount=0;
		int count=0;
		
		for(int i=0; i<numbers.length;i++){
		 	numbers[i]=sc.nextInt();

			if(numbers[i]>0){
				positivecount++;
			}
			else if(numbers[i]<0){
				negativecount++;
			}
			else{
				zerocount++;
			}
					
		}
		System.out.println("Positive numbers: " + positivecount );
		System.out.println("Negative numbers: " + negativecount);
	}

}