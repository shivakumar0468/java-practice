package com.practice.programs.beginner;

import java.util.Scanner;
/*
 * 11. Write a program to convert temperature from Celsius to Fahrenheit.
Input:
Enter the temperature in Celsius: 25
Output:
25°C is equal to 77°F.
 */
public class Temperature {
	public double temp(double a) {
		double fahrenheit = 0.0;
		fahrenheit = (a * 1.8) + 32;
		return fahrenheit;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temperature in celsius : ");
		double a = sc.nextDouble();
		Temperature obj = new Temperature();
		double tem=obj.temp(a);
		System.out.println("fahrenheit :" + tem);
		sc.close();
	}

}
