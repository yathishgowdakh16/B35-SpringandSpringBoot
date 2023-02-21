package org.tnsif.springautowire;

public class Human {
	//DI in terms of objects
		private Heart heart;
		//DI using setters
		//in order to use byName , setters method is used for DI
		public void setHeart(Heart heart) {
			this.heart = heart;
		}
		
		//DI using constructors
		/*public Human(Heart heart) {
			super();
			this.heart = heart;
			System.out.println("Autowire using constructor");
		}*/
		
		public void startPumping()
		{
			heart.pump();
		}

}