package com.divergent.string.question;

class ReversWord{
	public static String reverseWordCharacters(String text1) {
        String reverse = "";
        int length = text1.length();
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + text1.charAt(i);
            System.out.println();
        }
        return reverse;
    }

}
public class QuestionS3 {

	public static void main(String[] args) {
		ReversWord reverword = new ReversWord();
		System.out.println("Revesing Word are: "+reverword.reverseWordCharacters("Prateek"));
	}

}
