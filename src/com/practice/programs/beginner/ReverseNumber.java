package com.practice.programs.beginner;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n :");
		int n = sc.nextInt();
		int reverse = 0;
		while (n != 0) {
			int remainder = n % 10;
			reverse = reverse * 10 + remainder;
			n = n / 10;

		}
		System.out.println("Reverse :" + reverse);
		sc.close();

	}

}
