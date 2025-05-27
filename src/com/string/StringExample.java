package com.string;

public class StringExample {
	
//	public static String concat1(String s1) {
//		s1 = s1 + "besant";
//		return s1;
//		
//	}
//	
//	public static void concat2(StringBuilder s2) {
//		s2.append("Bala");
//	}
//	
//	public static void concat3(StringBuffer s3) {
//		s3.append("Bala");
//	}
//	
//	public static void main(String[] args) {
//		String s1 = "geeks";
//		s1 = concat1(s1);
//		System.out.println(s1);
//		
//		StringBuilder s2 = new StringBuilder("sow");
//		concat2(s2);
//		System.out.println(s2);
//		
//		StringBuffer s3 = new StringBuffer("devi");
//		concat3(s3);
//		System.out.println(s3);
//			
//	}
	
	public static void main(String[] args) {
		
		String str = "Welcome";
		str.concat("everyone");
		System.out.println(str);
		System.out.println(str.contains("welcome"));
		System.out.println(str.endsWith("u"));
		System.out.println(str.replace('e', 'a'));
		
		String name  ;
		name = str.concat(" to home");
		System.out.println(name);
		
		
		StringBuilder sb = new StringBuilder("Hello");
		sb.append(str);
		System.out.println(sb);
		sb.capacity();
		System.out.println(sb.capacity());
		System.out.println(sb.charAt(5));
		System.out.println(sb.equals(str));
		System.out.println(sb.indexOf(str));
		System.out.println(sb.substring(4, 8));
		System.out.println(sb.delete(4, 8));
		
		
		StringBuffer sbr = new StringBuffer("MIxed practice");
		System.out.println(sbr.delete(4, 6));
		
		
		String s = "INtro";
		StringBuilder sbr1 = new StringBuilder(s);
		sbr1.reverse();
		System.out.println(sbr1);
		
		StringBuffer sbl = new StringBuffer(s);
		sbl.reverse();
		System.out.println(sbl);
		
		StringBuilder sbr2 = new StringBuilder("JAva program");
		String s1 = sbr2.toString();
		System.out.println(s1);
		
		
		StringBuffer sbt= new StringBuffer("Appa");
		String  s3 = sbt.toString();
		StringBuilder sbr5 = new StringBuilder(s3);
		System.out.println(sbr5);
	}
}
