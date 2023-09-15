package com.pratice.programs.patterns;

/*
 * 19. Print Rhombus pattern using nested loops.
Input:
Enter the number of rows: 5
Output:
    ******
   ******
  ******
 ******
******
 */
import java.util.Scanner;

public class RhombusPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows:");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j =0; j<=n-i; j++) {
				System.out.print(" ");

			}
			for (int k =1 ; k <= n; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
