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

	
	/*
	 * a couple datatypes and their format specifiers to use to display them 
	 * boolean ==> System.out.printf("%b");
	 * char ==> System.out.printf("%c");
	 * string ==> System.out.printf("%s");
	 * int ==> System.out.printf("%d");
	 * double ==> System.out.printf("%f");
	 * 
	 * [width] ==> %-20s geeft aan hoeveel spaces er moet zijn tussen characters, deze is met een min sign, dus zal er een 20 spaces open blijven aan de linkerkant. 
	 */
	// FIXME: format specifier proberen op te lossen
	@Override
	public String toString() {

		return String.format("%-20s-%d%n", "Employee ID:" + employeeId)
				+ String.format("%-20s %s%n", "Employee Name:" + firstName + " " + lastName);

	}
}
