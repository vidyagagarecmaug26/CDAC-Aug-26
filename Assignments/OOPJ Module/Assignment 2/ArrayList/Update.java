package org.vidya;

import java.util.ArrayList;

public class Update {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Orange");
		list.add("Red");
		list.add("Blue");
		list.add("Black");
		list.add("White");
		list.set(3, "Violet");
		
		System.out.println("Colors are: "+list);
	}
}
