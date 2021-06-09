package com.cyient.employee;

public class Employee {
	public int empNo;
	public String empName;
	public double empSalary;
	public static String companyName;

	public static void printEmployeeDetails(Employee e1) {
		/*
		 * System.out.println(no); System.out.println(name);
		 */
		System.out.println(""+e1.empNo);
		System.out.println(e1.empName);
		System.out.println(Employee.companyName);
		System.out.println(e1.empSalary);
	}
}
