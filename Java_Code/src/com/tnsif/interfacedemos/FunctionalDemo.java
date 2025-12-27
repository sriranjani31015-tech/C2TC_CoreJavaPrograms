package com.tnsif.interfacedemos;

public class FunctionalDemo {

	public static void main(String[] args) {
	
		//Lambda Expression
		GreetingDemos gd = () -> 
		System.out.println("Hello Everyone, Welcome to the Java Session");
		
		gd.greet();
		
		

	}

}
