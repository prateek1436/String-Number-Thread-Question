package com.divergent.string.question;

public class QuestionS4 {

	public static void main(String[] args) {
		String text = "abc12"; 
		String number=" "; 

		if (text.contains("[a-zA-Z]+") == false && text.length() > 2) {
		    number = text; 
		}
		System.out.println(number);
	}

}
