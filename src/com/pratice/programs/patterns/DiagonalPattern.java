package com.pratice.programs.patterns;
/*
 * 20. Print diagonal number pattern using nested loops.
Input:
Enter the number of rows: 5
Output:
1 0 0 0 0
0 2 0 0 0
0 0 3 0 0
0 0 0 4 0
0 0 0 0 5

 */
import java.util.Scanner;

public class DiagonalPattern {
	public void shape(int n) {
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=n; j++) {
				if (i == j) {
					System.out.print(i + "");
				} else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows:");
		int n = sc.nextInt();
		DiagonalPattern obj = new DiagonalPattern();
		obj.shape(n);

		
		sc.close();
	}
}
