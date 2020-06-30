package com.utsav.cloning;

public class Employee implements Cloneable {
	private int empoyeeId;
	private String employeeName;
	private Department department;

	public Employee(int id, String name, Department dept) {
		this.empoyeeId = id;
		this.employeeName = name;
		this.department = dept;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public int getEmpoyeeId() {
		return empoyeeId;
	}

	public void setEmpoyeeId(int empoyeeId) {
		this.empoyeeId = empoyeeId;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		Department dept = new Department(1, "Human Resource");
		Employee original = new Employee(1, "Admin", dept);
		Employee cloned = (Employee) original.clone();
	//	System.out.println(cloned.getEmpoyeeId());
		//System.out.println(original != cloned);
		//System.out.println(original.getClass() == cloned.getClass());
		//System.out.println(original.equals(cloned));
		
		cloned.getDepartment().setName("Finance");
		cloned.setEmployeeName("deepak");
		 System.out.println(original.getEmployeeName()==cloned.getEmployeeName());
		System.out.println("Emp Name-->"+original.getEmployeeName());  
		System.out.println("Emp Name cloned-->"+cloned.getEmployeeName()); 
		System.out.println(original.getDepartment().getName());
	}
}
