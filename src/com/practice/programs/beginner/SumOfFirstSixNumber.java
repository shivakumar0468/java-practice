package com.practice.programs.beginner;

import java.util.Scanner;
/*
 * 4.Write a program to sum of first n natural numbers using a while loop
Input:
Enter n: 6
Output:
Sum of first 6 natural numbers is: 21
 */
public class SumOfFirstSixNumber {
	public int add(int a) {
		int sum = 0, i = 1;
		while (i <= a) {

			sum += i;
			i++;

		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n :");
		int a = sc.nextInt();
		SumOfFirstSixNumber obj = new SumOfFirstSixNumber();
		int result = obj.add(a);
		
		System.out.println("the sum of first six numbers : " + result);
		sc.close();
	}
}
