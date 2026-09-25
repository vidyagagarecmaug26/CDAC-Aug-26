package org.vidya;

import java.util.ArrayList;
import java.util.List;

public class sort {

	public static void main(String[] args) {
			ArrayList<String> list = new ArrayList<>(List.of("Ram","Anil","Sham","Alice"));
		
			list.sort((a,b)-> a.compareTo(b));
			System.out.println("Sorted array: "+list);
	}
}
