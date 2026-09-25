package org.vidya;

import java.util.ArrayList;

public class Search {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Orange");
		list.add("Red");
		list.add("Blue");
		list.add("Black");
		list.add("White");
		System.out.println("Colors are: "+list);
		
		System.out.println("Red Colour Present: "+list.contains("Red"));
		System.out.println("Purple Colour Present: "+list.contains("Purple"));
		
	}
}
