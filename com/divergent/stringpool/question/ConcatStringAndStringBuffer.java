package com.divergent.stringpool.question;

public class ConcatStringAndStringBuffer {
	
	public static String concatWithString() {
		String s1 = "Hello";
		System.out.println(s1.hashCode());
		for(int i = 0;i<10000;i++) {
			s1 = s1+"World";
		}
		return s1;
	}
	
	public static String concatWithStringBuffer() {
		StringBuffer sb1 = new StringBuffer("Hello");
		for(int i = 0;i<10000;i++) {
			sb1.append("World");
		}
		return sb1.toString();
	}
	public static String concatWithStringBuidler() {
		StringBuilder sb1 = new StringBuilder("Hello");
		for(int i = 0;i<10000;i++) {
			sb1.append("World");
		}
		return sb1.toString();
	}
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		concatWithString();
		System.out.println("Time taken by String concat "+(System.currentTimeMillis()-startTime)+"ms.");
		startTime = System.currentTimeMillis();
		concatWithStringBuffer();
		System.out.println("Time taken by StringBuffer Concat "+(System.currentTimeMillis()-startTime)+"ms.");
		startTime = System.currentTimeMillis();
		concatWithStringBuidler();
		System.out.println("Time taken by StringBuidler concat "+(System.currentTimeMillis()-startTime)+"ms.");
	}

}
