package com.practice.strings;

import java.util.Scanner;

public class RemovingWhiteSpaces {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s1=sc.nextLine();
		String s=s1.replaceAll("\\s", "");
		System.out.println(s);
		sc.close();
	}

}
