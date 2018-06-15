package com.objectInjection;

import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanNameAware;

public class Employee implements BeanNameAware {
	
	private EmployeeDetails employee1;
	private EmployeeDetails employee2;
	private EmployeeDetails employee3;
	
	public EmployeeDetails getEmployee1() {
		return employee1;
	}
	public void setEmployee1(EmployeeDetails employee1) {
		this.employee1 = employee1;
	}
	public EmployeeDetails getEmployee2() {
		return employee2;
	}
	public void setEmployee2(EmployeeDetails employee2) {
		this.employee2 = employee2;
	}
	public EmployeeDetails getEmployee3() {
		return employee3;
	}
	public void setEmployee3(EmployeeDetails employee3) {
		this.employee3 = employee3;
	}
	
	
	public void information()
	{
		System.out.println("Id1"+employee1.getId()+"Name1"+employee1.getName()+"Address1"+employee1.getAddress());
		System.out.println("Id2"+employee2.getId()+"Name2"+employee2.getName()+"Address2"+employee2.getAddress());
		System.out.println("Id3"+employee3.getId()+"Name3"+employee3.getName()+"Address3"+employee3.getAddress());

	}
 
	
	@Override
	public void setBeanName(String beanName) {
		// TODO Auto-generated method stub
		System.out.println("Bean Name is"+beanName);
	}
	

}
