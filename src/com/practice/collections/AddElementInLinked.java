package com.practice.collections;

import java.util.LinkedList;
import java.util.Scanner;

/*
 * 9.Write a program to add an element at the end of a LinkedList
Input:
[10 20 30 40 50]
Element to add: 6
Output:
LinkedList after adding element 6 at end: 10 20 30 40 50 6.

 */
public class AddElementInLinked {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the LinkedList: ");
		int size = sc.nextInt();
		System.out.println("Enter the elements of the LinkedList: ");
		LinkedList linkedList = new LinkedList();
		for (int i = 0; i < size; i++) {
			linkedList.add(sc.nextInt());
		}
		System.out.println(linkedList);
		System.out.println("Enter the element to add: ");
		int element = sc.nextInt();
		linkedList.add(element);
		System.out.println(linkedList);
	}

}
