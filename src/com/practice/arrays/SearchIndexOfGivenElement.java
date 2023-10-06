package com.practice.arrays;

import java.util.Scanner;

/*
 * 9.Write a program to search the index of a given element in an array.
Input:
Enter the length of the array: 5
Enter the array elements: 10 20 30 40 50
Enter the element to search: 30
Output:
The index of 30 is 2
 */
public class SearchIndexOfGivenElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int n = sc.nextInt();
		System.out.println("Enter the array elements: ");
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the element to search: ");
		int m = sc.nextInt();
		for (int i = 0; i < arr.length - 1; i++) {
			if (m == arr.length) {
				System.out.println(m);

			}
		}
		sc.close();
	}

}
