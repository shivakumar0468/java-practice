package com.practice.collections;

import java.util.Scanner;
import java.util.TreeSet;

/*
 * 21. Write a Java program to add elements to a TreeSet and display them.
Input:
Elements: 5, 2, 7, 1, 9
Output:
TreeSet: [1, 2, 5, 7, 9]

 */
public class AddElementsToaTreeSet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the TreeSet: ");
		int size = sc.nextInt();
		System.out.println("Enter the elements of the treeset: ");
		TreeSet treeSet = new TreeSet();
		for (int i = 0; i < size; i++) {
			treeSet.add(sc.next());
		}
		System.out.println(treeSet);
		sc.next();
	}

}
