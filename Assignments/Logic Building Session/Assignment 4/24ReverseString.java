import java.util.*;

class ReverseString{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String name=sc.nextLine();
		
		String reverse=new StringBuilder(name).reverse().toString();
		System.out.println("Reversed string: " +reverse);
	}

}