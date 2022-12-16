package com.first;

public class Excercise3 {
	public static void main (String[]args) {
		
		
		String a =null;
		String b = "Tn20Cd9000";
		String b1 ="Bunyan";
		
		
		
		try {
		System.out.println(a.toUpperCase());
		}
		catch(NullPointerException n) {
			System.out.println("Null Values Not Accepted");
		}
		
		
		
		try {
	  int c = Integer.parseInt(b);
	    System.out.println(c);
	   }
	   catch(NumberFormatException x) {
		   System.out.println("Letters Not Accepted");
	   }
	   	
		
		
		int [] a1 = {1,2,3,4,5};
		try {
		System.out.println(a1[7]);
		}
		catch(ArrayIndexOutOfBoundsException x1) {
			System.out.println("Change The Index Value");
		}
		
		
		
		try {
		System.out.println(b1.charAt(7));
		}
		catch(StringIndexOutOfBoundsException s) {
			System.out.println("Change the Index Value Of the String");
		}
		
	
	
	
	}
}
