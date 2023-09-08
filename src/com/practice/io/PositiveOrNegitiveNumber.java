package com.practice.io;

import java.util.Scanner;

public class PositiveOrNegitiveNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int a = sc.nextInt();
		if (0 < a) {
			System.out.println("positive number");
		} else {
			System.out.println("Negative numebr");
		}
		sc.close();

	}

}
