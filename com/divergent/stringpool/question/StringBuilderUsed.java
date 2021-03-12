package com.divergent.stringpool.question;

public class StringBuilderUsed {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("Hello");
		sb1.append("Java");
		System.out.println(sb1);
		StringBuilder sb2 = new StringBuilder();
		System.out.println(sb2.capacity());
	}

}
