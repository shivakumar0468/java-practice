package com.practice.collections;

import java.util.LinkedHashSet;
import java.util.Scanner;

/*
 * 18. Write a Java program to check if two LinkedHashSets are equal.
Input:
LinkedHashSet1: [A, B, C]
LinkedHashSet2: [C, A, B]
Output:
LinkedHashSets are equal.

 */
public class CheckTwoLinkedListAreEqual {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the LinkedHashset: ");
		int size = sc.nextInt();
		System.out.println("enter the elements of the LinkedHashSets: ");
		LinkedHashSet hashSet = new LinkedHashSet();
		for (int i = 0; i < size; i++) {
			hashSet.add(sc.next());
		}
		System.out.println("enter the size of the LinkedHashset: ");
		int size1 = sc.nextInt();
		System.out.println("enter the elements of the LinkedHashSets: ");
		LinkedHashSet hashSet1 = new LinkedHashSet();
		for (int i = 0; i < size1; i++) {
			hashSet1.add(sc.next());
		}
		if(hashSet.equals(hashSet1)) {
		System.out.println("LinkedHashSets are equal.");
		}
		else {
			System.out.println("LinkedHashSets are not equal.");
		}
		sc.close();
	}

}
