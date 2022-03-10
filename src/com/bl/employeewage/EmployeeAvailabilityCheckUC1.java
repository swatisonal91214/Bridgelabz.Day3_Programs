package com.bl.employeewage;

public class EmployeeAvailabilityCheckUC1 {

	public static void main(String[] args) {
		int isPresent = 0;
		final int PRESENT = 1;
		System.out.println("Welcome to Employee Wage Computation Program!!!");
		System.out.println();
		isPresent = (int)(Math.random()*2);
		System.out.println(isPresent);
		if(isPresent == PRESENT) {
			System.out.println("Employee is present");
		}
		else {
			System.out.println("Employee is absent");
		}
	}
}
