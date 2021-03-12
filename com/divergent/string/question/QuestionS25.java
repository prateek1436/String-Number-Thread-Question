package com.divergent.string.question;

public class QuestionS25 {

	public static void main(String[] args) {
		int n1 = 6;
		int n2 = 6;
		System.out.println(getModulo(-1,n1/n2));
	}

	 static int getModulo(int n, int d) 
	    { 
	        return ( n & (d-1) ); 
	    }

}
