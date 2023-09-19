package com.practice.strings;

import java.util.Scanner;

public class StringPalindromeOrNot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s1=sc.next();
		int a=0,b=s1.length()-1;
		
		while(a<b) {
			if(s1.charAt(a)!=s1.charAt(b)) {
				System.out.println("is not palindrome");
				System.exit(0);
			}
			a++;
			b--;
			
		}
		System.out.println("palindrome");
		sc.close();
	}

}
