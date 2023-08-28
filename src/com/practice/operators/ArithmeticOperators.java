package com.practice.operators;

public class ArithmeticOperators {
	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		int sum = a+b;
		int sub  = a-b;
		int mul = a*b;
		int div = a/b;
		int mod = a%b;
		b++;//b = b+1
		a--;// a = a-1
		System.out.println("Addition: "+sum);
		System.out.println("Subtraction: "+sub);
		System.out.println("Multiplication: "+mul);
		System.out.println("Division: "+div);
		System.out.println("Remainder: "+mod);
		System.out.println("Decrement: "+a);
		System.out.println("Increment: "+b);
	}

}
