package com.practice.strings;

import java.util.Scanner;

public class NoOfVowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s1 = sc.nextLine();
		int vowels = 0;
		s1 = s1.toLowerCase();
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' || s1.charAt(i) == 'o'
					|| s1.charAt(i) == 'u') {
				vowels++;
			} else {

			}
		}
		System.out.println("The no of vowels in the string is: " + vowels);
		sc.close();
	}
}
