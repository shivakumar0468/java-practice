package com.practice.programs.beginner;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int m = sc.nextInt();
		int n, sum = 0;
		while (m > 0) {
			n = m % 10;
			sum = sum + n;
			m = m / 10;
		}
		System.out.println("The sum of digits is:"+sum);
		sc.close();
	}

}
