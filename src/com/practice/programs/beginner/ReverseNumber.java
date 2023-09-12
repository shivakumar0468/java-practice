package com.practice.programs.beginner;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n :");
		int n = sc.nextInt();
		int reverse = 0;
		while (n != 0) {
			int remainder = n % 10;//1234%10=4
			reverse = reverse * 10 + remainder;//0*10+4=4,4*10+3=43,43*10+2=432,432*10+1=4321
			n = n / 10;//1234/10=123

		}
		System.out.println("Reverse :" + reverse);
		sc.close();

	}

}
