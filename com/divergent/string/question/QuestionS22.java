package com.divergent.string.question;

public class QuestionS22 {
	public static boolean willAdditionOverflow(int left, int right) {
		if (right < 0 && right != Integer.MIN_VALUE) {
			return willSubtractionOverflow(left, -right);
		} else {
			return (~(left ^ right) & (left ^ (left + right))) < 0;
		}
	}

	public static boolean willSubtractionOverflow(int left, int right) {
		if (right < 0) {
			return willAdditionOverflow(left, -right);
		} else {
			return ((left ^ right) & (left ^ (left - right))) < 0;
		}
	}

	public static void main(String[] args) {
		int num = 15, num1 = 20;
		System.out.println("Max and Min " + num + " " + num1 + " is " + Math.max(num, num1));
		System.out.println(willAdditionOverflow(10, 20));
		System.out.println(willSubtractionOverflow(20, 10));
	}

}
