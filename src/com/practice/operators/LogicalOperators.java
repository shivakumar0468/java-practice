package com.practice.operators;

public class LogicalOperators {
	public static void main(String[] args) {
	int a=10,b=20,c=30;
	System.out.println(a>b&&c>b);//false&&true ->False
	System.out.println(a<b&&b<c);//true&&true->true
	System.out.println(a>b&&b>c);//false&&false->false
	System.out.println(a>b||a<c);//false||true->true
	System.out.println(a<b||c>b);//true||true->true
	System.out.println(a>b||b>c);//false||false->false
	}

}
