package org.vidya;

import java.util.TreeSet;

public class ReverseOrder {

	public static void main(String[] args) {
		
		TreeSet<String> set = new TreeSet<String>();
		set.add("Orange");
		set.add("Red");
		set.add("Blue");
		set.add("Black");
		set.add("White");
		
		System.out.println("Tree set of Colors are: "+set);
		
		
		System.out.println("Reversed colors are: "+set.reversed());
	}

}
