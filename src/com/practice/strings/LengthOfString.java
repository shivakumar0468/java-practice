package com.practice.strings;

import java.util.Scanner;

public class LengthOfString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String name = sc.nextLine();

		System.out.println(name.length());
		sc.close();
	}

}
