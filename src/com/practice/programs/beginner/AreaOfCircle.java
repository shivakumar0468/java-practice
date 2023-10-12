package com.practice.programs.beginner;

import java.util.Scanner;
/*
 * 13. Write a program to calculate the area of a circle.
Input:
Enter the radius of the circle: 5
Output:
The area of the circle is: 78.54

 */
public class AreaOfCircle {
	public double area( double r) {
		double pi = 3.14, area;
		area = pi * r * r;
		return area;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of the circle:");
		int r = sc.nextInt();
		AreaOfCircle obj = new AreaOfCircle();
		double result = obj.area(r);
		
		System.out.println("Area of the circle:" + result);
		sc.close();

	}

}
