package com.practice.arrays;

import java.util.Scanner;

/*
 * 25. Write a program to rotate an array by k steps.
Input:
Enter the length of the array: 7
Enter the array elements: 1 2 3 4 5 6 7
Enter k value: 3
Output:
After rotation: 5 6 7 1 2 3 4
 */
public class RotateAnArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int n = sc.nextInt();
		System.out.println("Enter the array elements: ");
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter k value: ");
		int m = sc.nextInt();

		for (int i = 0; i < m; i++) {
			int first = arr[0], j;
			for (j = 0; j < arr.length - 1; j++) {
				arr[j] = arr[j + 1];
			}
			arr[j] = first;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		sc.close();
	}

}
