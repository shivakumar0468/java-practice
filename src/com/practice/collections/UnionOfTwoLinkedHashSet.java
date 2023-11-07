package com.practice.collections;

import java.util.LinkedHashSet;
import java.util.Scanner;

/*
 * 17. Write a Java program to find the union of two LinkedHashSets.
Input:
LinkedHashSet1: [1, 2, 3]
LinkedHashSet2: [3, 4, 5]
Output:
Union: [1, 2, 3, 4, 5]
 */
public class UnionOfTwoLinkedHashSet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the Linkedhashset: ");
		int size =sc.nextInt();
		System.out.println("Enter the elements of the linkedhshset: ");
		LinkedHashSet set = new LinkedHashSet();
		for(int i = 0;i<size;i++) {
			set.add(sc.next());
			
		}
		System.out.println("enter the size of the Linkedhashset: ");
		int size2 =sc.nextInt();
		LinkedHashSet set2 = new LinkedHashSet();
		for(int i = 0;i<size2;i++) {
			set2.add(sc.next());
		}
		set.addAll(set2);
		System.out.println(set);
		sc.close();
	}

}
