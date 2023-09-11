package com.practice.programs.beginner;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n :");
		long n = sc.nextLong();
		long sum = 0;
		int i = 1;
		while (i <= n / 2) {
			if (n % i == 0) {
				sum = sum + i;

			}
			i++;

		}
		if (sum == n) {
			System.out.println("Perfect number :" + n);

		}
		else {
			System.out.println("Not perfect number :" + n);
		}
		sc.close();
	}

}
