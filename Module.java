package com.first;

public class Module {
	
	void aNonStaticMethod() {
		System.out.println("Non STATIC");
		astaticMethod();
	}
	

	
	public static void astaticMethod() {
		System.out.println("Static method");
	}
	

public static void main (String[]args) {
	
	Module m = new Module();
	//astaticMethod();
	m.aNonStaticMethod();
	
	
}
}
