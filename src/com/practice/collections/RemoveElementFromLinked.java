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
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the LinkedList: ");
		int size=sc.nextInt();
		System.out.println("Enter the elements of the LinkedList: ");
		LinkedList linkedList = new LinkedList();
		for(int i=0;i<size;i++) {
			linkedList.add(sc.nextInt());
		}
		System.out.println(linkedList);
		linkedList.remove(0);
		System.out.println("LinkedList after removing the first element:"+linkedList);
		sc.close();
	}

}
