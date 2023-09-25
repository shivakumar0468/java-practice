package com.practice.arrays;

import java.util.Scanner;

/*
 * 8.Write a program to find the average of all elements in an array.
Input:
Enter the length of the array: 5
Enter the array elements: 10 20 30 40 50
Output:
The average of all elements in array is 30.0

 */
public class AvearageOfAllElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int n = sc.nextInt();
		System.out.println("Enter the array elements: ");
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		int avrg = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];

		}
		if (sum > 0 || sum<0) {
			avrg = sum / n;
			System.out.println("The average of all elements in array is "+avrg);
		}
		sc.close();
	}

}
