package com.divergent.stringpool.question;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterUsed {

	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter wr = new PrintWriter(System.out);
		wr.write("Java is all in Software");
		wr.flush();
		wr.close();
		PrintWriter wr1 = null;
		wr1 = new PrintWriter(new File("D:\\\\IO Package\\\\java.txt"));
		wr1.write("Like Java,Python,Spring,PHP,Android etc.");
		wr1.flush();
		wr1.close();
	}

}
