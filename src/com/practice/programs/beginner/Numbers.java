package com.practice.programs.beginner;
/*
 * 2.Write a program to print the numbers from 1 to n.
Input:
Enter n: 5
Output:
1 2 3 4 5

 */
import java.util.Scanner;

public class Numbers {
	public void num(int n) {
		
		for (int i = 1; i <= n; i++) {
			System.out.println(""+i);
		}
		
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter n :");
		int n = s.nextInt();
		Numbers obj = new Numbers();
		
		s.close();

	}

}
