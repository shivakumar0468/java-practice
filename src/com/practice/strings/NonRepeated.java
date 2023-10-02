package com.practice.strings;

import java.util.Scanner;

public class NonRepeated {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();

		for (int i = 0; i < s.length(); i++) {
			char currentChar = s.charAt(i);
			String beforeStr = s.substring(0, i);
			String afterStr = s.substring(i + 1);
			if (!afterStr.contains(String.valueOf(currentChar)) && !beforeStr.contains(String.valueOf(currentChar))) {
				System.out.println("non-repeating character: " + currentChar);
				break;
			}

		}
		sc.close();
	}

}
