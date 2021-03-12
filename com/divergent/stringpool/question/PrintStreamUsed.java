package com.divergent.stringpool.question;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamUsed {

	public static void main(String[] args) throws Exception{
		FileOutputStream out = new FileOutputStream("D:\\\\IO Package\\\\java.txt");
		PrintStream pout = new PrintStream(out);
		pout.println(2016);
		pout.println("Hello Java");
		pout.println("Welcome to Java World");
		pout.close();
		out.close();
		System.out.println("Done");
	}

}
