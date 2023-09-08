package com.practice.io;

import java.util.Scanner;

public class Example1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		System.out.println("Enter the second number : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int sum = num1+num2;
		System.out.println("Sum : "+sum);
		sc.close();
		
		
	}

}
