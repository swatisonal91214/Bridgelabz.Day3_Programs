package com.bl.linecalculator;

import java.util.Scanner;

public class LineComputationUC2 {

	public static void main(String[] args) {
		double lengthofline1 = 0;
		double lengthofline2 = 0;
		System.out.println("Welcome to Line Computation Program");
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
		
		lengthofline1 =Math.floor(Math.sqrt(((ax2-ax1)*(ax2-ax1))+((ay2-ay1)*(ay2-ay1))));
		lengthofline2 =Math.floor(Math.sqrt(((bx2-bx1)*(bx2-bx1))+((by2-by1)*(by2-by1))));
		System.out.println("Length of the first line is :" + lengthofline1);
		System.out.println("Length of the second line is :" + lengthofline2);
		
		if(lengthofline1>lengthofline2) {
			System.out.println("First line is greater");
		}else if(lengthofline1<lengthofline2) {
			System.out.println("Second line is greater");
		}else
			System.out.println("Both are equal");
		
		sc.close();
		
	}

}
