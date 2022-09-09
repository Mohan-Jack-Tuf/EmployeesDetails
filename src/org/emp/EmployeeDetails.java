package org.emp;

import java.nio.charset.MalformedInputException;

import javax.swing.plaf.basic.BasicBorders.MarginBorder;

import sun.applet.Main;

public class EmployeeDetails<string> {
	

	
	public void employeeDetails() {
	
		byte empId = 21;
	    System.out.println("Employee Id is "+empId);
	    String empName = "Mohan";
	    System.out.println("Employee Name is "+empName);
	    String email = "mohan.jack94@gmail.com";
	    System.out.println("Employee Email Id is "+email);
	    long empPhoneno = 9600374006l;
	    System.out.println("Employee phone Number is "+empPhoneno);
	    float empSalary = 50000f;
	    System.out.println("Employee Salary is "+empSalary);
	    char gender = 'M';
	    System.out.println("Employee Gender is "+gender);
	    String empCity = "Chennai";
	    System.out.println("Employee city is "+empCity);
	    		
	    
	}
    public static void main(String[] args) {
		EmployeeDetails e = new EmployeeDetails();
		e.employeeDetails();
		

		System.out.println("mohan's code");
		System.out.println("nalin's code");

		
	}
    
	}
