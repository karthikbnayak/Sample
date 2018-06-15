package com.objectInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		EmployeeDetails employee1= (EmployeeDetails) context.getBean("employeeDeatils1");
		employee1.information();

	}

}
