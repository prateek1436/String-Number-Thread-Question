package com.divergent.all.question;

public class StringPract1 {

	public static void main(String[] args) {
		byte b1 = 100;
		byte b2 = (byte) (b1 << 1);
//		assertEquals(-56, b2);
//		System.out.println(b2);
//		System.out.println(assertEquals(-56, b2));
		String signedString = Integer.toString(Integer.MIN_VALUE);
		assertEquals("-2147483648", signedString);
	}

	private static void assertEquals(String str, String str1) {

	}

}
