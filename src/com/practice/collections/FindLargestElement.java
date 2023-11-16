package com.practice.collections;

import java.util.Scanner;
import java.util.TreeSet;

/*
 * 23. Write a Java program to find the largest element in a TreeSet.
Input:
TreeSet: [3, 1, 4, 2, 5]
Output:
Largest element: 5
 */
public class FindLargestElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the TreeSet: ");
		int size = sc.nextInt();
		System.out.println("Enter the elements of the TreeSet: ");
		TreeSet treeSet = new TreeSet();
		for (int i = 0; i < size; i++) {
			treeSet.add(sc.nextInt());
		}
		/*
		 * int maxElement = Integer.MIN_VALUE;
		 * 
		 * for (Object element : treeSet) {// forEach loop internally uses iterator
		 * methods like hashNext() and next(); int currentElement = (int) element; if
		 * (currentElement > maxElement) { maxElement = currentElement; } }
		 */
		System.out.println("Largest element: " + treeSet.last());
		System.out.println("Smallest element: "+treeSet.first());
		sc.close();
	}

}
