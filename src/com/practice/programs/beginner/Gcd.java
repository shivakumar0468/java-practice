package com.practice.programs.beginner;

import java.util.Scanner;
/*
 * 19. Write a program to find the GCD of two numbers.
	Input:
	Enter the first number: 12
	Enter the second number: 18
	Output:
	The GCD of 12 and 18 is: 6
 */
public class Gcd { //greatest common divisor  
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number: ");
		int num2 = sc.nextInt();
		int hcf = 0 ,lcm= 0;//6*2=12,6*3=18
		for (int i = 1; i <= num1 || i <= num2; i++) {//i<=12||i<=18->i<=18
			if (num1 % i == 0 && num2 % i == 0){// check whether remainder is 0 or not for both numbers
				hcf = i;//store temporary HCF
			}
		}
		lcm=num1*num2/hcf;
		System.out.println("HCF of given two numbers is :" + hcf);
		System.out.println("lcm of given two numbers : "+lcm);
		sc.close();
	}

}
