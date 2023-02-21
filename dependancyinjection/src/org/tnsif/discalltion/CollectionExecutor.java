package org.tnsif.dicollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionExecutor {

	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("collect.xml");

		CollectionDemo d = ap.getBean("def",CollectionDemo.class);
		d.display();
	}

}
