package com.practice.programs.beginner;

import java.util.Scanner;

public class SumOfTwoNumbers {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int b = a.nextInt();
		System.out.println("Enter the second number : ");
		int c = a.nextInt();
		int sum = b + c;
		System.out.println("Sum = " + sum);
		a.close();

	}

}
