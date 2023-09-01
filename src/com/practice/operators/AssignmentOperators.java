package com.practice.operators;

public class AssignmentOperators {
	public static void main(String[] args) {
		int x = 100,y = 50;
		System.out.println("X="+x);
		System.out.println("Y="+y);
		// swap two number
		int temp;
		temp = x;//temp = 100
		x = y;//x = 50
		y = temp;// y = 100
		System.out.println("X="+x);
		System.out.println("Y="+y);
		x *=y;// x=x*y ->5000
		x +=y;// x=x+y ->150
		x -=y;// x=x-y ->50
		x /=y;// x=x/y ->2
		System.out.println("X*Y: "+x);
		System.out.println("X+Y: "+x);
		System.out.println("X-Y: "+x);
		System.out.println("X/Y: "+x);
	}

}
