package com.divergent.string.question;

public class QuestionS13 {

	public static void main(String[] args) {
		String str = "India is my Country";
		System.out.println(charRemove(str, 6));

	}
	public static String charRemove(String str,int p) {
		return str.substring(0,p) + str.substring(p+1);
	}

}
