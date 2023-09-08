package com.practice.programs.beginner;

import java.util.Scanner;

public class SumOfFirstSixNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n :");
		int a = sc.nextInt();
		int sum = 0, i = 1;
		while (i <= a) {

			sum += i;
			i++;

		}
		System.out.println("the sum of first six numbers : " + sum);
		sc.close();
	}
}
