package org.vidya;

import java.util.ArrayList;

public class RemoveEle {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Orange");
		list.add("Red");
		list.add("Blue");
		list.add("Black");
		list.add("White");
		System.out.println("Colors are: "+list);
		
		list.remove(3);
		System.out.println("After Color removed is: "+list);
	}
}
