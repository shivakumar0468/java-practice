package com.practice.arrays;

import java.util.Scanner;

/*
 * 12. Write a program to find the number of occurrences of a given element
in an array.
Input:
Enter the length of the array: 6
Enter the array elements: 3 7 2 9 6 3
Enter the element to search for: 3
Output:
The element 3 occurs 2 times in the array
 */
public class NumberOfOccurrence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int n = sc.nextInt();
		System.out.println("Enter the array elements:");
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the element to search for: ");
		int m = sc.nextInt();
		int occurrence =0;
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] == m) {
				occurrence++;
				
			}
			
		}
		System.out.println("The Element "+m+" occurs "+occurrence+" times in the arrays");
		sc.close();
	}
}
