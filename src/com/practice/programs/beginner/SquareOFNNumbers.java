package com.practice.programs.beginner;

import java.util.Scanner;
/*
 * 20. Write a program to find the sum of the squares of the first n natural
numbers. For e.g. the sum of squares for the first five natural numbers
(1 to 5) is 1
2+2
2+3
2+4
2+5
2 = 55.
Input:
Enter n: 5
Output:
sum of squares = 55

 */
public class SquareOFNNumbers {
	public int add(int a) {
		int sum = 0;
		for (int i = 1; i <= a; i++) {
			sum = sum + i * i;

		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int a = sc.nextInt();
		SquareOFNNumbers obj = new SquareOFNNumbers();
		int result = obj.add(a);
		System.out.println("Sum =" + result);
		sc.close();
	}

}
