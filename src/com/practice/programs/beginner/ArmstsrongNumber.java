package com.practice.programs.beginner;

import java.util.Scanner;

public class ArmstsrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n :");
		int n = sc.nextInt();
		int number, result = 0, remainder;
		number = n;
		while (number != 0) {
			remainder = number % 10;
			result += Math.pow(remainder, 4);
			number = number / 10;

		}
		if (result == n) {
			System.out.println("Armstsrong Number :" + n);

		} else {
			System.out.println("Not Armstsrong Number :" + n);
		}
		sc.close();
	}

}
