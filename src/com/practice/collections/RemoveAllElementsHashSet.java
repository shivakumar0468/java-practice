package com.practice.collections;

import java.util.HashSet;
import java.util.Scanner;

/*
 * 19. Write a Java program to remove all the elements from one HashSet that
are not present in another HashSet.
Input:
HashSet1: [1, 2, 3, 4, 5]
HashSet2: [3, 4, 5, 6]
Output:
HashSet1 after removing non-matching elements: [3, 4, 5]
 */
public class RemoveAllElementsHashSet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Hashset: ");
		int size = sc.nextInt();
		System.out.println("Enter the elements of the HastSet: ");
		HashSet set = new HashSet();
		for (int i = 0; i < size; i++) {
			set.add(sc.next());
		}
		System.out.println("Enter the size of the Hashset: ");
		int size1 = sc.nextInt();
		System.out.println("Enter the elements of the HastSet: ");
		HashSet set1 = new HashSet();
		for (int i = 0; i < size1; i++) {
			set1.add(sc.next());
		}
		set.retainAll(set1);
		System.out.println(set);
		sc.close();
	}

}
