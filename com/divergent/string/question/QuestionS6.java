package com.divergent.string.question;


public class QuestionS6 {

	public static int CountingChar(String s,char c){
		int res = 0;
		for(int i = 0;i<s.length();i++) {
			if(s.charAt(i)==c) {
				res++;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		String str = "PrateekPatel RamLakhan";
		char c = 'a';
		System.out.println(CountingChar(str,c));
	}

}
