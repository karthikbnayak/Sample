package com.objectInjection;

public class EmployeeDetails {
	
	
	private int id;
	private String name;
	private String Address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
	public void information() {
		System.out.println("Id"+getId()+"Name"+getName()+"Address"+getAddress());
	}

}
