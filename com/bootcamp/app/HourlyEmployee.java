package com.bootcamp.app;

public class HourlyEmployee extends Employee {

	private double hoursWorked;
	private double hourlyRate;

	public HourlyEmployee() {
		super();
	}

	public HourlyEmployee(int employeeId, String firstName, String lastName, double hoursWorked, double hourlyRate) {
		super(employeeId, firstName, lastName);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}

	public double getHoursWorked() {
		return hoursWorked;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public double calculateSalary() {
		
		double salary = 0;
		double overtime = 0;
		
		if (hoursWorked > 40) {
			double hours = hoursWorked - 40;
			hoursWorked = 40;
			overtime = hours * (hourlyRate * 1.5);
		}
		
		salary = hoursWorked * hourlyRate;
		salary += overtime;
		return salary;

	};

	@Override
	public String toString() {

		return super.toString() + String.format("%-20s %.2f%n", "salary:" + calculateSalary());
	}
}
