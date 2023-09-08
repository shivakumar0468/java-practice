package com.practice.io;

import java.util.Scanner;

public class PersonsAge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age :");
		int age = sc.nextInt();
		if (age > 0 && age <= 17) {
			System.out.println("Minor");
		} else if (age >= 18 && age < 64) {
			System.out.println("Adult");

		} else if (age <= 64) {
			System.out.println("Senior citizen");
		} else {
			System.out.println("Invalid");
		}
		sc.close();
	}
}
