package com.practice.collections;

import java.util.LinkedHashSet;
import java.util.Scanner;

/*
 * 16. Write a Java program to check if a specific element exists in a
LinkedHashSet.
Input:
LinkedHashSet: [Java, Python, C++]
Element to check: Python
Output:
Element Python exists in LinkedHashSet.
 */
public class SpecificElementExist {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the linkedList: ");
		int size = sc.nextInt();
		System.out.println("Enter the elementof the LinkedList: ");
		LinkedHashSet set = new LinkedHashSet();
		for (int i = 0; i < size; i++) {
			set.add(sc.next());
		}
		System.out.println("Element to check:");
		String str = sc.next();

		for (int i = 0; i < set.size(); i++) {
			if (set.contains(str)) {

			}
		}
		System.out.println("Element " + str + " exists in LinkedHashSet.");
		sc.close();
	}
}
