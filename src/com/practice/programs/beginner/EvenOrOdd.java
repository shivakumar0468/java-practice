package com.practice.programs.beginner;

import java.util.Scanner;

public class EvenOrOdd {
	public int isEvenorOdd(int n) {
		int num=0;
		num =n%2;
		return num;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		EvenOrOdd obj = new EvenOrOdd();
		int num =obj.isEvenorOdd(n);
		if (num==0) {
			System.out.println(n + " is an even number.");
		} else {
			System.out.println(n + " is an odd number.");
		}
		sc.close();
	}

}
