package com.first;

public class Excercise2 {

	public static void main (String[]args) {
		
		int a=10;
		int b=3;
		int c=0;
		
		try {
			System.out.println(a/b);
			System.out.println(a/c);
			System.out.println(a);
		}
		catch(NullPointerException x1){
			System.out.println("Null exception");
		}
		catch(NumberFormatException x2) {
			System.out.println("Number Format Exception");
		}
		catch(ArithmeticException x){
			System.out.println("Do Not Divide By Zero");
		}
		catch(StringIndexOutOfBoundsException x3) {
			System.out.println("String out of bound exception");
		}
		catch(ArrayIndexOutOfBoundsException x4) {
			System.out.println("Array out of bound exception");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Come Back Later");
		}
		
	}
}
