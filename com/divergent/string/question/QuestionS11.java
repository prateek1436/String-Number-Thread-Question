package com.divergent.string.question;

public class QuestionS11 {

//	static boolean isPalindrom(String str) {
//		int i=0,j = str.length() - 1;
//		while(i < j) {
//			if(str.charAt(i)!=str.charAt(j)) 
//				return false;
//			j++;
//			i--;
//		}
//		return true;
//	}
//	public static void main(String[] args) {
//		String str = "madam";
//		if(isPalindrom(str))
//			System.out.println("Yes");
//		else
//			System.out.println("No");
//	}

	public static void main(String arg[]) {
		String original = "ABBAa",reverse = "";
		int lenght = original.length();
		for(int i = lenght-1;i>=0;i--) {
			reverse = reverse + original.charAt(i);
		}
		if(original.equals(reverse)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}
