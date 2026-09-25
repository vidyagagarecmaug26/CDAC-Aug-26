package org.vidya;

import java.util.Random;
import java.util.function.Supplier;

public class GenerateOTP {

	public static void main(String[] args) {
		
		Supplier<String>otpGenerator = () -> {
			String vowels = "AEIOU";
			Random rand = new Random();
			StringBuilder otp = new StringBuilder();
			
			otp.append(vowels.charAt(rand.nextInt(vowels.length())));
			
			for(int i=0; i<4; i++)
				otp.append(rand.nextInt(10));
			
			return otp.toString();
		};
		
		String myOtp = otpGenerator.get();
		
		System.out.println("Generated Random OTP: "+myOtp);
		
	}

}
