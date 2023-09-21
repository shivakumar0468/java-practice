package com.practice.strings;

import java.util.Scanner;
/*
 * 13. Write a program to reverse each word in a sentence.
Input:
Enter a sentence: The quick brown fox
Output:
The reversed sentence is: ehT kciuq nworb xof

 */
public class ReverseEachWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentance: ");
		String sentence=sc.nextLine();
		String[] s = sentence.split(" ");
		
		for (String name : s) {
			String rev="";
			for(int i=name.length()-1;i>=0;i--) {
				rev=rev+name.charAt(i);
			}
			System.out.print(rev+" ");
			
		}
		sc.close();
	}

}
