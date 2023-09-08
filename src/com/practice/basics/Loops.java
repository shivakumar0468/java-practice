package com.practice.basics;

public class Loops {
	public static void main(String[] args) {
		//print 10 numbers 
		// using for loop
		for(int i =0; i<10; i++) {
		//	System.out.println(i);
		}
		
		//using while loop
		int j =0;
		while(j<10) {
			//System.out.println(j);
			j++;
		}
		
		//print 10 numbers in reverse order
		//using for loop
		for(int i=9;i>=0; i-- ) {
			//System.out.println(i);
		}
		
		int k=9;
		while(k>=0) {
			//System.out.println(k);
			k--;
		}
		
		//print even numbers in first 10 numbers
		//using for loop
		for(int i=0; i<10; i++) {
			if (i>0 && i%2==0) {
				System.out.println(i);
			}
		}
		
		//using while loop
		int e=0;
		while(e<10) {
			if (e>0 && e%2==0) {
				//System.out.println(e);
			}
			e++;
		}
	}

}
