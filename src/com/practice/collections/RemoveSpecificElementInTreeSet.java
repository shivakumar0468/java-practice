package com.practice.collections;

import java.util.Scanner;
import java.util.TreeSet;

/*
 * 22. Write a Java program to remove a specific element from a TreeSet.
Input:
TreeSet: [Apple, Banana, Orange]
Element to remove: Banana
Output:
TreeSet after removal: [Apple, Orange]
 */
public class RemoveSpecificElementInTreeSet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the TreeSet: ");
		int size = sc.nextInt();
		System.out.println("enter the elements of the TreeSet: ");
		TreeSet treeSet = new TreeSet();
		for (int i = 0; i < size; i++) {
			treeSet.add(sc.next());
		}
		System.out.println("Element to remove: ");
		String word = sc.next();

		treeSet.remove(word);
		System.out.println("TreeSet after removal: " + treeSet);
		sc.close();
	}

}
