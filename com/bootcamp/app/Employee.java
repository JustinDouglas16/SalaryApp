package com.bootcamp.app;

public abstract class Employee {

	private int employeeId;
	private String firstName;
	private String lastName;
	
	public Employee() {
		
	}

	public Employee(int employeeId, String firstName, String lastName) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public abstract double calculateSalary();
	
	@Override
	public String toString() {
		
		return String.format("%-20s-%d%n", "Employee ID:" + employeeId) + String.format("%-20s %s%n", "Employee Name:" + firstName + " " + lastName);
		
	}
}
