package com.practice.programs.beginner;

import java.util.Scanner;
/*
 * 7.Print a pattern of numbers in a triangle shape using nested loops.
Input:
Enter the number of rows: 5
Output:
1
22
333
4444
55555
 */
public class NumberInTraingleShape {
	public void shape(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);

			}
			System.out.println();

		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the n :");
		int n = sc.nextInt();
		NumberInTraingleShape obj=new NumberInTraingleShape();
		obj.shape(n);
		sc.close();
	}

}
