package com.practice.collections;

import java.util.LinkedList;
import java.util.Scanner;
/*
 * 10. Write a program to remove all elements from a linked list that are
greater than a given value.
Input:
[1 6 2 3 4 5 9]
Enter the value: 4
Output:
LinkedList after removal:[1 2 3 4]
 */
public class RemoveAllElementsInLinkedList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of LinkedList:");
		int n = sc.nextInt();
		System.out.println("enter the elements of LinkedList: ");
		LinkedList list = new LinkedList();
		for(int i=0;i<n;i++) {
			list.add(sc.nextInt());
		}
		System.out.println("Enter the value: ");
		int value = sc.nextInt();
		LinkedList list2=new LinkedList();
		
		 for (Object object : list) {
			int currentValue= (int) object ;
			 if(currentValue<=value) {
			 list2.add(currentValue);
			 }
			 
		 }
		 System.out.println(list2);
		 
		
			sc.close();
	}

}
