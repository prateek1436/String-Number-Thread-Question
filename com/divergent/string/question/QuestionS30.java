package com.divergent.string.question;

public class QuestionS30 {
	public static void main(String[] args) {
		long val1 = 699991234;
		long val2 = 678491234;
		System.out.println("Value1: " + val1);
		System.out.println("Value2: " + val2);
		long mul = val1 * val2;
		if (mul > Long.MAX_VALUE) {
			throw new ArithmeticException("Overflow!");
		}
		System.out.println("Multiplication Result: " + (long) mul);
	}

}
