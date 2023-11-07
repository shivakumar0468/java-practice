package com.practice.collections;

import java.util.LinkedHashSet;
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
public class RemovingNonMatchingElements {
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
		set.retainAll(set2);
		System.out.println("HashSet1 after removing non-matching elements:"+set);
		sc.close();
	}

}
