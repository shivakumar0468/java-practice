package com.practice.programs.beginner;

import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number :");
		int a = sc.nextInt();
		System.out.println("Enter the second number :");
		int b = sc.nextInt();
		System.out.println("Enter the third number :");
		int c = sc.nextInt();
		if (a < b && c < b) {
			System.out.println("The largest number is :" + b);
		} else if (b < a && c < a) {
			System.out.println("The largest number is :" + a);

		} else {
			System.out.println("The largest number is :" + c);
		}

		sc.close();
	}

}
