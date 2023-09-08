package com.practice.programs.beginner;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int p = 1; p <= 10; p++) {
			System.out.println(" 2 * " + p + " = " + p * 2);

		}
		sc.close();
	}

}
