package com.practice.operators;

public class SwappingTwoVariables {
	public static void main(String[] args) {
		int a=10,b=30;
		System.out.println("a="+a);
		System.out.println("b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a="+a);
		System.out.println("b="+b);
		
	}

}
