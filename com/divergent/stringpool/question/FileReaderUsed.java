package com.divergent.stringpool.question;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderUsed {

	public static void main(String[] args) throws Exception {
//		FileReader fr = new FileReader("D:\\IO Package\\java.txt");
//		int i;
//		while((i=fr.read())!=-1) {
//			System.out.println((char)i);
//			fr.close();
//		}
		
		FileWriter wr = new FileWriter("D:\\\\IO Package\\\\java.txt");
		BufferedWriter br = new BufferedWriter(wr);
		br.write("Welcome to javaTpoint");
		br.close();
		System.out.println("Done");
	}
}
