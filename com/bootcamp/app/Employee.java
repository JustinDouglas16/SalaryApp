package com.bootcamp.app;
/*
 * hier is de parentclass als empoloyee aangegeven en vannhieuit zullen alle childclasses hun attributen overerven.
 * 
 */

public abstract class Employee {

	// employee attributes
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

	public void setEmployeeId(int id) {
		this.employeeId = id;
	}

	public void setFirstName(String name) {
		this.firstName = name;
	}

	public void setLastName(String name) {
		this.lastName = name;
	}

	/*
	 * fuction to calculate salary of an employee. all the child classes must
	 * override this function to return a salary
	 */
	public abstract double calculateSalary();

	// FIXME: format specifier proberen op te lossen
	@Override
	public String toString() {

		return String.format("%-20s-%d%n", "Employee ID:" + employeeId)
				+ String.format("%-20s %s%n", "Employee Name:" + firstName + " " + lastName);

	}
}
