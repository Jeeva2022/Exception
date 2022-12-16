package com.first;

public class LoginCredintial {
	public static void main (String[]args)throws LoginException,Exception {
		
		String user = "Jeeva";
		int pass = 1234;
		
		if(user.equals("jeeva")&&pass==1234) {
			System.out.println("Valid User");
		}
		else {
			throw new LoginException("Invalid User");
		}
		
	}

}
