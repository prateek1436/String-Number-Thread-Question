package com.divergent.stringpool.question;

public class StringPoolUsed {

	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = "Java";
		String s5 = "Hello";
		String s3 = new String("Java");
		String s4 = new String("Hello").intern();
		System.out.println((s1==s2)+", String are equal.");
		System.out.println((s1==s3)+", String are not equal");
		System.out.println((s1==s4)+", String are equal.");
		System.out.println((s4==s5));
	}

}
