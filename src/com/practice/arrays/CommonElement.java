package com.practice.arrays;

import java.util.Scanner;

/*
 * 11. Write a program to find the common elements between two arrays.
Input:
Enter the length of the 1st array: 5
Enter the array elements: 1 2 3 4
Enter the length of the 2nd array: 4
Enter the array elements: 3 4 5 6
Output:
The common elements are: 3 4
 */
public class CommonElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the 1st array: ");
		int n = sc.nextInt();
		System.out.println("Enter the array elements:");
		int arr[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the length of the 2nd array: ");
		int m = sc.nextInt();
		System.out.println("Enter the array elements:");
		int arr1[] = new int[m];
		for (int j = 0; j < m; j++) {
			arr1[j] = sc.nextInt();
		}
		int common=0;
		System.out.print("The common elements are: ");
		for (int i = 0; i <arr.length; i++) {
			for (int j = 0; j <arr1.length; j++) {
				if (arr[i] == arr1[j]) {
					arr[i]=arr1[j];
					common=arr[i];
					System.out.print(common+" ");
				}
			}
		}
		sc.close();
	}
}
