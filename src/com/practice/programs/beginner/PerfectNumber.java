package com.practice.programs.beginner;

import java.util.Scanner;

public class PerfectNumber {public boolean notPerfect(int n) {
	int i = 1;
	int sum=0;
	while (i <= n / 2) {
		if (n % i == 0) {
			sum = sum + i;
		}
		i++;
	}
	return sum==n;
}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter n : ");
	int n = sc.nextInt();
	PerfectNumber obj = new PerfectNumber();
	if (obj.notPerfect(n)) {
		System.out.println(n + " is a perfect number ");
	} else {
		System.out.println(n + " is not a perfect number ");
	}
	sc.close();
	
	}

}
