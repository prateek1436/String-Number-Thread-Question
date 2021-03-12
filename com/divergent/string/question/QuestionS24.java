package com.divergent.string.question;

public class QuestionS24 {

	public static void main(String[] args) {
		int n1 = Integer.MAX_VALUE;
		int n2 = Integer.MIN_VALUE;
		System.out.println("Value of n1 and n2 :"+ n1 +" "+ n2);
		int compareInt = Integer.compare(n2, n1);
		System.out.println(compareInt);
		int compareIntUn = Integer.compareUnsigned(n1, n2);
		System.out.println(compareIntUn);
	}

}
