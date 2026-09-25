package org.vidya;

import java.util.ArrayList;

public class Insertion {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		
		list.add(0, "purple");
		list.add("Orange");
		list.add("Red");
		list.add("Blue");
		list.add("Black");
		list.add("White");
		
		System.out.println("Colors are: "+list);
	}
}
