package org.vidya;

import java.util.Scanner;
import java.util.function.BiFunction;

public class Concatenate {

	public static void main(String[] args) {
		BiFunction<String,String,String> concat=(str1,str2)->str1+str2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first String: ");
		String first = sc.nextLine();
		
		System.out.println("Enter second String: ");
		String second = sc.nextLine();
		
		String result = concat.apply(first, second);
		System.out.println("Concatenated Result: "+result);

	}

}
