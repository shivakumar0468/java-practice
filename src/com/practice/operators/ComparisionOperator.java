package com.practice.operators;

public class ComparisionOperator {
	public static void main(String[] args) {
		int a=20;
		int b=10;

		a += a;//a=a+a=20+20=40 
		System.out.println("a+=a : "+a);
		b += b;//b=b+b=10+10=20
		System.out.println("b+=b : "+b);
		a -= b;//a=a-b=40-20=20
		System.out.println("a-=b : "+a);
		a *= b;//a=a*b=20*20=400
		System.out.println("a*=b : "+a);
		a /=b;//a=a/b=400/20=20
		System.out.println("a/=b : "+a);

		int x,y,z;
		x=y=z=100;
		System.out.println("x,y,z : "+x+","+y+","+z);

		String greeting = "hello";
		greeting += " world";//greeting=greeting+ " world" ->concatination
		System.out.println("greeting : "+greeting);
		String something ="shiva";
		something += " kumar";
		System.out.println("something :"+something);
		String guess;
		guess = "wel";
		guess += "come";
		System.out.println("guess :"+guess);

		//note: +operator does both addition and concatination. this is called as operator overloading 
	}

}
