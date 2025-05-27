package com.sample;

public class JavaString {

	public static void main(String[] args) {
		String text = "Besant is a training institute is in India";
		String text1 = "Besant is a training institute is in India";
		String text3 = new String("Besant is a training institute is in India");
		System.out.println(text);
		System.out.println(text.length());
		System.out.println(text.toUpperCase());
		System.out.println(text.toLowerCase());

		System.out.println(text.indexOf("is"));
		System.out.println(text == text1);
		System.out.println(text3);
		System.out.println(text == text3);
		System.out.println(text.equals(text3));
		System.out.println(text.equalsIgnoreCase(text3)); 
//		
//		String name = "Ram";
//		String name1 = "Ram";
//		
//		System.out.println(name1.compareTo(name));
			
	//String name = "the" , StringBuffer, StringBUilder
		
	}

}
