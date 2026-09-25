package org.vidya;

import java.util.TreeSet;

public class Ceiling {

	public static void main(String[] args) {
		
		TreeSet<Integer> set = new TreeSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		
		int givenElement = 25;
		
		System.out.println("Tree Set elements are: "+set);
		
		System.out.println("Element greater than or equal to "+givenElement+" is: "+set.ceiling(givenElement));

	}

}
