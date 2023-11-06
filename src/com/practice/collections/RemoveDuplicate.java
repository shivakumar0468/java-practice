package com.practice.collections;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 5.Write a program to remove duplicates from an ArrayList.
Input:
[10,20,30,20,40,30,50]
Output:
ArrayList after removing duplicates: [10,20,30,40,50]
 */
public class RemoveDuplicate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the ArrayList: ");
		int size=sc.nextInt();
		System.out.println("Enter the elements of the ArrayList: ");
		ArrayList list = new ArrayList();
		for(int i=0;i<size;i++) {
			list.add(sc.nextInt());
		}
		System.out.println(list);
		ArrayList list2 = new ArrayList();
		for (int i = 0; i < list.size(); i++) {
			int current=(int) list.get(i);
			if(!list2.contains(current)) {
				list2.add(current);
		}
			
			
		}
		System.out.println("ArrayList after removing duplicates:"+list2);
		sc.close();
		
	}

}
