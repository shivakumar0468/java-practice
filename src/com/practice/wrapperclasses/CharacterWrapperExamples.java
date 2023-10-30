package com.practice.wrapperclasses;

public class CharacterWrapperExamples {
	public static void main(String[] args) {
		//creation
		Character CharObj = new Character('s');
		System.out.println(CharObj.toString());
		
		//parsing
		String d = "c";
		//char ch = Character.valueOf(d);
		//System.out.println(ch);
		
		//autoboxing
		Character letter = 'c';
		
		//unboxing
		char pLetter=letter;
		
		//comparison
		Character a='a';
		Character b='b';
		System.out.println(a.equals(b));
		
		
		
	}


}
