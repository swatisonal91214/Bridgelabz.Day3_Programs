package com.bl.employeewage;

public class EmployeeWageCalculatorUC4 {
	public static void main(String[] args) {
		int totalWage = 0;
		int isPresentHour =(int) Math.floor(Math.random()*9);
		switch(isPresentHour){
			case 0 :
				totalWage = 0;
				System.out.println("Employee is absent"); 
				System.out.println("Total Wages is" + "  " + totalWage + " rupees");
				break;
			
			case 1 :
				System.out.println("Employee have worked part time"); 
				System.out.println("Employee is present for 1 hour \n" + "Total Part time Wages is 20 rupees");
				break;
				
			case 2 :
				System.out.println("Employee have worked part time"); 
				System.out.println("Employee is present for 2 hour \n" + "Total Part time Wages is 40 rupees");
				break;
				
			case 3 :
				System.out.println("Employee have worked part time"); 
				System.out.println("Employee is present for 3 hour \n" + "Total Part time Wages is 60 rupees");
				break;
				
			case 4 :
				System.out.println("Employee have worked part time"); 
				System.out.println("Employee is present for 4 hour \n" + "Total Part time Wages is 80 rupees");
				break;
				
			case 5 :
				System.out.println("Employee have worked part time"); 
				System.out.println("Employee is present for 5 hour \n" + "Total Part time Wages is 100 rupees");
				break;
				
			case 6 :
				System.out.println("Employee have worked part time"); 
				System.out.println("Employee is present for 6 hour \n" + "Total Part time Wages is 120 rupees");
				break;
				
			case 7 :
				System.out.println("Employee have worked part time"); 
				System.out.println("Employee is present for 7 hour \n" + "Total Part time Wages is 140 rupees");
				break;
			case 8 :
				System.out.println("Employee is full time present"); 
				System.out.println("Total Wages is 160 rupees");
				break;
				}
		}
}


