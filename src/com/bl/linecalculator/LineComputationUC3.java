package com.bl.linecalculator;

import java.util.Scanner;
// using compareTo method for comparing the lines,also printing the difference
public class LineComputationUC3 {
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
		LineComputationUC3 line = new LineComputationUC3();
		line.calculateLength(ax1,ax2,ay1,ay2,bx1,by1,bx2,by2);
		sc.close();
	}
	
	public void calculateLength(double ax1,double ax2,double ay1,double ay2,double bx1,double by1,double bx2,double by2) {
		double difference;
		String lengthofline1 =String.valueOf(Math.floor(Math.sqrt(((ax2-ax1)*(ax2-ax1))+((ay2-ay1)*(ay2-ay1)))));
		String lengthofline2 =String.valueOf(Math.floor(Math.sqrt(((bx2-bx1)*(bx2-bx1))+((by2-by1)*(by2-by1)))));
		System.out.println("Length of the first line is :" + lengthofline1);
		System.out.println();
		System.out.println("Length of the second line is :" + lengthofline2);
		System.out.println();
		if(lengthofline1.compareTo(lengthofline2)== 1) {
			 difference= (Double.valueOf(lengthofline2))- (Double.valueOf(lengthofline1));
			System.out.println("Line 1 is longer than line 2 by " +difference);
		} else if(lengthofline1.compareTo(lengthofline2)==0) {
			System.out.println("Both lines are equal");
		} else  {
			difference= (Double.valueOf(lengthofline2))- (Double.valueOf(lengthofline1));
			System.out.println("Line 2 is longer than line 1 by " +difference);
		}
	}
}
		
		
	