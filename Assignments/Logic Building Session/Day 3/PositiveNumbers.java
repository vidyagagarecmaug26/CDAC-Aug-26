import java.util.Scanner;

class PositiveNumber{
	int askForPositiveNumber(){
		Scanner sc=new Scanner(System.in);
		int num;
		do{
			
			System.out.println("Enter a Positive number:");
			num=sc.nextInt();
			
		}
		while(num<=0);
		System.out.println("Your Positive number is:" + num);
		return num;
	}
	
	public static void main(String[] args){
		PositiveNumber obj= new PositiveNumber();
		obj.askForPositiveNumber();
	}

}