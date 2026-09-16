
public class Reversed {

	public static void main(String[] args) {
		String str = "The quick brown fox jumps";
		String reversed="";
		
		for(int i=str.length()-1;i>=0;i--) {
			reversed= reversed +str.charAt(i);
		}
		
		System.out.println("The given string is: "+str);
		System.out.println("The string in reverse order is: "+reversed);

	}
	
}
