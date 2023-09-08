package com.practice.basics;

public class NestedLoop {
	public static void main(String[] args) {
		//print 1 to 10 tables
		/*
		 * 2 * 1 = 2
		 * 2 * 2 = 4
		 * 2 * 3 = 6
		 * 2 * 4 = 8
		 * 2 * 5 = 10
		 * 2 * 6 = 12
		 * 2 * 7 = 14
		 * 2 * 8 = 16
		 * 2 * 9 = 18
		 * 2 * 10 = 20
		 */
		for(int p=1; p<=10; p++) {//it will provide  1 to 10 values
			for (int i=1; i<=10; i++) {
				System.out.println(p+" * "+i+" = "+p*i);//multiplication
			}
			System.out.println("-------------");//table separator
		}
		
	}

}
