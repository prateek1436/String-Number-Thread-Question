package com.divergent.string.question;

public class QuestionS12 {

//	public static String removeDuplicates(String input){
//	    String result = "";
//	    for (int i = 0; i < input.length(); i++) {
//	        if(!result.contains(String.valueOf(input.charAt(i)))) {
//	            result += String.valueOf(input.charAt(i));
//	        }
//	    }
//	    return result;
//	}
	public static void main(String[] args) {
//		String input = "Prateek";
//		String output = new String();
//		for(int i = 0;i<input.length();i++) {
//			for(int j = 0;j<output.length();j++) {
//				if(input.charAt(i) != output.charAt(j)) {
//					output = output + input.charAt(i);
//				}
//			}
//		}
//		System.out.println(output);
//		String str = "abbccddd";
//		removeDuplicates(str);
//		System.out.println(result);
		String str1 = "topjavatutorial";
        System.out.println(removeDuplicateChars(str1));
        String str2 = "hello";
        System.out.println(removeDuplicateChars(str2));
	}
	 private static String removeDuplicateChars(String sourceStr) {
	        // Store encountered letters in this string.
	        char[] chrArray = sourceStr.toCharArray();
	        String targetStr = "";
	 
	        // Loop over each character.
	        for (char value : chrArray) {
	            // See if character is in the target
	            if (targetStr.indexOf(value) == -1) {
	                targetStr += value; // Use StringBuilder as shown below
	            }
	        }
	        return targetStr;
	    }

}
