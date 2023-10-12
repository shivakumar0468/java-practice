package com.practice.programs.beginner;

import java.util.Scanner;
/*
 * 8.Write a program to find the largest of three numbers.
Input:
Enter the first number: 7
Enter the second number: 4
Enter the third number: 9
Output:
The largest number is: 9

 */
public class LargestNumber {
	public int large(int a, int b, int c) {
		if (a < b && c < b) {
			return b;
		} else if (b < a && c < a) { 
			return a;
		} else {
            return c;
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number :");
		int a = sc.nextInt();
		System.out.println("Enter the second number :");
		int b = sc.nextInt();
		System.out.println("Enter the third number :");
		int c = sc.nextInt();
		
		LargestNumber obj = new LargestNumber();
		int result=obj.large(a, b, c);
		System.out.println("The largest number is "+result);

		sc.close();
	}

}
