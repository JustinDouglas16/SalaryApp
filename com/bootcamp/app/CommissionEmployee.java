package com.bootcamp.app;

public class CommissionEmployee extends Employee {
	
	private double commissionRate;
	private double baseSalary;
	private double totalSales;
	

	public CommissionEmployee() {
		super();
	}

	public CommissionEmployee(int employeeId, String firstName, String lastName, double rate, double baseSalary, double totalSales) {
		super(employeeId, firstName, lastName);
		commissionRate = rate;
		this.baseSalary = baseSalary;
		this.totalSales = totalSales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public double getSales() {
		return totalSales;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public void setSales(double sales) {
		this.totalSales = sales;
	}
	
	public double calculateCommission() {
		return totalSales * commissionRate;
	}

	public double calculateSalary() {
		return calculateCommission() * baseSalary;

	};

	@Override
	public String toString() {

		return super.toString() + String.format("%-20s %.2f%n", "salary:" + calculateSalary());
	}
}
