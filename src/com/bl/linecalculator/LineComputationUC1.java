package com.bl.linecalculator;

import java.util.Scanner;

public class LineComputationUC1 {

	public static void main(String[] args) {
		String lengthofline = "0";
		System.out.println("Welcome to Line Computation Program");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the x coordinate of first point of the line");
		double x1 = sc.nextDouble();
		System.out.println("Enter the y coordinate of first point of the line");
		double y1 = sc.nextDouble();
		System.out.println("Enter the x coordinate of second point of the line");
		double x2 = sc.nextDouble();
		System.out.println("Enter the y coordinate of second point of the line");
		double y2 = sc.nextDouble();
		lengthofline =String.valueOf(Math.floor((Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1))))));
		System.out.println("Length of the line is :" + lengthofline);
		sc.close();
	}

}
