package com.practice.programs.beginner;

import java.util.Scanner;

public class Temperature {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temperature in celsius : ");
		double a = sc.nextDouble();
		double fahrenheit = 0.0;
		fahrenheit = (a * 1.8) + 32;
		System.out.println("fahrenheit :" + fahrenheit);
		sc.close();
	}

}
