package com.pratice.programs.patterns;

/*
 * 9.Print a pattern of numbers in a right triangle shape using nested loops.
	Input:
	Enter the number of rows: 5
	Output:
		1
	   12
	  123
	 1234
	12345
	1->4 spaces+ 1 number
	2->3 spaces+ 2 numbers
	3->2 spaces+ 3 numbers
	4->1 spaces+ 4 numbers
	5->0 spaces+ 5 numbers
	
    
 */
import java.util.Scanner;

public class NumberInRightAngleTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows: ");
		int n = sc.nextInt();

		for (int i = 0; i <=n; i++) {
			for (int j = n-1; j>=i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(k);
			}
			System.out.println();
		}
		sc.close();
	}

}
