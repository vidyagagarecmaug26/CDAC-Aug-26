import java.util.Scanner;

class MultiplesOfNumber{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		for(int i=3;i<=num;i+=3){
			System.out.println(i);
		}

	}
}