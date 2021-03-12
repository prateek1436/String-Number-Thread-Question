package com.divergent.stringpool.question;

import java.io.FileWriter;
import java.io.Writer;

public class WriteMethodUsed {

	public static void main(String[] args) {
		try {
			Writer wr = new FileWriter("D:\\IO Package\\java.txt");
			String content = "I love my India";
			wr.write(content);
			wr.close();
			System.out.println("Done");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
