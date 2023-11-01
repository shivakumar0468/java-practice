package com.practice.collections;

import java.util.LinkedList;
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
		LinkedList linkedList = new LinkedList();
		linkedList.add(10);
		linkedList.add(20);
		linkedList.add(30);
		linkedList.add(40);
		linkedList.add(50);
		System.out.println(linkedList);
		linkedList.add(6);
		System.out.println(linkedList);
	}

}
