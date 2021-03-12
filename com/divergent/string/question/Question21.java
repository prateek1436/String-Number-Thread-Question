package com.divergent.string.question;

public class Question21 {

	public static void main(String[] args) {
		String str = "  Hello    world     ";
		System.out.println(str);
		System.out.println(str.trim());
		
		String regex = "^\\s+";
        
		String originalString1 = "  v     howtodo  injava.com";    //3 leading spaces
		String originalString2 = "   howtodoinjava.com   "; //3 leading and trailing spaces
		 
		String trimmedString1 = originalString1.replaceAll(regex, "");
		String trimmedString2 = originalString2.replaceAll(regex, "");
		 
		System.out.println(trimmedString1);
		System.out.println(trimmedString2);
	}

}
