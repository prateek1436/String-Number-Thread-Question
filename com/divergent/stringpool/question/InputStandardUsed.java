package com.divergent.stringpool.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStandardUsed {

	public static void main(String[] args) {
		int n1,n2,result;
		BufferedReader brd = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Enter a First Number");
			n1 = Integer.parseInt(brd.readLine());
			System.out.println("Enter a Second Number");
			n2 = Integer.parseInt(brd.readLine());
			result = n1 * n2;
			System.out.println("Result is :"+result);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
