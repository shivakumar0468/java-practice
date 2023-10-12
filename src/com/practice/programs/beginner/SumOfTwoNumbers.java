package com.practice.programs.beginner;

import java.util.Scanner;
/*
 * 3.Write a program to calculate and print the sum of two numbers.
Input:
Enter the first number: 5
Enter the second number: 7
Output:
The sum of 5 and 7 is: 12

 */
public class SumOfTwoNumbers {
	public int add(int b, int c) {
		int sum = b + c;
		return sum;
	}
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int b = a.nextInt();
		System.out.println("Enter the second number : ");
		int c = a.nextInt();
		SumOfTwoNumbers obj=new SumOfTwoNumbers();
		int total=obj.add(b, c);
		System.out.println("Sum = " + total);
		a.close();

	}

}
