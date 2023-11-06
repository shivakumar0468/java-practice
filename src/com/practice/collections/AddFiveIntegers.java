package com.practice.collections;

import java.util.ArrayList;
import java.util.Scanner;
/*
 * 1.Write a program to create an ArrayList and add five integers to it. Then
print the elements of the ArrayList.
 */
public class AddFiveIntegers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the ArryList: ");
		int size =sc.nextInt() ;
		System.out.println("Enter the elements of the ArrayList: ");
		ArrayList arrayList = new ArrayList();
		for(int i=0;i<size;i++) {
			arrayList.add(sc.nextInt());
		}
		System.out.println(arrayList);
	}

}
