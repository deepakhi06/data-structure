package com.utsav.javaserialization;

import java.io.Serializable;

public class Employee implements Serializable {
	private static final long serialVersionUID = 2L;

	transient private String name;
	private int id;
	//private int salary;
	// private String password;

	Employee() {
		System.out.println("consturtor call");
	}

/*	@Override
	public String toString() {
		return "Employee{name=" + name + ",id=" + id + ",salary=" + salary + "}";
	}*/

	// getter and setter methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	/*public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}*/

	/*public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}*/
}
