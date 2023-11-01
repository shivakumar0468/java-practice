package com.practice.collections;

import java.util.LinkedList;
import java.util.Scanner;
/*
 * 8.Write a program to remove the first element from a LinkedList
Input:
[10 20 30 40 50]
Output:
LinkedList after removing the first element: 20 30 40 50.

 */
public class RemoveElementFromLinked {
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.add(10);
		linkedList.add(20);
		linkedList.add(30);
		linkedList.add(40);
		linkedList.add(50);
		System.out.println(linkedList);
		linkedList.remove(0);
		System.out.println("LinkedList after removing the first element:"+linkedList);
	}

}
