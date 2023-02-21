package org.tnsif.beanlifecycle;

public class Book {
	//private data members
		private String name;
		private String author;
		
		//deafult constructor
		public Book() {
			super();
			// TODO Auto-generated constructor stub
		}

		//getters and setters
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAuthor() {
			return author;
		}

		public void setAuthor(String author) {
			this.author = author;
		}

		@Override
		public String toString() {
			return "Book [name=" + name + ", author=" + author + "]";
		}
		
		/*spring bean life-cycle method and we can change the 
		method name but method signature should be same*/
		public void init()
		{
			System.out.println("Inside Init() method");
		}
		public void destroy()
		{
			System.out.println("Inside destroy() method");
		}
}