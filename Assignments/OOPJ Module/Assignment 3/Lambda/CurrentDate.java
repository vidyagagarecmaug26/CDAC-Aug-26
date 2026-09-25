package org.vidya;

import java.time.LocalDate;

public class CurrentDate {

	public static void main(String[] args) {

		Runnable date = () -> System.out.println("Current Data: "+LocalDate.now());
		
		date.run();
	}

}
