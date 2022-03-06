package com.bl.employeewage;

public class EmployeeWageCalculatorUC2_UC3 {

	public static void main(String[] args) {
		double total_wage_per_day = 0;
		final double WAGE_PER_HOUR = 20;
		final double TOTAL_WORKING_HOURS = 8;
		double isPresentHour = Math.floor(Math.random()*9);
		
		if(isPresentHour < TOTAL_WORKING_HOURS && isPresentHour > 0) {
			total_wage_per_day = WAGE_PER_HOUR * isPresentHour;
			System.out.print(" Employee have worked part time      "); 
			System.out.println("Employee is present for " + isPresentHour + " hours     " + "Daily total Part time Wages is" + "  " + total_wage_per_day + " rupees");
			
		} else if (isPresentHour == 0){
			total_wage_per_day = 0;
			System.out.print(" Employee is absent    "); 
			System.out.println("Daily total Wages is" + "  " + total_wage_per_day + " rupees");
			
		} else {
			total_wage_per_day = WAGE_PER_HOUR * isPresentHour;
			System.out.print(" Employee is present    "); 
			System.out.println("Daily total Wages is" + "  " + total_wage_per_day + " rupees");
		  }
	
	}
}

