package com.practice.programs.beginner;

import java.util.Scanner;

public class SquareOFNNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int a = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= a; i++) {
			sum = sum + i * i;

		}
		System.out.println("Sum =" + sum);
		sc.close();
	}

}
