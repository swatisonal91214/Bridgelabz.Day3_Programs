package com.bl.linecalculator;

import java.util.Scanner;

public class LineComputationUC2 {


	public static void main(String[] args) {
		System.out.println("Welcome to Line Computation Program");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the x coordinate of first point of the First line");
		double ax1 = sc.nextDouble();
		System.out.println("Enter the y coordinate of first point of the First line");
		double ay1 = sc.nextDouble();
		System.out.println("Enter the x coordinate of second point of the First line");
		double ax2 = sc.nextDouble();
		System.out.println("Enter the y coordinate of second point of the First line");
		double ay2 = sc.nextDouble();
		
		System.out.println("Enter the x coordinate of first point of the second line");
		double bx1 = sc.nextDouble();
		System.out.println("Enter the y coordinate of first point of the second line");
		double by1 = sc.nextDouble();
		System.out.println("Enter the x coordinate of second point of the second line");
		double bx2 = sc.nextDouble();
		System.out.println("Enter the y coordinate of second point of the second line");
		double by2 = sc.nextDouble();
		LineComputationUC2 line = new LineComputationUC2();
		line.checkEqual(ax1,ax2,ay1,ay2,bx1,by1,bx2,by2);
		sc.close();
	}
	public void checkEqual(double ax1,double ax2,double ay1,double ay2,double bx1,double by1,double bx2,double by2) {
		String lengthofline1 =String.valueOf(Math.floor(Math.sqrt(((ax2-ax1)*(ax2-ax1))+((ay2-ay1)*(ay2-ay1)))));
		String lengthofline2 =String.valueOf(Math.floor(Math.sqrt(((bx2-bx1)*(bx2-bx1))+((by2-by1)*(by2-by1)))));
		System.out.println("Length of the first line is :" + lengthofline1);
		System.out.println();
		System.out.println("Length of the second line is :" + lengthofline2);
		System.out.println();
		System.out.println();
		System.out.println("Comparing the equality of the lines of based on end points"); // UC2
		String diffinline1 =String.valueOf(Math.floor((bx2-ax2)));
		String diffinline2 =String.valueOf(Math.floor((by2-ay2)));
		
	
		if(diffinline1.equals(diffinline2)) {
			System.out.println("The are equal");
		}else {
			System.out.println("They are not equal");
		}
	}
}


