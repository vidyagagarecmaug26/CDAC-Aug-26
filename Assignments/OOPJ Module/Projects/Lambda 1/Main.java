package org.vidya;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Main {

	public static void main(String[] args) {
		ArrayList<Transaction> transactions= new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Details of 5 transactions: ");
		for(int itmp=1; itmp<=5; itmp++) {
			System.out.println("Transactions "+itmp);
			
			System.out.println("Enter Transaction Id: ");
			int id = sc.nextInt();
			
			System.out.println("Enter Transaction Amount: ");
			float amt = sc.nextFloat();
			
			System.out.println("Enter Status: ");
			boolean status = sc.nextBoolean();
			
			System.out.println("Enter Arrears Status: ");
			boolean arrears = sc.nextBoolean();
			
			transactions.add(new Transaction(id,amt,status,arrears));
			System.out.println();
		}
		
		System.out.println("Result-");
		List<Transaction> highAmount = transactions.stream()
								.filter(t -> t.getTxAmount() > 5000)
								.collect(Collectors.toList());
		System.out.println("Transaction with Amount > 5000: "+ highAmount+"\n");
		
		
		List<Transaction> failed = transactions.stream()
								.filter(t ->!t.isTxStatus())
								.collect(Collectors.toList());
		System.out.println("Transaction with False status: "+ failed+"\n");
		
		
		Function<Transaction, Float> calculateAmount= t -> {
			if(t.isTxArrears()) {
				return t.getTxAmount() + 500f + (t.getTxAmount() * 0.18f);
			}
			else {
				return t.getTxAmount();
			}
			
		};
		System.out.println("Calculated Amount Due: ");
		for(Transaction t : transactions) {
			float totalDue = calculateAmount.apply(t);
			System.out.println("Tx ID: "+t.getTxId());
			System.out.println("Original: Rs. "+t.getTxAmount());
			System.out.println("Final Due: Rs. "+totalDue+"\n");
		}
		
	}

}
