package com.bootcamp.app;

public class SalaryEmployee extends Employee {
	
	public double baseSalary;
	
	
	

	public SalaryEmployee() {
		super();
	}

	public SalaryEmployee(int employeeId, String firstName, String lastName, int i) {
		super(employeeId, firstName, lastName);
	}
	

	public void setBaseSalary(double salary) {
		this.baseSalary = salary;
	}

	public double calculateSalary() {
		return 0;

	};

	@Override
	public String toString() {

		return super.toString() + String.format("%-20s %.2f%n", "salary:" + calculateSalary());
	}
}
