package com.practice.io;

import java.util.Scanner;

public class Example3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		System.out.println("Enter the second number : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int add = a+b;
		int sub = a-b;
		int div = a/b;
		int multi = a*b;
		System.out.println("addition : "+add);
		System.out.println("subraction : "+sub);
		System.out.println("division : " +div);
		System.out.println("multiplication : "+multi);
		sc.close();
		
		
	}

}
