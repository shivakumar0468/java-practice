package com.practice.programs.beginner;

import java.util.Scanner;

public class SumOfEvenOrOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a limit:");
		int number = sc.nextInt();
		int evensum = 0, oddsum = 0;
		for (int i = 1; i <= number; i++) {
			if (i % 2 == 0) {
				evensum = evensum + i;

			} else {
				oddsum = oddsum + i;
			}

		}
		System.out.println("even number :" + evensum);
		System.out.println("odd number :" + oddsum);
		sc.close();
	}

}
