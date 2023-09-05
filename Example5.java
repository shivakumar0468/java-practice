package com.practice.io;

import java.util.Scanner;

public class Example5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your weight in kilograms : ");

		double weight = sc.nextDouble();
		System.out.println("Enter your height in meters : ");
		double height = sc.nextDouble();
		double Bmi = weight / (height * height);

		if (Bmi >= 0 && Bmi <= 9) {
			System.out.println("Underweight :" + Bmi);
		}

		else if (Bmi >= 10 && Bmi <= 24) {
			System.out.println("Normal weight : " + Bmi);
		}
		else if (Bmi >= 24 && Bmi <= 29) {
			System.out.println("over weight : " + Bmi);
		} 
		else {
			System.out.println("obese :" + Bmi);

		}

		sc.close();

	}
}
