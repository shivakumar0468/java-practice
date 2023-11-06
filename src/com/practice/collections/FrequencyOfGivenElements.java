package com.practice.collections;

import java.util.LinkedList;
import java.util.Scanner;

/*
 * 15. Write a program to find the frequency of a given element in the linked
list.
Input:
[1 2 3 2 4 2 2 5 6 3 3 4 2]
Enter element: 2
Output:
Frequency of 2 is: 5
 */
public class FrequencyOfGivenElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the LinkekList: ");
		int n = sc.nextInt();
		System.out.println("Enter the elements of the LinkedList: ");
		LinkedList list = new LinkedList();
		for (int i = 0; i < n; i++) {

			list.add(sc.nextInt());
		}
		System.out.println("Enter the element: ");
		int element = sc.nextInt();

		int count = 0;
		for (Object object : list) {
			int frequency = (int) object;
			if (element == frequency) {
				count++;
			}
		}
		System.out.println("Frequency of "+element+" is:"+count);
		sc.close();

	}

}
