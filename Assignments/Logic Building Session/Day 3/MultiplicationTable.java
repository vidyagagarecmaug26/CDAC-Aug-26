import java.util.Scanner;

class MultiplicationTable{
	void printMultiplicationTable(){
		Scanner sc= new Scanner(System.in);
		int num = 5;
		System.out.println("Enter a number:");
		num=sc.nextInt();

		for(int n=1;n<=10;n++){
			
			
			System.out.println(num +  "x" + n + "=" + num*n );
		}
	}
	public static void main(String[] args){
		MultiplicationTable obj=new MultiplicationTable();
		obj.printMultiplicationTable();
	
	}

}