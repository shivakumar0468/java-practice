package com.practice.strings;

import java.util.Scanner;
/*
 * 16. Write a program that prompts the user to enter a sentence, and then
	splits the sentence into individual words using the split() method. The
	program should then print out each word on a separate line.
	Input:
	Enter a sentence: The quick brown fox jumps over the lazy dog.
	Output:
	The
	quick
	brown
	fox
	jumps
	over
	the
	lazy
	dog.
 */
public class Split {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence : ");
		String s = sc.nextLine();
		String[] word =s.split(" ");
			for(String w:word) {
				System.out.println(w);
			}
			sc.close();
	}

}
