package com.practice.programs.beginner;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a nuber :");
		int a = sc.nextInt();
		if (a % 2 == 0) {
			System.out.println("Even number");

		} else {
			System.out.println("Odd number");
		}
		sc.close();
	}

}
