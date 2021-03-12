package com.divergent.string.question;

public class QuestionS23 {

	public static void main(String[] args) {
		String str = "254";
		int result = Integer.parseUnsignedInt(str);
		System.out.println(result);
		int result1 = Integer.parseUnsignedInt(str, 8);
		System.out.println(result1);

	}

}
