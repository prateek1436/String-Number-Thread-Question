package com.divergent.stringpool.question;

import java.io.CharArrayReader;

public class CharArrayReaderUsed {

	public static void main(String[] args) throws Exception {
		char ch[] = {'p','r','a','t','e','e','k'};
		
		CharArrayReader array = new CharArrayReader(ch);
		int k = 0;
		while((k=array.read())!=-1) {
			char ch1 = (char)k;
			System.out.print(ch1+" ");
			System.out.println(k);
		}
	}

}
