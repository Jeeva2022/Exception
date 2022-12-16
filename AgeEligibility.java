package com.first;

public class AgeEligibility {
	public static void main (String[]args)throws AgeException,Exception{
		
		int age = 17;
		
	try {
		if(age>=18) {
			System.out.println("Elgibile To Vote");
		}
		else {
			throw new AgeException("Not Elgible To Vote");
		}
	}
	catch(AgeException ae) {
		System.out.println(ae);
		ae.printStackTrace();
	}
		

	}

}
