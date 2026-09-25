package org.vidya;

import java.util.ArrayList;
import java.util.Collections;

public class CopyArrList {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Orange");
		list.add("Red");
		list.add("Blue");
		list.add("Black");
		list.add("White");
		
		System.out.println("Colors are: "+list);
		
		ArrayList<String> list1 = new ArrayList<String>();
		
		list1.add("");
		list1.add("");
		list1.add("");
		list1.add("");
		list1.add("");
		Collections.copy(list1, list);
		System.out.println("Copied Colors are: "+list1);
	}
}
