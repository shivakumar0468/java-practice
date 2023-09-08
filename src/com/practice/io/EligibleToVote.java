package com.practice.io;

import java.util.Scanner;

public class EligibleToVote {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age :");
		int a = sc.nextInt();
		if (a > 17) {
			System.out.println("Your are eligible to vote ");

		} else {
			System.out.println("Your are not eligible to vote ");
		}
		sc.close();
		
	}

}
