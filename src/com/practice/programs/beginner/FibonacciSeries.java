package com.practice.programs.beginner;

import java.util.Scanner;

public class FibonacciSeries {
	public int fibNum(int n) {
		int  a = 0 , b = 0 , c = 1;
		for (int i = 1; i <= n; i++) {
			a = b;
			b = c;
			c = a + b;
			System.out.print(a + " ");
		}
			return a;
		}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the numbers of terms : ");
			int n = sc.nextInt();

			FibonacciSeries obj = new FibonacciSeries();
			int a = obj.fibNum(n);
			System.out.println();
		sc.close();
	}

}
