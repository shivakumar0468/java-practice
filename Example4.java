package com.practice.io;

import java.util.Scanner;

public class Example4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("choice a number :");
		System.out.println("Enter '1' : ");
        System.out.println("Enter '2' : ");
		System.out.println("Enter '3' : ");
		System.out.println("Enter '4' : ");
		System.out.println("Enter '5' : ");
		System.out.println("Enter '6' : ");
		System.out.println("Enter '7' : ");
		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			System.out.println("monday");
			break;

		case 2:
			System.out.println("thuesday");
			break;
		case 3:
			System.out.println("wednesday");
			break;
		case 4:
			System.out.println("thursday");
			break;
		case 5:
			System.out.println("friday");
			break;
		case 6:
			System.out.println("saturday");
			break;
		case 7:
			System.out.println("sunday");
			break;
		default:
			System.out.println("you choice wrong number ");

			sc.close();

		}

	}

}
