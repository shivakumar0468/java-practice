package com.practice.strings;

import java.util.Scanner;

public class ValidPalindrome {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();

		s = s.replace(" ", "");
		s = s.toLowerCase();
		int firstIndex = 0;
		int lastIndex = s.length() - 1;
		boolean isPalindrome = true;
		while (firstIndex < lastIndex) {
			if (s.charAt(firstIndex) != s.charAt(lastIndex)) {
				isPalindrome = false;
				break;
			}
			firstIndex++;
			lastIndex--;
		}

		if (isPalindrome) {
			System.out.println("the string is a valid palindrome");
		} else {
			System.out.println("the string is  not a valid palindrome");
		}
		sc.close();
	}
}
