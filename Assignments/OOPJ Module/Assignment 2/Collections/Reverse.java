package org.vidya;

import java.util.ArrayList;
import java.util.Collections;

public class Reverse {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Orange");
		list.add("Red");
		list.add("Blue");
		list.add("Black");
		list.add("White");
		
		System.out.println("Colors are: "+list);
		
		Collections.reverse(list);
		System.out.println("Reverse Colors are: "+list);
	}
}
