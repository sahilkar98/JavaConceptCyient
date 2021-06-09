package com.cyient.employee;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.empNo = 100;
		e1.empName = "Sahil";
		Employee.companyName = "Cyient";
		e1.empSalary = 0.00;
		
		Employee.printEmployeeDetails(e1);
		
		//System.out.println(e1.empNo);
		//System.out.println(e1.empName);
		//System.out.println(Employee.companyName);
		//System.out.println(e1.empSalary);
	}

}
