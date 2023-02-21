package org.tnsif.springioc;

public class Airtel implements Sim  {

	public void call() {
		
System.out.println("I am  using airtel calling ");	
	}

	public Airtel() {
		super();
		System.out.println("Airtel Class Constructor");
	}

	public void data() {
		System.out.println("I am  using airtel data ");	
		
	}
}
