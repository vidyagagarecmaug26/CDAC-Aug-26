package org.vidya;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SmallestArray {

	public static void main(String[] args) {
		ArrayList<Integer>numbers = new ArrayList<>(List.of(22,99,63,56));
		
		int min = Collections.min(numbers);
		System.out.println("Smallest Number is: "+min);

	}

}
