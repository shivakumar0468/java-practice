package com.practice.wrapperclasses;

public class LongWrapperExamples {
	public static void main(String[] args) {
		//creation
		Long longObj = new Long(5);
		System.out.println(longObj.doubleValue());
		System.out.println(longObj.floatValue());
		System.out.println(longObj.intValue());
		System.out.println(longObj.toString());
		System.out.println(longObj.byteValue());
		System.out.println(longObj.shortValue());
		
		//parsing
		String salary = "200";
		long sal = Long.valueOf(salary);
		System.out.println(sal);
		 
		//autoboxing 
		Long age =10l;
		
		//unboxing
		long pAge = age;
		System.out.println(pAge);
		
		//comparision
		Long a =20l;
		Long b =30l;
		System.out.println(a.equals(b));
		
	}

}
