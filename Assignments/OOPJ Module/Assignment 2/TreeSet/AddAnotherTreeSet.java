package org.vidya;

import java.util.TreeSet;

public class AddAnotherTreeSet {

	public static void main(String[] args) {
		
		TreeSet<String> set = new TreeSet<String>();
		set.add("Orange");
		set.add("Red");
		set.add("Blue");
		set.add("Black");
		set.add("White");
		
		System.out.println("Tree set of Colors are: "+set);
		
		TreeSet<String> set1 = new TreeSet<String>();
		set1.add("Purple");
		set1.add("Violet");
		set1.add("Yellow");
		
		set.addAll(set1);
		
		System.out.println("Added Colours are: "+set);
	}
}
