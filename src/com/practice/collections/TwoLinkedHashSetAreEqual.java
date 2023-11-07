package com.practice.collections;

import java.util.LinkedHashSet;
import java.util.Scanner;

/*
 *18. Write a Java program to check if two LinkedHashSets are equal.
Input:
LinkedHashSet1: [A, B, C]
LinkedHashSet2: [C, A, B]
Output:
LinkedHashSets are equal.
 
 */
public class TwoLinkedHashSetAreEqual {
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
		set.contains(set2);
		
		sc.close();
	}

}
