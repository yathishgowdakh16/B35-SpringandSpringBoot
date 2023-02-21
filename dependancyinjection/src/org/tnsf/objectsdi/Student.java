package org.tnsif.objectsdi;

public class Student {
	//DI in the terms of objects
		Address address;

		//DI using setters
		public void setAddress(Address address) {
			this.address = address;
		}
		
		public void print()
		{
			address.display();
		}
}