package com.divergent.string.question;

import java.math.BigInteger;

public class QuestionS27 {

	public static void main(String[] args) {
		BigInteger big1,big2;
		int x,y;
		big1 = new BigInteger("123");
		big2 = new BigInteger("1234567890123789456123");
		x = big1.intValue();
		y = big2.intValue();
		
		System.out.println(x);
		System.out.println(y);
	}

}
