package com.practice.programs.beginner;

import java.util.Scanner;
/*
 * 18. Write a program to find the LCM of two numbers.
	Input:
	Enter the first number: 4
	Enter the second number: 6
	Output:
	The LCM of 4 and 6 is: 12
	lcm=a*b/gcd(a,b)=4*6/2=12
	lcm=12*18/6=36
 */
public class Lcm {//least common multiple
	public static void main(String args[]) {
		int a, b, max, step, lcm = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number ::");
		a = sc.nextInt();
		System.out.println("Enter second number ::");
		b = sc.nextInt();

		if (a > b) {
			max = step = a;
		} else {
			max = step = b;
		}

		while (a != 0) {
			if (max % a == 0 && max % b == 0) {
				lcm = max;
				break;
			}
			max += step;
		}
		System.out.println("LCM of given numbers is :: " + lcm);
		sc.close();

	}
}
