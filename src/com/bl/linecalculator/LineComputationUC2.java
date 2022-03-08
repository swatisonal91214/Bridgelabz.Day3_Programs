package com.bl.linecalculator;

import java.util.Scanner;

public class LineComputationUC2 {


	public static void main(String[] args) {
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
		LineComputationUC2 line = new LineComputationUC2();
		line.checkEqual(ax1,ax2,ay1,ay2,bx1,by1,bx2,by2);
		sc.close();
	}
	public void checkEqual(double ax1,double ax2,double ay1,double ay2,double bx1,double by1,double bx2,double by2) {
		
		double lengthofline1 =Math.floor(Math.sqrt(((ax2-ax1)*(ax2-ax1))+((ay2-ay1)*(ay2-ay1))));
		double lengthofline2 =Math.floor(Math.sqrt(((bx2-bx1)*(bx2-bx1))+((by2-by1)*(by2-by1))));
		System.out.println("Length of the first line is :" + lengthofline1);
		System.out.println("Length of the second line is :" + lengthofline2);
		
		if(lengthofline1>lengthofline2) {
			System.out.println("First line is greater");
		}else if(lengthofline1<lengthofline2) {
			System.out.println("Second line is greater");
		}else
			System.out.println("Both are equal");
	}
}


