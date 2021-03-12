package com.divergent.string.question;

public class QuestionS14 {

	static final int ASCII_SIZE = 256;

	static char getMaxOccuringChar(String str) {

		int count[] = new int[ASCII_SIZE];
		for (int i = 0; i < str.length(); i++)
			count[str.charAt(i)]++;

		int max = -1;
		char result = ' ';

		for (int i = 0; i < str.length(); i++) {
			if (max < count[str.charAt(i)]) {
				max = count[str.charAt(i)];
				result = str.charAt(i);
			}
		}

		return result;
	}

	public static void main(String[] args) {

		String str = "sample shhhhhh string";
		System.out.println("Max occurring character is " + getMaxOccuringChar(str));
	}

}
