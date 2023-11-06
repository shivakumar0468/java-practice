package com.practice.collections;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 4.Write a program to sum elements from one ArrayList to another ArrayList.
Input:
ArrayList 1: [10, 20, 30]
ArrayList 2: [40, 50, 60]
Output:
ArrayList1 after adding all elements from ArrayList 2: [50,70,90]
 */
public class SumElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the ArrayList: ");
		int size = sc.nextInt();
		System.out.println("Enter the elements of the Arraylist: ");
		ArrayList arrayList1 = new ArrayList();
		for (int i = 0; i < size; i++) {
			arrayList1.add(sc.nextInt());
		}
		System.out.println("Enter the size of the ArrayList2: ");
		int size2 = sc.nextInt();
		System.out.println("Enter the elements of the ArrayList2: ");
		ArrayList arrayList2 = new ArrayList();
		for (int j = 0; j < size2; j++) {
			arrayList2.add(sc.nextInt());
		}
		if (size != size2) {
			System.out.println("Arraylists are not of the same size");
			return;
		}
		for (int i = 0; i < arrayList1.size(); i++) {
			int sum = (int) arrayList1.get(i) + (int) arrayList2.get(i);
			// arrayList1.set(i, sum);
			System.out.println(sum);
		}

		// System.out.println(arrayList1);
	}

}
