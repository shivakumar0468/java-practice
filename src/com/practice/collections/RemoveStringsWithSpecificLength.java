package com.practice.collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
/*
 * 6.Write a program to remove all strings from an ArrayList that have a
specific length.
Input:
[Apple,Banana,Mango,Orange,Pineapple]
Output:
ArrayList after removing strings with length 6:[Apple,Mango,Pineapple]

 */
public class RemoveStringsWithSpecificLength {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Apple");
		list.add("Mango");
		list.add("Banana");
		list.add("Orange");
		list.add("Pineapple");
		
		for (int i = 0; i < list.size(); i++) {
			if((boolean)list.get(i).equals(4)) {
				list.remove(i);
			}
			System.out.println(list);
		}
	}

}
