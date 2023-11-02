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
		ArrayList arrayList1 = new ArrayList();
		arrayList1.add(10);
		arrayList1.add(20);
		arrayList1.add(30);
		
		ArrayList arrayList2 = new ArrayList();
		arrayList2.add(40);
		arrayList2.add(50);
		arrayList2.add(60);
		
		for (int i = 0; i < arrayList1.size(); i++) {
			int sum = (int) arrayList1.get(i) + (int) arrayList2.get(i);
			//arrayList1.set(i, sum);
		System.out.println(sum);
		}
		
		//System.out.println(arrayList1);
		}

}
