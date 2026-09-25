package org.vidya;

import java.util.ArrayList;
import java.util.Collections;

public class Shuffle {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Orange");
		list.add("Red");
		list.add("Blue");
		list.add("Black");
		list.add("White");
		
		System.out.println("Colors are: "+list);
		
		Collections.shuffle(list);
		System.out.println("Shuffled Colors are: "+list);
	}
}
