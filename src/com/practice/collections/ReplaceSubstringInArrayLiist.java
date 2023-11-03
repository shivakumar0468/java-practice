package com.practice.collections;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 7.Write a program to replace all occurrences of a specific substring in an
ArrayList of strings.
Input:
[Apple,Banana,Mango,Orange]
Substring to replace: an
New substring: **
Output:
ArrayList after replacing an with **:[Apple,B****a,M**go,Or**ge]

 */
public class ReplaceSubstringInArrayLiist {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the ArrayList: ");
		int size = sc.nextInt();
		System.out.println("enter the elements: ");
		ArrayList list = new ArrayList();
		for (int i = 0; i < size; i++) {
			list.add(sc.next());
		}
		System.out.println("Substring to replace: ");
		String change = sc.next();
		System.out.println("New substring: ");
		String replace = sc.next();

		ArrayList list2 = new ArrayList();
		for (int j = 0; j < list.size(); j++) {
			String word = (String) list.get(j);
			String replaced = word.replace(change, replace);
			list2.add(replaced);
		}
		System.out.println("ArrayList after replacing" + list2);

		sc.close();
	}

}
