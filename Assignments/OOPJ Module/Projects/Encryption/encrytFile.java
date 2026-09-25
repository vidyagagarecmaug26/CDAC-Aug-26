package org.vidya;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class encrytFile {
	
	public static void encryptFile(String inputFile, String outputFile) {
		try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
			BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))){
			
			int character;
			int key = 40;
			
			while((character = reader.read())!= -1) {
				char encryptedChar = (char)(character + key);
				writer.write(encryptedChar);
			}
			System.out.println("File encrypted");
		}
		catch(IOException e) {
			System.out.println("Error occured: "+ e.getMessage());
		}
	}
	
	public static void decryptFile(String inputFile, String outputFile) {
		try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
			BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))){
			
			int character;
			int key=40;
			
			while((character = reader.read())!= -1) {
				char decryptedChar = (char)(character - key);
				writer.write(decryptedChar);
			}
			System.out.println("File decrypted");
		}
		catch(IOException e) {
			System.out.println("Error occured: "+ e.getMessage());
		}
	}
	
	public static void main(String[] args) {
	
		final int ENCRYPT=1;
		final int DECRYPT=2;
		final int EXIT=3;
		
		Scanner sc=new Scanner(System.in);
		int choice;

		do {
			System.out.println("----File Menu----");
			System.out.println("1. Encrypt text file");
			System.out.println("2. Decrypt text file");
			System.out.println("3. Exit");
			System.out.println("Enter your choice");
			
			choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
				case ENCRYPT : System.out.println("Enter source text file path: ");
					   		   String sourceFile = sc.nextLine();
					   		   System.out.println("Enter destination encrypted file path: ");
					   		   String destFile = sc.nextLine();
					   
					   		   encryptFile(sourceFile, destFile);
					   		   break;
			
				case DECRYPT : System.out.println("Enter encrypted file path: ");
					   		   String encFile = sc.nextLine();
					   		   System.out.println("Enter destination decrypted file path: ");
					   		   String decFile = sc.nextLine();
	   
					   		   decryptFile(encFile, decFile);
					   		   break;
					   
				case EXIT: System.out.println("Exiting...");
							break;
				default: System.out.println("Invalid Value");
							break;
			}
		}while(choice!=EXIT);	
		sc.close();
	}
}
