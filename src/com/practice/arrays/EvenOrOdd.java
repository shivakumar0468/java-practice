package com.practice.arrays;

import java.util.Scanner;

/*
 * 4.Write a program to count the number of even and odd numbers in an array.
Input:
Enter the length of the array: 5
Enter the array elements: 1 2 3 4 5
Output:
Even numbers = 2, Odd numbers = 3

 */
public class EvenOrOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array: ");
		int n = sc.nextInt();
		System.out.println("Enter the array elements: ");
		int array[] = new int[n];

		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		int countEven = 0;
		int countOdd = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				countEven++;
			} else {
				countOdd++;
			}
		}
		System.out.println("Even numbers: " + countEven);
		System.out.println("Odd numbers: " + countOdd);
		sc.close();
	}

}
