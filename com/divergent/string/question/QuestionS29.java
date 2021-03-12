package com.divergent.string.question;

public class QuestionS29 {

	public static void main(String[] args) {
		int x = -125;
		int y = 5;
		System.out.println(Math.floorDiv(x, y));
		System.out.println(Math.floorMod(x, y));
		float a = 4.2f;

		int d = (int) Math.ceil(a);

		System.out.println(d);

		int totalNumberOfCachedData = 201;
		int DataCountMax = 200;

		float ceil = (float) totalNumberOfCachedData / (float) DataCountMax;
		int roundInt = (int) Math.ceil(ceil);
		System.out.println(roundInt);
	}

}
