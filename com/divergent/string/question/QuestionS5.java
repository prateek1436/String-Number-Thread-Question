package com.divergent.string.question;

public class QuestionS5 {

	public static void main(String[] args) {
		int vowelC = 0,ConsC = 0;
		String str = "This is a special case for vowel and consonant";
		str = str.toLowerCase();
		
		for(int i = 0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				vowelC++;
			}
			else if(str.charAt(i)>='a'&&str.charAt(i)<='z') {
				ConsC++;
			}
		}
		System.out.println("Vowel are : "+vowelC);
		System.out.println("Consonant are : "+ConsC);
		
	}

}
