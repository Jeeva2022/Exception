package com.first;

public class Excercise5 {
	
	public void callA() {
		CallB();
	}
	
	public void CallB() {
		callA();
	}

	public static void main (String[]args) {
		
		Excercise5 e = new Excercise5 ();
		
		e.callA();

		
		
	}
}
