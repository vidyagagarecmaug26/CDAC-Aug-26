import java.util.*;

class CheckStringIsPalindrome{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String name=sc.nextLine();
		
		String reverseStr="";
		for(int i=name.length()-1;i>=0;--i){
			reverseStr=reverseStr+name.charAt(i);			
		}
		if(name.equals(reverseStr)){
			System.out.println("The string '"+name+"' is Palindrome");
		}
		else{
			System.out.println("The string '"+name+"' is not Palindrome");
		}
		
	}

}