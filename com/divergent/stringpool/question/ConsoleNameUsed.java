package com.divergent.stringpool.question;

import java.io.Console;

public class ConsoleNameUsed {

	public static void main(String[] args) {
		Console cs = System.console();
		System.out.println("Enter your Name :");
		String n = cs.readLine();
		System.out.println("Welcome ,"+n);
		String str = "Abc";
		str = "xyz";
	}

}
