package com.practice.strings;

import java.util.Scanner;
/*
 * 7.Write a program to concatenate two strings.
Input:
Enter the first string: hello
Enter the second string: world
Output:
The concatenated string is: helloworld
 */
public class ConcatenateTwoStrings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String name = sc.next();
		System.out.println("Enter a string: ");
		String name1 = sc.next();
		name = name.concat(name1);
		System.out.println(name);
		sc.close();

	}

}
