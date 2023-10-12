package com.practice.programs.beginner;

import java.util.Scanner;
/*
 * 6.Write a program to calculate and print the average of three numbers.
Input:
Enter the first number: 4
Enter the second number: 7
Enter the third number: 2
Output:
The average of 4, 7, and 2 is: 4.33

 */
public class Average {
	public float num(float a, float b, float c) {
		float avg = 0;
		avg = (a + b + c) / 3;
		return avg;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number :");
		float a = sc.nextFloat();
		System.out.println("Enter the second number  :");
		float b = sc.nextFloat();
		System.out.println("Enter the third number :");
		float c = sc.nextFloat();
		Average obj = new Average();
		float avg=obj.num(a, b, c);
		System.out.println("avberage :" + avg);
		sc.close();

	}

}
