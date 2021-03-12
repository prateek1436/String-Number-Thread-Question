package com.divergent.string.question;

import java.lang.reflect.Array;
import java.util.Arrays;

public class QuestionS15 {

	public static void main(String[] args) {
		String[] strArr = { "ABCD", "AD", "A", "ASDFGHJZk", "ASDTWQ" };
		Arrays.sort(strArr, (str1, str2) -> 
									str1.length() - str2.length());
		Arrays.asList(strArr).forEach(System.out::println);
//		Arrays.sort(strArr,(str1,str2)->
//						str1.length() - str2.length());
	}

}
