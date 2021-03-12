package com.divergent.stringpool.question;

import java.io.FileReader;
import java.io.Reader;

public class ReaderFileUsed {

	public static void main(String[] args) {
		try {
			Reader r = new FileReader("D:\\\\IO Package\\\\java.txt");
			int data = r.read();
			while(data!=-1) {
				System.out.print((char)data);
				data = r.read();
			}
			r.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
