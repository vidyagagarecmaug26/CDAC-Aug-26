package org.vidya;

import java.util.Random;
import java.util.function.IntSupplier;

public class RandomNumber {

	public static void main(String[] args) {
	 
		Random rand = new Random();
		IntSupplier digits= ()-> rand.nextInt(900)+100;
	 
		int num1 = digits.getAsInt();
		int num2 = digits.getAsInt();
		int num3 = digits.getAsInt();
		
		System.out.println("Number 1: "+num1);
		System.out.println("Number 2: "+num2);
		System.out.println("Number 3: "+num3);
	}

}
