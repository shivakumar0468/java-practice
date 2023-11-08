package com.practice.collections;

import java.util.LinkedHashMap;
import java.util.Scanner;

/*
 * 29. Write a Java program to replace the value of a specific key in a
LinkedHashMap.
Input:
LinkedHashMap: {A=1, B=2, C=3}
Key to replace: B
New value: 5
Output:
LinkedHashMap after replacement: {A=1, B=5, C=3}
 */
public class ReplaceSpecificElementLinkedHashMap {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		LinkedHashMap map = new LinkedHashMap();
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		
		System.out.println("Key to replace: ");
		String replace =sc.next();
		System.out.println("New value: ");
		int value =sc.nextInt();
		
		map.replace(replace, value);
		System.out.println(map);
		sc.close();
		
	}

}
