import java.util.Scanner;

class AgeChecker{
	void checkAgeCategory(int age){
		
		String category=(age< 18) ? "You are a minor" : (age>=70) ? "You are a senior citizen" : "You are a adult";
		System.out.println(category);
		
		}
		public static void main(String args[]){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your age:");
			int age=sc.nextInt();
		
		

			AgeChecker obj=new AgeChecker();
			obj.checkAgeCategory(age);
	
		
		
		}


}