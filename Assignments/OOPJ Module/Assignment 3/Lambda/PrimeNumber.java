package org.vidya;

import java.util.Scanner;
import java.util.function.IntPredicate;

public class PrimeNumber {

	public static void main(String[] args) {

		IntPredicate isPrime = n -> {
			if(n<=1) return false;
			
			for(int i=2; i<=Math.sqrt(n); i++) {
				if(n % i == 0) {
					return false;
				}
			}
			return true;
		};
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scanner.nextInt();
		
		if(isPrime.test(num)) {
			System.out.println(num + " is a prime Number");
		}
		else {
			System.out.println(num +" is not a prime number");
		}

	}

}
