package com.objectInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		EmployeeDetails employee1= (EmployeeDetails) context.getBean("employeeDeatils1");
		EmployeeDetails employee2= (EmployeeDetails) context.getBean("employeeDeatils2");
		EmployeeDetails employee3= (EmployeeDetails) context.getBean("employeeDeatils3");


		employee1.information();
		employee2.information();
		employee3.information();
		

	}

}
