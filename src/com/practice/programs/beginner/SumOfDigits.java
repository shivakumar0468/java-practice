package com.practice.programs.beginner;

import java.util.Scanner;
/*
 * 16. Write a program to find the sum of digits of a given number.
Input:
Enter a number: 12345
Output:
The sum of digits of 12345 is: 15

 */
public class SumOfDigits {
	public int add(int m,int n) {
		int sum = 0;
		while (m > 0) {
			n = m % 10;
			sum = sum + n;
			m = m / 10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int m = sc.nextInt();
		
		SumOfDigits obj=new SumOfDigits();
		int result=obj.add(m, m);
		
		System.out.println("The sum of digits is:"+result);
		sc.close();
	}

}
