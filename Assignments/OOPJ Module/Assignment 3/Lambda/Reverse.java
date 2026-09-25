package org.vidya;

import java.util.ArrayList;
import java.util.List;

public class Reverse {

	public static void main(String[] args) {
			ArrayList<Integer> list = new ArrayList<>(List.of(22,44,56,98));
		
			System.out.println("Integer array: "+list);
			
			list.sort((a,b)-> b.compareTo(a));
			System.out.println("Reverse order: "+list);
	}
}
