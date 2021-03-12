package com.divergent.stringpool.question;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class BufferReaderUsed {

	public static void main(String[] args) throws Exception {
//		FileReader fr = new FileReader("D:\\IO Package\\java.txt");
//		BufferedReader br = new BufferedReader(fr);
//		int i;
//		while((i=br.read())!=-1) {
//			System.out.print((char)i);
//		}
//		br.close();
//		fr.close();
		InputStreamReader inputs = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(inputs);
		System.out.println("Enter Your Name");
		String name = br.readLine();
		System.out.println("Welcome, "+name);
	}

}
