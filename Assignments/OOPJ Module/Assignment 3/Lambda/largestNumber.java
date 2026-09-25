package org.vidya;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class largestNumber {

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<>(List.of(22,99,56,12));
		
		int max = Collections.max(num);
		System.out.println("Largest number is: "+max);
	}
}
