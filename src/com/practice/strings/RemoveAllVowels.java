package com.practice.strings;

import java.util.Scanner;
/*
 * 4. Write a program to remove all the vowels from a string.
Input:
Enter a string: Hello World
Output:
The string without vowels is: Hll Wrld
 */
public class RemoveAllVowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = sc.nextLine();
		str = str.toLowerCase();
		String s1 = "";

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				continue;

			} else {

			}
			s1 += c;
		}
		System.out.println(s1);
		sc.close();
	}

}
