package org.vidya;

import java.util.TreeSet;

public class GetElements {

	public static void main(String[] args) {
		
		TreeSet<String> set = new TreeSet<String>();
		set.add("Orange");
		set.add("Red");
		set.add("Blue");
		set.add("Black");
		set.add("White");
		
		System.out.println("Tree set of Colors are: "+set);
		
		System.out.println("First color is: "+set.first());
		System.out.println("Last color is: "+set.last());
	}

}
