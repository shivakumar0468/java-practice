package com.practice.programs.beginner;

import java.util.Scanner;

public class Numbers {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter n :");
		int n = s.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.print(" "+i);
		}
		s.close();

	}

}
