public class arr6 {

	public static void main(String[] args) {
		System.out.println("Enter Elements");
		int size=ConsoleInput.getInt();
		
		int[] numbers=new int[size];
		
		
		for(int num=0; num<numbers.length;num++) {
			numbers[num]=ConsoleInput.getInt();	
		}
		int reverse[]=new int[size];
		
		for(int num=0; num<numbers.length;num++) {
			reverse[reverse.length-1-num]=numbers[num];
		}

		System.out.println("Reverse :");
		for(int num=0; num<reverse.length;num++) {
			System.out.print(reverse[num] + " ");
		}
	}

}
//for(int num1=0; num1<numbers.length/2;num1++) {
//int index=numbers.length-1-num1;
//
//int temp=numbers[num1];
//numbers[num1]=numbers[index];
//numbers[index]=temp;
//}
