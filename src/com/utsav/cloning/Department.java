package com.utsav.cloning;

public class Department {
	private int id;
	private String name;

	public Department(int id, String name)
	{
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
