package com.practice.programs.beginner;

import java.util.Scanner;

public class AreaOfCircle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of the circle:");
		int r = sc.nextInt();
		double pi = 3.14, area;
		area = pi * r * r;
		System.out.println("Area of the circle:" + area);
		sc.close();

	}

}
