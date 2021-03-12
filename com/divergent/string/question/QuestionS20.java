package com.divergent.string.question;

import java.util.Scanner;

public class QuestionS20 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		System.out.println("Enter string: "); 
//		System.out.println("Enter value for n: "); 
//		int n = in.nextInt(); 
		int n = 5;
		String s = in.next(); 
		StringBuilder str = new StringBuilder(s); 
		for(int i = 0; i < n; i++) { 
			str.append(s); 
		} 
		System.out.println("New String: " + str.toString());  
	}

}
