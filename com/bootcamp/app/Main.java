package com.bootcamp.app;

public class Main {

	public static void main(String[] args) {

		Employee employees[] = new Employee[3];
		employees[0] = new HourlyEmployee(1, "john", "doe", 45, 19.95);
		employees[1] = new SalaryEmployee(2, "maria", "doe", 7000);
		employees[2] = new CommissionEmployee(3, "bruce", "lee", 0.05, 1500, 100000);

		for (int i = 0; i < employees.length; i++) {
			System.out.println(employees[i] + "\n");
		}

	}

}
