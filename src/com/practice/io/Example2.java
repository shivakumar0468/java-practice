package com.practice.io;

import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name : ");
		String name = sc.next();
		//String name1 = name; 
		System.out.println("Hello "+name);
		sc.close();
		
		
		
	}

}
