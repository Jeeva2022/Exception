package com.first;

public class DrivingAge {
	public static void main (String[]args)throws AgeException {
		
		int age = 20;
		try {
		if(age>20) {
			System.out.println(age+" Eligible For Driving");
		}
		else {
			throw new AgeException("Better Luck Next Time");
		}
		}
		catch(AgeException a) {
			System.out.println(a);
		}
		

	}

}
