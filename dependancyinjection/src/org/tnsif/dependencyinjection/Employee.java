package org.tnsif.dependencyinjection;

public class Employee {
	//1.DI in terms of literals
		private int id;
		private String empname;
		
		/*When we achieve DI using setters use property tag inside
		 * "beans.xml" file
		 */
		
		
		
		//DI using setters
		/*
		public void setId(int id) {
			this.id = id;
		}
		public void setEmpname(String empname) {
			this.empname = empname;
		}
		*/
		/*When we achieve DI using constructor use constructor-arg tag inside
		 * "beans.xml" file
		 */
		//DI using constructor
		public Employee(int id, String empname) {
			super();
			this.id = id;
			this.empname = empname;
		}
		
		public void display()
		{
			System.out.println("Emp ID is: "+id+" "+
		    "Emp Name is: "+empname);
		}
}