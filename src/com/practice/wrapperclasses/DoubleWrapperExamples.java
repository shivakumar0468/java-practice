package com.practice.wrapperclasses;

public class DoubleWrapperExamples {
	public static void main(String[] args) {
		//creation
		Double doubleObj = new Double(5);
		System.out.println(doubleObj.floatValue());
		System.out.println(doubleObj.intValue());
		System.out.println(doubleObj.longValue());
		System.out.println(doubleObj.toString());
		System.out.println(doubleObj.shortValue());
		
		//parsing
		String salary = "50000";
		double sal = Double.valueOf(salary);
		System.out.println(sal);
		
		//autoboxing
		Double age = 20d;
		
		//unboxing
		double pAge = age;
		System.out.println(pAge);
		
		//comparision
		Double a = 10d;
		Double b = 20d;
		System.out.println(a.equals(b));
	}

}
