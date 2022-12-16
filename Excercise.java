package com.first;

public class Excercise {

	public static void main (String[]args) {
		
		int a = 5; 
		int b = 2;
		int c = 0;
		
	
		
		try{
			System.out.println(a/b);
			System.out.println(a);
			System.out.println(a/c);
		}
		catch(Exception e){
			System.out.println(e);		
		}
		finally {
			System.out.println("Come Back Later");
		}
	
		
		
	}

}
