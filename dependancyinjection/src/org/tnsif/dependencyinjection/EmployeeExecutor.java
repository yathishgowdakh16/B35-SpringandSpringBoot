package org.tnsif.dependencyinjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeExecutor {

	public static void main(String[] args) {
		BeanFactory b=new ClassPathXmlApplicationContext("beans.xml");
		Employee e=b.getBean("e1",Employee.class);
		/*e1.setId(101);
		e1.setEmpname("Dularchand");*/
		e.display();
		
		Employee obj=b.getBean("e2",Employee.class);
		obj.display();

	}
	}

