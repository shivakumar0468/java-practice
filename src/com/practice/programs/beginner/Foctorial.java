package com.practice.programs.beginner;

import java.util.Scanner;

public class Foctorial {
	public int  calculateFactorial(int a) {
		int fact = 1;
		for (int i = 1; i <= a; i++) {
			fact = fact * i;
		}
		return fact;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a = sc.nextInt();
		Foctorial obj = new Foctorial();
		int fact = obj.calculateFactorial(a);
		System.out.println("factorial of " + a + " is: " + fact);
		sc.close();
	}

}
