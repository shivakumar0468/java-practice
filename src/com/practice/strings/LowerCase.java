package com.practice.strings;

import java.util.Scanner;

/*
 * Write a program to convert a string to lowercase.
Input:
Enter a string: HELLO WORLD
Output:
The string in lowercase is: hello world
 */
public class LowerCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String name = sc.nextLine();
		 name=name.toLowerCase();
		 System.out.println("String the name is: "+name);
		 sc.close();
	}
	

}
