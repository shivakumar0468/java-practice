package com.practice.wrapperclasses;

public class ByteWrapperExamples {
	public static void main(String[] args) {
		//creation
		byte a = 1;
		Byte byteObj = new Byte(a);
		System.out.println(byteObj.doubleValue());
		System.out.println(byteObj.floatValue());
		System.out.println(byteObj.intValue());
		System.out.println(byteObj.longValue());
		System.out.println(byteObj.toString());
		
		//parsing
		String salary = "100";
		byte sal = Byte.valueOf(salary);
		System.out.println(sal);
		
		//autoboxing
		Byte num = 20;
		
		//unboxing
		byte pNum = num;
		System.out.println(pNum);
		
		//comparision
		Byte b = 10;
		Byte c = 30;
		System.out.println(b.equals(c));
	}

}
