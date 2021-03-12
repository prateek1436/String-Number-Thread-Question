package com.divergent.stringpool.question;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriterUsed {

	public static void main(String[] args) {
		try {
			OutputStream out = new FileOutputStream("D:\\IO Package\\java.txt");
			Writer wr = new OutputStreamWriter(out);
			wr.write("Hello Wolrd");
			wr.close();
			System.out.println("Done");
		} catch (Exception e) {
			e.getMessage();
		}
	}

}
